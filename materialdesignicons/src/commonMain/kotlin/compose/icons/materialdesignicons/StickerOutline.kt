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

public val MaterialDesignIcons.StickerOutline: ImageVector
    get() {
        if (_stickerOutline != null) {
            return _stickerOutline!!
        }
        _stickerOutline = Builder(name = "StickerOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 2.0f)
                curveTo(3.6f, 2.0f, 2.0f, 3.6f, 2.0f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(2.0f, 20.4f, 3.6f, 22.0f, 5.5f, 22.0f)
                horizontalLineTo(16.0f)
                lineTo(22.0f, 16.0f)
                verticalLineTo(5.5f)
                curveTo(22.0f, 3.6f, 20.4f, 2.0f, 18.5f, 2.0f)
                horizontalLineTo(5.5f)
                moveTo(5.8f, 4.0f)
                horizontalLineTo(18.3f)
                curveTo(19.3f, 4.0f, 20.1f, 4.8f, 20.1f, 5.8f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.6f)
                curveTo(16.7f, 15.0f, 15.1f, 16.6f, 15.1f, 18.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.8f)
                curveTo(4.8f, 20.0f, 4.0f, 19.2f, 4.0f, 18.2f)
                verticalLineTo(5.8f)
                curveTo(4.0f, 4.8f, 4.8f, 4.0f, 5.8f, 4.0f)
            }
        }
        .build()
        return _stickerOutline!!
    }

private var _stickerOutline: ImageVector? = null
