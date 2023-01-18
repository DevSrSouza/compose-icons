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

public val BoldGroup.MaskSad: ImageVector
    get() {
        if (_maskSad != null) {
            return _maskSad!!
        }
        _maskSad = Builder(name = "MaskSad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(137.2f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.9f, -16.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 17.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.9f, 16.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, true, -53.6f, 0.0f)
                close()
                moveTo(118.8f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.9f, -16.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -17.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.9f, 16.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 53.6f, 0.0f)
                close()
                moveTo(161.2f, 174.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, false, -66.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.3f, 20.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 39.8f, 0.0f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, 6.6f, 2.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.7f, -22.0f)
                close()
                moveTo(228.0f, 48.3f)
                lineTo(228.0f, 104.0f)
                curveToRelative(0.0f, 36.6f, -9.9f, 71.2f, -27.9f, 97.3f)
                reflectiveCurveTo(155.6f, 244.0f, 128.0f, 244.0f)
                reflectiveCurveToRelative(-53.2f, -15.2f, -72.1f, -42.7f)
                reflectiveCurveTo(28.0f, 140.6f, 28.0f, 104.0f)
                lineTo(28.0f, 48.3f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, 8.7f, -16.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 18.5f, -2.1f)
                curveTo(69.0f, 35.0f, 96.8f, 44.0f, 128.0f, 44.0f)
                reflectiveCurveToRelative(59.0f, -9.0f, 72.8f, -14.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 18.5f, 2.1f)
                arcTo(20.2f, 20.2f, 0.0f, false, true, 228.0f, 48.3f)
                close()
                moveTo(204.0f, 54.1f)
                curveTo(187.4f, 60.0f, 159.3f, 68.0f, 128.0f, 68.0f)
                reflectiveCurveTo(68.6f, 60.0f, 52.0f, 54.1f)
                lineTo(52.0f, 104.0f)
                curveToRelative(0.0f, 31.8f, 8.4f, 61.5f, 23.7f, 83.7f)
                reflectiveCurveTo(108.6f, 220.0f, 128.0f, 220.0f)
                reflectiveCurveToRelative(38.0f, -11.5f, 52.3f, -32.3f)
                reflectiveCurveTo(204.0f, 135.8f, 204.0f, 104.0f)
                close()
            }
        }
        .build()
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null
