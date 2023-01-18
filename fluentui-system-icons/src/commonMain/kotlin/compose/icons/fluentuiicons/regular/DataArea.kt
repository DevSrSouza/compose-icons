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

public val RegularGroup.DataArea: ImageVector
    get() {
        if (_dataArea != null) {
            return _dataArea!!
        }
        _dataArea = Builder(name = "DataArea", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.75f)
                curveTo(3.0f, 3.3358f, 3.3358f, 3.0f, 3.75f, 3.0f)
                curveTo(4.1642f, 3.0f, 4.5f, 3.3358f, 4.5f, 3.75f)
                verticalLineTo(10.0077f)
                lineTo(8.1507f, 8.0863f)
                curveTo(8.3805f, 7.9654f, 8.6565f, 7.9719f, 8.8803f, 8.1035f)
                lineTo(12.6997f, 10.3503f)
                lineTo(18.3f, 6.15f)
                curveTo(18.5273f, 5.9795f, 18.8314f, 5.9521f, 19.0854f, 6.0792f)
                curveTo(19.3395f, 6.2062f, 19.5f, 6.4659f, 19.5f, 6.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 19.5f, 21.0f, 19.8358f, 21.0f, 20.25f)
                curveTo(21.0f, 20.6642f, 20.6642f, 21.0f, 20.25f, 21.0f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 21.0f, 3.0f, 20.6642f, 3.0f, 20.25f)
                verticalLineTo(11.2641f)
                curveTo(2.9998f, 11.2551f, 2.9998f, 11.2461f, 3.0f, 11.2371f)
                verticalLineTo(3.75f)
                close()
                moveTo(4.5f, 11.7028f)
                verticalLineTo(19.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.25f)
                lineTo(13.2f, 11.85f)
                curveTo(12.958f, 12.0315f, 12.6306f, 12.0499f, 12.3698f, 11.8965f)
                lineTo(8.4797f, 9.6082f)
                lineTo(4.5f, 11.7028f)
                close()
            }
        }
        .build()
        return _dataArea!!
    }

private var _dataArea: ImageVector? = null
