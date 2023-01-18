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

public val ThinGroup.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) {
            return _circleHalfTilt!!
        }
        _circleHalfTilt = Builder(name = "CircleHalfTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.7f, 57.3f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 57.3f, 198.7f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.7f, 57.3f)
                close()
                moveTo(188.0f, 197.7f)
                arcToRelative(91.2f, 91.2f, 0.0f, false, true, -24.0f, 15.0f)
                lineTo(164.0f, 97.7f)
                lineToRelative(24.0f, -24.0f)
                close()
                moveTo(100.0f, 161.7f)
                lineTo(124.0f, 137.7f)
                verticalLineToRelative(82.2f)
                arcToRelative(95.8f, 95.8f, 0.0f, false, true, -24.0f, -4.2f)
                close()
                moveTo(92.0f, 212.7f)
                arcToRelative(92.5f, 92.5f, 0.0f, false, true, -26.2f, -16.9f)
                lineTo(92.0f, 169.7f)
                close()
                moveTo(132.0f, 129.7f)
                lineTo(156.0f, 105.7f)
                verticalLineToRelative(110.0f)
                arcToRelative(95.8f, 95.8f, 0.0f, false, true, -24.0f, 4.2f)
                close()
                moveTo(36.0f, 128.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 190.2f, 60.2f)
                lineToRelative(-130.0f, 130.0f)
                arcTo(91.8f, 91.8f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(196.0f, 190.0f)
                lineTo(196.0f, 66.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, 0.0f, 124.0f)
                close()
            }
        }
        .build()
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
