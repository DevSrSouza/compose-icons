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

public val LineAwesomeIcons.FlaskSolid: ImageVector
    get() {
        if (_flaskSolid != null) {
            return _flaskSolid!!
        }
        _flaskSolid = Builder(name = "FlaskSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 0.0f)
                curveTo(16.4492f, 0.0f, 16.0f, 0.4492f, 16.0f, 1.0f)
                curveTo(16.0f, 1.5508f, 16.4492f, 2.0f, 17.0f, 2.0f)
                curveTo(17.5508f, 2.0f, 18.0f, 1.5508f, 18.0f, 1.0f)
                curveTo(18.0f, 0.4492f, 17.5508f, 0.0f, 17.0f, 0.0f)
                close()
                moveTo(14.0f, 3.0f)
                curveTo(13.4492f, 3.0f, 13.0f, 3.4492f, 13.0f, 4.0f)
                lineTo(10.0f, 4.0f)
                lineTo(10.0f, 6.0f)
                lineTo(11.0f, 6.0f)
                lineTo(11.0f, 13.6563f)
                lineTo(4.8438f, 21.5938f)
                curveTo(4.3008f, 22.293f, 4.0f, 23.1484f, 4.0f, 24.0313f)
                curveTo(4.0f, 26.2148f, 5.7852f, 28.0f, 7.9688f, 28.0f)
                lineTo(24.0313f, 28.0f)
                curveTo(26.2148f, 28.0f, 28.0f, 26.2148f, 28.0f, 24.0313f)
                curveTo(28.0f, 23.1484f, 27.6992f, 22.293f, 27.1563f, 21.5938f)
                lineTo(21.0f, 13.6563f)
                lineTo(21.0f, 6.0f)
                lineTo(22.0f, 6.0f)
                lineTo(22.0f, 4.0f)
                lineTo(15.0f, 4.0f)
                curveTo(15.0f, 3.4492f, 14.5508f, 3.0f, 14.0f, 3.0f)
                close()
                moveTo(13.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 14.3438f)
                lineTo(21.8438f, 18.0f)
                lineTo(10.1563f, 18.0f)
                lineTo(13.0f, 14.3438f)
                close()
                moveTo(17.0f, 10.0f)
                curveTo(16.4492f, 10.0f, 16.0f, 10.4492f, 16.0f, 11.0f)
                curveTo(16.0f, 11.5508f, 16.4492f, 12.0f, 17.0f, 12.0f)
                curveTo(17.5508f, 12.0f, 18.0f, 11.5508f, 18.0f, 11.0f)
                curveTo(18.0f, 10.4492f, 17.5508f, 10.0f, 17.0f, 10.0f)
                close()
                moveTo(8.5938f, 20.0f)
                lineTo(23.4063f, 20.0f)
                lineTo(25.5938f, 22.8125f)
                curveTo(25.8633f, 23.1602f, 26.0f, 23.5938f, 26.0f, 24.0313f)
                curveTo(26.0f, 25.1367f, 25.1367f, 26.0f, 24.0313f, 26.0f)
                lineTo(7.9688f, 26.0f)
                curveTo(6.8633f, 26.0f, 6.0f, 25.1367f, 6.0f, 24.0313f)
                curveTo(6.0f, 23.5938f, 6.1367f, 23.1602f, 6.4063f, 22.8125f)
                close()
            }
        }
        .build()
        return _flaskSolid!!
    }

private var _flaskSolid: ImageVector? = null
