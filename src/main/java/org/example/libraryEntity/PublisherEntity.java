package org.example.libraryEntity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PublisherEntity {
        private String namePublisher;
        private String cityPublisher;

        @Override
        public String toString() {
                return namePublisher + " | Город издательства: " + cityPublisher;
        }


}
