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

public val RegularGroup.DualScreenSpan: ImageVector
    get() {
        if (_dualScreenSpan != null) {
            return _dualScreenSpan!!
        }
        _dualScreenSpan = Builder(name = "DualScreenSpan", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3113f, 10.249f)
                curveTo(8.5865f, 9.9394f, 8.5586f, 9.4654f, 8.249f, 9.1902f)
                curveTo(7.9394f, 8.915f, 7.4654f, 8.9429f, 7.1902f, 9.2525f)
                lineTo(5.1902f, 11.5025f)
                curveTo(4.9376f, 11.7866f, 4.9376f, 12.2148f, 5.1902f, 12.499f)
                lineTo(7.1902f, 14.749f)
                curveTo(7.4654f, 15.0586f, 7.9394f, 15.0865f, 8.249f, 14.8113f)
                curveTo(8.5586f, 14.5361f, 8.5865f, 14.0621f, 8.3113f, 13.7525f)
                lineTo(7.4209f, 12.7507f)
                horizontalLineTo(16.5806f)
                lineTo(15.6902f, 13.7525f)
                curveTo(15.415f, 14.0621f, 15.4429f, 14.5361f, 15.7525f, 14.8113f)
                curveTo(16.0621f, 15.0865f, 16.5361f, 15.0586f, 16.8113f, 14.749f)
                lineTo(18.8113f, 12.499f)
                lineTo(18.8219f, 12.4869f)
                curveTo(18.9271f, 12.3633f, 18.993f, 12.2053f, 19.0001f, 12.032f)
                curveTo(19.0009f, 12.0119f, 19.001f, 11.9918f, 19.0002f, 11.9716f)
                curveTo(18.9933f, 11.7907f, 18.9223f, 11.6261f, 18.8092f, 11.5001f)
                lineTo(16.8113f, 9.2525f)
                curveTo(16.5361f, 8.9429f, 16.0621f, 8.915f, 15.7525f, 9.1902f)
                curveTo(15.4429f, 9.4654f, 15.415f, 9.9394f, 15.6902f, 10.249f)
                lineTo(16.5806f, 11.2507f)
                horizontalLineTo(7.4209f)
                lineTo(8.3113f, 10.249f)
                close()
                moveTo(12.7554f, 4.0019f)
                lineTo(12.7548f, 4.004f)
                lineTo(20.253f, 4.0044f)
                curveTo(21.2195f, 4.0044f, 22.003f, 4.7879f, 22.003f, 5.7544f)
                verticalLineTo(18.2495f)
                curveTo(22.003f, 19.216f, 21.2195f, 19.9995f, 20.253f, 19.9995f)
                horizontalLineTo(11.2554f)
                lineTo(11.2548f, 19.997f)
                lineTo(3.7578f, 19.9971f)
                curveTo(2.7913f, 19.9971f, 2.0078f, 19.2136f, 2.0078f, 18.2471f)
                verticalLineTo(5.7519f)
                curveTo(2.0078f, 4.7854f, 2.7913f, 4.0019f, 3.7578f, 4.0019f)
                horizontalLineTo(12.7554f)
                close()
                moveTo(20.253f, 5.5044f)
                horizontalLineTo(12.7554f)
                verticalLineTo(10.5007f)
                horizontalLineTo(11.2554f)
                verticalLineTo(5.5019f)
                horizontalLineTo(3.7578f)
                curveTo(3.6197f, 5.5019f, 3.5078f, 5.6139f, 3.5078f, 5.7519f)
                verticalLineTo(18.2471f)
                curveTo(3.5078f, 18.3851f, 3.6197f, 18.4971f, 3.7578f, 18.4971f)
                horizontalLineTo(11.2554f)
                verticalLineTo(13.5007f)
                lineTo(12.7554f, 13.5007f)
                verticalLineTo(18.4995f)
                horizontalLineTo(20.253f)
                curveTo(20.391f, 18.4995f, 20.503f, 18.3876f, 20.503f, 18.2495f)
                verticalLineTo(5.7544f)
                curveTo(20.503f, 5.6163f, 20.391f, 5.5044f, 20.253f, 5.5044f)
                close()
            }
        }
        .build()
        return _dualScreenSpan!!
    }

private var _dualScreenSpan: ImageVector? = null
