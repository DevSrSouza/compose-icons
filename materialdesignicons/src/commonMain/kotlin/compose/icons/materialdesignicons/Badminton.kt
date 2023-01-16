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

public val MaterialDesignIcons.Badminton: ImageVector
    get() {
        if (_badminton != null) {
            return _badminton!!
        }
        _badminton = Builder(name = "Badminton", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3f, 2.0f)
                curveTo(11.33f, 2.03f, 10.58f, 2.84f, 10.61f, 3.8f)
                curveTo(10.62f, 4.04f, 10.67f, 4.27f, 10.77f, 4.5f)
                lineTo(11.06f, 5.14f)
                verticalLineTo(5.14f)
                curveTo(11.1f, 5.27f, 11.03f, 5.41f, 10.89f, 5.45f)
                curveTo(10.8f, 5.5f, 10.7f, 5.45f, 10.63f, 5.37f)
                lineTo(10.21f, 4.82f)
                curveTo(9.88f, 4.4f, 9.38f, 4.14f, 8.85f, 4.13f)
                curveTo(7.88f, 4.11f, 7.08f, 4.88f, 7.06f, 5.84f)
                curveTo(7.05f, 6.26f, 7.19f, 6.66f, 7.45f, 7.0f)
                lineTo(7.87f, 7.5f)
                horizontalLineTo(7.88f)
                curveTo(7.96f, 7.63f, 7.93f, 7.79f, 7.82f, 7.87f)
                curveTo(7.73f, 7.94f, 7.61f, 7.94f, 7.53f, 7.87f)
                lineTo(7.0f, 7.45f)
                curveTo(6.66f, 7.19f, 6.25f, 7.05f, 5.84f, 7.06f)
                curveTo(4.88f, 7.08f, 4.11f, 7.88f, 4.13f, 8.85f)
                curveTo(4.14f, 9.38f, 4.4f, 9.88f, 4.82f, 10.21f)
                lineTo(5.39f, 10.65f)
                curveTo(5.5f, 10.75f, 5.5f, 10.91f, 5.38f, 11.0f)
                curveTo(5.31f, 11.07f, 5.21f, 11.09f, 5.12f, 11.05f)
                horizontalLineTo(5.11f)
                lineTo(4.5f, 10.77f)
                curveTo(4.27f, 10.68f, 4.04f, 10.62f, 3.8f, 10.61f)
                curveTo(2.84f, 10.58f, 2.03f, 11.34f, 2.0f, 12.31f)
                curveTo(2.0f, 13.03f, 2.4f, 13.69f, 3.06f, 13.97f)
                lineTo(14.45f, 19.04f)
                lineTo(19.04f, 14.45f)
                lineTo(13.97f, 3.06f)
                curveTo(13.69f, 2.39f, 13.0f, 1.97f, 12.3f, 2.0f)
                moveTo(13.13f, 6.1f)
                curveTo(13.55f, 6.09f, 13.93f, 6.33f, 14.09f, 6.71f)
                lineTo(17.14f, 13.55f)
                lineTo(13.19f, 9.61f)
                lineTo(12.26f, 7.5f)
                curveTo(11.96f, 6.87f, 12.42f, 6.12f, 13.13f, 6.1f)
                moveTo(9.85f, 8.85f)
                curveTo(10.12f, 8.85f, 10.37f, 8.95f, 10.56f, 9.15f)
                lineTo(15.37f, 13.96f)
                curveTo(15.77f, 14.34f, 15.78f, 14.97f, 15.4f, 15.37f)
                curveTo(15.0f, 15.77f, 14.38f, 15.78f, 13.96f, 15.37f)
                lineTo(9.15f, 10.56f)
                curveTo(8.75f, 10.18f, 8.74f, 9.54f, 9.13f, 9.15f)
                curveTo(9.32f, 8.95f, 9.58f, 8.85f, 9.85f, 8.85f)
                moveTo(7.13f, 12.17f)
                curveTo(7.26f, 12.17f, 7.4f, 12.21f, 7.5f, 12.26f)
                lineTo(9.63f, 13.2f)
                lineTo(13.57f, 17.14f)
                lineTo(6.71f, 14.09f)
                curveTo(5.69f, 13.65f, 6.03f, 12.14f, 7.13f, 12.17f)
                moveTo(20.28f, 16.04f)
                lineTo(16.04f, 20.28f)
                lineTo(16.89f, 21.13f)
                curveTo(17.65f, 21.88f, 18.75f, 22.17f, 19.78f, 21.9f)
                curveTo(20.81f, 21.62f, 21.62f, 20.81f, 21.9f, 19.78f)
                curveTo(22.17f, 18.75f, 21.88f, 17.65f, 21.13f, 16.89f)
                lineTo(20.28f, 16.04f)
                close()
            }
        }
        .build()
        return _badminton!!
    }

private var _badminton: ImageVector? = null
