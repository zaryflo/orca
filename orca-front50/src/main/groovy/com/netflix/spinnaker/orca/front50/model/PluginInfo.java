/*
 * Copyright 2020 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.orca.front50.model;

import java.util.List;
import javax.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PluginInfo {
  @Nonnull private String id;
  private String description;
  private String provider;
  @Nonnull private List<Release> releases;
  private String homepage;
  private Repository repository;

  @Data
  public static class Release {
    private String version;
    private String date;

    private String requires;
    private String url;
    private String sha512sum;
    private boolean preferred;
    private String lastModifiedBy;
  }

  @Data
  public static class Repository {
    private String type;
    private String url;
  }
}
