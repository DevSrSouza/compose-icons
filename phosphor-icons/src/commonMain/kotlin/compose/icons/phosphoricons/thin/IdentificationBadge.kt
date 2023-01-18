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

public val ThinGroup.IdentificationBadge: ImageVector
    get() {
        if (_identificationBadge != null) {
            return _identificationBadge!!
        }
        _identificationBadge = Builder(name = "IdentificationBadge", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.7f, 166.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -37.4f, 0.0f)
                arcToRelative(63.0f, 63.0f, 0.0f, false, false, -32.5f, 22.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.8f, 5.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.2f, -1.6f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 89.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, -4.8f)
                arcTo(63.0f, 63.0f, 0.0f, false, false, 146.7f, 166.8f)
                close()
                moveTo(100.0f, 136.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 100.0f, 136.0f)
                close()
                moveTo(200.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                lineTo(44.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 28.0f)
                close()
                moveTo(204.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(200.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(92.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(96.0f, 68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 64.0f)
                close()
            }
        }
        .build()
        return _identificationBadge!!
    }

private var _identificationBadge: ImageVector? = null
