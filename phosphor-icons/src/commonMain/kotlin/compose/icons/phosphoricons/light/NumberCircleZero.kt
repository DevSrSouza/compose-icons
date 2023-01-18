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

public val LightGroup.NumberCircleZero: ImageVector
    get() {
        if (_numberCircleZero != null) {
            return _numberCircleZero!!
        }
        _numberCircleZero = Builder(name = "NumberCircleZero", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 74.0f)
                curveToRelative(-12.4f, 0.0f, -22.6f, 6.2f, -29.4f, 18.0f)
                curveTo(93.0f, 101.4f, 90.0f, 114.2f, 90.0f, 128.0f)
                reflectiveCurveToRelative(3.0f, 26.6f, 8.6f, 36.0f)
                curveToRelative(6.8f, 11.8f, 17.0f, 18.0f, 29.4f, 18.0f)
                reflectiveCurveToRelative(22.6f, -6.2f, 29.4f, -18.0f)
                curveToRelative(5.6f, -9.4f, 8.6f, -22.2f, 8.6f, -36.0f)
                reflectiveCurveToRelative(-3.0f, -26.6f, -8.6f, -36.0f)
                curveTo(150.6f, 80.2f, 140.4f, 74.0f, 128.0f, 74.0f)
                close()
                moveTo(128.0f, 170.0f)
                curveToRelative(-18.0f, 0.0f, -26.0f, -21.1f, -26.0f, -42.0f)
                curveToRelative(0.0f, -29.0f, 13.1f, -42.0f, 26.0f, -42.0f)
                curveToRelative(18.0f, 0.0f, 26.0f, 21.1f, 26.0f, 42.0f)
                curveTo(154.0f, 157.0f, 140.9f, 170.0f, 128.0f, 170.0f)
                close()
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _numberCircleZero!!
    }

private var _numberCircleZero: ImageVector? = null
