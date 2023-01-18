package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) {
            return _maskHappy!!
        }
        _maskHappy = Builder(name = "MaskHappy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.3f)
                verticalLineTo(104.0f)
                curveToRelative(0.0f, 70.7f, -39.4f, 128.0f, -88.0f, 128.0f)
                reflectiveCurveTo(40.0f, 174.7f, 40.0f, 104.0f)
                verticalLineTo(48.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 10.9f, -7.4f)
                curveTo(66.0f, 46.7f, 95.1f, 56.0f, 128.0f, 56.0f)
                reflectiveCurveToRelative(62.0f, -9.3f, 77.1f, -15.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 216.0f, 48.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.8f, 122.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.6f, 11.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -5.3f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.0f, -2.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -23.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, 0.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.6f, -11.3f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, true, 47.6f, 0.0f)
                close()
                moveTo(103.9f, 133.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, 2.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 5.3f, -2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.6f, -11.3f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, false, -47.6f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.6f, 11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, -0.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 23.8f, 0.0f)
                close()
                moveTo(150.1f, 169.3f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, true, -44.2f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.1f, 2.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 97.0f, 182.7f)
                arcToRelative(56.3f, 56.3f, 0.0f, false, false, 62.0f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.2f, -11.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 150.1f, 169.3f)
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
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
