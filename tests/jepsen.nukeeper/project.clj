(defproject jepsen.nukeeper "0.1.0-SNAPSHOT"
  :description "A jepsen tests for ClickHouse NuKeeper"
  :url "https://clickhouse.tech/"
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :main jepsen.nukeeper
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [jepsen "0.2.3"]
                 [zookeeper-clj "0.9.4"]]
  :repl-options {:init-ns jepsen.nukeeper})
