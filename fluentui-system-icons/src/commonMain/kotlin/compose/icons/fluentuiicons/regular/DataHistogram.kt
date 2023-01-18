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

public val RegularGroup.DataHistogram: ImageVector
    get() {
        if (_dataHistogram != null) {
            return _dataHistogram!!
        }
        _dataHistogram = Builder(name = "DataHistogram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.2305f)
                curveTo(8.5f, 3.9878f, 9.5074f, 2.9805f, 10.75f, 2.9805f)
                horizontalLineTo(13.25f)
                curveTo(14.4926f, 2.9805f, 15.5f, 3.9878f, 15.5f, 5.2305f)
                verticalLineTo(7.0005f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 7.0005f, 21.0f, 8.0078f, 21.0f, 9.2505f)
                verticalLineTo(20.2505f)
                curveTo(21.0f, 20.6647f, 20.6642f, 21.0005f, 20.25f, 21.0005f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 21.0005f, 3.0f, 20.6647f, 3.0f, 20.2505f)
                verticalLineTo(12.2505f)
                curveTo(3.0f, 11.0078f, 4.0074f, 10.0005f, 5.25f, 10.0005f)
                horizontalLineTo(8.5f)
                verticalLineTo(5.2305f)
                close()
                moveTo(10.0f, 19.5005f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.2305f)
                curveTo(14.0f, 4.8163f, 13.6642f, 4.4805f, 13.25f, 4.4805f)
                horizontalLineTo(10.75f)
                curveTo(10.3358f, 4.4805f, 10.0f, 4.8162f, 10.0f, 5.2305f)
                verticalLineTo(19.5005f)
                close()
                moveTo(8.5f, 11.5005f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 11.5005f, 4.5f, 11.8363f, 4.5f, 12.2505f)
                verticalLineTo(19.5005f)
                horizontalLineTo(8.5f)
                verticalLineTo(11.5005f)
                close()
                moveTo(15.5f, 19.5005f)
                horizontalLineTo(19.5f)
                verticalLineTo(9.2505f)
                curveTo(19.5f, 8.8363f, 19.1642f, 8.5005f, 18.75f, 8.5005f)
                horizontalLineTo(15.5f)
                verticalLineTo(19.5005f)
                close()
            }
        }
        .build()
        return _dataHistogram!!
    }

private var _dataHistogram: ImageVector? = null
