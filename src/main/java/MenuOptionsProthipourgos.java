public enum MenuOptionsProthipourgos {
        ARXH("Υποθετικος προυπολογισμος"),
        ARXH2("Δειτε τι ποσα ζητησαν τα υπουργεια , και μοιραστε το budjet σας σε αυτα "),
        MESH("Εισαγετε ποια εξοδα/εσοδα εχουν γινει μεχι στιγμης και ενημερωθειτε αμα ακολουθειτε τον αρχικο σας προϋπολογισμο "),
        TELOS("Τελικος προυπολογισμος , και Διαφορες με τον Αρχικο"),

        private String description;

        MenuOptionsProthipourgos(String description) {
                this.description = description ;
        }
        public String getDescriptionProthipourgos() {
                return description;
        }

}


