(ns clojure-codewars-client.core
  (:require [clj-http.client :as client]))

(defn completed-katas [user]
  (client/get (str "https://www.codewars.com/api/v1/users/" user "/code-challenges/completed?page=0") {:as :json}))