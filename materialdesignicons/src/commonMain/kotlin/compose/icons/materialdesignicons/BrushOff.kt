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

public val MaterialDesignIcons.BrushOff: ImageVector
    get() {
        if (_brushOff != null) {
            return _brushOff!!
        }
        _brushOff = Builder(name = "BrushOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(12.4f, 14.3f)
                lineTo(11.8f, 15.0f)
                lineTo(9.0f, 12.2f)
                lineTo(9.7f, 11.5f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(7.0f, 14.0f)
                curveTo(5.3f, 14.0f, 4.0f, 15.3f, 4.0f, 17.0f)
                curveTo(4.0f, 18.3f, 2.8f, 19.0f, 2.0f, 19.0f)
                curveTo(2.9f, 20.2f, 4.5f, 21.0f, 6.0f, 21.0f)
                curveTo(8.2f, 21.0f, 10.0f, 19.2f, 10.0f, 17.0f)
                curveTo(10.0f, 15.3f, 8.7f, 14.0f, 7.0f, 14.0f)
                moveTo(20.7f, 6.0f)
                curveTo(21.1f, 5.6f, 21.1f, 5.0f, 20.7f, 4.6f)
                lineTo(19.4f, 3.3f)
                curveTo(19.0f, 2.9f, 18.4f, 2.9f, 18.0f, 3.3f)
                lineTo(12.2f, 9.0f)
                lineTo(15.0f, 11.8f)
                lineTo(20.7f, 6.0f)
                close()
            }
        }
        .build()
        return _brushOff!!
    }

private var _brushOff: ImageVector? = null
