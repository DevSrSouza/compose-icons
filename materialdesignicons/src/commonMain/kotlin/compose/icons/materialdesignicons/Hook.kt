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

public val MaterialDesignIcons.Hook: ImageVector
    get() {
        if (_hook != null) {
            return _hook!!
        }
        _hook = Builder(name = "Hook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                curveTo(18.0f, 7.82f, 16.76f, 9.41f, 15.0f, 9.86f)
                verticalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 10.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 5.0f, 17.0f)
                verticalLineTo(12.0f)
                lineTo(10.0f, 17.0f)
                horizontalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 17.0f)
                verticalLineTo(9.86f)
                curveTo(11.23f, 9.4f, 10.0f, 7.8f, 10.0f, 5.97f)
                curveTo(10.0f, 3.76f, 11.8f, 2.0f, 14.0f, 2.0f)
                curveTo(16.22f, 2.0f, 18.0f, 3.79f, 18.0f, 6.0f)
                moveTo(14.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 8.0f)
                close()
            }
        }
        .build()
        return _hook!!
    }

private var _hook: ImageVector? = null
