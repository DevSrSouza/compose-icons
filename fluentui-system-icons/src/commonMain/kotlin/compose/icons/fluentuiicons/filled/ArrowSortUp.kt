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

public val FilledGroup.ArrowSortUp: ImageVector
    get() {
        if (_arrowSortUp != null) {
            return _arrowSortUp!!
        }
        _arrowSortUp = Builder(name = "ArrowSortUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2925f, 8.2933f)
                lineTo(11.2883f, 4.2933f)
                curveTo(11.6486f, 3.9326f, 12.2157f, 3.9046f, 12.6082f, 4.2093f)
                lineTo(12.7024f, 4.2924f)
                lineTo(16.7077f, 8.2924f)
                curveTo(17.0984f, 8.6827f, 17.0988f, 9.3159f, 16.7086f, 9.7066f)
                curveTo(16.3483f, 10.0674f, 15.7811f, 10.0955f, 15.3886f, 9.7907f)
                lineTo(15.2944f, 9.7076f)
                lineTo(13.001f, 7.417f)
                lineTo(13.001f, 19.0007f)
                curveTo(13.001f, 19.5135f, 12.615f, 19.9362f, 12.1176f, 19.9939f)
                lineTo(12.001f, 20.0007f)
                curveTo(11.4882f, 20.0007f, 11.0655f, 19.6146f, 11.0077f, 19.1173f)
                lineTo(11.001f, 19.0007f)
                lineTo(11.001f, 7.41f)
                lineTo(8.7075f, 9.7067f)
                curveTo(8.3472f, 10.0674f, 7.78f, 10.0954f, 7.3875f, 9.7906f)
                lineTo(7.2933f, 9.7075f)
                curveTo(6.9326f, 9.3472f, 6.9046f, 8.78f, 7.2094f, 8.3875f)
                lineTo(7.2925f, 8.2933f)
                lineTo(11.2883f, 4.2933f)
                lineTo(7.2925f, 8.2933f)
                close()
            }
        }
        .build()
        return _arrowSortUp!!
    }

private var _arrowSortUp: ImageVector? = null
