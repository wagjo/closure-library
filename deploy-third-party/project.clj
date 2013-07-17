(defproject com.wagjo/closure-library-third-party "0.1.0-SNAPSHOT"
  :description "Fork of a Google Closure Library third party libraries."
  :url "https://github.com/wagjo/closure-library"
  :resource-paths ["../third_party/closure"]
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"
            :distribution :repo
            :comments "same as Google Closure Library"}
  :jar-exclusions [#"project.clj"])
