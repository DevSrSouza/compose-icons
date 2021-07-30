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
                curveTo(3.9336f, 10.8164f, 9.1172f, 11.6836f, 15.4063f, 11.8125f)
                curveTo(19.1172f, 11.8906f, 27.2813f, 11.5742f, 27.2813f, 13.5625f)
                curveTo(27.2813f, 15.0547f, 21.8438f, 19.7305f, 21.8438f, 20.6875f)
                curveTo(21.8438f, 20.6875f, 25.6133f, 17.5f, 27.7188f, 15.625f)
                curveTo(29.8242f, 13.75f, 31.0f, 12.6406f, 31.0f, 11.5313f)
                curveTo(31.0f, 9.2734f, 22.2695f, 9.6875f, 15.2188f, 9.6875f)
                curveTo(8.168f, 9.6875f, 4.3125f, 8.3516f, 1.0f, 5.25f)
                close()
                moveTo(8.875f, 22.5313f)
                curveTo(7.707f, 22.5313f, 6.75f, 23.457f, 6.75f, 24.625f)
                curveTo(6.75f, 25.793f, 7.707f, 26.75f, 8.875f, 26.75f)
                curveTo(10.043f, 26.75f, 10.9688f, 25.793f, 10.9688f, 24.625f)
                curveTo(10.9688f, 23.457f, 10.043f, 22.5313f, 8.875f, 22.5313f)
                close()
                moveTo(18.625f, 22.5313f)
                curveTo(17.457f, 22.5313f, 16.5313f, 23.457f, 16.5313f, 24.625f)
                curveTo(16.5313f, 25.793f, 17.457f, 26.75f, 18.625f, 26.75f)
                curveTo(19.793f, 26.75f, 20.75f, 25.793f, 20.75f, 24.625f)
                curveTo(20.75f, 23.457f, 19.793f, 22.5313f, 18.625f, 22.5313f)
                close()
            }
        }
        .build()
        return _opencart!!
    }

private var _opencart: ImageVector? = null
