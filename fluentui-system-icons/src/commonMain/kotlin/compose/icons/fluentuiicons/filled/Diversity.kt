package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Diversity: ImageVector
    get() {
        if (_diversity != null) {
            return _diversity!!
        }
        _diversity = Builder(name = "Diversity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.3431f, 3.0f, 13.0f, 4.3432f, 13.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(13.0f, 9.6568f, 14.3431f, 11.0f, 16.0f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 11.0f, 21.0f, 9.6568f, 21.0f, 8.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.3432f, 19.6569f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(5.5503f, 3.8984f)
                curveTo(6.1528f, 2.7005f, 7.8472f, 2.7005f, 8.4497f, 3.8984f)
                lineTo(10.8216f, 8.6143f)
                curveTo(11.371f, 9.7067f, 10.5851f, 11.0f, 9.3719f, 11.0f)
                lineTo(4.6281f, 11.0f)
                curveTo(3.4149f, 11.0f, 2.629f, 9.7067f, 3.1784f, 8.6143f)
                lineTo(5.5503f, 3.8984f)
                close()
                moveTo(10.9276f, 17.7617f)
                curveTo(10.823f, 18.3043f, 10.6087f, 18.8077f, 10.3089f, 19.2482f)
                lineTo(4.7518f, 13.6911f)
                curveTo(5.1959f, 13.3888f, 5.7042f, 13.1735f, 6.2518f, 13.0699f)
                curveTo(6.272f, 13.066f, 6.2922f, 13.0624f, 6.3125f, 13.0589f)
                curveTo(6.5359f, 13.0202f, 6.7656f, 13.0f, 7.0f, 13.0f)
                curveTo(9.2091f, 13.0f, 11.0f, 14.7909f, 11.0f, 17.0f)
                curveTo(11.0f, 17.2557f, 10.976f, 17.5058f, 10.9301f, 17.7482f)
                curveTo(10.9293f, 17.7527f, 10.9284f, 17.7572f, 10.9276f, 17.7617f)
                close()
                moveTo(7.6875f, 20.9411f)
                curveTo(7.4641f, 20.9798f, 7.2344f, 21.0f, 7.0f, 21.0f)
                curveTo(4.7909f, 21.0f, 3.0f, 19.2091f, 3.0f, 17.0f)
                curveTo(3.0f, 16.7443f, 3.024f, 16.4942f, 3.0698f, 16.2518f)
                curveTo(3.0707f, 16.2473f, 3.0716f, 16.2428f, 3.0724f, 16.2383f)
                curveTo(3.177f, 15.6957f, 3.3912f, 15.1923f, 3.6911f, 14.7518f)
                lineTo(9.2482f, 20.3089f)
                curveTo(8.8041f, 20.6112f, 8.2959f, 20.8265f, 7.7482f, 20.9301f)
                curveTo(7.728f, 20.934f, 7.7078f, 20.9376f, 7.6875f, 20.9411f)
                close()
                moveTo(16.5199f, 13.1163f)
                curveTo(16.8202f, 12.9612f, 17.1798f, 12.9612f, 17.4801f, 13.1163f)
                lineTo(20.4537f, 14.6521f)
                curveTo(20.7898f, 14.8256f, 21.0f, 15.1663f, 21.0f, 15.5373f)
                verticalLineTo(18.4627f)
                curveTo(21.0f, 18.8337f, 20.7898f, 19.1744f, 20.4537f, 19.3479f)
                lineTo(17.4801f, 20.8837f)
                curveTo(17.1798f, 21.0388f, 16.8202f, 21.0388f, 16.5199f, 20.8837f)
                lineTo(13.5463f, 19.3479f)
                curveTo(13.2102f, 19.1744f, 13.0f, 18.8337f, 13.0f, 18.4627f)
                verticalLineTo(15.5373f)
                curveTo(13.0f, 15.1663f, 13.2102f, 14.8256f, 13.5463f, 14.6521f)
                lineTo(16.5199f, 13.1163f)
                close()
            }
        }
        .build()
        return _diversity!!
    }

private var _diversity: ImageVector? = null
