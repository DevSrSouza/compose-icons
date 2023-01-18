package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.8f, 186.5f)
                curveToRelative(-5.3f, 15.7f, -17.9f, 27.3f, -36.4f, 33.5f)
                arcToRelative(89.2f, 89.2f, 0.0f, false, true, -25.9f, 4.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                arcTo(89.2f, 89.2f, 0.0f, false, true, 36.0f, 192.6f)
                curveToRelative(6.2f, -18.5f, 17.8f, -31.1f, 33.5f, -36.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.6f, 3.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.8f, 7.6f)
                curveTo(51.1f, 175.1f, 45.4f, 200.0f, 44.0f, 212.0f)
                curveToRelative(11.9f, -1.5f, 37.0f, -7.1f, 44.4f, -29.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 7.6f, -3.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 99.8f, 186.5f)
                close()
                moveTo(200.1f, 109.6f)
                lineTo(190.6f, 119.2f)
                verticalLineToRelative(62.1f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -4.1f, 9.9f)
                lineToRelative(-32.4f, 32.3f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -9.9f, 4.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -13.7f, -11.3f)
                lineToRelative(-8.0f, -40.1f)
                lineTo(79.8f, 133.5f)
                lineToRelative(-40.1f, -8.0f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 29.0f, 115.8f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, 3.5f, -13.9f)
                lineTo(64.8f, 69.5f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, 9.9f, -4.1f)
                horizontalLineToRelative(62.1f)
                lineToRelative(9.6f, -9.5f)
                curveToRelative(27.9f, -28.0f, 56.5f, -27.2f, 67.5f, -25.5f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, 11.7f, 11.7f)
                curveTo(227.3f, 53.1f, 228.1f, 81.7f, 200.1f, 109.6f)
                close()
                moveTo(42.0f, 113.7f)
                lineToRelative(38.8f, 7.8f)
                lineToRelative(44.0f, -44.1f)
                lineTo(74.7f, 77.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.4f, 0.6f)
                lineTo(41.0f, 110.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.5f, 2.0f)
                arcTo(1.8f, 1.8f, 0.0f, false, false, 42.0f, 113.7f)
                close()
                moveTo(178.6f, 131.2f)
                lineTo(134.5f, 175.2f)
                lineTo(142.3f, 214.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.3f, 1.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -0.5f)
                lineTo(178.0f, 182.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.6f, -1.4f)
                close()
                moveTo(191.6f, 101.1f)
                curveToRelative(8.1f, -8.0f, 26.3f, -29.6f, 22.2f, -57.2f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.7f, -1.7f)
                curveToRelative(-27.6f, -4.1f, -49.2f, 14.1f, -57.2f, 22.2f)
                lineTo(143.6f, 75.7f)
                horizontalLineToRelative(0.0f)
                lineTo(91.2f, 128.0f)
                lineTo(128.0f, 164.8f)
                lineToRelative(52.3f, -52.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(11.3f, -11.3f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
