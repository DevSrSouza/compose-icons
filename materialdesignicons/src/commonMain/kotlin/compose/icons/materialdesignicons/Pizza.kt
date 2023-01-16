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

public val MaterialDesignIcons.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 13.0f)
                curveTo(10.0f, 11.89f, 10.9f, 11.0f, 12.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 15.0f)
                moveTo(7.0f, 7.0f)
                curveTo(7.0f, 5.89f, 7.89f, 5.0f, 9.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 9.0f)
                curveTo(7.89f, 9.0f, 7.0f, 8.1f, 7.0f, 7.0f)
                moveTo(12.0f, 2.0f)
                curveTo(8.43f, 2.0f, 5.23f, 3.54f, 3.0f, 6.0f)
                lineTo(12.0f, 22.0f)
                lineTo(21.0f, 6.0f)
                curveTo(18.78f, 3.54f, 15.57f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
