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

public val FilledGroup.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.5f)
                curveTo(14.1421f, 2.5f, 17.5f, 5.8579f, 17.5f, 10.0f)
                curveTo(17.5f, 11.7101f, 16.9276f, 13.2866f, 15.964f, 14.5483f)
                lineTo(20.7071f, 19.2929f)
                curveTo(21.0976f, 19.6834f, 21.0976f, 20.3166f, 20.7071f, 20.7071f)
                curveTo(20.3466f, 21.0676f, 19.7794f, 21.0953f, 19.3871f, 20.7903f)
                lineTo(19.2929f, 20.7071f)
                lineTo(14.5483f, 15.964f)
                curveTo(13.2866f, 16.9276f, 11.7101f, 17.5f, 10.0f, 17.5f)
                curveTo(5.8579f, 17.5f, 2.5f, 14.1421f, 2.5f, 10.0f)
                curveTo(2.5f, 5.8579f, 5.8579f, 2.5f, 10.0f, 2.5f)
                close()
                moveTo(10.0f, 4.5f)
                curveTo(6.9624f, 4.5f, 4.5f, 6.9624f, 4.5f, 10.0f)
                curveTo(4.5f, 13.0376f, 6.9624f, 15.5f, 10.0f, 15.5f)
                curveTo(13.0376f, 15.5f, 15.5f, 13.0376f, 15.5f, 10.0f)
                curveTo(15.5f, 6.9624f, 13.0376f, 4.5f, 10.0f, 4.5f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
