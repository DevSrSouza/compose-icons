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

public val FilledGroup.FoodCarrot: ImageVector
    get() {
        if (_foodCarrot != null) {
            return _foodCarrot!!
        }
        _foodCarrot = Builder(name = "FoodCarrot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.75f)
                curveTo(17.5f, 2.3358f, 17.1642f, 2.0f, 16.75f, 2.0f)
                curveTo(16.3358f, 2.0f, 16.0f, 2.3358f, 16.0f, 2.75f)
                verticalLineTo(6.7648f)
                curveTo(13.974f, 5.4074f, 11.1329f, 5.8835f, 9.7065f, 7.9797f)
                lineTo(2.3531f, 18.7861f)
                curveTo(1.7967f, 19.6038f, 1.9036f, 20.6966f, 2.6082f, 21.3936f)
                curveTo(3.3228f, 22.1005f, 4.4474f, 22.1979f, 5.2754f, 21.6247f)
                lineTo(16.0644f, 14.1552f)
                curveTo(18.1214f, 12.7311f, 18.5757f, 9.9775f, 17.2407f, 8.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 8.0f, 22.0f, 7.6642f, 22.0f, 7.25f)
                curveTo(22.0f, 6.8358f, 21.6642f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(18.5603f)
                lineTo(21.7806f, 3.2804f)
                curveTo(22.0735f, 2.9875f, 22.0736f, 2.5127f, 21.7807f, 2.2197f)
                curveTo(21.4879f, 1.9268f, 21.013f, 1.9267f, 20.7201f, 2.2196f)
                lineTo(17.5f, 5.439f)
                verticalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _foodCarrot!!
    }

private var _foodCarrot: ImageVector? = null
