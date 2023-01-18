package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) {
            return _rocketLaunch!!
        }
        _rocketLaunch = Builder(name = "RocketLaunch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(101.6f, 187.1f)
                curveToRelative(-5.4f, 16.4f, -18.4f, 28.4f, -37.5f, 34.8f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, -26.6f, 4.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, 4.6f, -26.6f)
                curveToRelative(6.4f, -19.1f, 18.4f, -32.1f, 34.8f, -37.5f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 74.0f, 169.5f)
                curveToRelative(-19.7f, 6.6f, -25.8f, 27.9f, -27.7f, 40.2f)
                curveToRelative(12.3f, -1.9f, 33.6f, -8.0f, 40.2f, -27.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.1f, 5.1f)
                close()
                moveTo(201.5f, 111.0f)
                lineToRelative(-8.9f, 9.0f)
                verticalLineToRelative(61.3f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -4.7f, 11.3f)
                lineToRelative(-32.4f, 32.3f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, -11.3f, 4.7f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -4.6f, -0.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.1f, -12.2f)
                lineToRelative(-7.9f, -39.5f)
                lineTo(78.8f, 135.4f)
                lineToRelative(-39.5f, -7.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.2f, -11.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 4.0f, -15.9f)
                lineTo(63.4f, 68.1f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 11.3f, -4.7f)
                lineTo(136.0f, 63.4f)
                lineToRelative(9.0f, -8.9f)
                curveToRelative(28.6f, -28.6f, 57.9f, -27.8f, 69.2f, -26.1f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, 13.4f, 13.4f)
                curveTo(229.3f, 53.1f, 230.1f, 82.4f, 201.5f, 111.0f)
                close()
                moveTo(42.4f, 111.8f)
                lineTo(80.1f, 119.3f)
                lineTo(120.0f, 79.4f)
                lineTo(74.7f, 79.4f)
                close()
                moveTo(94.1f, 128.0f)
                lineTo(128.0f, 161.9f)
                lineToRelative(62.2f, -62.2f)
                curveToRelative(7.8f, -7.8f, 25.6f, -28.8f, 21.6f, -55.5f)
                curveToRelative(-26.7f, -4.0f, -47.7f, 13.8f, -55.5f, 21.6f)
                close()
                moveTo(176.6f, 136.0f)
                lineTo(136.7f, 175.9f)
                lineTo(144.2f, 213.6f)
                lineTo(176.6f, 181.3f)
                close()
            }
        }
        .build()
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
