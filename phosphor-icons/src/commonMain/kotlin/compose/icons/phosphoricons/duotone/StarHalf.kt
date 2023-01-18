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

public val DuotoneGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                lineTo(128.0f, 189.4f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -4.4f, 1.3f)
                lineTo(76.7f, 220.4f)
                curveToRelative(-7.7f, 4.9f, -17.3f, -2.4f, -15.0f, -11.4f)
                lineToRelative(13.5f, -53.2f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -2.9f, -8.8f)
                lineTo(27.1f, 109.3f)
                curveToRelative(-5.9f, -4.9f, -2.9f, -14.8f, 4.8f, -15.3f)
                lineToRelative(59.0f, -3.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 7.3f, -5.4f)
                lineToRelative(22.0f, -55.4f)
                arcTo(8.3f, 8.3f, 0.0f, false, true, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.2f, 97.4f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 224.6f, 86.0f)
                lineToRelative(-59.0f, -3.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, -0.3f)
                lineToRelative(-22.0f, -55.5f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, -30.4f, 0.0f)
                lineToRelative(-22.0f, 55.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, 0.3f)
                lineTo(31.4f, 86.0f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 16.8f, 97.4f)
                arcTo(16.8f, 16.8f, 0.0f, false, false, 22.0f, 115.5f)
                lineToRelative(45.2f, 37.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.2f, 0.8f)
                lineTo(53.9f, 207.0f)
                arcToRelative(18.6f, 18.6f, 0.0f, false, false, 7.0f, 19.6f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 20.1f, 0.6f)
                lineToRelative(46.9f, -29.7f)
                horizontalLineToRelative(0.2f)
                lineToRelative(50.5f, 31.9f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 8.7f, 2.6f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, false, 9.5f, -3.1f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, 6.3f, -17.7f)
                lineToRelative(-14.5f, -57.3f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.2f, -0.8f)
                lineTo(234.0f, 115.5f)
                arcTo(16.8f, 16.8f, 0.0f, false, false, 239.2f, 97.4f)
                close()
                moveTo(72.4f, 213.7f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -2.1f, -0.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.9f, -2.6f)
                lineToRelative(13.5f, -53.2f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, false, -5.4f, -17.0f)
                lineTo(32.2f, 103.2f)
                curveToRelative(-0.1f, -0.1f, -0.3f, -0.3f, -0.1f, -0.8f)
                reflectiveCurveToRelative(0.2f, -0.4f, 0.3f, -0.4f)
                lineToRelative(59.1f, -3.8f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 14.1f, -10.4f)
                lineTo(120.0f, 51.6f)
                verticalLineToRelative(132.0f)
                lineToRelative(-0.7f, 0.4f)
                close()
                moveTo(223.8f, 103.2f)
                lineToRelative(-45.3f, 37.6f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, false, -5.4f, 17.0f)
                lineToRelative(14.5f, 57.3f)
                curveToRelative(0.1f, 0.4f, 0.1f, 0.5f, 0.0f, 0.6f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.3f, 0.3f)
                horizontalLineToRelative(-0.2f)
                lineTo(136.7f, 184.0f)
                lineToRelative(-0.7f, -0.4f)
                verticalLineTo(51.6f)
                lineToRelative(14.4f, 36.2f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 14.1f, 10.4f)
                lineToRelative(59.1f, 3.8f)
                curveToRelative(0.1f, 0.0f, 0.2f, 0.0f, 0.3f, 0.4f)
                reflectiveCurveTo(223.9f, 103.1f, 223.8f, 103.2f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
