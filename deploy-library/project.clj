(defproject com.wagjo/closure-library "0.1.0-SNAPSHOT"
  :description "Fork of a Google Closure Library with small adjustments."
  :url "https://github.com/wagjo/closure-library"
  :dependencies [[com.wagjo/closure-library-third-party "0.1.0-SNAPSHOT"]]
  :resource-paths ["../closure"]
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"
            :distribution :repo
            :comments "same as Google Closure Library"}
  :jar-exclusions [#"project.clj"])
