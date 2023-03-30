var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":67,"methods":[{"el":18,"sc":5,"sl":11},{"el":33,"sc":5,"sl":20}],"name":"ArtistsTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":20}],"name":"verifyPostPokemonReturnSuccessStatusCode","pass":true,"statements":[{"sl":22},{"sl":24}]},"test_3":{"methods":[{"sl":11}],"name":"verifyGetArtistEndpointReturnSuccessStatusCode","pass":true,"statements":[{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3], [], [3], [], [], [], [], [], [], [2], [], [2], [], [2], [], [], [], [], [], [], [], [], [], []]
