(defproject pinkgorilla-ui-core-matrix "0.1.1"
  :description "PinkGorilla REPL integration for core.matrix datasets"
  :url "https://github.com/pink-gorilla/core-matrix-gorilla"
  :license {:name "MIT"}
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :username "pinkgorillawb"
                             :sign-releases false}]]
  :dependencies 
  [[org.clojure/clojure "1.8.0"]
   [net.mikera/core.matrix "0.56.0"]
   [org.clojure/data.codec "0.1.0"]
   ;[org.clojars.deas/gorilla-renderable "2.1.0"] ;PinkGorilla Renderable
   [pinkgorilla.ui.gorilla-renderable "1.0.1"] ;PinkGorilla Renderable
   ])
