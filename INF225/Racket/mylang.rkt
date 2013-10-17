#! /usr/bin/env racket
#lang racket
(define (bake flavor)
  (printf "preheating oven..\n")
  (string-append flavor " pie"))

(define (nobake flavor)
  string-append flavor "jello")

(define (reply s)
  (if (equal? "hello" (substring s 0 5))
      "hi!"
      "fuck off!"))

(define (replied s)
  (if (and (string? s)
           (>= (string-length s) 5)
           (equal? "hello" (substring s 0 5)))
      "hi!"
      "huh?"))

(define (reply-more s)
  (cond
    [(equal? "hello" (substring s 0 5))
     "hei!"]
    [(equal? "goodbye" (substring s 0 7))
     "bye!"]
    [(equal? "?" (substring s (- (string-length s) 1)))
     "I don't know"]
    [else "huh"]))

(define (double v)
  ((if (string? v) string-append +) v v))

(define (twice f v)
  (f (f v)))

(define (louder s)
  (string-append s "!"))

(define (make-add-suffix s2)
  (lambda (s) (string-append s s2)))
