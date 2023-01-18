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

public val FilledGroup.PhonePagination: ImageVector
    get() {
        if (_phonePagination != null) {
            return _phonePagination!!
        }
        _phonePagination = Builder(name = "PhonePagination", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 2.0f)
                curveTo(16.9926f, 2.0f, 18.0f, 3.0074f, 18.0f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.9926f, 16.9926f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0074f, 7.0074f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(9.4988f, 17.7619f)
                curveTo(9.0846f, 17.7619f, 8.7488f, 18.0977f, 8.7488f, 18.5119f)
                curveTo(8.7488f, 18.9261f, 9.0846f, 19.2619f, 9.4988f, 19.2619f)
                curveTo(9.913f, 19.2619f, 10.2488f, 18.9261f, 10.2488f, 18.5119f)
                curveTo(10.2488f, 18.0977f, 9.913f, 17.7619f, 9.4988f, 17.7619f)
                close()
                moveTo(11.9988f, 17.7619f)
                curveTo(11.5846f, 17.7619f, 11.2488f, 18.0977f, 11.2488f, 18.5119f)
                curveTo(11.2488f, 18.9261f, 11.5846f, 19.2619f, 11.9988f, 19.2619f)
                curveTo(12.413f, 19.2619f, 12.7488f, 18.9261f, 12.7488f, 18.5119f)
                curveTo(12.7488f, 18.0977f, 12.413f, 17.7619f, 11.9988f, 17.7619f)
                close()
                moveTo(14.4988f, 17.7619f)
                curveTo(14.0846f, 17.7619f, 13.7488f, 18.0977f, 13.7488f, 18.5119f)
                curveTo(13.7488f, 18.9261f, 14.0846f, 19.2619f, 14.4988f, 19.2619f)
                curveTo(14.913f, 19.2619f, 15.2488f, 18.9261f, 15.2488f, 18.5119f)
                curveTo(15.2488f, 18.0977f, 14.913f, 17.7619f, 14.4988f, 17.7619f)
                close()
            }
        }
        .build()
        return _phonePagination!!
    }

private var _phonePagination: ImageVector? = null
