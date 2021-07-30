package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ItunesNote: ImageVector
    get() {
        if (_itunesNote != null) {
            return _itunesNote!!
        }
        _itunesNote = Builder(name = "ItunesNote", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0684f, 5.0059f)
                curveTo(22.8904f, 5.0059f, 21.6258f, 5.2553f, 11.2578f, 7.1973f)
                curveTo(11.1768f, 7.1973f, 10.7892f, 7.2986f, 10.5762f, 7.4766f)
                curveTo(10.3672f, 7.6446f, 10.2558f, 7.8688f, 10.2148f, 8.1328f)
                curveTo(10.0418f, 8.8238f, 10.5931f, 21.2812f, 10.0801f, 21.8652f)
                curveTo(9.8561f, 22.1142f, 9.4613f, 22.1862f, 9.1563f, 22.2422f)
                curveTo(7.3323f, 22.5622f, 6.1179f, 22.7297f, 5.2539f, 23.5527f)
                curveTo(3.7649f, 25.0057f, 4.5364f, 27.5411f, 6.7324f, 27.9531f)
                curveTo(7.5554f, 28.1051f, 9.1011f, 27.8988f, 9.9551f, 27.4258f)
                curveTo(10.7071f, 27.0388f, 11.2772f, 26.343f, 11.4902f, 25.418f)
                curveTo(11.6732f, 24.625f, 11.6172f, 25.1731f, 11.6172f, 13.2441f)
                curveTo(11.6172f, 12.6591f, 11.7808f, 12.5065f, 12.2988f, 12.3945f)
                curveTo(12.2988f, 12.3945f, 21.3193f, 10.7077f, 21.7363f, 10.6367f)
                curveTo(22.3203f, 10.5347f, 22.5996f, 10.6927f, 22.5996f, 11.2617f)
                curveTo(22.5996f, 19.3487f, 22.702f, 19.1906f, 22.377f, 19.5566f)
                curveTo(22.153f, 19.8056f, 21.887f, 19.8756f, 21.582f, 19.9316f)
                curveTo(19.757f, 20.2516f, 18.655f, 20.3079f, 17.791f, 21.1309f)
                curveTo(16.698f, 22.1979f, 16.7127f, 23.8901f, 17.9277f, 24.9121f)
                curveTo(18.8327f, 25.6021f, 19.8487f, 25.772f, 21.0938f, 25.543f)
                curveTo(22.5117f, 25.278f, 23.5695f, 24.4946f, 23.8945f, 23.1016f)
                curveTo(24.0415f, 22.4666f, 23.9943f, 23.4064f, 23.9883f, 5.9004f)
                curveTo(23.9883f, 5.3104f, 23.6524f, 4.9649f, 23.0684f, 5.0059f)
                close()
            }
        }
        .build()
        return _itunesNote!!
    }

private var _itunesNote: ImageVector? = null
