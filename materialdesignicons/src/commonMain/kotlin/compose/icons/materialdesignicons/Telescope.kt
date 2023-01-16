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

public val MaterialDesignIcons.Telescope: ImageVector
    get() {
        if (_telescope != null) {
            return _telescope!!
        }
        _telescope = Builder(name = "Telescope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9f, 8.9f)
                lineTo(20.2f, 9.9f)
                lineTo(16.2f, 3.0f)
                lineTo(17.9f, 2.0f)
                lineTo(21.9f, 8.9f)
                moveTo(9.8f, 7.9f)
                lineTo(12.8f, 13.1f)
                lineTo(18.9f, 9.6f)
                lineTo(15.9f, 4.4f)
                lineTo(9.8f, 7.9f)
                moveTo(11.4f, 12.7f)
                lineTo(9.4f, 9.2f)
                lineTo(5.1f, 11.7f)
                lineTo(7.1f, 15.2f)
                lineTo(11.4f, 12.7f)
                moveTo(2.1f, 14.6f)
                lineTo(3.1f, 16.3f)
                lineTo(5.7f, 14.8f)
                lineTo(4.7f, 13.1f)
                lineTo(2.1f, 14.6f)
                moveTo(12.1f, 14.0f)
                lineTo(11.8f, 13.6f)
                lineTo(7.5f, 16.1f)
                lineTo(7.8f, 16.5f)
                curveTo(8.0f, 16.8f, 8.3f, 17.1f, 8.6f, 17.3f)
                lineTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                lineTo(10.4f, 17.7f)
                horizontalLineTo(10.5f)
                lineTo(12.0f, 22.0f)
                horizontalLineTo(14.0f)
                lineTo(12.1f, 16.4f)
                curveTo(12.6f, 15.7f, 12.6f, 14.8f, 12.1f, 14.0f)
                close()
            }
        }
        .build()
        return _telescope!!
    }

private var _telescope: ImageVector? = null
