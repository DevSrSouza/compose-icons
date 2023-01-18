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

public val BoldGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 114.7f)
                lineTo(228.0f, 56.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(48.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineToRelative(58.7f)
                arcToRelative(136.8f, 136.8f, 0.0f, false, false, 0.7f, 14.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(7.7f, 80.8f, 78.3f, 108.4f, 93.1f, 113.3f)
                arcToRelative(21.3f, 21.3f, 0.0f, false, false, 5.5f, 1.0f)
                horizontalLineToRelative(1.4f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, false, 5.5f, -1.0f)
                curveToRelative(14.8f, -4.9f, 85.4f, -32.5f, 93.1f, -113.3f)
                verticalLineToRelative(-0.2f)
                arcTo(133.6f, 133.6f, 0.0f, false, false, 228.0f, 114.7f)
                close()
                moveTo(204.0f, 114.7f)
                lineTo(204.0f, 116.0f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 60.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(52.0f, 60.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(56.0f)
                lineTo(52.0f, 116.0f)
                lineTo(52.0f, 60.0f)
                close()
                moveTo(54.6f, 140.0f)
                lineTo(116.0f, 140.0f)
                verticalLineToRelative(74.4f)
                curveTo(96.4f, 204.9f, 64.0f, 183.2f, 54.6f, 140.0f)
                close()
                moveTo(140.0f, 214.4f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(61.4f)
                curveTo(192.0f, 183.2f, 159.6f, 204.9f, 140.0f, 214.4f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
