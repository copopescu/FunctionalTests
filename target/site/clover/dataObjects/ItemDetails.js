var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":8,"methods":[{"el":18,"sc":5,"sl":14},{"el":23,"sc":5,"sl":20},{"el":28,"sc":5,"sl":25},{"el":33,"sc":5,"sl":30}],"name":"ItemDetails","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":14},{"sl":20},{"sl":25},{"sl":30}],"name":"verifyPostPokemonReturnSuccessStatusCode","pass":false,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":22},{"sl":27},{"sl":32}]},"test_2":{"methods":[{"sl":14},{"sl":20},{"sl":25},{"sl":30}],"name":"verifyPostPokemonReturnSuccessStatusCode","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17},{"sl":22},{"sl":27},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [1, 2], [1, 2], [1, 2], [1, 2], [], [], [1, 2], [], [1, 2], [], [], [1, 2], [], [1, 2], [], [], [1, 2], [], [1, 2], [], [], []]
