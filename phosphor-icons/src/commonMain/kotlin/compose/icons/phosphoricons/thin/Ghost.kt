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

public val ThinGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 108.0f, 116.0f)
                close()
                moveTo(156.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 108.0f)
                close()
                moveTo(220.0f, 120.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.3f, 3.6f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, -1.7f, 0.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.5f, -0.9f)
                lineToRelative(-26.8f, -21.9f)
                lineToRelative(-26.8f, 21.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.1f, 0.0f)
                lineTo(128.0f, 197.2f)
                lineToRelative(-26.8f, 21.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.1f, 0.0f)
                lineTo(69.3f, 197.2f)
                lineTo(42.5f, 219.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -4.2f, 0.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 216.0f)
                lineTo(36.0f, 120.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 184.0f, 0.0f)
                close()
                moveTo(212.0f, 120.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f)
                verticalLineToRelative(87.6f)
                lineToRelative(22.8f, -18.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 5.1f, 0.0f)
                lineToRelative(26.8f, 21.9f)
                lineToRelative(26.8f, -21.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.0f, 0.0f)
                lineToRelative(26.8f, 21.9f)
                lineToRelative(26.8f, -21.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 5.1f, 0.0f)
                lineTo(212.0f, 207.6f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
