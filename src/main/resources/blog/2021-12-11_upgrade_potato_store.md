---
writer: drpicox
coder: NoeliaMGU
---

# Upgrade potato store
Want to be able to keep more potatoes? Then upgrade the potato store.

## Upgrade, upgrade, upgrade

### Build the potato store
 * Go to the next player "leonard"
 <!-- SNAPSHOT status=200 -->
 * Go to the "leonard" "ship" "Beagle"
 * Go to the contained "deck" "Builder".
 * Build the "Potato store".
 <!-- SNAPSHOT status=200 -->


### Then upgrade the potato store
The price to upgrade is 2 steel.
 * Given that the "leonard" "city" "Capital" has resource "steel" count 2.
 * Go to the contained "deck" "Potato store".
 * The _level_ number should be 1.
 * The resource modifier for "potato" maximum should be 5.
 * Upgrade the level.
 <!-- SNAPSHOT status=200 -->
 * The _level_ number should be 2.
 * The resource modifier for "potato" maximum should be 10.
 * Go back to the previous screen.
 * The resource "potato" maximum should be 10.
 * The dock resource "steel" count should be 0.
