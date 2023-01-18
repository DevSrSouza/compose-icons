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

public val FilledGroup.ArrowSort: ImageVector
    get() {
        if (_arrowSort != null) {
            return _arrowSort!!
        }
        _arrowSort = Builder(name = "ArrowSort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2883f, 4.2933f)
                lineTo(2.2925f, 8.2933f)
                lineTo(2.2094f, 8.3875f)
                curveTo(1.9046f, 8.78f, 1.9326f, 9.3472f, 2.2933f, 9.7075f)
                lineTo(2.3875f, 9.7906f)
                curveTo(2.78f, 10.0954f, 3.3472f, 10.0674f, 3.7075f, 9.7067f)
                lineTo(6.001f, 7.41f)
                lineTo(6.001f, 19.0007f)
                lineTo(6.0077f, 19.1173f)
                curveTo(6.0655f, 19.6146f, 6.4882f, 20.0007f, 7.001f, 20.0007f)
                lineTo(7.1176f, 19.9939f)
                curveTo(7.615f, 19.9362f, 8.001f, 19.5135f, 8.001f, 19.0007f)
                lineTo(8.001f, 7.417f)
                lineTo(10.2944f, 9.7076f)
                lineTo(10.3886f, 9.7907f)
                curveTo(10.7811f, 10.0955f, 11.3483f, 10.0674f, 11.7086f, 9.7066f)
                curveTo(12.0988f, 9.3159f, 12.0984f, 8.6827f, 11.7077f, 8.2924f)
                lineTo(7.7024f, 4.2924f)
                lineTo(7.6082f, 4.2093f)
                curveTo(7.2157f, 3.9046f, 6.6486f, 3.9326f, 6.2883f, 4.2933f)
                close()
                moveTo(17.0f, 4.0032f)
                lineTo(16.8834f, 4.0099f)
                curveTo(16.386f, 4.0677f, 16.0f, 4.4903f, 16.0f, 5.0032f)
                lineTo(16.0f, 16.583f)
                lineTo(13.7068f, 14.2925f)
                lineTo(13.6125f, 14.2094f)
                curveTo(13.2201f, 13.9045f, 12.6529f, 13.9325f, 12.2926f, 14.2932f)
                curveTo(11.9022f, 14.6839f, 11.9025f, 15.3171f, 12.2932f, 15.7074f)
                lineTo(16.297f, 19.7074f)
                lineTo(16.3912f, 19.7905f)
                curveTo(16.7837f, 20.0954f, 17.3509f, 20.0674f, 17.7112f, 19.7067f)
                lineTo(21.7074f, 15.7067f)
                lineTo(21.7906f, 15.6125f)
                curveTo(22.0954f, 15.22f, 22.0674f, 14.6528f, 21.7068f, 14.2925f)
                lineTo(21.6125f, 14.2094f)
                curveTo(21.2201f, 13.9045f, 20.6529f, 13.9325f, 20.2926f, 14.2932f)
                lineTo(18.0f, 16.587f)
                lineTo(18.0f, 5.0032f)
                lineTo(17.9933f, 4.8865f)
                curveTo(17.9355f, 4.3892f, 17.5128f, 4.0032f, 17.0f, 4.0032f)
                close()
            }
        }
        .build()
        return _arrowSort!!
    }

private var _arrowSort: ImageVector? = null
