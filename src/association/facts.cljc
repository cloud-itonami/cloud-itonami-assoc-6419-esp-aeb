(ns association.facts
  "Industry rule/history catalog for the Asociación Española de Banca
  (AEB, Spanish Banking Association) -- a 38th industry-association-level
  source per ADR-2607141700 (cloud-itonami-compliance-fact-federation).
  The EIGHTH entry aligned to ISIC 6419 (other monetary intermediation
  / banking), alongside cloud-itonami-assoc-6419-jpn-zenginkyo (Japan),
  -6419-deu-bankenverband (Germany), -6419-fra-fbf (France),
  -6419-aus-aba (Australia), -6419-are-ubf (UAE), -6419-vnm-vnba
  (Vietnam), and -6419-phl-bap (Philippines) -- the same
  cross-country-same-ISIC pattern already used for ISIC 2910
  (VDA/SMMT).

  Royal FloraHolland (Netherlands, a flower-auction cooperative) was
  attempted first this tick as a genuine industry-diversification pick,
  but its domain (royalfloraholland.com) returned HTTP 403 on every
  URL tried, including its dedicated history page. The Federation of
  Egyptian Industries (a natural pick to fill Egypt's still-missing
  association axis after this session's Cairo/Egypt municipality and
  country entries) was attempted next, but its own founding-date
  claims were internally inconsistent (1922 vs a 1947 founding law)
  with no primary-source page on fei.org.eg confirming either -- also
  abandoned.

  Both entries here instead cite aebanca.es's own 'Our history' page,
  which states directly: 'The Spanish Banking Association (AEB) was
  founded in 1977' following approval of legislation permitting trade
  union associations; separately, 1985 is confirmed as the year of
  'Spain's EU accession and AEB's official entry into the European
  Banking Federation.' The page also names AEB's first president and
  his successor -- read only to confirm the historical timeline,
  personal names never stored.

  A rule not in this table has NO spec-basis, full stop; extend
  `catalog`, do not invent an id/url.")

(def catalog
  "assoc-slug -> vector of self-regulatory rule entries."
  {"aeb"
   [{:association-rule/id "aeb.founding-1977"
     :association-rule/title "AEB founding (Our history)"
     :association-rule/association "aeb"
     :association-rule/isic "6419"
     :association-rule/country "ESP"
     :association-rule/kind :governance-program
     :association-rule/url "https://aebanca.es/en/about-aeb/our-history/"
     :association-rule/url-provenance :official-aebanca-es
     :association-rule/established-date "1977"
     :association-rule/retrieved-at "2026-07-17"
     :association-rule/topic #{:governance}}
    {:association-rule/id "aeb.european-banking-federation-entry-1985"
     :association-rule/title "Spain's EU accession and AEB's entry into the European Banking Federation (Our history)"
     :association-rule/association "aeb"
     :association-rule/isic "6419"
     :association-rule/country "ESP"
     :association-rule/kind :governance-program
     :association-rule/url "https://aebanca.es/en/about-aeb/our-history/"
     :association-rule/url-provenance :official-aebanca-es
     :association-rule/established-date "1985"
     :association-rule/retrieved-at "2026-07-17"
     :association-rule/topic #{:governance}}]})

(defn spec-basis [assoc-slug] (get catalog assoc-slug))

(defn coverage
  ([] (coverage (keys catalog)))
  ([slugs]
   (let [have (filter catalog slugs)
         missing (remove catalog slugs)]
     {:requested (count slugs)
      :covered (count have)
      :covered-associations (vec (sort have))
      :missing-associations (vec (sort missing))
      :note (str "cloud-itonami-assoc-6419-esp-aeb Wave 0 (ADR-2607141700): "
                 (count (get catalog "aeb")) " aeb entries seeded with an "
                 "official aebanca.es citation. Extend "
                 "`association.facts/catalog`, never fabricate a rule id/url.")})))

(defn by-topic [assoc-slug topic]
  (filterv #(contains? (:association-rule/topic %) topic) (spec-basis assoc-slug)))
