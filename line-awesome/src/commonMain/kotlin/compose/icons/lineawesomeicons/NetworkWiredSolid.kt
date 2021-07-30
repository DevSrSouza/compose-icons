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

public val LineAwesomeIcons.NetworkWiredSolid: ImageVector
    get() {
        if (_networkWiredSolid != null) {
            return _networkWiredSolid!!
        }
        _networkWiredSolid = Builder(name = "NetworkWiredSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                lineTo(13.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                curveTo(7.3555f, 6.0f, 6.0f, 7.3555f, 6.0f, 9.0f)
                lineTo(6.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                lineTo(4.0f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                lineTo(8.0f, 9.0f)
                curveTo(8.0f, 8.4336f, 8.4336f, 8.0f, 9.0f, 8.0f)
                lineTo(13.0f, 8.0f)
                lineTo(13.0f, 10.0f)
                lineTo(19.0f, 10.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                close()
                moveTo(20.0f, 6.0f)
                lineTo(20.0f, 8.0f)
                lineTo(23.0f, 8.0f)
                curveTo(23.5664f, 8.0f, 24.0f, 8.4336f, 24.0f, 9.0f)
                lineTo(24.0f, 13.0f)
                lineTo(22.0f, 13.0f)
                lineTo(22.0f, 19.0f)
                lineTo(28.0f, 19.0f)
                lineTo(28.0f, 13.0f)
                lineTo(26.0f, 13.0f)
                lineTo(26.0f, 9.0f)
                curveTo(26.0f, 7.3555f, 24.6445f, 6.0f, 23.0f, 6.0f)
                close()
                moveTo(6.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                lineTo(8.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                close()
                moveTo(24.0f, 15.0f)
                lineTo(26.0f, 15.0f)
                lineTo(26.0f, 17.0f)
                lineTo(24.0f, 17.0f)
                close()
                moveTo(6.0f, 20.0f)
                lineTo(6.0f, 23.0f)
                curveTo(6.0f, 24.6445f, 7.3555f, 26.0f, 9.0f, 26.0f)
                lineTo(13.0f, 26.0f)
                lineTo(13.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                curveTo(8.4336f, 24.0f, 8.0f, 23.5664f, 8.0f, 23.0f)
                lineTo(8.0f, 20.0f)
                close()
                moveTo(24.0f, 20.0f)
                lineTo(24.0f, 23.0f)
                curveTo(24.0f, 23.5664f, 23.5664f, 24.0f, 23.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 26.0f)
                lineTo(23.0f, 26.0f)
                curveTo(24.6445f, 26.0f, 26.0f, 24.6445f, 26.0f, 23.0f)
                lineTo(26.0f, 20.0f)
                close()
                moveTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                close()
            }
        }
        .build()
        return _networkWiredSolid!!
    }

private var _networkWiredSolid: ImageVector? = null
