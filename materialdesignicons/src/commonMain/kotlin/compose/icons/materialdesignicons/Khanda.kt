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

public val MaterialDesignIcons.Khanda: ImageVector
    get() {
        if (_khanda != null) {
            return _khanda!!
        }
        _khanda = Builder(name = "Khanda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 20.0f)
                curveTo(19.72f, 18.0f, 22.0f, 15.27f, 22.0f, 12.0f)
                curveTo(22.0f, 9.34f, 20.46f, 6.9f, 17.89f, 5.0f)
                horizontalLineTo(17.82f)
                curveTo(19.0f, 6.35f, 19.68f, 8.09f, 19.68f, 10.0f)
                curveTo(19.68f, 13.0f, 18.0f, 15.0f, 15.5f, 16.83f)
                curveTo(15.5f, 16.84f, 14.38f, 17.54f, 13.0f, 18.41f)
                verticalLineTo(17.33f)
                lineTo(15.0f, 16.0f)
                curveTo(15.0f, 16.0f, 14.8f, 15.4f, 14.58f, 14.46f)
                curveTo(16.6f, 13.58f, 18.0f, 11.69f, 18.0f, 9.5f)
                curveTo(18.0f, 7.34f, 16.64f, 5.47f, 14.65f, 4.57f)
                curveTo(14.84f, 3.63f, 15.0f, 3.0f, 15.0f, 3.0f)
                lineTo(12.0f, 1.0f)
                lineTo(9.0f, 3.0f)
                curveTo(9.0f, 3.0f, 9.16f, 3.63f, 9.35f, 4.57f)
                curveTo(7.37f, 5.47f, 6.0f, 7.34f, 6.0f, 9.5f)
                curveTo(6.0f, 11.69f, 7.4f, 13.58f, 9.42f, 14.46f)
                curveTo(9.2f, 15.4f, 9.0f, 16.0f, 9.0f, 16.0f)
                lineTo(11.0f, 17.33f)
                verticalLineTo(18.41f)
                curveTo(9.62f, 17.54f, 8.5f, 16.84f, 8.5f, 16.83f)
                curveTo(6.0f, 15.0f, 4.32f, 13.0f, 4.32f, 10.0f)
                curveTo(4.32f, 8.09f, 5.0f, 6.35f, 6.18f, 5.0f)
                horizontalLineTo(6.12f)
                curveTo(3.54f, 6.9f, 2.0f, 9.34f, 2.0f, 12.0f)
                curveTo(2.0f, 15.27f, 4.29f, 18.0f, 8.0f, 20.0f)
                lineTo(9.0f, 18.5f)
                lineTo(10.92f, 19.73f)
                lineTo(7.34f, 22.0f)
                lineTo(8.0f, 23.0f)
                lineTo(11.0f, 21.07f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.07f)
                lineTo(16.0f, 23.0f)
                lineTo(16.66f, 22.0f)
                lineTo(13.08f, 19.73f)
                lineTo(15.0f, 18.5f)
                lineTo(16.0f, 20.0f)
                moveTo(16.75f, 9.5f)
                curveTo(16.75f, 11.09f, 15.76f, 12.46f, 14.31f, 13.19f)
                curveTo(14.14f, 12.23f, 14.0f, 11.12f, 14.0f, 10.0f)
                curveTo(14.0f, 8.67f, 14.2f, 7.15f, 14.42f, 5.86f)
                curveTo(15.81f, 6.6f, 16.75f, 7.95f, 16.75f, 9.5f)
                moveTo(7.25f, 9.5f)
                curveTo(7.25f, 7.95f, 8.19f, 6.6f, 9.59f, 5.86f)
                curveTo(9.8f, 7.15f, 10.0f, 8.67f, 10.0f, 10.0f)
                curveTo(10.0f, 11.12f, 9.86f, 12.23f, 9.69f, 13.19f)
                curveTo(8.24f, 12.46f, 7.25f, 11.09f, 7.25f, 9.5f)
                close()
            }
        }
        .build()
        return _khanda!!
    }

private var _khanda: ImageVector? = null
