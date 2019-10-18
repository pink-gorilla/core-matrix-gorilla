(defproject pinkgorilla-ui-core-matrix "0.1.2"
  :description "PinkGorilla REPL integration for core.matrix datasets"
  :url "https://github.com/pink-gorilla/core-matrix-gorilla"
  :license {:name "MIT"}
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :username "pinkgorillawb"
                             :sign-releases false}]]
  :dependencies 
  [[org.clojure/clojure "1.9.0-alpha14"]
   [net.mikera/core.matrix "0.56.0"]
   [org.clojure/data.codec "0.1.0"]
   [pinkgorilla.ui.gorilla-renderable "2.0.7"] ;PinkGorilla Renderable
   ])
