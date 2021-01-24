package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 400.0f)
                curveToRelative(-75.85f, 0.0f, -137.25f, -58.71f, -142.9f, -133.11f)
                lineTo(72.2f, 185.82f)
                curveToRelative(-13.79f, 17.3f, -26.48f, 35.59f, -36.72f, 55.59f)
                arcToRelative(32.35f, 32.35f, 0.0f, false, false, 0.0f, 29.19f)
                curveTo(89.71f, 376.41f, 197.07f, 448.0f, 320.0f, 448.0f)
                curveToRelative(26.91f, 0.0f, 52.87f, -4.0f, 77.89f, -10.46f)
                lineTo(346.0f, 397.39f)
                arcToRelative(144.13f, 144.13f, 0.0f, false, true, -26.0f, 2.61f)
                close()
                moveTo(633.82f, 458.1f)
                lineToRelative(-110.55f, -85.44f)
                arcToRelative(331.25f, 331.25f, 0.0f, false, false, 81.25f, -102.07f)
                arcToRelative(32.35f, 32.35f, 0.0f, false, false, 0.0f, -29.19f)
                curveTo(550.29f, 135.59f, 442.93f, 64.0f, 320.0f, 64.0f)
                arcToRelative(308.15f, 308.15f, 0.0f, false, false, -147.32f, 37.7f)
                lineTo(45.46f, 3.37f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 23.0f, 6.18f)
                lineTo(3.37f, 31.45f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 6.18f, 53.9f)
                lineToRelative(588.36f, 454.73f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.46f, -2.81f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.82f, -22.45f)
                close()
                moveTo(450.1f, 316.1f)
                lineToRelative(-39.3f, -30.38f)
                arcTo(94.75f, 94.75f, 0.0f, false, false, 416.0f, 256.0f)
                arcToRelative(94.76f, 94.76f, 0.0f, false, false, -121.31f, -92.21f)
                arcTo(47.65f, 47.65f, 0.0f, false, true, 304.0f, 192.0f)
                arcToRelative(46.64f, 46.64f, 0.0f, false, true, -1.54f, 10.0f)
                lineToRelative(-73.61f, -56.89f)
                arcTo(142.31f, 142.31f, 0.0f, false, true, 320.0f, 112.0f)
                arcToRelative(143.92f, 143.92f, 0.0f, false, true, 144.0f, 144.0f)
                curveToRelative(0.0f, 21.63f, -5.29f, 41.79f, -13.9f, 60.11f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
