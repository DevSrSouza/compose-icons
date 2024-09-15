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

public val LineAwesomeIcons.Opera: ImageVector
    get() {
        if (_opera != null) {
            return _opera!!
        }
        _opera = Builder(name = "Opera", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.969f, 4.0f)
                curveTo(9.672f, 4.0f, 5.0f, 8.945f, 5.0f, 15.906f)
                curveTo(5.0f, 22.191f, 9.461f, 28.0f, 15.969f, 28.0f)
                curveTo(22.527f, 28.0f, 27.0f, 22.191f, 27.0f, 15.906f)
                curveTo(27.0f, 8.883f, 22.211f, 4.0f, 15.969f, 4.0f)
                close()
                moveTo(15.969f, 6.0f)
                curveTo(21.211f, 6.0f, 25.0f, 9.754f, 25.0f, 15.906f)
                curveTo(25.0f, 21.262f, 21.344f, 26.0f, 15.969f, 26.0f)
                curveTo(10.652f, 26.0f, 7.0f, 21.262f, 7.0f, 15.906f)
                curveTo(7.0f, 9.793f, 10.676f, 6.0f, 15.969f, 6.0f)
                close()
                moveTo(15.969f, 6.313f)
                curveTo(14.926f, 6.313f, 13.973f, 6.719f, 13.313f, 7.375f)
                curveTo(12.652f, 8.031f, 12.234f, 8.867f, 11.938f, 9.781f)
                curveTo(11.34f, 11.613f, 11.219f, 13.797f, 11.219f, 15.719f)
                curveTo(11.219f, 17.48f, 11.285f, 19.727f, 11.844f, 21.656f)
                curveTo(12.121f, 22.621f, 12.516f, 23.535f, 13.188f, 24.25f)
                curveTo(13.859f, 24.965f, 14.855f, 25.438f, 15.969f, 25.438f)
                curveTo(17.09f, 25.438f, 18.066f, 24.961f, 18.75f, 24.25f)
                curveTo(19.434f, 23.539f, 19.84f, 22.621f, 20.125f, 21.656f)
                curveTo(20.699f, 19.727f, 20.781f, 17.5f, 20.781f, 15.719f)
                curveTo(20.781f, 13.652f, 20.621f, 11.492f, 20.0f, 9.688f)
                curveTo(19.688f, 8.785f, 19.266f, 7.941f, 18.594f, 7.313f)
                curveTo(17.922f, 6.684f, 16.996f, 6.313f, 15.969f, 6.313f)
                close()
                moveTo(15.969f, 8.313f)
                curveTo(16.539f, 8.313f, 16.875f, 8.461f, 17.219f, 8.781f)
                curveTo(17.563f, 9.102f, 17.883f, 9.613f, 18.125f, 10.313f)
                curveTo(18.609f, 11.715f, 18.781f, 13.754f, 18.781f, 15.719f)
                curveTo(18.781f, 17.438f, 18.676f, 19.547f, 18.219f, 21.094f)
                curveTo(17.988f, 21.867f, 17.672f, 22.5f, 17.313f, 22.875f)
                curveTo(16.953f, 23.25f, 16.594f, 23.438f, 15.969f, 23.438f)
                curveTo(15.359f, 23.438f, 15.008f, 23.25f, 14.656f, 22.875f)
                curveTo(14.305f, 22.5f, 13.973f, 21.871f, 13.75f, 21.094f)
                curveTo(13.301f, 19.539f, 13.219f, 17.426f, 13.219f, 15.719f)
                curveTo(13.219f, 13.891f, 13.375f, 11.852f, 13.844f, 10.406f)
                curveTo(14.078f, 9.684f, 14.41f, 9.148f, 14.75f, 8.813f)
                curveTo(15.09f, 8.477f, 15.414f, 8.313f, 15.969f, 8.313f)
                close()
            }
        }
        .build()
        return _opera!!
    }

private var _opera: ImageVector? = null
