(ns association.facts-test
  (:require [clojure.test :refer [deftest is]]
            [association.facts :as facts]))

(deftest aeb-has-spec-basis
  (let [sb (facts/spec-basis "aeb")]
    (is (= 2 (count sb)))
    (is (every? #(= "6419" (:association-rule/isic %)) sb))
    (is (every? #(= "ESP" (:association-rule/country %)) sb))))

(deftest unknown-association-has-no-spec-basis
  (is (nil? (facts/spec-basis "bap")))
  (is (nil? (facts/spec-basis "zzz"))))

(deftest coverage-is-honest
  (let [c (facts/coverage ["aeb" "bap"])]
    (is (= 2 (:requested c)))
    (is (= 1 (:covered c)))
    (is (= ["bap"] (:missing-associations c)))))

(deftest by-topic-filters
  (is (= 2 (count (facts/by-topic "aeb" :governance))))
  (is (empty? (facts/by-topic "aeb" :labor)))
  (is (empty? (facts/by-topic "bap" :governance))))
