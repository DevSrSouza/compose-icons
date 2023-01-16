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

public val MaterialDesignIcons.Duck: ImageVector
    get() {
        if (_duck != null) {
            return _duck!!
        }
        _duck = Builder(name = "Duck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 5.0f)
                moveTo(10.0f, 2.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 15.0f, 7.0f)
                curveTo(15.0f, 8.7f, 14.15f, 10.2f, 12.86f, 11.1f)
                curveTo(14.44f, 11.25f, 16.22f, 11.61f, 18.0f, 12.5f)
                curveTo(21.0f, 14.0f, 22.0f, 12.0f, 22.0f, 12.0f)
                curveTo(22.0f, 12.0f, 21.0f, 21.0f, 15.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 21.0f, 4.0f, 21.0f, 4.0f, 16.0f)
                curveTo(4.0f, 13.0f, 7.0f, 12.0f, 6.0f, 10.0f)
                curveTo(2.0f, 10.0f, 2.0f, 6.5f, 2.0f, 6.5f)
                curveTo(3.0f, 7.0f, 4.24f, 7.0f, 5.0f, 6.65f)
                curveTo(5.19f, 4.05f, 7.36f, 2.0f, 10.0f, 2.0f)
                close()
            }
        }
        .build()
        return _duck!!
    }

private var _duck: ImageVector? = null
