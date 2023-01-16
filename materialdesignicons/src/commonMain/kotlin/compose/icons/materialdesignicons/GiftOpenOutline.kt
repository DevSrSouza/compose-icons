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

public val MaterialDesignIcons.GiftOpenOutline: ImageVector
    get() {
        if (_giftOpenOutline != null) {
            return _giftOpenOutline!!
        }
        _giftOpenOutline = Builder(name = "GiftOpenOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.87f)
                lineTo(19.26f, 9.28f)
                curveTo(19.5f, 9.07f, 19.73f, 8.8f, 19.9f, 8.5f)
                curveTo(20.73f, 7.07f, 20.24f, 5.23f, 18.8f, 4.4f)
                curveTo(17.94f, 3.9f, 16.93f, 3.9f, 16.08f, 4.26f)
                lineTo(16.09f, 4.25f)
                lineTo(15.21f, 4.64f)
                lineTo(15.1f, 3.68f)
                lineTo(15.09f, 3.69f)
                curveTo(15.0f, 2.78f, 14.47f, 1.9f, 13.61f, 1.4f)
                curveTo(12.17f, 0.575f, 10.34f, 1.07f, 9.5f, 2.5f)
                curveTo(9.33f, 2.8f, 9.22f, 3.13f, 9.16f, 3.45f)
                lineTo(6.41f, 1.87f)
                curveTo(5.45f, 1.32f, 4.23f, 1.64f, 3.68f, 2.6f)
                lineTo(2.18f, 5.2f)
                curveTo(1.9f, 5.68f, 2.07f, 6.29f, 2.55f, 6.56f)
                lineTo(4.28f, 7.56f)
                lineTo(8.5f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(14.87f)
                lineTo(22.73f, 13.6f)
                curveTo(23.28f, 12.64f, 22.96f, 11.42f, 22.0f, 10.87f)
                moveTo(16.44f, 6.5f)
                curveTo(16.71f, 6.0f, 17.33f, 5.86f, 17.8f, 6.13f)
                curveTo(18.28f, 6.41f, 18.45f, 7.0f, 18.17f, 7.5f)
                curveTo(17.89f, 8.0f, 17.28f, 8.14f, 16.8f, 7.87f)
                curveTo(16.33f, 7.59f, 16.16f, 7.0f, 16.44f, 6.5f)
                moveTo(14.07f, 8.6f)
                lineTo(21.0f, 12.6f)
                lineTo(20.0f, 14.33f)
                lineTo(13.07f, 10.33f)
                lineTo(14.07f, 8.6f)
                moveTo(11.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                moveTo(11.34f, 9.33f)
                lineTo(4.41f, 5.33f)
                lineTo(5.41f, 3.6f)
                lineTo(12.34f, 7.6f)
                lineTo(11.34f, 9.33f)
                moveTo(11.61f, 4.87f)
                curveTo(11.13f, 4.59f, 10.97f, 4.0f, 11.24f, 3.5f)
                curveTo(11.5f, 3.0f, 12.13f, 2.86f, 12.61f, 3.13f)
                curveTo(13.09f, 3.41f, 13.25f, 4.0f, 12.97f, 4.5f)
                curveTo(12.7f, 5.0f, 12.09f, 5.14f, 11.61f, 4.87f)
                moveTo(13.0f, 20.0f)
                verticalLineTo(12.6f)
                lineTo(20.0f, 16.64f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _giftOpenOutline!!
    }

private var _giftOpenOutline: ImageVector? = null
