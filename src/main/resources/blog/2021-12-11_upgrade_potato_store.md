---
writer: drpicox
coder: NoeliaMGU
---

# Upgrade potato store
Want to be able to keep more potatoes? Then upgrade the potato store.

## Upgrade, upgrade, upgrade
2. Post: Upgradejar el Potato store del vaixell
Si el test comença de 0 assegurar que existeix
 * Go to the next player "leonard"
 <!-- SNAPSHOT status=200 -->
 * Go to the "leonard" "ship" "Beagle"
 * Go to the contained "deck" "Builder".
 * Build the "Potato store".
 <!-- SNAPSHOT status=200 -->

Posar un cost: ex, 2 steel
 * Given that the "leonard" "city" "Capital" has resource "steel" count 2.

Afegir el leveledComponent al Potato store
 * Go to the contained "deck" "Potato store".
 * The _level_ number should be 1.

Crear el PotatoStoreUpgrader
 * The resource modifier for "potato" maximum should be 5.
 * Upgrade the level.
 <!-- SNAPSHOT status=200 -->
 * The _level_ number should be 2.
 * The resource modifier for "potato" maximum should be 10.
 * Go back to the previous screen.
 * The resource "potato" maximum should be 10.
 * The dock resource "steel" count should be 0.
