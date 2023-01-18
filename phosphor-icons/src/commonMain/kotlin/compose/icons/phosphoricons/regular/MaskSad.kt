package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.MaskSad: ImageVector
    get() {
        if (_maskSad != null) {
            return _maskSad!!
        }
        _maskSad = Builder(name = "MaskSad", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.8f, 125.3f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, true, -47.6f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.6f, -11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, 0.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 23.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -0.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 187.8f, 125.3f)
                close()
                moveTo(115.8f, 125.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.6f, -11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -23.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -0.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.6f, 11.3f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, false, 47.6f, 0.0f)
                close()
                moveTo(159.0f, 177.3f)
                arcToRelative(56.3f, 56.3f, 0.0f, false, false, -62.0f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -2.2f, 11.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.1f, 2.3f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, true, 44.2f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 11.1f, -2.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 159.0f, 177.3f)
                close()
                moveTo(224.0f, 48.3f)
                lineTo(224.0f, 104.0f)
                curveToRelative(0.0f, 35.8f, -9.7f, 69.5f, -27.2f, 95.0f)
                reflectiveCurveToRelative(-42.6f, 41.0f, -68.8f, 41.0f)
                reflectiveCurveToRelative(-50.7f, -14.5f, -68.8f, -41.0f)
                reflectiveCurveTo(32.0f, 139.8f, 32.0f, 104.0f)
                lineTo(32.0f, 48.3f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 53.8f, 33.4f)
                curveTo(67.8f, 38.9f, 96.2f, 48.0f, 128.0f, 48.0f)
                reflectiveCurveToRelative(60.2f, -9.1f, 74.2f, -14.6f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.3f)
                close()
                moveTo(208.0f, 48.3f)
                horizontalLineToRelative(0.0f)
                curveTo(192.9f, 54.2f, 162.4f, 64.0f, 128.0f, 64.0f)
                reflectiveCurveTo(63.1f, 54.2f, 48.0f, 48.3f)
                lineTo(48.0f, 104.0f)
                curveToRelative(0.0f, 32.6f, 8.7f, 63.1f, 24.4f, 86.0f)
                reflectiveCurveToRelative(34.8f, 34.0f, 55.6f, 34.0f)
                reflectiveCurveToRelative(40.5f, -12.1f, 55.6f, -34.0f)
                reflectiveCurveTo(208.0f, 136.6f, 208.0f, 104.0f)
                close()
            }
        }
        .build()
        return _maskSad!!
    }

private var _maskSad: ImageVector? = null
