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

public val LineAwesomeIcons.Opencart: ImageVector
    get() {
        if (_opencart != null) {
            return _opencart!!
        }
        _opencart = Builder(name = "Opencart", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 5.25f)
                curveTo(3.934f, 10.816f, 9.117f, 11.684f, 15.406f, 11.813f)
                curveTo(19.117f, 11.891f, 27.281f, 11.574f, 27.281f, 13.563f)
                curveTo(27.281f, 15.055f, 21.844f, 19.73f, 21.844f, 20.688f)
                curveTo(21.844f, 20.688f, 25.613f, 17.5f, 27.719f, 15.625f)
                curveTo(29.824f, 13.75f, 31.0f, 12.641f, 31.0f, 11.531f)
                curveTo(31.0f, 9.273f, 22.27f, 9.688f, 15.219f, 9.688f)
                curveTo(8.168f, 9.688f, 4.313f, 8.352f, 1.0f, 5.25f)
                close()
                moveTo(8.875f, 22.531f)
                curveTo(7.707f, 22.531f, 6.75f, 23.457f, 6.75f, 24.625f)
                curveTo(6.75f, 25.793f, 7.707f, 26.75f, 8.875f, 26.75f)
                curveTo(10.043f, 26.75f, 10.969f, 25.793f, 10.969f, 24.625f)
                curveTo(10.969f, 23.457f, 10.043f, 22.531f, 8.875f, 22.531f)
                close()
                moveTo(18.625f, 22.531f)
                curveTo(17.457f, 22.531f, 16.531f, 23.457f, 16.531f, 24.625f)
                curveTo(16.531f, 25.793f, 17.457f, 26.75f, 18.625f, 26.75f)
                curveTo(19.793f, 26.75f, 20.75f, 25.793f, 20.75f, 24.625f)
                curveTo(20.75f, 23.457f, 19.793f, 22.531f, 18.625f, 22.531f)
                close()
            }
        }
        .build()
        return _opencart!!
    }

private var _opencart: ImageVector? = null
