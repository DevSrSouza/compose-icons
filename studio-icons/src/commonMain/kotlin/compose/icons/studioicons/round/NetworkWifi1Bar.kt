package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.NetworkWifi1Bar: ImageVector
    get() {
        if (_networkWifi1Bar != null) {
            return _networkWifi1Bar!!
        }
        _networkWifi1Bar = Builder(name = "NetworkWifi1Bar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f)
                lineTo(12.0f, 21.0f)
                lineTo(24.0f, 8.98f)
                curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(15.32f, 14.84f)
                curveTo(14.34f, 14.3f, 13.2f, 14.0f, 12.0f, 14.0f)
                curveToRelative(-1.2f, 0.0f, -2.34f, 0.3f, -3.32f, 0.84f)
                lineTo(2.92f, 9.07f)
                curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f)
                lineTo(15.32f, 14.84f)
                close()
            }
        }
        .build()
        return _networkWifi1Bar!!
    }

private var _networkWifi1Bar: ImageVector? = null
