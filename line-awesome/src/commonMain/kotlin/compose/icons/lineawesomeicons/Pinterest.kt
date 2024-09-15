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

public val LineAwesomeIcons.Pinterest: ImageVector
    get() {
        if (_pinterest != null) {
            return _pinterest!!
        }
        _pinterest = Builder(name = "Pinterest", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.371f, 4.0f, 4.0f, 9.371f, 4.0f, 16.0f)
                curveTo(4.0f, 21.086f, 7.164f, 25.426f, 11.629f, 27.176f)
                curveTo(11.523f, 26.227f, 11.426f, 24.77f, 11.668f, 23.73f)
                curveTo(11.887f, 22.797f, 13.074f, 17.766f, 13.074f, 17.766f)
                curveTo(13.074f, 17.766f, 12.719f, 17.047f, 12.719f, 15.984f)
                curveTo(12.719f, 14.316f, 13.684f, 13.07f, 14.887f, 13.07f)
                curveTo(15.91f, 13.07f, 16.406f, 13.84f, 16.406f, 14.762f)
                curveTo(16.406f, 15.793f, 15.75f, 17.332f, 15.41f, 18.758f)
                curveTo(15.129f, 19.953f, 16.012f, 20.926f, 17.188f, 20.926f)
                curveTo(19.32f, 20.926f, 20.961f, 18.676f, 20.961f, 15.43f)
                curveTo(20.961f, 12.559f, 18.898f, 10.551f, 15.949f, 10.551f)
                curveTo(12.535f, 10.551f, 10.531f, 13.109f, 10.531f, 15.758f)
                curveTo(10.531f, 16.789f, 10.93f, 17.895f, 11.426f, 18.496f)
                curveTo(11.523f, 18.613f, 11.535f, 18.719f, 11.508f, 18.84f)
                curveTo(11.414f, 19.219f, 11.215f, 20.035f, 11.176f, 20.199f)
                curveTo(11.121f, 20.422f, 11.0f, 20.469f, 10.773f, 20.359f)
                curveTo(9.273f, 19.664f, 8.336f, 17.473f, 8.336f, 15.711f)
                curveTo(8.336f, 11.926f, 11.086f, 8.449f, 16.266f, 8.449f)
                curveTo(20.43f, 8.449f, 23.664f, 11.414f, 23.664f, 15.383f)
                curveTo(23.664f, 19.516f, 21.055f, 22.844f, 17.438f, 22.844f)
                curveTo(16.223f, 22.844f, 15.078f, 22.215f, 14.688f, 21.469f)
                curveTo(14.688f, 21.469f, 14.086f, 23.758f, 13.938f, 24.32f)
                curveTo(13.668f, 25.363f, 12.938f, 26.668f, 12.445f, 27.465f)
                curveTo(13.57f, 27.813f, 14.762f, 28.0f, 16.0f, 28.0f)
                curveTo(22.629f, 28.0f, 28.0f, 22.629f, 28.0f, 16.0f)
                curveTo(28.0f, 9.371f, 22.629f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _pinterest!!
    }

private var _pinterest: ImageVector? = null
