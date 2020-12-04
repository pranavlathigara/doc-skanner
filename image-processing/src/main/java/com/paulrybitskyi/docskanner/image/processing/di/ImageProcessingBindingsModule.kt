/*
 * Copyright 2020 Paul Rybitskyi, paul.rybitskyi.work@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.paulrybitskyi.docskanner.image.processing.di

import com.paulrybitskyi.docskanner.image.processing.ImageLoader
import com.paulrybitskyi.docskanner.image.processing.ImageLoaderImpl
import com.paulrybitskyi.docskanner.image.processing.cropping.CroppingTransformationFactory
import com.paulrybitskyi.docskanner.image.processing.cropping.CroppingTransformationFactoryImpl
import com.paulrybitskyi.docskanner.image.processing.cropping.ImagePerspectiveTransformer
import com.paulrybitskyi.docskanner.image.processing.cropping.OpenCvImagePerspectiveTransformer
import com.paulrybitskyi.docskanner.image.processing.effects.ImageEffectTransformationFactory
import com.paulrybitskyi.docskanner.image.processing.effects.ImageEffectTransformationFactoryImpl
import com.paulrybitskyi.docskanner.image.processing.highlight.ImageHighlightFinder
import com.paulrybitskyi.docskanner.image.processing.highlight.OpenCvImageHighlightFinder
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
internal interface ImageProcessingBindingsModule {


    @Binds
    fun bindImageLoader(
        imageLoader: ImageLoaderImpl
    ): ImageLoader


    @Binds
    fun bindImageEffectTransformationFactory(
        transformationFactory: ImageEffectTransformationFactoryImpl
    ): ImageEffectTransformationFactory


    @Binds
    fun bindImagePerspectiveTransformer(
        perspectiveTransformer: OpenCvImagePerspectiveTransformer
    ): ImagePerspectiveTransformer


    @Binds
    fun bindImageHighlightFinder(
        highlightFinder: OpenCvImageHighlightFinder
    ): ImageHighlightFinder


    @Binds
    fun bindCroppingTransformationFactory(
        factory: CroppingTransformationFactoryImpl
    ): CroppingTransformationFactory


}