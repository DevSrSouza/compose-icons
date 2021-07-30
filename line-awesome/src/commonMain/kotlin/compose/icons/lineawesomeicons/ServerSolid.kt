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

public val LineAwesomeIcons.ServerSolid: ImageVector
    get() {
        if (_serverSolid != null) {
            return _serverSolid!!
        }
        _serverSolid = Builder(name = "ServerSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                close()
                moveTo(7.0f, 9.0f)
                lineTo(7.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                lineTo(15.0f, 9.0f)
                close()
                moveTo(24.0f, 9.0f)
                curveTo(23.4492f, 9.0f, 23.0f, 9.4492f, 23.0f, 10.0f)
                curveTo(23.0f, 10.5508f, 23.4492f, 11.0f, 24.0f, 11.0f)
                curveTo(24.5508f, 11.0f, 25.0f, 10.5508f, 25.0f, 10.0f)
                curveTo(25.0f, 9.4492f, 24.5508f, 9.0f, 24.0f, 9.0f)
                close()
                moveTo(5.0f, 14.0f)
                lineTo(27.0f, 14.0f)
                lineTo(27.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                close()
                moveTo(7.0f, 15.0f)
                lineTo(7.0f, 17.0f)
                lineTo(15.0f, 17.0f)
                lineTo(15.0f, 15.0f)
                close()
                moveTo(24.0f, 15.0f)
                curveTo(23.4492f, 15.0f, 23.0f, 15.4492f, 23.0f, 16.0f)
                curveTo(23.0f, 16.5508f, 23.4492f, 17.0f, 24.0f, 17.0f)
                curveTo(24.5508f, 17.0f, 25.0f, 16.5508f, 25.0f, 16.0f)
                curveTo(25.0f, 15.4492f, 24.5508f, 15.0f, 24.0f, 15.0f)
                close()
                moveTo(5.0f, 20.0f)
                lineTo(27.0f, 20.0f)
                lineTo(27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
                moveTo(7.0f, 21.0f)
                lineTo(7.0f, 23.0f)
                lineTo(15.0f, 23.0f)
                lineTo(15.0f, 21.0f)
                close()
                moveTo(24.0f, 21.0f)
                curveTo(23.4492f, 21.0f, 23.0f, 21.4492f, 23.0f, 22.0f)
                curveTo(23.0f, 22.5508f, 23.4492f, 23.0f, 24.0f, 23.0f)
                curveTo(24.5508f, 23.0f, 25.0f, 22.5508f, 25.0f, 22.0f)
                curveTo(25.0f, 21.4492f, 24.5508f, 21.0f, 24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _serverSolid!!
    }

private var _serverSolid: ImageVector? = null
