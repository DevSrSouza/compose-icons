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

public val RegularGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 115.5f)
                lineToRelative(-8.7f, 7.2f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -5.1f, 1.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.2f, -14.2f)
                lineToRelative(8.8f, -7.2f)
                curveToRelative(0.1f, -0.1f, 0.3f, -0.3f, 0.1f, -0.8f)
                reflectiveCurveToRelative(-0.2f, -0.4f, -0.3f, -0.4f)
                lineToRelative(-11.5f, -0.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.0f, -16.0f)
                lineToRelative(11.5f, 0.7f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, 14.6f, 11.4f)
                arcTo(16.8f, 16.8f, 0.0f, false, true, 234.0f, 115.5f)
                close()
                moveTo(173.1f, 157.8f)
                lineTo(176.4f, 170.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.7f, 6.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 2.0f, -0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.8f, -9.7f)
                lineToRelative(-3.3f, -13.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.2f, -0.8f)
                lineToRelative(10.0f, -8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.0f, -11.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -11.2f, -1.0f)
                lineToRelative(-10.1f, 8.3f)
                arcTo(16.8f, 16.8f, 0.0f, false, false, 173.1f, 157.8f)
                close()
                moveTo(177.7f, 99.0f)
                lineToRelative(-13.2f, -0.8f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, -14.1f, -10.4f)
                lineTo(136.0f, 51.6f)
                verticalLineToRelative(132.0f)
                lineToRelative(0.7f, 0.4f)
                lineToRelative(11.5f, 7.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.6f, 13.5f)
                lineToRelative(-11.5f, -7.3f)
                horizontalLineToRelative(-0.2f)
                lineTo(81.0f, 227.2f)
                arcToRelative(17.6f, 17.6f, 0.0f, false, true, -9.6f, 2.8f)
                arcToRelative(18.2f, 18.2f, 0.0f, false, true, -17.5f, -23.0f)
                lineToRelative(13.5f, -53.1f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.2f, -0.8f)
                lineTo(22.0f, 115.5f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, true, -5.2f, -18.1f)
                arcTo(16.4f, 16.4f, 0.0f, false, true, 31.4f, 86.0f)
                lineToRelative(59.0f, -3.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.3f)
                lineToRelative(22.0f, -55.5f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, 30.4f, 0.0f)
                lineToRelative(22.0f, 55.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, 0.3f)
                lineToRelative(13.1f, 0.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -1.0f, 15.9f)
                close()
                moveTo(119.3f, 184.0f)
                lineTo(120.0f, 183.6f)
                lineTo(120.0f, 51.6f)
                lineTo(105.6f, 87.8f)
                arcTo(16.4f, 16.4f, 0.0f, false, true, 91.5f, 98.2f)
                lineTo(32.4f, 102.0f)
                curveToRelative(-0.1f, 0.0f, -0.2f, 0.0f, -0.3f, 0.4f)
                reflectiveCurveToRelative(0.0f, 0.7f, 0.1f, 0.8f)
                lineToRelative(45.3f, 37.6f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, true, 5.4f, 17.0f)
                lineTo(69.4f, 211.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.9f, 2.6f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 2.1f, 0.1f)
                close()
                moveTo(200.4f, 200.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -9.8f, -5.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.7f, 9.7f)
                lineToRelative(2.7f, 10.9f)
                curveToRelative(0.1f, 0.4f, 0.1f, 0.5f, 0.0f, 0.6f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, -0.3f, 0.3f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-9.8f, -6.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.6f, 13.5f)
                lineToRelative(9.9f, 6.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 8.7f, 2.6f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, false, 9.5f, -3.1f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, 6.3f, -17.7f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
