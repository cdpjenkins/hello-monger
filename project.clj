(defproject hello-monger "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.novemberain/monger "2.0.0"]]
  :plugins [[cider/cider-nrepl "0.7.0"]]
  :main ^:skip-aot hello-monger.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
