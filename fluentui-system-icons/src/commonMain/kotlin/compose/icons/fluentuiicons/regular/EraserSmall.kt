package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.EraserSmall: ImageVector
    get() {
        if (_eraserSmall != null) {
            return _eraserSmall!!
        }
        _eraserSmall = Builder(name = "EraserSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8411f, 2.6612f)
                curveTo(14.9679f, 1.7706f, 13.5369f, 1.7601f, 12.6509f, 2.6379f)
                lineTo(3.0525f, 12.1464f)
                curveTo(2.1611f, 13.0295f, 2.1642f, 14.4711f, 3.0595f, 15.3502f)
                lineTo(8.1585f, 20.3577f)
                curveTo(9.0427f, 21.226f, 10.4626f, 21.2159f, 11.3343f, 20.3351f)
                lineTo(13.1189f, 18.5317f)
                curveTo(13.0411f, 18.2003f, 13.0f, 17.8547f, 13.0f, 17.4995f)
                curveTo(13.0f, 17.1119f, 13.049f, 16.7357f, 13.1412f, 16.3768f)
                lineTo(12.7914f, 16.7303f)
                lineTo(6.7028f, 10.6417f)
                lineTo(13.7066f, 3.7035f)
                curveTo(14.0019f, 3.4109f, 14.4789f, 3.4144f, 14.7699f, 3.7113f)
                lineTo(19.68f, 8.7195f)
                curveTo(19.9669f, 9.0122f, 19.9658f, 9.4809f, 19.6775f, 9.7722f)
                lineTo(16.3321f, 13.1526f)
                curveTo(16.7045f, 13.0528f, 17.096f, 12.9995f, 17.5f, 12.9995f)
                curveTo(17.8389f, 12.9995f, 18.1691f, 13.037f, 18.4865f, 13.108f)
                lineTo(20.7437f, 10.8273f)
                curveTo(21.6085f, 9.9535f, 21.6118f, 8.5473f, 20.7511f, 7.6694f)
                lineTo(15.8411f, 2.6612f)
                close()
                moveTo(5.6371f, 11.6974f)
                lineTo(11.7362f, 17.7965f)
                lineTo(10.2681f, 19.2799f)
                curveTo(9.9775f, 19.5735f, 9.5043f, 19.5769f, 9.2095f, 19.2875f)
                lineTo(4.1105f, 14.28f)
                curveTo(3.8121f, 13.9869f, 3.811f, 13.5064f, 4.1082f, 13.2121f)
                lineTo(5.6371f, 11.6974f)
                close()
                moveTo(17.6028f, 14.001f)
                curveTo(19.4882f, 14.0554f, 21.0f, 15.6009f, 21.0f, 17.4995f)
                curveTo(21.0f, 19.4325f, 19.433f, 20.9995f, 17.5f, 20.9995f)
                curveTo(15.6136f, 20.9995f, 14.0758f, 19.5072f, 14.0027f, 17.6387f)
                curveTo(14.0011f, 17.5964f, 14.0002f, 17.5538f, 14.0f, 17.5111f)
                curveTo(14.0f, 17.5073f, 14.0f, 17.5034f, 14.0f, 17.4995f)
                curveTo(14.0f, 15.5665f, 15.567f, 13.9995f, 17.5f, 13.9995f)
                curveTo(17.5344f, 13.9995f, 17.5686f, 14.0f, 17.6028f, 14.001f)
                close()
            }
        }
        .build()
        return _eraserSmall!!
    }

private var _eraserSmall: ImageVector? = null
