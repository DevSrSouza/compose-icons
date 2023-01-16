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

public val MaterialDesignIcons.Barley: ImageVector
    get() {
        if (_barley != null) {
            return _barley!!
        }
        _barley = Builder(name = "Barley", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.33f, 18.33f)
                curveTo(6.5f, 17.17f, 6.5f, 15.83f, 6.5f, 14.5f)
                curveTo(8.17f, 15.5f, 9.83f, 16.5f, 10.67f, 17.67f)
                lineTo(11.0f, 18.23f)
                verticalLineTo(15.95f)
                curveTo(9.5f, 15.05f, 8.08f, 14.13f, 7.33f, 13.08f)
                curveTo(6.5f, 11.92f, 6.5f, 10.58f, 6.5f, 9.25f)
                curveTo(8.17f, 10.25f, 9.83f, 11.25f, 10.67f, 12.42f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(10.7f)
                curveTo(9.5f, 9.8f, 8.08f, 8.88f, 7.33f, 7.83f)
                curveTo(6.5f, 6.67f, 6.5f, 5.33f, 6.5f, 4.0f)
                curveTo(8.17f, 5.0f, 9.83f, 6.0f, 10.67f, 7.17f)
                curveTo(10.77f, 7.31f, 10.86f, 7.46f, 10.94f, 7.62f)
                curveTo(10.77f, 7.0f, 10.66f, 6.42f, 10.65f, 5.82f)
                curveTo(10.64f, 4.31f, 11.3f, 2.76f, 11.96f, 1.21f)
                curveTo(12.65f, 2.69f, 13.34f, 4.18f, 13.35f, 5.69f)
                curveTo(13.36f, 6.32f, 13.25f, 6.96f, 13.07f, 7.59f)
                curveTo(13.15f, 7.45f, 13.23f, 7.31f, 13.33f, 7.17f)
                curveTo(14.17f, 6.0f, 15.83f, 5.0f, 17.5f, 4.0f)
                curveTo(17.5f, 5.33f, 17.5f, 6.67f, 16.67f, 7.83f)
                curveTo(15.92f, 8.88f, 14.5f, 9.8f, 13.0f, 10.7f)
                verticalLineTo(13.0f)
                lineTo(13.33f, 12.42f)
                curveTo(14.17f, 11.25f, 15.83f, 10.25f, 17.5f, 9.25f)
                curveTo(17.5f, 10.58f, 17.5f, 11.92f, 16.67f, 13.08f)
                curveTo(15.92f, 14.13f, 14.5f, 15.05f, 13.0f, 15.95f)
                verticalLineTo(18.23f)
                lineTo(13.33f, 17.67f)
                curveTo(14.17f, 16.5f, 15.83f, 15.5f, 17.5f, 14.5f)
                curveTo(17.5f, 15.83f, 17.5f, 17.17f, 16.67f, 18.33f)
                curveTo(15.92f, 19.38f, 14.5f, 20.3f, 13.0f, 21.2f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.2f)
                curveTo(9.5f, 20.3f, 8.08f, 19.38f, 7.33f, 18.33f)
                close()
            }
        }
        .build()
        return _barley!!
    }

private var _barley: ImageVector? = null
