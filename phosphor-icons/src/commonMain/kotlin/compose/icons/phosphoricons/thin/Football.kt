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

public val ThinGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 57.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -23.0f, -23.0f)
                curveToRelative(-30.6f, -5.2f, -88.2f, -7.6f, -130.4f, 34.6f)
                reflectiveCurveTo(28.8f, 168.4f, 34.0f, 199.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 23.0f, 23.0f)
                arcToRelative(197.1f, 197.1f, 0.0f, false, false, 32.6f, 2.8f)
                curveToRelative(30.3f, 0.0f, 67.9f, -7.5f, 97.8f, -37.4f)
                curveTo(229.6f, 145.2f, 227.2f, 87.6f, 222.0f, 57.0f)
                close()
                moveTo(166.1f, 39.1f)
                arcToRelative(181.3f, 181.3f, 0.0f, false, true, 31.6f, 2.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 16.4f, 16.4f)
                arcTo(183.9f, 183.9f, 0.0f, false, true, 216.7f, 99.0f)
                lineTo(157.0f, 39.3f)
                close()
                moveTo(58.3f, 214.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -16.4f, -16.4f)
                arcTo(183.9f, 183.9f, 0.0f, false, true, 39.3f, 157.0f)
                lineTo(99.0f, 216.7f)
                lineToRelative(-9.1f, 0.2f)
                arcTo(181.3f, 181.3f, 0.0f, false, true, 58.3f, 214.1f)
                close()
                moveTo(181.7f, 181.7f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-12.1f, 12.2f, -35.4f, 29.4f, -72.3f, 34.0f)
                lineTo(40.3f, 146.6f)
                curveToRelative(4.6f, -36.9f, 21.8f, -60.2f, 34.0f, -72.3f)
                reflectiveCurveToRelative(35.4f, -29.4f, 72.3f, -34.0f)
                lineToRelative(69.1f, 69.1f)
                curveTo(211.1f, 146.3f, 193.9f, 169.6f, 181.7f, 181.7f)
                close()
                moveTo(162.8f, 93.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineTo(145.0f, 116.7f)
                lineToRelative(11.8f, 11.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, 1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                lineToRelative(-11.8f, -11.8f)
                lineToRelative(-17.0f, 17.0f)
                lineToRelative(11.8f, 11.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.7f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.8f, 1.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, -1.1f)
                lineTo(116.7f, 145.0f)
                lineTo(98.8f, 162.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(111.0f, 139.3f)
                lineTo(99.2f, 127.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.7f, 0.0f)
                lineToRelative(11.8f, 11.8f)
                lineToRelative(17.0f, -17.0f)
                lineToRelative(-11.8f, -11.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 0.0f)
                lineTo(139.3f, 111.0f)
                lineToRelative(17.9f, -17.8f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 162.8f, 93.2f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
