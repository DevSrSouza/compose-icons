package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.EarSlash: ImageVector
    get() {
        if (_earSlash != null) {
            return _earSlash!!
        }
        _earSlash = Builder(name = "EarSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.3f, 166.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-75.5f, -83.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-28.0f, -30.8f)
                horizontalLineToRelative(0.0f)
                lineTo(52.4f, 36.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.8f, 8.0f)
                lineTo(55.7f, 57.4f)
                arcTo(85.2f, 85.2f, 0.0f, false, false, 42.0f, 104.0f)
                curveToRelative(0.0f, 32.6f, 12.1f, 44.3f, 21.9f, 53.7f)
                curveTo(71.8f, 165.3f, 78.0f, 171.4f, 78.0f, 188.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 88.6f, 31.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.3f, -7.6f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 90.0f, 188.0f)
                curveToRelative(0.0f, -21.7f, -9.1f, -30.5f, -17.8f, -38.9f)
                reflectiveCurveTo(54.0f, 131.5f, 54.0f, 104.0f)
                arcTo(73.9f, 73.9f, 0.0f, false, true, 64.1f, 66.6f)
                lineTo(84.5f, 89.1f)
                arcTo(44.4f, 44.4f, 0.0f, false, false, 82.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, true, 0.3f, -4.2f)
                lineToRelative(40.6f, 44.7f)
                arcToRelative(30.8f, 30.8f, 0.0f, false, false, -0.9f, 7.5f)
                arcToRelative(25.8f, 25.8f, 0.0f, false, false, 30.9f, 25.5f)
                lineTo(203.6f, 220.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, -1.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.4f, -8.4f)
                close()
                moveTo(147.6f, 158.5f)
                lineTo(152.4f, 163.7f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 147.6f, 158.5f)
                close()
                moveTo(81.8f, 38.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.1f, -8.2f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 214.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, false, -74.0f, -74.0f)
                arcTo(73.1f, 73.1f, 0.0f, false, false, 90.1f, 40.5f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 81.8f, 38.4f)
                close()
                moveTo(158.3f, 115.4f)
                arcTo(17.5f, 17.5f, 0.0f, false, false, 162.0f, 104.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, false, -45.0f, -32.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -3.9f, -11.3f)
                arcTo(44.4f, 44.4f, 0.0f, false, true, 128.0f, 58.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 46.0f, 46.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, -6.1f, 18.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.6f, -7.2f)
                close()
            }
        }
        .build()
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
