# Split Layout (25% / 75%) with Weighted Column (2:3:5) — Jetpack Compose

This demo screen shows:
- A `Row` split into **25%** and **75%** using `Modifier.weight(1f)` and `Modifier.weight(3f)`.
- Inside the **75%** section, a `Column` with **3 children** weighted **2:3:5**.
- Colored `Box`es and text labels to visualize the proportions.

## How it works

- **Row proportions:** Using weights `1f` and `3f` creates a 1:3 ratio → 25% and 75%.
- **Column proportions:** Using weights `2f`, `3f`, `5f` on the children yields a total of 10 weight units:
  - Top: 2/10 = 20% of the right section
  - Middle: 3/10 = 30% of the right section
  - Bottom: 5/10 = 50% of the right section
