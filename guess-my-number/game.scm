(define small 1)

(define big 100)

(define guess-my-number
  (lambda ()
    (ash (+ small big) -1)))

(define smaller
  (lambda ()
    (set! big (1- (guess-my-number)))
    (guess-my-number)))

(define bigger
  (lambda ()
    (set! small (1+ (guess-my-number)))
    (guess-my-number)))

(define start-over
  (lambda ()
    (set! small 1)
    (set! big 100)
    (guess-my-number)))
