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

public val FilledGroup.DataHistogram: ImageVector
    get() {
        if (_dataHistogram != null) {
            return _dataHistogram!!
        }
        _dataHistogram = Builder(name = "DataHistogram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.2305f)
                curveTo(9.0f, 3.9878f, 10.0074f, 2.9805f, 11.25f, 2.9805f)
                horizontalLineTo(12.75f)
                curveTo(13.9926f, 2.9805f, 15.0f, 3.9878f, 15.0f, 5.2305f)
                verticalLineTo(21.0005f)
                curveTo(13.0251f, 21.0005f, 11.0084f, 21.0005f, 9.0f, 21.0005f)
                verticalLineTo(5.2305f)
                close()
                moveTo(7.5f, 10.0005f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 10.0005f, 3.0f, 11.0078f, 3.0f, 12.2505f)
                verticalLineTo(20.2505f)
                curveTo(3.0f, 20.6647f, 3.3358f, 21.0005f, 3.75f, 21.0005f)
                horizontalLineTo(7.5f)
                verticalLineTo(10.0005f)
                close()
                moveTo(16.5f, 21.0005f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 21.0005f, 21.0f, 20.6647f, 21.0f, 20.2505f)
                verticalLineTo(9.2505f)
                curveTo(21.0f, 8.0078f, 19.9926f, 7.0005f, 18.75f, 7.0005f)
                horizontalLineTo(16.5f)
                verticalLineTo(21.0005f)
                close()
            }
        }
        .build()
        return _dataHistogram!!
    }

private var _dataHistogram: ImageVector? = null
