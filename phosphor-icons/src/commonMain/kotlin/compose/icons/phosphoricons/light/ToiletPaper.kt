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

public val LightGroup.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) {
            return _toiletPaper!!
        }
        _toiletPaper = Builder(name = "ToiletPaper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.0f, 120.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 74.0f, 120.0f)
                close()
                moveTo(238.0f, 120.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(112.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(98.0f, 178.5f)
                curveToRelative(-8.4f, 17.0f, -20.4f, 27.5f, -34.0f, 27.5f)
                curveToRelative(-25.8f, 0.0f, -46.0f, -37.8f, -46.0f, -86.0f)
                reflectiveCurveTo(38.2f, 34.0f, 64.0f, 34.0f)
                lineTo(192.0f, 34.0f)
                curveTo(217.8f, 34.0f, 238.0f, 71.8f, 238.0f, 120.0f)
                close()
                moveTo(98.0f, 120.0f)
                curveToRelative(0.0f, -44.3f, -17.6f, -74.0f, -34.0f, -74.0f)
                reflectiveCurveTo(30.0f, 75.7f, 30.0f, 120.0f)
                reflectiveCurveToRelative(17.6f, 74.0f, 34.0f, 74.0f)
                reflectiveCurveTo(98.0f, 164.3f, 98.0f, 120.0f)
                close()
                moveTo(226.0f, 208.0f)
                lineTo(226.0f, 126.0f)
                lineTo(208.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(17.9f)
                curveToRelative(-1.5f, -40.9f, -18.2f, -68.0f, -33.9f, -68.0f)
                lineTo(87.8f, 46.0f)
                curveToRelative(12.5f, 13.9f, 21.0f, 38.7f, 22.1f, 68.0f)
                lineTo(128.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(110.0f, 126.0f)
                verticalLineToRelative(82.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(224.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 226.0f, 208.0f)
                close()
                moveTo(176.0f, 114.0f)
                lineTo(160.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
