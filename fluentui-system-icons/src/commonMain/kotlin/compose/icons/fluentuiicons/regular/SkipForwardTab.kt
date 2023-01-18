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

public val RegularGroup.SkipForwardTab: ImageVector
    get() {
        if (_skipForwardTab != null) {
            return _skipForwardTab!!
        }
        _skipForwardTab = Builder(name = "SkipForwardTab", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 3.75f)
                curveTo(21.5f, 3.3358f, 21.1642f, 3.0f, 20.75f, 3.0f)
                curveTo(20.3358f, 3.0f, 20.0f, 3.3358f, 20.0f, 3.75f)
                verticalLineTo(7.1495f)
                curveTo(18.8465f, 5.7615f, 17.3504f, 4.5867f, 15.4717f, 4.0054f)
                curveTo(13.0931f, 3.2693f, 10.5682f, 3.3307f, 8.2386f, 4.1973f)
                curveTo(5.9227f, 5.0588f, 3.7345f, 6.8069f, 2.5925f, 8.8896f)
                curveTo(2.3934f, 9.2528f, 2.5264f, 9.7087f, 2.8895f, 9.9079f)
                curveTo(3.2527f, 10.107f, 3.7086f, 9.974f, 3.9078f, 9.6108f)
                curveTo(4.8521f, 7.8885f, 6.7327f, 6.3579f, 8.7616f, 5.6032f)
                curveTo(10.7768f, 4.8535f, 12.9619f, 4.7989f, 15.0283f, 5.4383f)
                curveTo(16.7297f, 5.9648f, 18.0992f, 7.1021f, 19.1573f, 8.5f)
                horizontalLineTo(15.2499f)
                curveTo(14.8357f, 8.5f, 14.4999f, 8.8358f, 14.4999f, 9.25f)
                curveTo(14.4999f, 9.6642f, 14.8357f, 10.0f, 15.2499f, 10.0f)
                horizontalLineTo(20.75f)
                curveTo(21.1642f, 10.0f, 21.5f, 9.6642f, 21.5f, 9.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(7.7239f, 14.0f, 7.5f, 14.2239f, 7.5f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(7.5f, 18.7761f, 7.7239f, 19.0f, 8.0f, 19.0f)
                horizontalLineTo(16.0f)
                curveTo(16.2761f, 19.0f, 16.5f, 18.7761f, 16.5f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(16.5f, 14.2239f, 16.2761f, 14.0f, 16.0f, 14.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(6.0f, 14.5f)
                curveTo(6.0f, 13.3954f, 6.8954f, 12.5f, 8.0f, 12.5f)
                horizontalLineTo(16.0f)
                curveTo(17.1046f, 12.5f, 18.0f, 13.3954f, 18.0f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(18.0f, 19.6046f, 17.1046f, 20.5f, 16.0f, 20.5f)
                horizontalLineTo(8.0f)
                curveTo(6.8954f, 20.5f, 6.0f, 19.6046f, 6.0f, 18.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _skipForwardTab!!
    }

private var _skipForwardTab: ImageVector? = null
