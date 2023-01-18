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

public val ThinGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 86.7f, 73.5f, 115.4f, 88.3f, 120.3f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 3.7f, 0.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 3.7f, -0.6f)
                curveToRelative(14.8f, -4.9f, 88.3f, -33.6f, 88.3f, -120.3f)
                lineTo(220.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(212.0f, 56.0f)
                verticalLineToRelative(58.7f)
                quadToRelative(0.0f, 4.8f, -0.3f, 9.3f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 52.0f)
                horizontalLineToRelative(76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 56.0f)
                close()
                moveTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(72.0f)
                lineTo(44.3f, 124.0f)
                quadToRelative(-0.3f, -4.5f, -0.3f, -9.3f)
                close()
                moveTo(45.1f, 132.0f)
                lineTo(124.0f, 132.0f)
                verticalLineToRelative(94.5f)
                curveTo(107.0f, 220.2f, 53.5f, 195.7f, 45.1f, 132.0f)
                close()
                moveTo(132.0f, 226.5f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(78.9f)
                curveTo(202.5f, 195.7f, 149.0f, 220.2f, 132.0f, 226.5f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
