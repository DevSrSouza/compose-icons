package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.VpnLock: ImageVector
    get() {
        if (_vpnLock != null) {
            return _vpnLock!!
        }
        _vpnLock = Builder(name = "VpnLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                curveToRelative(0.0f, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f)
                lineTo(16.9f, 17.0f)
                lineTo(14.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 3.46f)
                curveToRelative(-0.95f, -0.3f, -1.95f, -0.46f, -3.0f, -0.46f)
                curveTo(5.48f, 3.0f, 1.0f, 7.48f, 1.0f, 13.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveToRelative(0.0f, -0.34f, -0.02f, -0.67f, -0.05f, -1.0f)
                horizontalLineToRelative(-2.03f)
                curveToRelative(0.04f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f)
                close()
                moveTo(10.0f, 20.93f)
                curveToRelative(-3.95f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f)
                curveToRelative(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.93f)
                close()
                moveTo(22.0f, 4.0f)
                verticalLineToRelative(-0.36f)
                curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f)
                curveTo(18.26f, 0.86f, 17.0f, 2.03f, 17.0f, 3.5f)
                lineTo(17.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                lineTo(23.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(21.0f, 4.0f)
                close()
            }
        }
        .build()
        return _vpnLock!!
    }

private var _vpnLock: ImageVector? = null
