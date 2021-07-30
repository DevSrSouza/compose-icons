package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Etsy: ImageVector
    get() {
        if (_etsy != null) {
            return _etsy!!
        }
        _etsy = Builder(name = "Etsy", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 348.0f)
                curveToRelative(-1.75f, 10.75f, -13.75f, 110.0f, -15.5f, 132.0f)
                curveToRelative(-117.879f, -4.299f, -219.895f, -4.743f, -368.5f, 0.0f)
                verticalLineToRelative(-25.5f)
                curveToRelative(45.457f, -8.948f, 60.627f, -8.019f, 61.0f, -35.25f)
                curveToRelative(1.793f, -72.322f, 3.524f, -244.143f, 0.0f, -322.0f)
                curveToRelative(-1.029f, -28.46f, -12.13f, -26.765f, -61.0f, -36.0f)
                verticalLineToRelative(-25.5f)
                curveToRelative(73.886f, 2.358f, 255.933f, 8.551f, 362.999f, -3.75f)
                curveToRelative(-3.5f, 38.25f, -7.75f, 126.5f, -7.75f, 126.5f)
                horizontalLineTo(332.0f)
                curveTo(320.947f, 115.665f, 313.241f, 68.0f, 277.25f, 68.0f)
                horizontalLineToRelative(-137.0f)
                curveToRelative(-10.25f, 0.0f, -10.75f, 3.5f, -10.75f, 9.75f)
                verticalLineTo(241.5f)
                curveToRelative(58.0f, 0.5f, 88.5f, -2.5f, 88.5f, -2.5f)
                curveToRelative(29.77f, -0.951f, 27.56f, -8.502f, 40.75f, -65.251f)
                horizontalLineToRelative(25.75f)
                curveToRelative(-4.407f, 101.351f, -3.91f, 61.829f, -1.75f, 160.25f)
                horizontalLineTo(257.0f)
                curveToRelative(-9.155f, -40.086f, -9.065f, -61.045f, -39.501f, -61.5f)
                curveToRelative(0.0f, 0.0f, -21.5f, -2.0f, -88.0f, -2.0f)
                verticalLineToRelative(139.0f)
                curveToRelative(0.0f, 26.0f, 14.25f, 38.25f, 44.25f, 38.25f)
                horizontalLineTo(263.0f)
                curveToRelative(63.636f, 0.0f, 66.564f, -24.996f, 98.751f, -99.75f)
                horizontalLineTo(384.0f)
                close()
            }
        }
        .build()
        return _etsy!!
    }

private var _etsy: ImageVector? = null
