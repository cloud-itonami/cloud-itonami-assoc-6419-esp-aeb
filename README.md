# cloud-itonami-assoc-6419-esp-aeb

Industry rule/history catalog for the **Asociación Española de
Banca** (AEB, Spanish Banking Association) — the EIGHTH entry aligned
to **ISIC 6419** (other monetary intermediation / banking), alongside
[`-6419-jpn-zenginkyo`](https://github.com/cloud-itonami/cloud-itonami-assoc-6419-jpn-zenginkyo)
(Japan),
[`-6419-deu-bankenverband`](https://github.com/cloud-itonami/cloud-itonami-assoc-6419-deu-bankenverband)
(Germany),
[`-6419-fra-fbf`](https://github.com/cloud-itonami/cloud-itonami-assoc-6419-fra-fbf)
(France),
[`-6419-aus-aba`](https://github.com/cloud-itonami/cloud-itonami-assoc-6419-aus-aba)
(Australia),
[`-6419-are-ubf`](https://github.com/cloud-itonami/cloud-itonami-assoc-6419-are-ubf)
(UAE),
[`-6419-vnm-vnba`](https://github.com/cloud-itonami/cloud-itonami-assoc-6419-vnm-vnba)
(Vietnam), and
[`-6419-phl-bap`](https://github.com/cloud-itonami/cloud-itonami-assoc-6419-phl-bap)
(Philippines).

Alongside
[`cloud-itonami-assoc-6512-jpn-sonpo`](https://github.com/cloud-itonami/cloud-itonami-assoc-6512-jpn-sonpo),
[`-6612-jpn-jsda`](https://github.com/cloud-itonami/cloud-itonami-assoc-6612-jpn-jsda),
[`-6612-usa-finra`](https://github.com/cloud-itonami/cloud-itonami-assoc-6612-usa-finra),
[`-6512-usa-naic`](https://github.com/cloud-itonami/cloud-itonami-assoc-6512-usa-naic),
[`-6920-jpn-jicpa`](https://github.com/cloud-itonami/cloud-itonami-assoc-6920-jpn-jicpa),
[`-6920-usa-aicpa`](https://github.com/cloud-itonami/cloud-itonami-assoc-6920-usa-aicpa),
[`-6511-jpn-seiho`](https://github.com/cloud-itonami/cloud-itonami-assoc-6511-jpn-seiho),
[`-6910-jpn-nichibenren`](https://github.com/cloud-itonami/cloud-itonami-assoc-6910-jpn-nichibenren),
[`-6810-jpn-recaj`](https://github.com/cloud-itonami/cloud-itonami-assoc-6810-jpn-recaj),
[`-6411-jpn-boj`](https://github.com/cloud-itonami/cloud-itonami-assoc-6411-jpn-boj),
[`-6120-usa-ctia`](https://github.com/cloud-itonami/cloud-itonami-assoc-6120-usa-ctia),
[`-5110-usa-a4a`](https://github.com/cloud-itonami/cloud-itonami-assoc-5110-usa-a4a),
[`-3510-usa-eei`](https://github.com/cloud-itonami/cloud-itonami-assoc-3510-usa-eei),
[`-2910-deu-vda`](https://github.com/cloud-itonami/cloud-itonami-assoc-2910-deu-vda),
[`-2910-gbr-smmt`](https://github.com/cloud-itonami/cloud-itonami-assoc-2910-gbr-smmt),
[`-5010-nor-rederiforbundet`](https://github.com/cloud-itonami/cloud-itonami-assoc-5010-nor-rederiforbundet),
[`-0126-idn-gapki`](https://github.com/cloud-itonami/cloud-itonami-assoc-0126-idn-gapki),
[`-5510-usa-ahla`](https://github.com/cloud-itonami/cloud-itonami-assoc-5510-usa-ahla),
[`-2100-usa-phrma`](https://github.com/cloud-itonami/cloud-itonami-assoc-2100-usa-phrma),
[`-4719-usa-nrf`](https://github.com/cloud-itonami/cloud-itonami-assoc-4719-usa-nrf),
[`-4100-usa-agc`](https://github.com/cloud-itonami/cloud-itonami-assoc-4100-usa-agc),
[`-6020-usa-nab`](https://github.com/cloud-itonami/cloud-itonami-assoc-6020-usa-nab),
[`-3600-usa-awwa`](https://github.com/cloud-itonami/cloud-itonami-assoc-3600-usa-awwa),
[`-4923-usa-ata`](https://github.com/cloud-itonami/cloud-itonami-assoc-4923-usa-ata),
[`-5610-usa-nra`](https://github.com/cloud-itonami/cloud-itonami-assoc-5610-usa-nra),
[`-2011-usa-acc`](https://github.com/cloud-itonami/cloud-itonami-assoc-2011-usa-acc),
[`-8621-usa-ama`](https://github.com/cloud-itonami/cloud-itonami-assoc-8621-usa-ama),
[`-6201-usa-gtia`](https://github.com/cloud-itonami/cloud-itonami-assoc-6201-usa-gtia),
[`-0610-usa-api`](https://github.com/cloud-itonami/cloud-itonami-assoc-0610-usa-api),
and
[`-0150-usa-afbf`](https://github.com/cloud-itonami/cloud-itonami-assoc-0150-usa-afbf).
Part of the [`cloud-itonami`](https://github.com/cloud-itonami)
compliance-fact family (ADR-2607141700,
`cloud-itonami-compliance-fact-federation`, in `com-junkawasaki/root`).

## Sourcing note

Royal FloraHolland (Netherlands) was attempted first this tick as a
genuine industry-diversification pick, but its domain returned HTTP
403 on every URL tried. The Federation of Egyptian Industries was
attempted next (a natural pick to fill Egypt's still-missing
association axis), but its own founding-date claims were internally
inconsistent (1922 vs 1947) with no primary-source page confirming
either. Both abandoned in favor of AEB.

## Scope

A **read-only reference/archive** catalog — not an Advisor⊣Governor
actuation actor. It proposes or executes nothing on AEB's behalf.

Coverage is reported honestly by the fail-closed exported Kotoba ABI: an
association not explicitly admitted has **no spec-basis**, full stop — never
fabricate one.

## Data

- `src/association_facts.kotoba` — the sole production catalog authority.
- `schema/association-rule.edn` — DataScript schema.
- `data/datascript-tx.edn` — derived DataScript tx-data (query this
  alongside other `cloud-itonami`/`etzhayyim` compliance-fact sources via
  `com-junkawasaki/root`'s `scripts/compliance-fact-query.cljs`).

Both entries directly WebFetch-verified against `aebanca.es`'s own
"Our history" page: the 1977 founding and Spain's 1985 EU
accession/AEB's entry into the European Banking Federation.

The catalog compiles through `kotoba-lang/compiler` to the reference evaluator,
restricted JavaScript, and typed WebAssembly. Clojure/JVM and Node are test and
compiler hosts only; neither is production authority. Compatibility is checked
by observable values, typed ABI, empty effects, bounds, and fail-closed
rejections—not compiler-output byte identity.

## License

AGPL-3.0-or-later (matches the `cloud-itonami-iso3166-*` /
`-municipality-*` / `-assoc-*` / `-lei-*` convention). Policy text
itself remains AEB's; this repo stores only citation metadata
(id/title/url/dates), not full text.
