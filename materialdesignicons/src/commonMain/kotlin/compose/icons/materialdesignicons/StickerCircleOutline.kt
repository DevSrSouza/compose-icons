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

public val MaterialDesignIcons.StickerCircleOutline: ImageVector
    get() {
        if (_stickerCircleOutline != null) {
            return _stickerCircleOutline!!
        }
        _stickerCircleOutline = Builder(name = "StickerCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.12f, 18.46f)
                lineTo(18.3f, 12.28f)
                curveTo(16.94f, 12.59f, 15.31f, 13.2f, 14.07f, 14.46f)
                curveTo(13.04f, 15.5f, 12.39f, 16.83f, 12.12f, 18.46f)
                moveTo(20.75f, 10.0f)
                horizontalLineTo(21.05f)
                curveTo(21.44f, 10.0f, 21.79f, 10.27f, 21.93f, 10.64f)
                curveTo(22.07f, 11.0f, 22.0f, 11.43f, 21.7f, 11.71f)
                lineTo(11.7f, 21.71f)
                curveTo(11.5f, 21.9f, 11.26f, 22.0f, 11.0f, 22.0f)
                lineTo(10.64f, 21.93f)
                curveTo(10.27f, 21.79f, 10.0f, 21.44f, 10.0f, 21.05f)
                curveTo(9.84f, 17.66f, 10.73f, 14.96f, 12.66f, 13.03f)
                curveTo(15.5f, 10.2f, 19.62f, 10.0f, 20.75f, 10.0f)
                moveTo(12.0f, 2.0f)
                curveTo(16.5f, 2.0f, 20.34f, 5.0f, 21.58f, 9.11f)
                lineTo(20.0f, 9.0f)
                horizontalLineTo(19.42f)
                curveTo(18.24f, 6.07f, 15.36f, 4.0f, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                curveTo(4.0f, 15.36f, 6.07f, 18.24f, 9.0f, 19.42f)
                curveTo(8.97f, 20.13f, 9.0f, 20.85f, 9.11f, 21.57f)
                curveTo(5.0f, 20.33f, 2.0f, 16.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.47f, 6.5f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _stickerCircleOutline!!
    }

private var _stickerCircleOutline: ImageVector? = null
