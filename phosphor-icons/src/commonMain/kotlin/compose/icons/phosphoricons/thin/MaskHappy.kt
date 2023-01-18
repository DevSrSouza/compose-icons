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

public val ThinGroup.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) {
            return _maskHappy!!
        }
        _maskHappy = Builder(name = "MaskHappy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.9f, 125.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.3f, 5.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.7f, 1.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -3.0f, -1.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -29.8f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.7f, 0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.3f, -5.7f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 41.8f, 0.0f)
                close()
                moveTo(106.9f, 130.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 3.0f, 1.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.7f, -1.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, -5.7f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -41.8f, 0.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, 5.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, -0.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 29.8f, 0.0f)
                close()
                moveTo(152.3f, 172.7f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, true, -48.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.5f, 6.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 57.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.1f, -5.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 152.3f, 172.7f)
                close()
                moveTo(220.0f, 48.3f)
                lineTo(220.0f, 104.0f)
                curveToRelative(0.0f, 35.0f, -9.4f, 67.9f, -26.5f, 92.8f)
                reflectiveCurveTo(152.9f, 236.0f, 128.0f, 236.0f)
                reflectiveCurveToRelative(-48.1f, -13.9f, -65.5f, -39.2f)
                reflectiveCurveTo(36.0f, 139.0f, 36.0f, 104.0f)
                lineTo(36.0f, 48.3f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 5.2f, -9.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 11.1f, -1.3f)
                curveTo(66.7f, 42.7f, 95.5f, 52.0f, 128.0f, 52.0f)
                reflectiveCurveToRelative(61.3f, -9.3f, 75.7f, -14.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 11.1f, 1.3f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 220.0f, 48.3f)
                close()
                moveTo(212.0f, 48.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.4f, -3.7f)
                curveTo(191.7f, 50.3f, 161.8f, 60.0f, 128.0f, 60.0f)
                reflectiveCurveTo(64.3f, 50.3f, 49.4f, 44.6f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -1.4f, -0.3f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, -2.3f, 0.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 48.3f)
                lineTo(44.0f, 104.0f)
                curveToRelative(0.0f, 68.4f, 37.7f, 124.0f, 84.0f, 124.0f)
                reflectiveCurveToRelative(84.0f, -55.6f, 84.0f, -124.0f)
                close()
            }
        }
        .build()
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
