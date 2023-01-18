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

public val RegularGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.3f, 232.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -8.7f, -2.6f)
                lineToRelative(-50.5f, -31.9f)
                horizontalLineToRelative(-0.2f)
                lineTo(81.0f, 227.2f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -20.1f, -0.6f)
                arcToRelative(18.6f, 18.6f, 0.0f, false, true, -7.0f, -19.6f)
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
                lineToRelative(59.0f, 3.8f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, 14.6f, 11.4f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, true, -5.2f, 18.1f)
                lineToRelative(-45.2f, 37.6f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.2f, 0.8f)
                lineToRelative(14.5f, 57.3f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, true, -6.3f, 17.7f)
                arcTo(16.8f, 16.8f, 0.0f, false, true, 187.3f, 232.0f)
                close()
                moveTo(128.0f, 181.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 8.7f, 2.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(50.4f, 31.9f)
                horizontalLineToRelative(0.2f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.3f, -0.3f)
                curveToRelative(0.1f, -0.1f, 0.1f, -0.2f, 0.0f, -0.6f)
                lineToRelative(-14.5f, -57.3f)
                arcToRelative(16.8f, 16.8f, 0.0f, false, true, 5.4f, -17.0f)
                lineToRelative(45.3f, -37.6f)
                curveToRelative(0.1f, -0.1f, 0.3f, -0.3f, 0.1f, -0.8f)
                reflectiveCurveToRelative(-0.2f, -0.4f, -0.3f, -0.4f)
                lineToRelative(-59.1f, -3.8f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, -14.1f, -10.4f)
                lineTo(128.3f, 32.3f)
                curveToRelative(-0.1f, -0.3f, -0.2f, -0.3f, -0.3f, -0.3f)
                reflectiveCurveToRelative(-0.2f, 0.0f, -0.3f, 0.3f)
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
                lineTo(119.3f, 184.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 181.5f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
