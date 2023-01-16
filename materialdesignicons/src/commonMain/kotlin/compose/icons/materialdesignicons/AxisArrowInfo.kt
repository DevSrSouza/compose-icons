package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.AxisArrowInfo: ImageVector
    get() {
        if (_axisArrowInfo != null) {
            return _axisArrowInfo!!
        }
        _axisArrowInfo = Builder(name = "AxisArrowInfo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(16.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.85f)
                lineTo(19.53f, 17.61f)
                lineTo(21.0f, 15.03f)
                lineTo(22.5f, 20.5f)
                lineTo(17.0f, 21.96f)
                lineTo(18.53f, 19.35f)
                lineTo(12.0f, 15.58f)
                lineTo(5.47f, 19.35f)
                lineTo(7.0f, 21.96f)
                lineTo(1.5f, 20.5f)
                lineTo(3.0f, 15.03f)
                lineTo(4.47f, 17.61f)
                lineTo(11.0f, 13.85f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 2.0f)
                moveTo(21.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                moveTo(22.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _axisArrowInfo!!
    }

private var _axisArrowInfo: ImageVector? = null
