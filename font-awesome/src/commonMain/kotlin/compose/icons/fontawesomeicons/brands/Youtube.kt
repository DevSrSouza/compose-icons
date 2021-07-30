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

public val BrandsGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(549.655f, 124.083f)
                curveToRelative(-6.281f, -23.65f, -24.787f, -42.276f, -48.284f, -48.597f)
                curveTo(458.781f, 64.0f, 288.0f, 64.0f, 288.0f, 64.0f)
                reflectiveCurveTo(117.22f, 64.0f, 74.629f, 75.486f)
                curveToRelative(-23.497f, 6.322f, -42.003f, 24.947f, -48.284f, 48.597f)
                curveToRelative(-11.412f, 42.867f, -11.412f, 132.305f, -11.412f, 132.305f)
                reflectiveCurveToRelative(0.0f, 89.438f, 11.412f, 132.305f)
                curveToRelative(6.281f, 23.65f, 24.787f, 41.5f, 48.284f, 47.821f)
                curveTo(117.22f, 448.0f, 288.0f, 448.0f, 288.0f, 448.0f)
                reflectiveCurveToRelative(170.78f, 0.0f, 213.371f, -11.486f)
                curveToRelative(23.497f, -6.321f, 42.003f, -24.171f, 48.284f, -47.821f)
                curveToRelative(11.412f, -42.867f, 11.412f, -132.305f, 11.412f, -132.305f)
                reflectiveCurveToRelative(0.0f, -89.438f, -11.412f, -132.305f)
                close()
                moveTo(232.145f, 337.591f)
                lineTo(232.145f, 175.185f)
                lineToRelative(142.739f, 81.205f)
                lineToRelative(-142.739f, 81.201f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
