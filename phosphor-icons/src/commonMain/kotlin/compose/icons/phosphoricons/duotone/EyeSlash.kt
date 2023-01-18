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

public val DuotoneGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 56.0f)
                curveTo(48.0f, 56.0f, 16.0f, 128.0f, 16.0f, 128.0f)
                reflectiveCurveToRelative(32.0f, 72.0f, 112.0f, 72.0f)
                reflectiveCurveToRelative(112.0f, -72.0f, 112.0f, -72.0f)
                reflectiveCurveTo(208.0f, 56.0f, 128.0f, 56.0f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.9f, 34.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(61.3f, 66.5f)
                curveTo(25.0f, 88.8f, 9.4f, 123.2f, 8.7f, 124.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.0f, 6.4f)
                curveToRelative(0.3f, 0.8f, 8.8f, 19.6f, 27.6f, 38.5f)
                curveTo(61.4f, 194.7f, 93.1f, 208.0f, 128.0f, 208.0f)
                arcToRelative(128.6f, 128.6f, 0.0f, false, false, 52.1f, -10.8f)
                lineToRelative(22.0f, 24.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
                moveTo(101.2f, 110.5f)
                lineTo(142.9f, 156.3f)
                arcTo(31.6f, 31.6f, 0.0f, false, true, 128.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -26.8f, -49.5f)
                close()
                moveTo(128.0f, 192.0f)
                curveToRelative(-30.8f, 0.0f, -57.7f, -11.2f, -79.9f, -33.3f)
                arcTo(131.5f, 131.5f, 0.0f, false, true, 24.9f, 128.0f)
                curveToRelative(4.7f, -8.8f, 19.7f, -33.4f, 47.4f, -49.4f)
                lineToRelative(18.0f, 19.8f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 63.6f, 70.0f)
                lineToRelative(14.7f, 16.2f)
                arcTo(112.1f, 112.1f, 0.0f, false, true, 128.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.3f, 124.8f)
                curveToRelative(-0.3f, -0.8f, -8.8f, -19.6f, -27.6f, -38.5f)
                curveTo(194.6f, 61.3f, 162.9f, 48.0f, 128.0f, 48.0f)
                arcToRelative(132.4f, 132.4f, 0.0f, false, false, -22.0f, 1.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 99.4f, 59.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 9.2f, 6.6f)
                arcTo(112.9f, 112.9f, 0.0f, false, true, 128.0f, 64.0f)
                curveToRelative(30.8f, 0.0f, 57.7f, 11.2f, 79.9f, 33.2f)
                arcTo(130.3f, 130.3f, 0.0f, false, true, 231.0f, 128.0f)
                arcToRelative(132.6f, 132.6f, 0.0f, false, true, -27.7f, 35.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.6f, 11.3f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 5.9f, 2.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 5.3f, -2.0f)
                curveToRelative(22.9f, -20.5f, 33.0f, -42.9f, 33.4f, -43.9f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 247.3f, 124.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.9f, 125.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.9f, 7.2f)
                horizontalLineToRelative(0.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.2f, -8.7f)
                arcTo(48.3f, 48.3f, 0.0f, false, false, 137.0f, 80.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.0f, 15.8f)
                arcTo(32.2f, 32.2f, 0.0f, false, true, 159.9f, 125.0f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
