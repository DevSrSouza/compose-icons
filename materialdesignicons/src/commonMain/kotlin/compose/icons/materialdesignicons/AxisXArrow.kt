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

public val MaterialDesignIcons.AxisXArrow: ImageVector
    get() {
        if (_axisXArrow != null) {
            return _axisXArrow!!
        }
        _axisXArrow = Builder(name = "AxisXArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 20.5f)
                lineTo(3.0f, 15.03f)
                lineTo(4.46f, 17.6f)
                lineTo(11.0f, 13.82f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.82f)
                lineTo(22.39f, 19.25f)
                lineTo(21.39f, 21.0f)
                lineTo(12.0f, 15.56f)
                lineTo(5.46f, 19.33f)
                lineTo(7.0f, 21.96f)
                lineTo(1.5f, 20.5f)
                close()
            }
        }
        .build()
        return _axisXArrow!!
    }

private var _axisXArrow: ImageVector? = null
