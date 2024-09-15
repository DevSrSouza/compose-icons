package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Bowl: ImageVector
    get() {
        if (_bowl != null) {
            return _bowl!!
        }
        _bowl = Builder(name = "Bowl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.547f, 3.672f)
                curveTo(20.156f, 3.281f, 19.523f, 3.281f, 19.133f, 3.672f)
                lineTo(13.769f, 9.036f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.036f)
                horizontalLineTo(2.008f)
                curveTo(2.226f, 16.366f, 6.616f, 20.621f, 12.0f, 20.621f)
                curveTo(17.384f, 20.621f, 21.774f, 16.366f, 21.992f, 11.036f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.036f)
                horizontalLineTo(16.597f)
                lineTo(20.547f, 5.086f)
                curveTo(20.937f, 4.695f, 20.937f, 4.062f, 20.547f, 3.672f)
                close()
                moveTo(14.176f, 11.036f)
                curveTo(14.181f, 11.036f, 14.185f, 11.036f, 14.19f, 11.036f)
                horizontalLineTo(19.99f)
                curveTo(19.774f, 15.261f, 16.279f, 18.621f, 12.0f, 18.621f)
                curveTo(7.721f, 18.621f, 4.226f, 15.261f, 4.011f, 11.036f)
                horizontalLineTo(14.176f)
                close()
            }
        }
        .build()
        return _bowl!!
    }

private var _bowl: ImageVector? = null
