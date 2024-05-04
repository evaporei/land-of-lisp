# guess-my-number

## Common Lisp

```bash
$ clisp
[1]> (load "game.lisp")
;; Loading file game.lisp ...
;; Loaded file game.lisp
#P"/Users/evaporei/land-of-lisp/guess-my-number/game.lisp"
[2]> (guess-my-number)
50
[3]> (bigger)
75
[4]> (bigger)
88
[5]> (smaller)
81
[6]> (bigger)
84
[7]> (bigger)
86
[8]> (start-over)
50
```

## Clojure

```bash
$ clj
Clojure 1.11.3
user=> (load-file "game.clj")
#'user/start-over
user=> (guess-my-number)
50
user=> (bigger)
75
user=> (bigger)
88
user=> (smaller)
81
user=> (bigger)
84
user=> (bigger)
86
user=> (start-over)
50
```

## Scheme

```bash
Chez Scheme Version 10.0.0
Copyright 1984-2024 Cisco Systems, Inc.

> (load "game.scm")
> (guess-my-number)
50
> (bigger)
75
> (bigger)
88
> (smaller)
81
> (bigger)
84
> (bigger)
86
> (start-over)
50
```
