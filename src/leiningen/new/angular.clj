(ns leiningen.new.angular
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]
        [leinjacker.utils :only [lein-generation]]))

(def render (renderer "angular"))

(defn angular
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (println "Generating a new app with Clojure, AngularJS, CoffeeScript and Sass...")
    (->files data ["src/{{sanitized}}/util.clj" (render "util.clj" data)]
;; clojure backend
["src/{{sanitized}}/routes/home.clj" (render "home.clj" data)]
["src/{{sanitized}}/views/layout.clj" (render "layout.clj" data)]
["project.clj" (render "project.clj" data)]
["src/{{sanitized}}/repl.clj" (render "repl.clj" data)]
["src/{{sanitized}}/handler.clj" (render "handler.clj" data)]
["src/{{sanitized}}/routes/api.clj" (render "api.clj" data)]
["src/{{sanitized}}/views/templates/base.html" (render "base.html" data)]

;; clojure tests
["test/{{sanitized}}/test/handler.clj" (render "test_handler.clj" data)]

;; resources - fonts
["resources/fonts/glyphicons-halflings-regular.svg" (render "glyphicons_halflings_regular.svg")]
["resources/fonts/glyphicons-halflings-regular.ttf" (render "glyphicons_halflings_regular.ttf")]
["resources/fonts/glyphicons-halflings-regular.eot" (render "glyphicons_halflings_regular.eot")]
["resources/fonts/glyphicons-halflings-regular.woff" (render "glyphicons_halflings_regular.woff")]

;; resources - coffeescript
["resources/scripts/app.coffee" (render "app.coffee" data)]
["resources/scripts/controllers/main.coffee" (render "main.coffee" data)]

;; resources - angular views
["resources/views/main.html" (render "main.html")]

;; resources - sass
["resources/styles/main.sass" (render "main.sass")]

;; npm dependencies
["package.json" (render "package.json" data)]

;; bower
["bower.json" (render "bower.json" data)]
[".bowerrc" (render ".bowerrc")]

;; grunt
["gruntfile.coffee" (render "gruntfile.coffee")]

;; readme
["README.md" (render "README.md" data)]
)
    (println "Be sure to read the README file and set up the rest of the dependencies")))
