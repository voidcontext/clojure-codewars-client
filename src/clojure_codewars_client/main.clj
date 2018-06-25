(ns clojure-codewars-client.main
  (:require [clojure-codewars-client.core]))

(defn print-katas [katas]
  (doseq [kata katas] (println
                        (-> kata :name)
                        (-> kata :slug)
                        (-> kata :completedLanguages))))

(defn -main []
  (let [user (do (print "Username: ") (flush) (read-line))]
    (do
      (println "Username is:" user)
      (println (print-katas
                 (->
                   (clojure-codewars-client.core/completed-katas user)
                   :body
                   :data))))))

