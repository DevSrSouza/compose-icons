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

public val MaterialDesignIcons.CircleSlice4: ImageVector
    get() {
        if (_circleSlice4 != null) {
            return _circleSlice4!!
        }
        _circleSlice4 = Builder(name = "CircleSlice4", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5f, 17.5f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                curveTo(20.0f, 7.58f, 16.42f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 5.0f)
                curveTo(15.87f, 5.0f, 19.0f, 8.13f, 19.0f, 12.0f)
                curveTo(19.0f, 15.87f, 15.87f, 19.0f, 12.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _circleSlice4!!
    }

private var _circleSlice4: ImageVector? = null
