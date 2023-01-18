package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.9f, 31.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 39.1f, 48.1f)
                lineTo(55.2f, 65.7f)
                curveTo(20.7f, 88.6f, 5.7f, 121.6f, 5.0f, 123.1f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, false, 0.0f, 9.8f)
                arcToRelative(149.8f, 149.8f, 0.0f, false, false, 28.5f, 39.6f)
                curveTo(59.4f, 198.3f, 92.0f, 212.0f, 128.0f, 212.0f)
                arcToRelative(132.1f, 132.1f, 0.0f, false, false, 51.0f, -10.0f)
                lineToRelative(20.1f, 22.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.8f, -17.0f)
                close()
                moveTo(128.0f, 188.0f)
                curveToRelative(-29.6f, 0.0f, -55.5f, -10.7f, -76.9f, -31.9f)
                arcTo(131.4f, 131.4f, 0.0f, false, true, 29.5f, 128.0f)
                curveToRelative(5.3f, -9.3f, 18.8f, -29.9f, 42.0f, -44.3f)
                lineToRelative(90.1f, 99.1f)
                arcTo(106.9f, 106.9f, 0.0f, false, true, 128.0f, 188.0f)
                close()
                moveTo(251.0f, 132.9f)
                curveToRelative(-0.4f, 0.8f, -9.0f, 19.9f, -28.1f, 39.1f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -8.5f, 3.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -8.5f, -20.5f)
                arcTo(128.5f, 128.5f, 0.0f, false, false, 226.5f, 128.0f)
                arcToRelative(131.4f, 131.4f, 0.0f, false, false, -21.6f, -28.1f)
                curveTo(183.5f, 78.7f, 157.6f, 68.0f, 128.0f, 68.0f)
                curveToRelative(-3.3f, 0.0f, -6.7f, 0.1f, -10.0f, 0.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -12.9f, -10.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.9f, -13.0f)
                curveToRelative(3.9f, -0.3f, 8.0f, -0.5f, 12.0f, -0.5f)
                curveToRelative(36.0f, 0.0f, 68.6f, 13.7f, 94.5f, 39.5f)
                arcTo(149.8f, 149.8f, 0.0f, false, true, 251.0f, 123.1f)
                arcTo(12.8f, 12.8f, 0.0f, false, true, 251.0f, 132.9f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
