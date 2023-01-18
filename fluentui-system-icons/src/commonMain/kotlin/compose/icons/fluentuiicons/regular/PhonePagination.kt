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

public val RegularGroup.PhonePagination: ImageVector
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
                moveTo(15.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 3.5f, 7.5f, 3.8358f, 7.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.1642f, 7.8358f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 20.5f, 16.5f, 20.1642f, 16.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(16.5f, 3.8358f, 16.1642f, 3.5f, 15.75f, 3.5f)
                close()
                moveTo(9.4988f, 17.7545f)
                curveTo(9.913f, 17.7545f, 10.2488f, 18.0902f, 10.2488f, 18.5045f)
                curveTo(10.2488f, 18.9187f, 9.913f, 19.2545f, 9.4988f, 19.2545f)
                curveTo(9.0846f, 19.2545f, 8.7488f, 18.9187f, 8.7488f, 18.5045f)
                curveTo(8.7488f, 18.0902f, 9.0846f, 17.7545f, 9.4988f, 17.7545f)
                close()
                moveTo(11.9988f, 17.7545f)
                curveTo(12.413f, 17.7545f, 12.7488f, 18.0902f, 12.7488f, 18.5045f)
                curveTo(12.7488f, 18.9187f, 12.413f, 19.2545f, 11.9988f, 19.2545f)
                curveTo(11.5846f, 19.2545f, 11.2488f, 18.9187f, 11.2488f, 18.5045f)
                curveTo(11.2488f, 18.0902f, 11.5846f, 17.7545f, 11.9988f, 17.7545f)
                close()
                moveTo(14.4988f, 17.7545f)
                curveTo(14.913f, 17.7545f, 15.2488f, 18.0902f, 15.2488f, 18.5045f)
                curveTo(15.2488f, 18.9187f, 14.913f, 19.2545f, 14.4988f, 19.2545f)
                curveTo(14.0846f, 19.2545f, 13.7488f, 18.9187f, 13.7488f, 18.5045f)
                curveTo(13.7488f, 18.0902f, 14.0846f, 17.7545f, 14.4988f, 17.7545f)
                close()
            }
        }
        .build()
        return _phonePagination!!
    }

private var _phonePagination: ImageVector? = null
