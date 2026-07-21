# ADR 0001: Kotoba is the AEB catalog source authority

- Status: Accepted
- Date: 2026-07-21

`src/association_facts.kotoba` is the sole production source. It preserves the
1977 founding and 1985 federation-entry years as year-only values and keeps both
revision dates absent rather than inventing precision. Both entries retain their
governance topic and official AEB citation. Unknown associations, aliases,
fields, topics, and indexes fail closed; no effects are declared.

Conformance is observable semantics across the reference evaluator, restricted
JavaScript, and instantiated typed WebAssembly, including the typed ABI, bounds,
effects, and rejection behavior. Compiler-output byte identity is not a language
gate. Clojure and the JVM are compiler/test hosts only.
