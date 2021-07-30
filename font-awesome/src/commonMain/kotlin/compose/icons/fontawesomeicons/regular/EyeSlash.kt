package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(634.0f, 471.0f)
                lineTo(36.0f, 3.51f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 13.51f, 6.0f)
                lineToRelative(-10.0f, 12.49f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.0f, 41.0f)
                lineToRelative(598.0f, 467.49f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.49f, -2.49f)
                lineToRelative(10.0f, -12.49f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 634.0f, 471.0f)
                close()
                moveTo(296.79f, 146.47f)
                lineToRelative(134.79f, 105.38f)
                curveTo(429.36f, 191.91f, 380.48f, 144.0f, 320.0f, 144.0f)
                arcToRelative(112.26f, 112.26f, 0.0f, false, false, -23.21f, 2.47f)
                close()
                moveTo(343.21f, 365.54f)
                lineTo(208.42f, 260.16f)
                curveTo(210.65f, 320.09f, 259.53f, 368.0f, 320.0f, 368.0f)
                arcToRelative(113.0f, 113.0f, 0.0f, false, false, 23.21f, -2.46f)
                close()
                moveTo(320.0f, 112.0f)
                curveToRelative(98.65f, 0.0f, 189.09f, 55.0f, 237.93f, 144.0f)
                arcToRelative(285.53f, 285.53f, 0.0f, false, true, -44.0f, 60.2f)
                lineToRelative(37.74f, 29.5f)
                arcToRelative(333.7f, 333.7f, 0.0f, false, false, 52.9f, -75.11f)
                arcToRelative(32.35f, 32.35f, 0.0f, false, false, 0.0f, -29.19f)
                curveTo(550.29f, 135.59f, 442.93f, 64.0f, 320.0f, 64.0f)
                curveToRelative(-36.7f, 0.0f, -71.71f, 7.0f, -104.63f, 18.81f)
                lineToRelative(46.41f, 36.29f)
                curveToRelative(18.94f, -4.3f, 38.34f, -7.1f, 58.22f, -7.1f)
                close()
                moveTo(320.0f, 400.0f)
                curveToRelative(-98.65f, 0.0f, -189.08f, -55.0f, -237.93f, -144.0f)
                arcToRelative(285.47f, 285.47f, 0.0f, false, true, 44.05f, -60.19f)
                lineToRelative(-37.74f, -29.5f)
                arcToRelative(333.6f, 333.6f, 0.0f, false, false, -52.89f, 75.1f)
                arcToRelative(32.35f, 32.35f, 0.0f, false, false, 0.0f, 29.19f)
                curveTo(89.72f, 376.41f, 197.08f, 448.0f, 320.0f, 448.0f)
                curveToRelative(36.7f, 0.0f, 71.71f, -7.05f, 104.63f, -18.81f)
                lineToRelative(-46.41f, -36.28f)
                curveTo(359.28f, 397.2f, 339.89f, 400.0f, 320.0f, 400.0f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
