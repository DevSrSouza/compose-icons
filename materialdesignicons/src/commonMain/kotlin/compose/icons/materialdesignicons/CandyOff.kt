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

public val MaterialDesignIcons.CandyOff: ImageVector
    get() {
        if (_candyOff != null) {
            return _candyOff!!
        }
        _candyOff = Builder(name = "CandyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(14.4f, 16.3f)
                curveTo(12.5f, 17.4f, 10.0f, 17.1f, 8.4f, 15.5f)
                curveTo(6.8f, 13.9f, 6.5f, 11.4f, 7.6f, 9.5f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(15.5f, 8.5f)
                curveTo(14.1f, 7.1f, 12.2f, 6.7f, 10.4f, 7.3f)
                lineTo(16.7f, 13.6f)
                curveTo(17.3f, 11.8f, 16.9f, 9.8f, 15.5f, 8.5f)
                moveTo(17.7f, 9.2f)
                curveTo(18.8f, 9.5f, 20.4f, 9.3f, 21.6f, 8.1f)
                curveTo(20.8f, 7.3f, 19.7f, 6.8f, 18.7f, 6.6f)
                curveTo(19.1f, 6.0f, 19.4f, 5.3f, 19.5f, 4.6f)
                curveTo(19.5f, 4.6f, 18.5f, 4.7f, 17.5f, 5.4f)
                curveTo(17.4f, 4.4f, 16.9f, 3.3f, 16.0f, 2.5f)
                curveTo(14.8f, 3.7f, 14.6f, 5.3f, 14.9f, 6.4f)
                curveTo(16.2f, 6.7f, 17.3f, 7.8f, 17.7f, 9.2f)
                moveTo(6.3f, 14.8f)
                curveTo(5.2f, 14.5f, 3.6f, 14.7f, 2.4f, 15.9f)
                curveTo(3.2f, 16.7f, 4.3f, 17.2f, 5.3f, 17.4f)
                curveTo(4.9f, 18.0f, 4.6f, 18.7f, 4.5f, 19.4f)
                curveTo(4.5f, 19.4f, 5.5f, 19.3f, 6.5f, 18.6f)
                curveTo(6.6f, 19.6f, 7.1f, 20.7f, 8.0f, 21.5f)
                curveTo(9.2f, 20.3f, 9.4f, 18.7f, 9.1f, 17.6f)
                curveTo(7.8f, 17.3f, 6.7f, 16.2f, 6.3f, 14.8f)
                close()
            }
        }
        .build()
        return _candyOff!!
    }

private var _candyOff: ImageVector? = null
