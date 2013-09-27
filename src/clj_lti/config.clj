(ns clj-lti.config
 (:require [clojure.data.xml :as xml]))

(defn generate-xml [options]
  (xml/emit-str (xml/sexp-as-element
    [:cartridge_basiclti_link {
    "xmlns"               "http://www.imsglobal.org/xsd/imslticc_v1p0",
    "xmlns:blti"          "http://www.imsglobal.org/xsd/imsbasiclti_v1p0",
    "xmlns:lticm"         "http://www.imsglobal.org/xsd/imslticm_v1p0",
    "xmlns:lticp"         "http://www.imsglobal.org/xsd/imslticp_v1p0",
    "xmlns:xsi"           "http://www.w3.org/2001/XMLSchema-instance",
    "xsi:schemaLocation"  "http://www.imsglobal.org/xsd/imslticc_v1p0 http://www.imsglobal.org/xsd/lti/ltiv1p0/imslticc_v1p0.xsd http://www.imsglobal.org/xsd/imsbasiclti_v1p0 http://www.imsglobal.org/xsd/lti/ltiv1p0/imsbasiclti_v1p0p1.xsd http://www.imsglobal.org/xsd/imslticm_v1p0 http://www.imsglobal.org/xsd/lti/ltiv1p0/imslticm_v1p0.xsd http://www.imsglobal.org/xsd/imslticp_v1p0 http://www.imsglobal.org/xsd/lti/ltiv1p0/imslticp_v1p0.xsd"}
    ["blti:title" (:title options)]
    ["blti:description" (:description options)]
    ["blti:icon" (:icon options)]
    ["blti:launch_url" (:launch_url options)]
    ])))
