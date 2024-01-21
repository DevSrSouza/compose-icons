package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Springboot: ImageVector
    get() {
        if (_springboot != null) {
            return _springboot!!
        }
        _springboot = Builder(name = "Springboot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.693f, 10.7058f)
                lineToRelative(-4.73f, -8.1844f)
                curveToRelative(-0.4094f, -0.7106f, -1.4166f, -1.2942f, -2.2402f, -1.2942f)
                lineTo(7.2725f, 1.2272f)
                curveToRelative(-0.819f, 0.0f, -1.8308f, 0.5836f, -2.2402f, 1.2942f)
                lineTo(0.307f, 10.7058f)
                curveToRelative(-0.4095f, 0.7106f, -0.4095f, 1.873f, 0.0f, 2.5837f)
                lineToRelative(4.7252f, 8.189f)
                curveToRelative(0.4094f, 0.7107f, 1.4166f, 1.2943f, 2.2402f, 1.2943f)
                horizontalLineToRelative(9.455f)
                curveToRelative(0.819f, 0.0f, 1.826f, -0.5836f, 2.2402f, -1.2942f)
                lineToRelative(4.7252f, -8.189f)
                curveToRelative(0.4095f, -0.7107f, 0.4095f, -1.8732f, 0.0f, -2.5838f)
                close()
                moveTo(10.9763f, 5.7547f)
                curveToRelative(0.0f, -0.5365f, 0.4377f, -0.9742f, 0.9742f, -0.9742f)
                reflectiveCurveToRelative(0.9742f, 0.4377f, 0.9742f, 0.9742f)
                verticalLineToRelative(5.8217f)
                curveToRelative(0.0f, 0.5366f, -0.4377f, 0.9742f, -0.9742f, 0.9742f)
                reflectiveCurveToRelative(-0.9742f, -0.4376f, -0.9742f, -0.9742f)
                close()
                moveTo(11.9505f, 18.1841f)
                curveToRelative(-3.6427f, 0.0f, -6.6077f, -2.965f, -6.6077f, -6.6077f)
                curveToRelative(0.0047f, -2.0896f, 0.993f, -4.0521f, 2.6685f, -5.304f)
                arcToRelative(0.8657f, 0.8657f, 0.0f, false, true, 1.2142f, 0.1788f)
                arcToRelative(0.8657f, 0.8657f, 0.0f, false, true, -0.1788f, 1.2143f)
                curveToRelative(-2.1602f, 1.6048f, -2.612f, 4.6592f, -1.0072f, 6.8194f)
                curveToRelative(1.6049f, 2.1603f, 4.6593f, 2.612f, 6.8195f, 1.0072f)
                curveToRelative(1.2378f, -0.9177f, 1.9673f, -2.372f, 1.9673f, -3.9157f)
                arcToRelative(4.8972f, 4.8972f, 0.0f, false, false, -1.9861f, -3.925f)
                curveToRelative(-0.386f, -0.2824f, -0.466f, -0.8284f, -0.1836f, -1.2143f)
                curveToRelative(0.2824f, -0.386f, 0.8283f, -0.466f, 1.2143f, -0.1835f)
                curveToRelative(1.6895f, 1.2471f, 2.6826f, 3.2238f, 2.6873f, 5.3228f)
                curveToRelative(0.0f, 3.6474f, -2.965f, 6.6077f, -6.6077f, 6.6077f)
                close()
            }
        }
        .build()
        return _springboot!!
    }

private var _springboot: ImageVector? = null
