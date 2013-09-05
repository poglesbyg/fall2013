#include <stdio.h>
#include <assert.h>
#include <stdlib.h>
#include <string.h>

struct Person {
    char *name;
    int age;
    int height;
    int weight;
};

struct Person *Person_create(char *name, int age, int height, int weight) {
    struct Person *who = malloc(sizeof(struct Person));
    assert(who != NULL);

    who->name = strdup(name);
    who->age = age;
    who->height = height;
    who->weight = weight;

    return who;
}

void Person_destroy(struct Person *who) {
    assert(who != NULL);

    free(who->name);
    free(who);
}

void Person_print(struct Person *who){
    printf("Name: %s\n", who->name);
    printf("\tAge: %d\n", who->age);
    printf("\tHeight: %d\n", who->height);
    printf("\tWeight: %d\n", who->weight);
}

int main(int argc, char *argv[]) {
    //make two people structures
    struct Person *paul = Person_create(
            "Paul Grant", 23,193,86);

    struct Person *ingrid = Person_create(
            "Ingrid Smestad", 24,165,60);

    //print them out where they are in memeory
    printf("Paul is at memory location %p:\n", paul);
    Person_print(paul);

    printf("Ingrid is at memory location %p:\n", ingrid);
    Person_print(ingrid);

    //make everyone age 20 years and print them again
    paul->age += 20;
    paul->height -= 2;
    paul->weight += 20;
    Person_print(paul);

    ingrid->age += 20;
    ingrid->height -= 2;
    Person_print(ingrid);

    //destroy them both so we clean up
    Person_destroy(paul);
    Person_destroy(ingrid);

    return 0;
}

