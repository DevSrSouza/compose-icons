package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.9f, 185.8f)
                curveToRelative(-5.1f, 15.2f, -17.2f, 26.3f, -35.1f, 32.3f)
                arcToRelative(87.1f, 87.1f, 0.0f, false, true, -25.3f, 4.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                arcToRelative(87.1f, 87.1f, 0.0f, false, true, 4.4f, -25.3f)
                curveToRelative(6.0f, -17.9f, 17.1f, -30.0f, 32.3f, -35.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, 2.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.5f, 5.0f)
                curveToRelative(-24.9f, 8.3f, -29.9f, 37.5f, -31.0f, 48.6f)
                curveToRelative(11.1f, -1.1f, 40.3f, -6.1f, 48.6f, -31.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.0f, -2.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 97.9f, 185.8f)
                close()
                moveTo(198.7f, 108.2f)
                lineTo(188.6f, 118.3f)
                verticalLineToRelative(63.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -3.5f, 8.4f)
                lineToRelative(-32.4f, 32.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.5f, 3.5f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, -3.5f, -0.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.2f, -9.1f)
                lineToRelative(-8.2f, -40.8f)
                lineTo(80.8f, 131.7f)
                lineToRelative(-40.7f, -8.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -9.2f, -8.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.0f, -12.0f)
                lineTo(66.3f, 70.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 8.4f, -3.5f)
                horizontalLineToRelative(63.0f)
                lineToRelative(10.1f, -10.1f)
                curveToRelative(27.3f, -27.3f, 55.1f, -26.6f, 65.8f, -25.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 10.1f, 10.1f)
                curveTo(225.3f, 53.1f, 226.0f, 80.9f, 198.7f, 108.2f)
                close()
                moveTo(41.6f, 115.7f)
                lineToRelative(39.8f, 8.0f)
                lineToRelative(48.3f, -48.3f)
                horizontalLineToRelative(-55.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.8f, 1.2f)
                lineTo(39.6f, 108.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.0f, 6.8f)
                close()
                moveTo(180.6f, 126.3f)
                lineTo(132.3f, 174.6f)
                lineTo(140.3f, 214.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 6.8f, 2.0f)
                lineToRelative(32.3f, -32.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.2f, -2.8f)
                close()
                moveTo(193.1f, 102.5f)
                curveToRelative(24.7f, -24.7f, 24.1f, -49.4f, 22.6f, -58.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -3.3f, -3.3f)
                curveToRelative(-9.5f, -1.5f, -34.2f, -2.1f, -58.9f, 22.6f)
                lineTo(142.1f, 74.3f)
                horizontalLineToRelative(0.0f)
                lineTo(88.4f, 128.0f)
                lineTo(128.0f, 167.6f)
                lineToRelative(53.7f, -53.7f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
