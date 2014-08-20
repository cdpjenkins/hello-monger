(ns hello-monger.core
  (:require [monger.core       :as mg]
            [monger.collection :as mc]
          )
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(comment
  (def conn (mg/connect))

  (def db (mg/get-db conn "monger-test"))


  (doseq [i (range 20)]
    (mc/insert db "stuff-and-things" {:cheese i,
                                      :ston   (str "hussp" i)}))

  (mc/insert db "stuff-and-things" {:cheese "ston"})

  (doseq [x (mc/find-maps db "stuff-and-things")]
    (println x))
)
