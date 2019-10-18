# pinkgorilla-ui-core-matrix

##History
- This repo was forked from [core.matrix](https://github.com/mikera/core.matrix) integration with [Pink Gorilla REPL] that enables us to view core.matrix datasets as HTML tables in PinkGorilla-repl worksheets.
- The fork was necessary to use pink gorilla renderable.

## Usage

Add 
[![Clojars Project](https://img.shields.io/clojars/v/core-matrix-gorilla.svg)](https://clojars.org/core-matrix-gorilla)
 to your project's dependencies. You will also need to have the lein-gorilla plugin in your project's plugin vector (see
Gorilla REPL's [getting started](http://gorilla-repl.org/start.html) page for help with installing Gorilla).
You can then `(use 'core-matrix-gorilla.render)` in your Gorilla worksheets.

## Example worksheet

You can see an example Gorilla worksheet [here](http://viewer.gorilla-repl.org/view.html?source=github&user=shark8me&repo=clojure-machinelearning-cookbook&path=core.matrix-gorilla/ws/coremat.cljw)

## License

This code is licensed to you under the MIT licence. See LICENCE.txt for details.

Copyright © 2016- Kiran Karkera 

## TODO

1. show column names
2. vectorz 
3. see pprint  

