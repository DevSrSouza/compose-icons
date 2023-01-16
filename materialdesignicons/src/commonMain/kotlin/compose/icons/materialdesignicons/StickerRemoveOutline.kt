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

public val MaterialDesignIcons.StickerRemoveOutline: ImageVector
    get() {
        if (_stickerRemoveOutline != null) {
            return _stickerRemoveOutline!!
        }
        _stickerRemoveOutline = Builder(name = "StickerRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.4f)
                lineTo(13.4f, 12.0f)
                lineTo(16.0f, 14.6f)
                lineTo(14.6f, 16.0f)
                lineTo(12.0f, 13.4f)
                lineTo(9.4f, 16.0f)
                lineTo(8.0f, 14.6f)
                lineTo(10.6f, 12.0f)
                lineTo(8.0f, 9.4f)
                lineTo(9.4f, 8.0f)
                lineTo(12.0f, 10.6f)
                lineTo(14.6f, 8.0f)
                lineTo(16.0f, 9.4f)
                moveTo(22.0f, 5.5f)
                verticalLineTo(16.0f)
                lineTo(16.0f, 22.0f)
                horizontalLineTo(5.5f)
                curveTo(3.6f, 22.0f, 2.0f, 20.4f, 2.0f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(2.0f, 3.6f, 3.6f, 2.0f, 5.5f, 2.0f)
                horizontalLineTo(18.5f)
                curveTo(20.4f, 2.0f, 22.0f, 3.6f, 22.0f, 5.5f)
                moveTo(20.0f, 5.8f)
                curveTo(20.0f, 4.8f, 19.2f, 4.0f, 18.2f, 4.0f)
                horizontalLineTo(5.8f)
                curveTo(4.8f, 4.0f, 4.0f, 4.8f, 4.0f, 5.8f)
                verticalLineTo(18.3f)
                curveTo(4.0f, 19.3f, 4.8f, 20.1f, 5.8f, 20.1f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.6f)
                curveTo(15.0f, 16.7f, 16.6f, 15.1f, 18.5f, 15.1f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.8f)
                close()
            }
        }
        .build()
        return _stickerRemoveOutline!!
    }

private var _stickerRemoveOutline: ImageVector? = null
