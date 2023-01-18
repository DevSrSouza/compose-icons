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

public val ThinGroup.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) {
            return _thermometerHot!!
        }
        _thermometerHot = Builder(name = "ThermometerHot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 164.3f)
                lineTo(124.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(116.0f, 164.3f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(120.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 204.0f)
                close()
                moveTo(180.9f, 82.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, 33.9f, 0.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 22.7f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -33.9f, 0.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -22.7f, 0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 180.9f, 82.8f)
                close()
                moveTo(243.1f, 117.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -33.9f, 0.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -22.7f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.6f, -5.6f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, 33.9f, 0.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 22.7f, 0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 243.1f, 117.2f)
                close()
                moveTo(156.0f, 145.1f)
                lineTo(156.0f, 48.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                verticalLineToRelative(97.1f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 72.0f, 0.0f)
                close()
                moveTo(120.0f, 236.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, true, 18.2f, -37.6f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 92.0f, 147.0f)
                lineTo(92.0f, 48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(99.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.7f, 3.3f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 120.0f, 236.0f)
                close()
            }
        }
        .build()
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null
