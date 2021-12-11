---
writer: drpicox
coder: NoeliaMGU
---

# Load Potatoes To Ship
We want to be able to plant potatoes and load them to our ship.

## Potatoes, potatoes, potatoes

### Build the potato plantation
 * Go to the next player "leonard"
 <!-- SNAPSHOT status=200 -->
 * Go to the "leonard" "city" "Capital".
 * The resource "potato" round increment should be 0.
 * Given that the "leonard" "city" "Capital" has resource "banana" count 5.
 * Go to the contained "building" "Builder".
 * Build the "Potato plantation".
 <!-- SNAPSHOT status=200 -->

 * There should contain the "building" "Potato plantation".
 * The resource "potato" round increment should be 1.
 * The resource "potato" count should be 0.
 * The resource "banana" count should be 0.
 * Skip 1 rounds.
 <!-- SNAPSHOT status=200 -->
 * The resource "potato" count should be 1.


### Build the potatoes store
We want to have a potatoes storage at our ship so that we can carry them. This will cost 4 wood.

 * Go to see the docked "leonard" "ship" "Beagle".
 * Given that the "leonard" "city" "Capital" has resource "wood" count 4.
 * Given that the "leonard" "city" "Capital" has resource "potato" count 5.
 * The resource "potato" maximum should be 0.
 * Go to the contained "deck" "Builder".
 * Build the "Potato store".
 <!-- SNAPSHOT status=200 -->

 * There should contain the "deck" "Potato store".
 * The resource "potato" maximum should be 5.
 * The resource "potato" count should be 0.
 * The resource "wood" count should be 0.
 
### Now try to load potatoes to the storage
 * Load 5 of "potato"
 <!-- SNAPSHOT status=200 -->
 * The resource "potato" count should be 5.
 * The dock resource "potato" count should be 0.
