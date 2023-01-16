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

public val MaterialDesignIcons.HeartBrokenOutline: ImageVector
    get() {
        if (_heartBrokenOutline != null) {
            return _heartBrokenOutline!!
        }
        _heartBrokenOutline = Builder(name = "HeartBrokenOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 5.0f)
                curveTo(7.7f, 5.0f, 7.9f, 5.0f, 8.1f, 5.1f)
                lineTo(10.5f, 9.2f)
                lineTo(6.8f, 13.8f)
                curveTo(5.1f, 11.8f, 4.0f, 10.2f, 4.0f, 8.5f)
                curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f)
                moveTo(7.5f, 3.0f)
                curveTo(4.4f, 3.0f, 2.0f, 5.4f, 2.0f, 8.5f)
                curveTo(2.0f, 12.3f, 5.4f, 15.4f, 10.6f, 20.0f)
                lineTo(12.0f, 21.3f)
                lineTo(9.0f, 14.3f)
                lineTo(13.0f, 9.3f)
                lineTo(9.4f, 3.3f)
                curveTo(8.8f, 3.1f, 8.2f, 3.0f, 7.5f, 3.0f)
                moveTo(16.5f, 5.0f)
                curveTo(18.5f, 5.0f, 20.0f, 6.5f, 20.0f, 8.5f)
                curveTo(20.0f, 11.1f, 17.4f, 13.7f, 13.4f, 17.3f)
                lineTo(13.1f, 15.0f)
                lineTo(17.9f, 9.7f)
                lineTo(15.6f, 5.2f)
                curveTo(15.9f, 5.0f, 16.2f, 5.0f, 16.5f, 5.0f)
                moveTo(16.5f, 3.0f)
                curveTo(15.2f, 3.0f, 13.9f, 3.5f, 12.9f, 4.3f)
                lineTo(15.5f, 9.4f)
                lineTo(11.0f, 14.4f)
                lineTo(12.0f, 21.4f)
                lineTo(13.4f, 20.1f)
                curveTo(18.6f, 15.4f, 22.0f, 12.3f, 22.0f, 8.6f)
                curveTo(22.0f, 5.4f, 19.6f, 3.0f, 16.5f, 3.0f)
                close()
            }
        }
        .build()
        return _heartBrokenOutline!!
    }

private var _heartBrokenOutline: ImageVector? = null
