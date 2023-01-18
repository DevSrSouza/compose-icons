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

public val ThinGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.9f, 74.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.6f, -5.6f)
                curveToRelative(0.4f, -0.4f, 10.9f, -8.6f, 27.5f, -12.8f)
                reflectiveCurveToRelative(39.2f, -4.8f, 65.2f, 12.6f)
                curveToRelative(18.8f, 12.5f, 38.5f, 16.4f, 58.5f, 11.5f)
                arcToRelative(72.4f, 72.4f, 0.0f, false, false, 24.8f, -11.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, 6.2f)
                curveToRelative(-0.4f, 0.4f, -10.9f, 8.6f, -27.5f, 12.8f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, true, -18.7f, 2.3f)
                curveToRelative(-13.4f, 0.0f, -29.5f, -3.5f, -46.5f, -14.9f)
                curveTo(107.0f, 62.8f, 87.3f, 58.9f, 67.3f, 63.8f)
                arcTo(72.4f, 72.4f, 0.0f, false, false, 42.5f, 75.1f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.9f, 74.5f)
                close()
                moveTo(213.5f, 124.9f)
                arcToRelative(72.4f, 72.4f, 0.0f, false, true, -24.8f, 11.3f)
                curveToRelative(-20.0f, 4.9f, -39.7f, 1.0f, -58.5f, -11.5f)
                curveToRelative(-26.0f, -17.4f, -49.8f, -16.4f, -65.2f, -12.6f)
                reflectiveCurveToRelative(-27.1f, 12.4f, -27.5f, 12.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.0f, 6.2f)
                arcToRelative(72.4f, 72.4f, 0.0f, false, true, 24.8f, -11.3f)
                curveToRelative(20.0f, -4.9f, 39.7f, -1.0f, 58.5f, 11.5f)
                curveToRelative(17.0f, 11.4f, 33.1f, 14.9f, 46.5f, 14.9f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, false, 18.7f, -2.3f)
                curveToRelative(16.6f, -4.2f, 27.1f, -12.4f, 27.5f, -12.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, -6.2f)
                close()
                moveTo(213.5f, 180.9f)
                arcToRelative(72.4f, 72.4f, 0.0f, false, true, -24.8f, 11.3f)
                curveToRelative(-20.0f, 4.9f, -39.7f, 1.0f, -58.5f, -11.5f)
                curveToRelative(-26.0f, -17.4f, -49.8f, -16.4f, -65.2f, -12.6f)
                reflectiveCurveToRelative(-27.1f, 12.4f, -27.5f, 12.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 6.2f)
                arcToRelative(72.4f, 72.4f, 0.0f, false, true, 24.8f, -11.3f)
                curveToRelative(20.0f, -4.9f, 39.7f, -1.0f, 58.5f, 11.5f)
                curveToRelative(17.0f, 11.4f, 33.1f, 14.9f, 46.5f, 14.9f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, false, 18.7f, -2.3f)
                curveToRelative(16.6f, -4.2f, 27.1f, -12.4f, 27.5f, -12.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, -6.2f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
