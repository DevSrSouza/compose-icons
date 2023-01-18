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

public val BoldGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.4f, 223.9f)
                lineToRelative(-35.0f, -38.5f)
                horizontalLineToRelative(-0.1f)
                lineTo(42.4f, 15.9f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.6f, 32.1f)
                lineToRelative(9.1f, 10.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 92.2f, 78.1f, 122.7f, 93.8f, 127.9f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 12.4f, 0.0f)
                arcToRelative(151.0f, 151.0f, 0.0f, false, false, 53.0f, -31.6f)
                lineToRelative(26.4f, 29.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.8f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 231.4f, 223.9f)
                close()
                moveTo(128.0f, 219.4f)
                curveToRelative(-15.5f, -5.4f, -76.0f, -31.3f, -76.0f, -104.7f)
                verticalLineTo(62.2f)
                lineTo(171.1f, 193.3f)
                arcTo(127.6f, 127.6f, 0.0f, false, true, 128.0f, 219.4f)
                close()
                moveTo(97.4f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineTo(208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(58.7f)
                arcToRelative(138.2f, 138.2f, 0.0f, false, true, -7.8f, 46.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.3f, 7.9f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -4.1f, -0.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.2f, -15.4f)
                arcToRelative(115.1f, 115.1f, 0.0f, false, false, 6.4f, -38.7f)
                verticalLineTo(60.0f)
                horizontalLineTo(109.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 97.4f, 48.0f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
