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

public val MaterialDesignIcons.DrawPen: ImageVector
    get() {
        if (_drawPen != null) {
            return _drawPen!!
        }
        _drawPen = Builder(name = "DrawPen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 20.85f)
                curveTo(11.53f, 20.15f, 11.14f, 18.22f, 10.24f, 17.0f)
                curveTo(9.35f, 15.75f, 8.12f, 14.89f, 6.88f, 14.06f)
                curveTo(6.0f, 13.5f, 5.19f, 12.8f, 4.54f, 12.0f)
                curveTo(4.26f, 11.67f, 3.69f, 11.06f, 4.27f, 10.94f)
                curveTo(4.86f, 10.82f, 5.88f, 11.4f, 6.4f, 11.62f)
                curveTo(7.31f, 12.0f, 8.21f, 12.44f, 9.05f, 12.96f)
                lineTo(10.06f, 11.26f)
                curveTo(8.5f, 10.23f, 6.5f, 9.32f, 4.64f, 9.05f)
                curveTo(3.58f, 8.89f, 2.46f, 9.11f, 2.1f, 10.26f)
                curveTo(1.78f, 11.25f, 2.29f, 12.25f, 2.87f, 13.03f)
                curveTo(4.24f, 14.86f, 6.37f, 15.74f, 7.96f, 17.32f)
                curveTo(8.3f, 17.65f, 8.71f, 18.04f, 8.91f, 18.5f)
                curveTo(9.12f, 18.94f, 9.07f, 18.97f, 8.6f, 18.97f)
                curveTo(7.36f, 18.97f, 5.81f, 18.0f, 4.8f, 17.36f)
                lineTo(3.79f, 19.06f)
                curveTo(5.32f, 20.0f, 7.88f, 21.47f, 9.75f, 20.85f)
                moveTo(18.96f, 7.33f)
                lineTo(13.29f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.71f)
                lineTo(16.67f, 5.03f)
                lineTo(18.96f, 7.33f)
                moveTo(22.36f, 6.55f)
                curveTo(22.35f, 6.85f, 22.04f, 7.16f, 21.72f, 7.47f)
                lineTo(19.2f, 10.0f)
                lineTo(18.33f, 9.13f)
                lineTo(20.93f, 6.54f)
                lineTo(20.34f, 5.95f)
                lineTo(19.67f, 6.62f)
                lineTo(17.38f, 4.33f)
                lineTo(19.53f, 2.18f)
                curveTo(19.77f, 1.94f, 20.16f, 1.94f, 20.39f, 2.18f)
                lineTo(21.82f, 3.61f)
                curveTo(22.06f, 3.83f, 22.06f, 4.23f, 21.82f, 4.47f)
                curveTo(21.61f, 4.68f, 21.41f, 4.88f, 21.41f, 5.08f)
                curveTo(21.39f, 5.28f, 21.59f, 5.5f, 21.79f, 5.67f)
                curveTo(22.08f, 5.97f, 22.37f, 6.25f, 22.36f, 6.55f)
                close()
            }
        }
        .build()
        return _drawPen!!
    }

private var _drawPen: ImageVector? = null
