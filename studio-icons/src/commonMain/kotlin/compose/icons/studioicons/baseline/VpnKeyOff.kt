package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.VpnKeyOff: ImageVector
    get() {
        if (_vpnKeyOff != null) {
            return _vpnKeyOff!!
        }
        _vpnKeyOff = Builder(name = "VpnKeyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.83f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(12.83f)
                lineTo(20.83f, 18.0f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(2.59f, 2.59f)
                curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(2.21f, 0.0f, 4.15f, -1.2f, 5.18f, -2.99f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(8.99f, 11.82f)
                curveTo(9.0f, 11.88f, 9.0f, 11.94f, 9.0f, 12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.06f, 0.0f, 0.12f, 0.0f, 0.18f, 0.01f)
                lineTo(8.99f, 11.82f)
                close()
            }
        }
        .build()
        return _vpnKeyOff!!
    }

private var _vpnKeyOff: ImageVector? = null
