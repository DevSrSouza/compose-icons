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

public val LineAwesomeIcons.Behance: ImageVector
    get() {
        if (_behance != null) {
            return _behance!!
        }
        _behance = Builder(name = "Behance", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 6.75f)
                lineTo(1.0f, 25.25f)
                lineTo(9.938f, 25.25f)
                curveTo(10.766f, 25.25f, 16.469f, 25.082f, 16.469f, 19.875f)
                curveTo(16.469f, 16.621f, 14.23f, 15.516f, 13.094f, 15.188f)
                curveTo(13.93f, 14.793f, 15.594f, 13.855f, 15.594f, 11.344f)
                curveTo(15.594f, 9.945f, 15.395f, 6.75f, 9.688f, 6.75f)
                close()
                moveTo(21.375f, 8.469f)
                lineTo(21.375f, 10.156f)
                lineTo(28.281f, 10.156f)
                lineTo(28.281f, 8.469f)
                close()
                moveTo(5.063f, 9.906f)
                lineTo(8.875f, 9.906f)
                curveTo(9.234f, 9.906f, 11.656f, 9.715f, 11.656f, 12.031f)
                curveTo(11.656f, 14.012f, 9.906f, 14.219f, 9.188f, 14.219f)
                lineTo(5.063f, 14.219f)
                close()
                moveTo(25.0f, 11.688f)
                curveTo(19.777f, 11.688f, 18.688f, 16.223f, 18.688f, 18.188f)
                curveTo(18.688f, 24.02f, 23.469f, 24.688f, 25.0f, 24.688f)
                curveTo(29.129f, 24.688f, 30.301f, 22.016f, 30.781f, 20.531f)
                lineTo(27.781f, 20.531f)
                curveTo(27.664f, 20.914f, 26.789f, 22.156f, 25.125f, 22.156f)
                curveTo(22.336f, 22.156f, 22.094f, 19.977f, 22.094f, 19.0f)
                lineTo(30.969f, 19.0f)
                curveTo(31.148f, 15.625f, 29.672f, 11.688f, 25.0f, 11.688f)
                close()
                moveTo(24.906f, 14.219f)
                curveTo(25.738f, 14.219f, 26.41f, 14.461f, 26.813f, 14.906f)
                curveTo(27.215f, 15.355f, 27.512f, 16.012f, 27.594f, 16.875f)
                lineTo(22.094f, 16.875f)
                curveTo(22.109f, 16.637f, 22.164f, 16.363f, 22.25f, 16.063f)
                curveTo(22.336f, 15.754f, 22.469f, 15.461f, 22.688f, 15.188f)
                curveTo(22.906f, 14.918f, 23.211f, 14.684f, 23.563f, 14.5f)
                curveTo(23.922f, 14.313f, 24.367f, 14.219f, 24.906f, 14.219f)
                close()
                moveTo(5.063f, 17.0f)
                lineTo(9.469f, 17.0f)
                curveTo(10.344f, 17.0f, 12.406f, 17.137f, 12.406f, 19.656f)
                curveTo(12.406f, 22.098f, 9.809f, 22.094f, 9.406f, 22.094f)
                lineTo(5.063f, 22.094f)
                close()
            }
        }
        .build()
        return _behance!!
    }

private var _behance: ImageVector? = null
