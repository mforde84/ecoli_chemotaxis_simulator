# ecoli_chemotaxis_simulator
Educational project / draft for real-time E.coli chemotaxis simulator. Currently in development. This release represents most recent milestone build.

~

Git repository source available at git@blik.bounceme.net:/opt/git/expand.git

RSA key for repository available on Freedcamp project management site.

~

If you would like access to the source, and contribute to development please contact me at the provided email address.

~

Version 1.1.00:

~

Features of simulator - designed and coded by Dr. Nikita Vladimirov.

1) Simulation of cells swimming in 2D with realistic run and tumble times, and with effect of rotational diffusion.

2) Simultaneous running of one up to a large number of cells local on your tablet.

3) Model correctly reproduces the high sensitivity of the chemotactic pathway (FRET experiments).

4) Multiple flagellar motors are simulated explicitly, and their number affect run and tumble times.

5) Gradient of attractant can be chosen from 8 pre-defined shapes, or defined by user.

6) Composition of receptor cluster (Tar and Tsr receptors) can be defined by user.

7) Protein levels (CheA, CheR, CheB, CheY) can be altered to simulate mutants.

~

New Features

1) Plot is now an actual animation of path over time.

2) Each cells is now delineated by a unique color.

3) Random seed functions have been implemented on program and model start to ensure unique results each run.

~

Future Directions

1) Migrate model computations and video rendering to cloud

2) Plot to zoomable and spinnable object.

3) Add cell animations to plots representing cell structures, and signaling events.

~

BUG Fixes

1) Fixed resetting model so that multiple analyses could be run in one instance
