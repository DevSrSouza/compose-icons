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

public val MaterialDesignIcons.Turtle: ImageVector
    get() {
        if (_turtle != null) {
            return _turtle!!
        }
        _turtle = Builder(name = "Turtle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.47f, 5.95f)
                curveTo(8.95f, 5.67f, 9.47f, 5.44f, 10.0f, 5.28f)
                verticalLineTo(4.0f)
                curveTo(10.0f, 2.9f, 10.87f, 2.0f, 11.97f, 1.97f)
                curveTo(13.13f, 2.0f, 14.0f, 2.9f, 14.0f, 4.0f)
                verticalLineTo(5.28f)
                curveTo(14.53f, 5.45f, 15.05f, 5.67f, 15.53f, 5.95f)
                lineTo(13.93f, 8.07f)
                horizontalLineTo(10.07f)
                lineTo(8.47f, 5.95f)
                moveTo(19.0f, 12.0f)
                curveTo(19.0f, 12.5f, 18.95f, 12.95f, 18.86f, 13.4f)
                lineTo(16.33f, 12.62f)
                lineTo(15.14f, 8.96f)
                lineTo(16.74f, 6.85f)
                curveTo(17.17f, 7.25f, 17.55f, 7.7f, 17.88f, 8.2f)
                curveTo(18.67f, 8.13f, 19.43f, 8.25f, 20.11f, 8.59f)
                curveTo(21.14f, 9.12f, 21.84f, 10.13f, 22.0f, 11.28f)
                lineTo(19.0f, 11.64f)
                curveTo(19.0f, 11.76f, 19.0f, 11.88f, 19.0f, 12.0f)
                moveTo(5.0f, 12.0f)
                curveTo(5.0f, 11.88f, 5.0f, 11.76f, 5.0f, 11.65f)
                lineTo(2.0f, 11.28f)
                curveTo(2.16f, 10.13f, 2.86f, 9.12f, 3.89f, 8.59f)
                curveTo(4.57f, 8.25f, 5.34f, 8.13f, 6.08f, 8.26f)
                curveTo(6.41f, 7.75f, 6.79f, 7.28f, 7.24f, 6.87f)
                lineTo(8.86f, 8.95f)
                lineTo(7.67f, 12.62f)
                lineTo(5.14f, 13.4f)
                curveTo(5.05f, 12.95f, 5.0f, 12.5f, 5.0f, 12.0f)
                moveTo(10.24f, 9.57f)
                horizontalLineTo(13.76f)
                lineTo(14.85f, 12.93f)
                lineTo(12.0f, 15.0f)
                lineTo(9.15f, 12.93f)
                lineTo(10.24f, 9.57f)
                moveTo(8.13f, 14.05f)
                lineTo(11.25f, 16.31f)
                verticalLineTo(18.96f)
                curveTo(10.68f, 18.9f, 10.13f, 18.77f, 9.62f, 18.58f)
                lineTo(8.39f, 21.34f)
                curveTo(7.33f, 20.87f, 6.57f, 19.9f, 6.37f, 18.76f)
                curveTo(6.23f, 18.0f, 6.35f, 17.24f, 6.69f, 16.56f)
                curveTo(6.24f, 16.04f, 5.87f, 15.46f, 5.59f, 14.82f)
                lineTo(8.13f, 14.05f)
                moveTo(15.87f, 14.05f)
                lineTo(18.41f, 14.82f)
                curveTo(18.13f, 15.46f, 17.76f, 16.04f, 17.31f, 16.56f)
                curveTo(17.65f, 17.24f, 17.77f, 18.0f, 17.64f, 18.76f)
                curveTo(17.43f, 19.9f, 16.67f, 20.87f, 15.61f, 21.34f)
                lineTo(14.39f, 18.58f)
                curveTo(13.86f, 18.77f, 13.33f, 18.94f, 12.75f, 19.0f)
                verticalLineTo(16.31f)
                lineTo(15.87f, 14.05f)
                close()
            }
        }
        .build()
        return _turtle!!
    }

private var _turtle: ImageVector? = null
