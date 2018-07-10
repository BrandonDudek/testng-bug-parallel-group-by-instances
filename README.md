# testng-bug-parallel-group-by-instances
Sample code show that when you use
 **group-by-instances="true"** with **parallel="instances"**
 the Test Suite is ran in a single thread.
 (When it should be ran on multiple threads!)
 
 **See:** [
When group-by-instances is set to true the instances created by @Factory does not run in parallel #326](https://github.com/cbeust/testng/issues/326)