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

public val RoundGroup.NetworkWifi2Bar: ImageVector
    get() {
        if (_networkWifi2Bar != null) {
            return _networkWifi2Bar!!
        }
        _networkWifi2Bar = Builder(name = "NetworkWifi2Bar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(7.7f, 4.0f, 3.78f, 5.6f, 0.79f, 8.24f)
                curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f)
                lineToRelative(10.56f, 10.58f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f)
                lineTo(23.27f, 9.71f)
                curveToRelative(0.41f, -0.41f, 0.38f, -1.08f, -0.06f, -1.47f)
                curveTo(20.22f, 5.6f, 16.3f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(16.78f, 13.38f)
                curveTo(15.4f, 12.5f, 13.76f, 12.0f, 12.0f, 12.0f)
                curveToRelative(-1.76f, 0.0f, -3.4f, 0.5f, -4.78f, 1.38f)
                lineToRelative(-4.3f, -4.3f)
                curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f)
                lineTo(16.78f, 13.38f)
                close()
            }
        }
        .build()
        return _networkWifi2Bar!!
    }

private var _networkWifi2Bar: ImageVector? = null
