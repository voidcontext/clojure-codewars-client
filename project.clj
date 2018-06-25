(defproject clojure-codewars-client "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main clojure-codewars-client.main
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "3.9.0"]
                 [cheshire "5.8.0"]]
  :profiles {:test {:dependencies [[clj-http-fake "1.0.3"]]}}
  )
