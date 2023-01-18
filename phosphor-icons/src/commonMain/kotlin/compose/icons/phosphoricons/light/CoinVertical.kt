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

public val LightGroup.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) {
            return _coinVertical!!
        }
        _coinVertical = Builder(name = "CoinVertical", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.8f, 57.1f)
                curveTo(185.1f, 37.0f, 169.2f, 26.0f, 152.0f, 26.0f)
                lineTo(104.0f, 26.0f)
                curveTo(86.8f, 26.0f, 70.9f, 37.0f, 59.2f, 57.1f)
                reflectiveCurveTo(42.0f, 101.3f, 42.0f, 128.0f)
                reflectiveCurveToRelative(6.1f, 51.9f, 17.2f, 70.9f)
                reflectiveCurveTo(86.8f, 230.0f, 104.0f, 230.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.2f, 0.0f, 33.1f, -11.0f, 44.8f, -31.1f)
                reflectiveCurveTo(214.0f, 154.7f, 214.0f, 128.0f)
                reflectiveCurveTo(207.9f, 76.1f, 196.8f, 57.1f)
                close()
                moveTo(201.9f, 122.0f)
                horizontalLineToRelative(-36.0f)
                curveToRelative(-0.7f, -18.8f, -4.4f, -36.7f, -10.8f, -52.0f)
                lineTo(190.0f, 70.0f)
                curveTo(197.1f, 84.7f, 201.2f, 102.8f, 201.9f, 122.0f)
                close()
                moveTo(152.0f, 38.0f)
                curveToRelative(11.3f, 0.0f, 22.2f, 7.1f, 31.1f, 20.0f)
                lineTo(149.3f, 58.0f)
                lineToRelative(-0.5f, -0.9f)
                arcTo(75.1f, 75.1f, 0.0f, false, false, 133.5f, 38.0f)
                close()
                moveTo(69.6f, 192.9f)
                curveTo(59.5f, 175.6f, 54.0f, 152.6f, 54.0f, 128.0f)
                reflectiveCurveToRelative(5.5f, -47.6f, 15.6f, -64.9f)
                reflectiveCurveTo(91.3f, 38.0f, 104.0f, 38.0f)
                reflectiveCurveToRelative(25.0f, 8.9f, 34.4f, 25.1f)
                reflectiveCurveTo(154.0f, 103.4f, 154.0f, 128.0f)
                reflectiveCurveToRelative(-5.5f, 47.6f, -15.6f, 64.9f)
                reflectiveCurveTo(116.7f, 218.0f, 104.0f, 218.0f)
                reflectiveCurveTo(79.0f, 209.1f, 69.6f, 192.9f)
                close()
                moveTo(152.0f, 218.0f)
                lineTo(133.5f, 218.0f)
                arcToRelative(75.1f, 75.1f, 0.0f, false, false, 15.3f, -19.1f)
                lineToRelative(0.5f, -0.9f)
                horizontalLineToRelative(33.8f)
                curveTo(174.2f, 210.9f, 163.3f, 218.0f, 152.0f, 218.0f)
                close()
                moveTo(190.0f, 186.0f)
                lineTo(155.1f, 186.0f)
                curveToRelative(6.4f, -15.3f, 10.1f, -33.2f, 10.8f, -52.0f)
                horizontalLineToRelative(36.0f)
                curveTo(201.2f, 153.2f, 197.1f, 171.3f, 190.0f, 186.0f)
                close()
            }
        }
        .build()
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
