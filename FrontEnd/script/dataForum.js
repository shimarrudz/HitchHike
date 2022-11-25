var defaultThreads = [{
        id: 1,
        title: "Thread 1",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    },
    {
        id: 2,
        title: "Thread 2",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content 2",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    },
    {
        id: 3,
        title: "Thread 3",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content 3",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    },
    {
        id: 4,
        title: "Thread 4",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content 4",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    },
    {
        id: 5,
        title: "Thread 5",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content 5",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    },
    {
        id: 6,
        title: "Thread 6",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content 6",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    },
    {
        id: 7,
        title: "Thread 7",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content 7",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    },
    {
        id: 8,
        title: "Thread 8",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content 8",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    },
    {
        id: 9,
        title: "Thread 9",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content 9",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    },
    {
        id: 10,
        title: "Thread 10",
        author: "Aaron",
        date: Date.now(),
        content: "Thread content 10",
        comments: [{
                author: "Jack",
                date: Date.now(),
                content: "Eaee"
            },
            {
                author: "Arthur",
                date: Date.now(),
                content: "Opa! blz?"
            }
        ]
    }
]

var threads = defaultThreads
if (localStorage && localStorage.getItem('threads')) {
    threads = JSON.parse(localStorage.getItem('threads'));
} else {
    threads = defaultThreads;
    localStorage.setItem('threads', JSON.stringify(defaultThreads));
}