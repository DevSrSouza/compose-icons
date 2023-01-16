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

public val MaterialDesignIcons.AppleFinder: ImageVector
    get() {
        if (_appleFinder != null) {
            return _appleFinder!!
        }
        _appleFinder = Builder(name = "AppleFinder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                curveTo(7.45f, 11.0f, 7.0f, 10.55f, 7.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(7.0f, 7.45f, 7.45f, 7.0f, 8.0f, 7.0f)
                curveTo(8.55f, 7.0f, 9.0f, 7.45f, 9.0f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 10.55f, 8.55f, 11.0f, 8.0f, 11.0f)
                moveTo(17.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 7.45f, 16.55f, 7.0f, 16.0f, 7.0f)
                curveTo(15.45f, 7.0f, 15.0f, 7.45f, 15.0f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 10.55f, 15.45f, 11.0f, 16.0f, 11.0f)
                curveTo(16.55f, 11.0f, 17.0f, 10.55f, 17.0f, 10.0f)
                moveTo(22.0f, 5.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 21.1f, 21.1f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.9f, 2.9f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f)
                moveTo(4.0f, 20.0f)
                lineTo(13.06f, 20.0f)
                curveTo(12.96f, 19.35f, 12.89f, 18.64f, 12.83f, 17.94f)
                curveTo(12.56f, 17.96f, 12.3f, 18.0f, 12.0f, 18.0f)
                curveTo(8.24f, 18.0f, 6.31f, 15.73f, 6.23f, 15.63f)
                curveTo(5.88f, 15.21f, 5.94f, 14.58f, 6.36f, 14.22f)
                curveTo(6.78f, 13.87f, 7.41f, 13.93f, 7.77f, 14.35f)
                curveTo(7.83f, 14.43f, 9.23f, 16.0f, 12.0f, 16.0f)
                curveTo(12.27f, 16.0f, 12.5f, 15.97f, 12.74f, 15.95f)
                curveTo(12.71f, 14.75f, 12.73f, 13.74f, 12.74f, 13.26f)
                horizontalLineTo(10.93f)
                curveTo(10.28f, 13.26f, 9.75f, 12.7f, 9.75f, 12.0f)
                curveTo(9.77f, 11.75f, 10.07f, 7.82f, 11.0f, 5.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 20.0f)
                moveTo(20.0f, 20.0f)
                lineTo(20.0f, 5.0f)
                horizontalLineTo(12.6f)
                curveTo(11.74f, 7.19f, 11.37f, 10.73f, 11.27f, 11.76f)
                horizontalLineTo(13.08f)
                curveTo(13.72f, 11.76f, 14.25f, 12.32f, 14.25f, 13.0f)
                curveTo(14.25f, 13.04f, 14.21f, 14.15f, 14.24f, 15.6f)
                curveTo(15.54f, 15.11f, 16.22f, 14.35f, 16.23f, 14.34f)
                curveTo(16.58f, 13.92f, 17.21f, 13.85f, 17.63f, 14.2f)
                curveTo(18.06f, 14.55f, 18.12f, 15.18f, 17.77f, 15.61f)
                curveTo(17.71f, 15.68f, 16.55f, 17.05f, 14.32f, 17.68f)
                curveTo(14.38f, 18.5f, 14.46f, 19.29f, 14.58f, 20.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _appleFinder!!
    }

private var _appleFinder: ImageVector? = null
