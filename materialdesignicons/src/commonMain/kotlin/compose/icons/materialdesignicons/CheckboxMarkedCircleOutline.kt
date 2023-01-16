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

public val MaterialDesignIcons.CheckboxMarkedCircleOutline: ImageVector
    get() {
        if (_checkboxMarkedCircleOutline != null) {
            return _checkboxMarkedCircleOutline!!
        }
        _checkboxMarkedCircleOutline = Builder(name = "CheckboxMarkedCircleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                curveTo(12.76f, 4.0f, 13.5f, 4.11f, 14.2f, 4.31f)
                lineTo(15.77f, 2.74f)
                curveTo(14.61f, 2.26f, 13.34f, 2.0f, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                moveTo(7.91f, 10.08f)
                lineTo(6.5f, 11.5f)
                lineTo(11.0f, 16.0f)
                lineTo(21.0f, 6.0f)
                lineTo(19.59f, 4.58f)
                lineTo(11.0f, 13.17f)
                lineTo(7.91f, 10.08f)
                close()
            }
        }
        .build()
        return _checkboxMarkedCircleOutline!!
    }

private var _checkboxMarkedCircleOutline: ImageVector? = null
