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

public val RegularGroup.LeafOne: ImageVector
    get() {
        if (_leafOne != null) {
            return _leafOne!!
        }
        _leafOne = Builder(name = "LeafOne", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2375f, 3.2723f)
                curveTo(12.554f, 2.5889f, 11.446f, 2.5889f, 10.7626f, 3.2723f)
                lineTo(7.0512f, 6.9837f)
                curveTo(4.318f, 9.7169f, 4.318f, 14.1482f, 7.0512f, 16.8813f)
                curveTo(8.2268f, 18.0569f, 9.7164f, 18.7268f, 11.25f, 18.8911f)
                verticalLineTo(21.2496f)
                curveTo(11.25f, 21.6638f, 11.5858f, 21.9996f, 12.0f, 21.9996f)
                curveTo(12.4142f, 21.9996f, 12.75f, 21.6638f, 12.75f, 21.2496f)
                verticalLineTo(18.8911f)
                curveTo(14.2836f, 18.7268f, 15.7733f, 18.0569f, 16.9488f, 16.8813f)
                curveTo(19.682f, 14.1482f, 19.682f, 9.7169f, 16.9488f, 6.9837f)
                lineTo(13.2375f, 3.2723f)
                close()
                moveTo(12.75f, 17.3801f)
                verticalLineTo(11.7496f)
                curveTo(12.75f, 11.3354f, 12.4142f, 10.9996f, 12.0f, 10.9996f)
                curveTo(11.5858f, 10.9996f, 11.25f, 11.3354f, 11.25f, 11.7496f)
                verticalLineTo(17.3801f)
                curveTo(10.1021f, 17.223f, 8.9943f, 16.7031f, 8.1119f, 15.8207f)
                curveTo(5.9645f, 13.6733f, 5.9645f, 10.1917f, 8.1119f, 8.0444f)
                lineTo(11.8232f, 4.333f)
                curveTo(11.9209f, 4.2354f, 12.0792f, 4.2354f, 12.1768f, 4.333f)
                lineTo(15.8882f, 8.0444f)
                curveTo(18.0355f, 10.1917f, 18.0355f, 13.6733f, 15.8882f, 15.8207f)
                curveTo(15.0057f, 16.7031f, 13.8979f, 17.223f, 12.75f, 17.3801f)
                close()
            }
        }
        .build()
        return _leafOne!!
    }

private var _leafOne: ImageVector? = null
