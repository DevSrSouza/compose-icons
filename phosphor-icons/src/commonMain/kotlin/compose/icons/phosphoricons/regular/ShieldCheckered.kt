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

public val RegularGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 114.7f)
                lineTo(224.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.7f)
                arcToRelative(127.4f, 127.4f, 0.0f, false, false, 0.7f, 14.0f)
                verticalLineToRelative(0.2f)
                curveToRelative(7.5f, 78.4f, 76.0f, 105.2f, 90.3f, 109.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(14.3f, -4.7f, 82.8f, -31.5f, 90.3f, -109.9f)
                verticalLineToRelative(-0.2f)
                arcTo(127.4f, 127.4f, 0.0f, false, false, 224.0f, 114.7f)
                close()
                moveTo(208.0f, 114.7f)
                curveToRelative(0.0f, 1.8f, -0.1f, 3.5f, -0.1f, 5.3f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 56.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(48.0f, 56.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(64.0f)
                lineTo(48.1f, 120.0f)
                curveToRelative(-0.1f, -1.8f, -0.1f, -3.5f, -0.1f, -5.3f)
                close()
                moveTo(49.8f, 136.0f)
                lineTo(120.0f, 136.0f)
                verticalLineToRelative(84.6f)
                curveTo(100.3f, 212.2f, 58.8f, 188.7f, 49.8f, 136.0f)
                close()
                moveTo(136.0f, 220.6f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(70.2f)
                curveTo(197.2f, 188.7f, 155.7f, 212.2f, 136.0f, 220.6f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
