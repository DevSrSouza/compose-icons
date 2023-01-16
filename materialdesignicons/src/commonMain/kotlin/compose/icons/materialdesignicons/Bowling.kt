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

public val MaterialDesignIcons.Bowling: ImageVector
    get() {
        if (_bowling != null) {
            return _bowling!!
        }
        _bowling = Builder(name = "Bowling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 11.0f)
                moveTo(12.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 5.0f)
                moveTo(5.93f, 8.5f)
                curveTo(5.38f, 9.45f, 5.71f, 10.67f, 6.66f, 11.22f)
                curveTo(7.62f, 11.78f, 8.84f, 11.45f, 9.4f, 10.5f)
                curveTo(9.95f, 9.53f, 9.62f, 8.31f, 8.66f, 7.76f)
                curveTo(7.71f, 7.21f, 6.5f, 7.53f, 5.93f, 8.5f)
                close()
            }
        }
        .build()
        return _bowling!!
    }

private var _bowling: ImageVector? = null
