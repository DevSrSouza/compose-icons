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

public val FilledGroup.LeafOne: ImageVector
    get() {
        if (_leafOne != null) {
            return _leafOne!!
        }
        _leafOne = Builder(name = "LeafOne", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0374f, 3.0479f)
                curveTo(11.7167f, 2.5996f, 12.6396f, 2.6744f, 13.2375f, 3.2723f)
                lineTo(16.9489f, 6.9837f)
                curveTo(19.682f, 9.7169f, 19.682f, 14.1482f, 16.9489f, 16.8813f)
                curveTo(16.8019f, 17.0283f, 16.6501f, 17.1673f, 16.4938f, 17.2985f)
                curveTo(16.1033f, 17.6263f, 15.6853f, 17.9048f, 15.2482f, 18.1339f)
                curveTo(14.4615f, 18.5463f, 13.6127f, 18.7987f, 12.75f, 18.8912f)
                verticalLineTo(21.2496f)
                curveTo(12.75f, 21.6638f, 12.4143f, 21.9996f, 12.0f, 21.9996f)
                curveTo(11.5858f, 21.9996f, 11.25f, 21.6638f, 11.25f, 21.2496f)
                verticalLineTo(18.8912f)
                curveTo(9.7164f, 18.7268f, 8.2268f, 18.0569f, 7.0512f, 16.8814f)
                curveTo(4.318f, 14.1482f, 4.318f, 9.7169f, 7.0512f, 6.9837f)
                lineTo(10.7626f, 3.2724f)
                curveTo(10.7626f, 3.2724f, 10.7626f, 3.2723f, 10.7626f, 3.2724f)
                curveTo(10.8481f, 3.1868f, 10.9403f, 3.112f, 11.0374f, 3.0479f)
                close()
                moveTo(12.0f, 10.9996f)
                curveTo(11.5858f, 10.9996f, 11.25f, 11.3354f, 11.25f, 11.7496f)
                verticalLineTo(17.3801f)
                curveTo(11.7475f, 17.4483f, 12.2525f, 17.4483f, 12.75f, 17.3801f)
                verticalLineTo(11.7496f)
                curveTo(12.75f, 11.3354f, 12.4142f, 10.9996f, 12.0f, 10.9996f)
                close()
            }
        }
        .build()
        return _leafOne!!
    }

private var _leafOne: ImageVector? = null
