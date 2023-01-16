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

public val MaterialDesignIcons.Alpha: ImageVector
    get() {
        if (_alpha != null) {
            return _alpha!!
        }
        _alpha = Builder(name = "Alpha", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.08f, 17.8f)
                curveTo(17.62f, 17.93f, 17.21f, 18.0f, 16.85f, 18.0f)
                curveTo(15.65f, 18.0f, 14.84f, 17.12f, 14.43f, 15.35f)
                horizontalLineTo(14.38f)
                curveTo(13.39f, 17.26f, 12.0f, 18.21f, 10.25f, 18.21f)
                curveTo(8.94f, 18.21f, 7.89f, 17.72f, 7.1f, 16.73f)
                curveTo(6.31f, 15.74f, 5.92f, 14.5f, 5.92f, 13.0f)
                curveTo(5.92f, 11.25f, 6.37f, 9.85f, 7.26f, 8.76f)
                curveTo(8.15f, 7.67f, 9.36f, 7.12f, 10.89f, 7.12f)
                curveTo(11.71f, 7.12f, 12.45f, 7.35f, 13.09f, 7.8f)
                curveTo(13.73f, 8.26f, 14.22f, 8.9f, 14.56f, 9.73f)
                horizontalLineTo(14.6f)
                lineTo(15.31f, 7.33f)
                horizontalLineTo(17.87f)
                lineTo(15.73f, 12.65f)
                curveTo(15.97f, 13.89f, 16.22f, 14.74f, 16.5f, 15.19f)
                curveTo(16.74f, 15.64f, 17.08f, 15.87f, 17.5f, 15.87f)
                curveTo(17.74f, 15.87f, 17.93f, 15.83f, 18.1f, 15.76f)
                lineTo(18.08f, 17.8f)
                moveTo(13.82f, 12.56f)
                curveTo(13.61f, 11.43f, 13.27f, 10.55f, 12.81f, 9.95f)
                curveTo(12.36f, 9.34f, 11.81f, 9.04f, 11.18f, 9.04f)
                curveTo(10.36f, 9.04f, 9.7f, 9.41f, 9.21f, 10.14f)
                curveTo(8.72f, 10.88f, 8.5f, 11.79f, 8.5f, 12.86f)
                curveTo(8.5f, 13.84f, 8.69f, 14.65f, 9.12f, 15.31f)
                curveTo(9.54f, 15.97f, 10.11f, 16.29f, 10.82f, 16.29f)
                curveTo(11.42f, 16.29f, 11.97f, 16.0f, 12.46f, 15.45f)
                curveTo(12.96f, 14.88f, 13.37f, 14.05f, 13.7f, 12.96f)
                lineTo(13.82f, 12.56f)
                close()
            }
        }
        .build()
        return _alpha!!
    }

private var _alpha: ImageVector? = null
