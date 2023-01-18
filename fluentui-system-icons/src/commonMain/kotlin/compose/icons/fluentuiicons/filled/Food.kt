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

public val FilledGroup.Food: ImageVector
    get() {
        if (_food != null) {
            return _food!!
        }
        _food = Builder(name = "Food", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                curveTo(18.5128f, 3.0f, 18.9355f, 3.386f, 18.9933f, 3.8834f)
                lineTo(19.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 20.5523f, 18.5523f, 21.0f, 18.0f, 21.0f)
                curveTo(17.4872f, 21.0f, 17.0645f, 20.614f, 17.0067f, 20.1166f)
                lineTo(17.0f, 20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                curveTo(15.4872f, 15.0f, 15.0645f, 14.614f, 15.0067f, 14.1166f)
                lineTo(15.0f, 14.0f)
                verticalLineTo(8.0f)
                curveTo(15.0f, 5.7909f, 16.5f, 3.0f, 18.0f, 3.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(12.5128f, 3.0f, 12.9355f, 3.386f, 12.9933f, 3.8834f)
                lineTo(13.0f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 10.8636f, 11.7256f, 12.4295f, 10.0008f, 12.8738f)
                lineTo(10.0f, 20.0f)
                curveTo(10.0f, 20.5523f, 9.5523f, 21.0f, 9.0f, 21.0f)
                curveTo(8.4872f, 21.0f, 8.0645f, 20.614f, 8.0067f, 20.1166f)
                lineTo(8.0f, 20.0f)
                lineTo(8.0002f, 12.874f)
                curveTo(6.3388f, 12.4465f, 5.095f, 10.9784f, 5.0052f, 9.2058f)
                lineTo(5.0f, 9.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.4477f, 5.4477f, 3.0f, 6.0f, 3.0f)
                curveTo(6.5128f, 3.0f, 6.9355f, 3.386f, 6.9933f, 3.8834f)
                lineTo(7.0f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(7.0f, 9.7402f, 7.4022f, 10.3866f, 7.9999f, 10.7324f)
                lineTo(8.0f, 4.0f)
                curveTo(8.0f, 3.4477f, 8.4477f, 3.0f, 9.0f, 3.0f)
                curveTo(9.5128f, 3.0f, 9.9355f, 3.386f, 9.9933f, 3.8834f)
                lineTo(10.0f, 4.0f)
                lineTo(10.0011f, 10.7318f)
                curveTo(10.5523f, 10.4125f, 10.937f, 9.8375f, 10.993f, 9.169f)
                lineTo(11.0f, 9.0f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.4477f, 11.4477f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _food!!
    }

private var _food: ImageVector? = null
