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

public val RegularGroup.FoodCarrot: ImageVector
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
                verticalLineTo(6.7635f)
                curveTo(13.9741f, 5.4078f, 11.1344f, 5.8843f, 9.7085f, 7.9798f)
                lineTo(2.355f, 18.7862f)
                curveTo(1.7987f, 19.6038f, 1.9056f, 20.6967f, 2.6101f, 21.3936f)
                curveTo(3.3248f, 22.1006f, 4.4493f, 22.198f, 5.2773f, 21.6247f)
                lineTo(16.0663f, 14.1553f)
                curveTo(18.1234f, 12.7311f, 18.5776f, 9.9775f, 17.2426f, 8.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 8.0f, 22.0f, 7.6642f, 22.0f, 7.25f)
                curveTo(22.0f, 6.8358f, 21.6642f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(18.5604f)
                lineTo(21.7806f, 3.2804f)
                curveTo(22.0735f, 2.9875f, 22.0736f, 2.5127f, 21.7807f, 2.2197f)
                curveTo(21.4879f, 1.9268f, 21.013f, 1.9267f, 20.7201f, 2.2196f)
                lineTo(17.5f, 5.439f)
                verticalLineTo(2.75f)
                close()
                moveTo(10.9596f, 8.8128f)
                curveTo(12.0219f, 7.2516f, 14.2605f, 7.0373f, 15.6058f, 8.368f)
                curveTo(16.9352f, 9.6831f, 16.7418f, 11.8667f, 15.2015f, 12.9331f)
                lineTo(4.4125f, 20.4025f)
                curveTo(4.1841f, 20.5607f, 3.8737f, 20.5338f, 3.6765f, 20.3388f)
                curveTo(3.4821f, 20.1465f, 3.4526f, 19.8449f, 3.6061f, 19.6192f)
                lineTo(10.9596f, 8.8128f)
                close()
            }
        }
        .build()
        return _foodCarrot!!
    }

private var _foodCarrot: ImageVector? = null
