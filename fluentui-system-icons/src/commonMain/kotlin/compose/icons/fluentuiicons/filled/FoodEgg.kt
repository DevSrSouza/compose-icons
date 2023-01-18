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

public val FilledGroup.FoodEgg: ImageVector
    get() {
        if (_foodEgg != null) {
            return _foodEgg!!
        }
        _foodEgg = Builder(name = "FoodEgg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 12.25f)
                curveTo(11.5f, 11.8358f, 11.8358f, 11.5f, 12.25f, 11.5f)
                curveTo(12.6642f, 11.5f, 13.0f, 11.1642f, 13.0f, 10.75f)
                curveTo(13.0f, 10.3358f, 12.6642f, 10.0f, 12.25f, 10.0f)
                curveTo(11.0074f, 10.0f, 10.0f, 11.0073f, 10.0f, 12.25f)
                curveTo(10.0f, 12.6642f, 10.3358f, 13.0f, 10.75f, 13.0f)
                curveTo(11.1642f, 13.0f, 11.5f, 12.6642f, 11.5f, 12.25f)
                close()
                moveTo(13.5f, 2.0f)
                curveTo(10.3825f, 2.0f, 7.6878f, 3.8252f, 6.2145f, 6.4936f)
                curveTo(5.9742f, 6.9288f, 5.6062f, 7.3073f, 5.1591f, 7.6095f)
                curveTo(3.2485f, 8.9005f, 2.0f, 11.179f, 2.0f, 13.75f)
                curveTo(2.0f, 17.6964f, 4.9667f, 21.0f, 8.75f, 21.0f)
                curveTo(9.0738f, 21.0f, 9.3926f, 20.9755f, 9.7049f, 20.9279f)
                curveTo(10.5741f, 20.7957f, 11.4969f, 20.9274f, 12.2716f, 21.3089f)
                curveTo(13.1708f, 21.7516f, 14.1825f, 22.0f, 15.25f, 22.0f)
                curveTo(18.9779f, 22.0f, 22.0f, 18.9779f, 22.0f, 15.25f)
                curveTo(22.0f, 14.8298f, 21.9615f, 14.4179f, 21.8877f, 14.0178f)
                curveTo(21.8188f, 13.645f, 21.8072f, 13.2793f, 21.8641f, 12.9356f)
                curveTo(21.9535f, 12.3963f, 22.0f, 11.8413f, 22.0f, 11.275f)
                curveTo(22.0f, 6.2214f, 18.2601f, 2.0f, 13.5f, 2.0f)
                close()
                moveTo(17.25f, 12.5f)
                curveTo(17.25f, 15.1233f, 15.1234f, 17.25f, 12.5f, 17.25f)
                curveTo(9.8766f, 17.25f, 7.75f, 15.1233f, 7.75f, 12.5f)
                curveTo(7.75f, 9.8766f, 9.8766f, 7.75f, 12.5f, 7.75f)
                curveTo(15.1234f, 7.75f, 17.25f, 9.8766f, 17.25f, 12.5f)
                close()
            }
        }
        .build()
        return _foodEgg!!
    }

private var _foodEgg: ImageVector? = null
