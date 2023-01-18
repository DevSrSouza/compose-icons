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

public val FilledGroup.Timeline: ImageVector
    get() {
        if (_timeline != null) {
            return _timeline!!
        }
        _timeline = Builder(name = "Timeline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2505f, 13.0003f)
                curveTo(16.217f, 13.0003f, 17.0005f, 13.7838f, 17.0005f, 14.7503f)
                verticalLineTo(19.2536f)
                curveTo(17.0005f, 20.2201f, 16.217f, 21.0036f, 15.2505f, 21.0036f)
                horizontalLineTo(3.7505f)
                curveTo(2.784f, 21.0036f, 2.0005f, 20.2201f, 2.0005f, 19.2536f)
                verticalLineTo(14.7503f)
                curveTo(2.0005f, 13.7838f, 2.784f, 13.0003f, 3.7505f, 13.0003f)
                horizontalLineTo(15.2505f)
                close()
                moveTo(21.001f, 14.8959f)
                lineTo(21.0005f, 20.2503f)
                curveTo(21.0005f, 20.6646f, 20.6647f, 21.0003f, 20.2505f, 21.0003f)
                curveTo(19.8708f, 21.0003f, 19.557f, 20.7182f, 19.5073f, 20.3521f)
                lineTo(19.5005f, 20.2503f)
                lineTo(19.5003f, 14.9066f)
                curveTo(19.7338f, 14.965f, 19.9782f, 14.9959f, 20.2298f, 14.9959f)
                curveTo(20.4964f, 14.9959f, 20.7549f, 14.9611f, 21.001f, 14.8959f)
                close()
                moveTo(20.2507f, 10.0923f)
                curveTo(21.3045f, 10.0923f, 22.1588f, 10.9465f, 22.1588f, 12.0003f)
                curveTo(22.1588f, 13.0541f, 21.3045f, 13.9084f, 20.2507f, 13.9084f)
                curveTo(19.1969f, 13.9084f, 18.3427f, 13.0541f, 18.3427f, 12.0003f)
                curveTo(18.3427f, 10.9465f, 19.1969f, 10.0923f, 20.2507f, 10.0923f)
                close()
                moveTo(15.2461f, 2.9971f)
                curveTo(16.2126f, 2.9971f, 16.9961f, 3.7806f, 16.9961f, 4.7471f)
                verticalLineTo(9.2503f)
                curveTo(16.9961f, 10.2168f, 16.2126f, 11.0003f, 15.2461f, 11.0003f)
                horizontalLineTo(3.7461f)
                curveTo(2.7796f, 11.0003f, 1.9961f, 10.2168f, 1.9961f, 9.2503f)
                verticalLineTo(4.7471f)
                curveTo(1.9961f, 3.8289f, 2.7032f, 3.0759f, 3.6026f, 3.0029f)
                lineTo(3.7461f, 2.9971f)
                horizontalLineTo(15.2461f)
                close()
                moveTo(20.2511f, 3.0003f)
                curveTo(20.6308f, 3.0003f, 20.9446f, 3.2825f, 20.9943f, 3.6486f)
                lineTo(21.0011f, 3.7503f)
                lineTo(21.001f, 9.096f)
                curveTo(20.7549f, 9.0307f, 20.4964f, 8.9959f, 20.2298f, 8.9959f)
                curveTo(19.9782f, 8.9959f, 19.7338f, 9.0269f, 19.5003f, 9.0852f)
                lineTo(19.5011f, 3.7503f)
                curveTo(19.5011f, 3.3361f, 19.8369f, 3.0003f, 20.2511f, 3.0003f)
                close()
            }
        }
        .build()
        return _timeline!!
    }

private var _timeline: ImageVector? = null
