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

public val MaterialDesignIcons.Pirate: ImageVector
    get() {
        if (_pirate != null) {
            return _pirate!!
        }
        _pirate = Builder(name = "Pirate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2f, 12.1f)
                curveTo(7.9f, 12.3f, 7.7f, 12.7f, 7.8f, 13.0f)
                curveTo(7.8f, 13.7f, 8.5f, 14.2f, 9.1f, 14.2f)
                curveTo(9.7f, 14.2f, 10.3f, 13.7f, 10.3f, 13.0f)
                curveTo(9.7f, 12.6f, 9.0f, 12.3f, 8.2f, 12.1f)
                moveTo(22.0f, 11.0f)
                lineTo(23.0f, 7.0f)
                curveTo(23.0f, 7.0f, 21.0f, 7.0f, 18.0f, 5.0f)
                curveTo(15.0f, 3.0f, 15.0f, 1.0f, 12.0f, 1.0f)
                curveTo(9.0f, 1.0f, 9.0f, 3.0f, 6.0f, 5.0f)
                curveTo(3.0f, 7.0f, 1.0f, 7.0f, 1.0f, 7.0f)
                lineTo(2.0f, 11.0f)
                horizontalLineTo(2.1f)
                curveTo(2.0f, 11.3f, 2.0f, 11.7f, 2.0f, 12.0f)
                curveTo(2.0f, 15.5f, 3.8f, 18.6f, 6.5f, 20.4f)
                lineTo(6.0f, 21.3f)
                curveTo(12.4f, 25.4f, 18.0f, 21.3f, 18.0f, 21.3f)
                lineTo(17.5f, 20.4f)
                curveTo(20.2f, 18.6f, 22.0f, 15.5f, 22.0f, 12.0f)
                curveTo(22.0f, 11.7f, 22.0f, 11.3f, 22.0f, 11.0f)
                moveTo(11.3f, 4.5f)
                lineTo(9.9f, 3.1f)
                lineTo(10.6f, 2.4f)
                lineTo(12.0f, 3.8f)
                lineTo(13.4f, 2.4f)
                lineTo(14.1f, 3.1f)
                lineTo(12.7f, 4.5f)
                lineTo(14.1f, 5.9f)
                lineTo(13.4f, 6.6f)
                lineTo(12.0f, 5.2f)
                lineTo(10.6f, 6.6f)
                lineTo(9.9f, 5.9f)
                lineTo(11.3f, 4.5f)
                moveTo(9.3f, 8.5f)
                curveTo(10.3f, 8.2f, 11.3f, 8.0f, 12.0f, 8.0f)
                curveTo(14.2f, 8.0f, 17.9f, 9.6f, 19.8f, 10.4f)
                curveTo(19.9f, 10.7f, 19.9f, 11.0f, 19.9f, 11.3f)
                lineTo(9.3f, 8.5f)
                moveTo(13.6f, 19.1f)
                curveTo(12.9f, 19.5f, 12.2f, 19.8f, 11.4f, 19.9f)
                curveTo(10.9f, 19.5f, 10.9f, 18.7f, 11.4f, 18.3f)
                curveTo(11.8f, 17.9f, 12.7f, 17.7f, 13.2f, 18.2f)
                curveTo(13.5f, 18.3f, 13.6f, 18.8f, 13.6f, 19.1f)
                moveTo(20.0f, 13.4f)
                curveTo(19.5f, 15.5f, 18.2f, 17.4f, 16.5f, 18.6f)
                lineTo(15.0f, 16.0f)
                horizontalLineTo(9.0f)
                lineTo(7.5f, 18.6f)
                curveTo(5.4f, 17.2f, 4.0f, 14.8f, 4.0f, 12.0f)
                curveTo(4.0f, 11.5f, 4.1f, 11.0f, 4.2f, 10.5f)
                curveTo(4.7f, 10.3f, 5.3f, 10.0f, 6.0f, 9.7f)
                lineTo(13.1f, 11.6f)
                verticalLineTo(14.0f)
                curveTo(13.1f, 14.5f, 13.5f, 15.0f, 14.1f, 15.0f)
                horizontalLineTo(16.1f)
                curveTo(16.6f, 15.0f, 17.1f, 14.6f, 17.1f, 14.0f)
                verticalLineTo(12.6f)
                lineTo(20.0f, 13.4f)
                close()
            }
        }
        .build()
        return _pirate!!
    }

private var _pirate: ImageVector? = null
