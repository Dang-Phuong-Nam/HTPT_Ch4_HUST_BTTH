#include <stdio.h>
#include <stdlib.h>

#include <sys/types.h>
#include <unistd.h>

#include <pthread.h>

int shared = 10;

void *fun(void *args) {
  time_t start = time(NULL);
  time_t end = start + 5;
  while (time(NULL) != end) {
    shared += 1;
  }
  return NULL;
}

int main() {
  pthread_t thread_id;
  pthread_create(&thread_id, NULL, fun, NULL);
  pthread_join(thread_id, NULL);
  printf("Shared: %d\n", shared);
}