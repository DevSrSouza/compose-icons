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

public val LineAwesomeIcons.Cloudscale: ImageVector
    get() {
        if (_cloudscale != null) {
            return _cloudscale!!
        }
        _cloudscale = Builder(name = "Cloudscale", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(16.0f, 9.0f)
                curveTo(12.134f, 9.0f, 9.0f, 12.134f, 9.0f, 16.0f)
                curveTo(9.0f, 16.225f, 9.0122f, 16.447f, 9.0332f, 16.666f)
                curveTo(9.2072f, 14.063f, 11.353f, 12.0f, 14.0f, 12.0f)
                curveTo(15.3091f, 12.0f, 16.4867f, 12.5153f, 17.375f, 13.3418f)
                lineTo(16.5117f, 14.0742f)
                curveTo(16.3477f, 14.0312f, 16.178f, 14.0f, 16.0f, 14.0f)
                curveTo(14.895f, 14.0f, 14.0f, 14.895f, 14.0f, 16.0f)
                curveTo(14.0f, 17.105f, 14.895f, 18.0f, 16.0f, 18.0f)
                curveTo(17.105f, 18.0f, 18.0f, 17.105f, 18.0f, 16.0f)
                curveTo(18.0f, 15.822f, 17.9688f, 15.6523f, 17.9258f, 15.4883f)
                lineTo(21.8535f, 10.8535f)
                curveTo(21.9435f, 10.7625f, 22.0f, 10.638f, 22.0f, 10.5f)
                curveTo(22.0f, 10.224f, 21.776f, 10.0f, 21.5f, 10.0f)
                curveTo(21.362f, 10.0f, 21.2375f, 10.0565f, 21.1465f, 10.1465f)
                lineTo(20.5313f, 10.668f)
                curveTo(19.3097f, 9.6294f, 17.7292f, 9.0f, 16.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cloudscale!!
    }

private var _cloudscale: ImageVector? = null
