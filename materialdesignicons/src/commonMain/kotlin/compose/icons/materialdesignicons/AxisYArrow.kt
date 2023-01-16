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

public val MaterialDesignIcons.AxisYArrow: ImageVector
    get() {
        if (_axisYArrow != null) {
            return _axisYArrow!!
        }
        _axisYArrow = Builder(name = "AxisYArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 20.5f)
                lineTo(17.0f, 21.96f)
                lineTo(18.53f, 19.35f)
                lineTo(12.0f, 15.58f)
                lineTo(2.61f, 21.0f)
                lineTo(1.61f, 19.27f)
                lineTo(11.0f, 13.85f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.85f)
                lineTo(19.53f, 17.61f)
                lineTo(21.0f, 15.03f)
                lineTo(22.5f, 20.5f)
                close()
            }
        }
        .build()
        return _axisYArrow!!
    }

private var _axisYArrow: ImageVector? = null
