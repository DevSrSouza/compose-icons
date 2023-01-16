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

public val MaterialDesignIcons.Connection: ImageVector
    get() {
        if (_connection != null) {
            return _connection!!
        }
        _connection = Builder(name = "Connection", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4f, 7.5f)
                curveTo(22.2f, 8.3f, 22.2f, 9.6f, 21.4f, 10.3f)
                lineTo(18.6f, 13.1f)
                lineTo(10.8f, 5.3f)
                lineTo(13.6f, 2.5f)
                curveTo(14.4f, 1.7f, 15.7f, 1.7f, 16.4f, 2.5f)
                lineTo(18.2f, 4.3f)
                lineTo(21.2f, 1.3f)
                lineTo(22.6f, 2.7f)
                lineTo(19.6f, 5.7f)
                lineTo(21.4f, 7.5f)
                moveTo(15.6f, 13.3f)
                lineTo(14.2f, 11.9f)
                lineTo(11.4f, 14.7f)
                lineTo(9.3f, 12.6f)
                lineTo(12.1f, 9.8f)
                lineTo(10.7f, 8.4f)
                lineTo(7.9f, 11.2f)
                lineTo(6.4f, 9.8f)
                lineTo(3.6f, 12.6f)
                curveTo(2.8f, 13.4f, 2.8f, 14.7f, 3.6f, 15.4f)
                lineTo(5.4f, 17.2f)
                lineTo(1.4f, 21.2f)
                lineTo(2.8f, 22.6f)
                lineTo(6.8f, 18.6f)
                lineTo(8.6f, 20.4f)
                curveTo(9.4f, 21.2f, 10.7f, 21.2f, 11.4f, 20.4f)
                lineTo(14.2f, 17.6f)
                lineTo(12.8f, 16.2f)
                lineTo(15.6f, 13.3f)
                close()
            }
        }
        .build()
        return _connection!!
    }

private var _connection: ImageVector? = null
