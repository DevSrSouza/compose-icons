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

public val LineAwesomeIcons.Megaport: ImageVector
    get() {
        if (_megaport != null) {
            return _megaport!!
        }
        _megaport = Builder(name = "Megaport", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 10.672f)
                lineTo(13.0f, 12.672f)
                lineTo(13.0f, 15.707f)
                lineTo(10.0f, 18.105f)
                lineTo(10.0f, 19.586f)
                lineTo(10.0f, 22.0f)
                lineTo(11.0f, 23.0f)
                lineTo(12.0f, 22.0f)
                lineTo(12.0f, 19.586f)
                lineTo(12.0f, 19.066f)
                lineTo(13.5f, 17.865f)
                lineTo(15.0f, 19.066f)
                lineTo(15.0f, 22.0f)
                lineTo(16.0f, 23.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 19.586f)
                lineTo(17.0f, 19.066f)
                lineTo(18.5f, 17.865f)
                lineTo(20.0f, 19.066f)
                lineTo(20.0f, 22.0f)
                lineTo(21.0f, 23.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 19.586f)
                lineTo(22.0f, 18.105f)
                lineTo(19.0f, 15.707f)
                lineTo(19.0f, 12.672f)
                lineTo(17.0f, 10.672f)
                lineTo(17.0f, 8.0f)
                lineTo(16.0f, 7.0f)
                close()
                moveTo(16.0f, 12.5f)
                lineTo(17.0f, 13.5f)
                lineTo(17.0f, 16.172f)
                lineTo(16.0f, 17.172f)
                lineTo(15.0f, 16.172f)
                lineTo(15.0f, 13.5f)
                lineTo(16.0f, 12.5f)
                close()
            }
        }
        .build()
        return _megaport!!
    }

private var _megaport: ImageVector? = null
