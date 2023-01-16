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

public val MaterialDesignIcons.StickerCheck: ImageVector
    get() {
        if (_stickerCheck != null) {
            return _stickerCheck!!
        }
        _stickerCheck = Builder(name = "StickerCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(7.0f, 12.5f)
                lineTo(8.3f, 11.1f)
                lineTo(10.4f, 13.2f)
                lineTo(15.6f, 8.0f)
                lineTo(17.0f, 9.4f)
                lineTo(10.5f, 16.0f)
                lineTo(7.0f, 12.5f)
                moveTo(15.0f, 20.0f)
                verticalLineTo(18.5f)
                curveTo(15.0f, 16.6f, 16.6f, 15.0f, 18.5f, 15.0f)
                horizontalLineTo(20.0f)
                lineTo(15.0f, 20.0f)
                close()
            }
        }
        .build()
        return _stickerCheck!!
    }

private var _stickerCheck: ImageVector? = null
