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

public val MaterialDesignIcons.BarleyOff: ImageVector
    get() {
        if (_barleyOff != null) {
            return _barleyOff!!
        }
        _barleyOff = Builder(name = "BarleyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.96f, 1.21f)
                curveTo(11.3f, 2.76f, 10.64f, 4.31f, 10.65f, 5.82f)
                curveTo(10.66f, 6.42f, 10.77f, 7.0f, 10.94f, 7.62f)
                curveTo(10.86f, 7.46f, 10.77f, 7.31f, 10.67f, 7.17f)
                curveTo(9.83f, 6.0f, 8.17f, 5.0f, 6.5f, 4.0f)
                curveTo(6.5f, 4.8f, 6.5f, 5.59f, 6.68f, 6.36f)
                lineTo(13.0f, 12.68f)
                verticalLineTo(10.7f)
                curveTo(14.5f, 9.8f, 15.92f, 8.88f, 16.67f, 7.83f)
                curveTo(17.5f, 6.67f, 17.5f, 5.33f, 17.5f, 4.0f)
                curveTo(15.83f, 5.0f, 14.17f, 6.0f, 13.33f, 7.17f)
                curveTo(13.23f, 7.31f, 13.15f, 7.45f, 13.07f, 7.59f)
                curveTo(13.25f, 6.96f, 13.36f, 6.32f, 13.35f, 5.69f)
                curveTo(13.34f, 4.18f, 12.65f, 2.69f, 11.96f, 1.21f)
                moveTo(3.28f, 5.5f)
                lineTo(2.0f, 6.77f)
                lineTo(6.64f, 11.41f)
                curveTo(6.75f, 12.0f, 6.95f, 12.55f, 7.33f, 13.08f)
                curveTo(8.08f, 14.13f, 9.5f, 15.05f, 11.0f, 15.95f)
                verticalLineTo(18.23f)
                lineTo(10.67f, 17.67f)
                curveTo(9.83f, 16.5f, 8.17f, 15.5f, 6.5f, 14.5f)
                curveTo(6.5f, 15.83f, 6.5f, 17.17f, 7.33f, 18.33f)
                curveTo(8.08f, 19.38f, 9.5f, 20.3f, 11.0f, 21.2f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.2f)
                curveTo(13.74f, 20.76f, 14.45f, 20.31f, 15.07f, 19.84f)
                lineTo(18.73f, 23.5f)
                lineTo(20.0f, 22.22f)
                curveTo(14.0f, 16.23f, 9.1f, 11.32f, 3.28f, 5.5f)
                moveTo(17.5f, 9.25f)
                curveTo(15.83f, 10.25f, 14.17f, 11.25f, 13.33f, 12.42f)
                lineTo(13.12f, 12.79f)
                lineTo(15.0f, 14.66f)
                curveTo(15.67f, 14.16f, 16.27f, 13.64f, 16.67f, 13.08f)
                curveTo(17.5f, 11.92f, 17.5f, 10.58f, 17.5f, 9.25f)
                moveTo(17.5f, 14.5f)
                curveTo(16.93f, 14.84f, 16.38f, 15.18f, 15.85f, 15.53f)
                lineTo(17.29f, 16.97f)
                curveTo(17.5f, 16.17f, 17.5f, 15.33f, 17.5f, 14.5f)
                close()
            }
        }
        .build()
        return _barleyOff!!
    }

private var _barleyOff: ImageVector? = null
