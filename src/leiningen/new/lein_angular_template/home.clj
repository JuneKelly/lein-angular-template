(ns {{ns-name}}.routes.home
  (:use compojure.core)
  (:require [{{ns-name}}.views.layout :as layout]
            [{{ns-name}}.util :as util]))


(defn home-page []
  (layout/render
    "base.html"))


(defroutes home-routes
  (GET "/" [] (home-page)))
