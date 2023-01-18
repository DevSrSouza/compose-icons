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

public val ThinGroup.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) {
            return _circleHalf!!
        }
        _circleHalf = Builder(name = "CircleHalf", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(132.0f, 36.1f)
                arcToRelative(87.0f, 87.0f, 0.0f, false, true, 24.0f, 4.3f)
                lineTo(156.0f, 215.6f)
                arcToRelative(90.9f, 90.9f, 0.0f, false, true, -24.0f, 4.3f)
                close()
                moveTo(164.0f, 43.3f)
                arcToRelative(94.2f, 94.2f, 0.0f, false, true, 24.0f, 15.0f)
                lineTo(188.0f, 197.7f)
                arcToRelative(94.2f, 94.2f, 0.0f, false, true, -24.0f, 15.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, 88.0f, -91.9f)
                lineTo(124.0f, 219.9f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(196.0f, 189.9f)
                lineTo(196.0f, 66.1f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, 0.0f, 123.8f)
                close()
            }
        }
        .build()
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
