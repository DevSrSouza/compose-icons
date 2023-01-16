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

public val MaterialDesignIcons.StickerCheckOutline: ImageVector
    get() {
        if (_stickerCheckOutline != null) {
            return _stickerCheckOutline!!
        }
        _stickerCheckOutline = Builder(name = "StickerCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 2.0f)
                horizontalLineTo(5.5f)
                curveTo(3.6f, 2.0f, 2.0f, 3.6f, 2.0f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(2.0f, 20.4f, 3.6f, 22.0f, 5.5f, 22.0f)
                horizontalLineTo(16.0f)
                lineTo(22.0f, 16.0f)
                verticalLineTo(5.5f)
                curveTo(22.0f, 3.6f, 20.4f, 2.0f, 18.5f, 2.0f)
                moveTo(20.0f, 15.0f)
                horizontalLineTo(18.5f)
                curveTo(16.6f, 15.0f, 15.0f, 16.6f, 15.0f, 18.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.8f)
                curveTo(4.8f, 20.0f, 4.0f, 19.2f, 4.0f, 18.2f)
                verticalLineTo(5.8f)
                curveTo(4.0f, 4.8f, 4.8f, 4.0f, 5.8f, 4.0f)
                horizontalLineTo(18.3f)
                curveTo(19.3f, 4.0f, 20.1f, 4.8f, 20.1f, 5.8f)
                verticalLineTo(15.0f)
                moveTo(15.2f, 8.2f)
                lineTo(16.7f, 9.7f)
                lineTo(10.7f, 15.7f)
                lineTo(7.2f, 12.2f)
                lineTo(8.7f, 10.7f)
                lineTo(10.7f, 12.7f)
                lineTo(15.2f, 8.2f)
                close()
            }
        }
        .build()
        return _stickerCheckOutline!!
    }

private var _stickerCheckOutline: ImageVector? = null
