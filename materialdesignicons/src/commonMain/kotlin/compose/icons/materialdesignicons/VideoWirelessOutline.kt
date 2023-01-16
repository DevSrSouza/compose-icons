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

public val MaterialDesignIcons.VideoWirelessOutline: ImageVector
    get() {
        if (_videoWirelessOutline != null) {
            return _videoWirelessOutline!!
        }
        _videoWirelessOutline = Builder(name = "VideoWirelessOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                moveTo(16.0f, 10.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 11.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 21.0f)
                verticalLineTo(17.5f)
                lineTo(21.0f, 21.5f)
                verticalLineTo(10.5f)
                lineTo(17.0f, 14.5f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 10.0f)
                moveTo(3.0f, 3.86f)
                lineTo(4.4f, 5.24f)
                curveTo(7.5f, 2.19f, 12.5f, 2.19f, 15.6f, 5.24f)
                lineTo(17.0f, 3.86f)
                curveTo(13.14f, 0.05f, 6.87f, 0.05f, 3.0f, 3.86f)
                moveTo(5.8f, 6.63f)
                lineTo(7.2f, 8.0f)
                curveTo(8.75f, 6.5f, 11.25f, 6.5f, 12.8f, 8.0f)
                lineTo(14.2f, 6.63f)
                curveTo(11.88f, 4.34f, 8.12f, 4.34f, 5.8f, 6.63f)
                close()
            }
        }
        .build()
        return _videoWirelessOutline!!
    }

private var _videoWirelessOutline: ImageVector? = null
