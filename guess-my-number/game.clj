(def small (atom 1))

(def big (atom 100))

(defn guess-my-number []
  (bit-shift-right (+ @small @big) 1))

(defn smaller []
  (swap! big (fn [_] (dec (guess-my-number))))
  (guess-my-number))

(defn bigger []
  (swap! small (fn [_] (inc (guess-my-number))))
  (guess-my-number))

(defn start-over []
  (reset! small 1)
  (reset! big 100)
  (guess-my-number))
