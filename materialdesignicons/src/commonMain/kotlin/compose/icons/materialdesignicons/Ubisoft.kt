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

public val MaterialDesignIcons.Ubisoft: ImageVector
    get() {
        if (_ubisoft != null) {
            return _ubisoft!!
        }
        _ubisoft = Builder(name = "Ubisoft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.41f, 2.0f)
                curveTo(5.21f, 2.0f, 2.53f, 7.53f, 2.53f, 7.53f)
                lineTo(3.32f, 8.09f)
                curveTo(3.32f, 8.09f, 2.33f, 10.0f, 2.35f, 12.4f)
                curveTo(2.35f, 17.34f, 6.29f, 22.0f, 12.07f, 22.0f)
                curveTo(17.33f, 22.0f, 21.67f, 17.71f, 21.67f, 12.41f)
                curveTo(21.67f, 5.5f, 16.31f, 2.0f, 11.41f, 2.0f)
                moveTo(11.47f, 3.69f)
                curveTo(16.31f, 3.69f, 20.07f, 7.6f, 20.07f, 12.14f)
                curveTo(20.07f, 16.95f, 16.45f, 20.3f, 12.23f, 20.3f)
                curveTo(9.13f, 20.3f, 6.33f, 17.94f, 6.33f, 14.7f)
                curveTo(6.33f, 12.82f, 7.32f, 11.5f, 8.44f, 10.82f)
                lineTo(8.6f, 11.0f)
                curveTo(8.3f, 11.24f, 7.43f, 12.64f, 7.43f, 14.0f)
                curveTo(7.43f, 16.56f, 9.43f, 18.33f, 11.95f, 18.33f)
                curveTo(15.16f, 18.33f, 17.3f, 15.59f, 17.3f, 12.41f)
                curveTo(17.3f, 8.71f, 14.03f, 5.57f, 10.1f, 5.57f)
                curveTo(7.93f, 5.57f, 6.09f, 6.5f, 5.03f, 7.33f)
                lineTo(4.86f, 7.18f)
                curveTo(6.25f, 5.04f, 8.65f, 3.69f, 11.47f, 3.69f)
                moveTo(10.0f, 7.23f)
                curveTo(12.53f, 7.23f, 14.97f, 8.89f, 15.59f, 11.25f)
                lineTo(15.36f, 11.33f)
                curveTo(14.27f, 9.88f, 12.47f, 8.68f, 10.35f, 8.68f)
                curveTo(6.44f, 8.68f, 4.39f, 12.23f, 4.69f, 15.19f)
                lineTo(4.46f, 15.28f)
                curveTo(4.46f, 15.28f, 4.03f, 14.33f, 4.03f, 13.2f)
                curveTo(4.03f, 9.93f, 6.71f, 7.23f, 10.0f, 7.23f)
                moveTo(11.68f, 11.33f)
                curveTo(12.86f, 11.33f, 13.81f, 12.3f, 13.81f, 13.44f)
                curveTo(13.81f, 14.38f, 13.21f, 14.94f, 13.21f, 14.94f)
                lineTo(13.92f, 15.45f)
                curveTo(13.92f, 15.45f, 13.21f, 16.57f, 11.76f, 16.57f)
                curveTo(10.37f, 16.57f, 9.13f, 15.44f, 9.13f, 13.93f)
                curveTo(9.13f, 12.38f, 10.47f, 11.33f, 11.68f, 11.33f)
                close()
            }
        }
        .build()
        return _ubisoft!!
    }

private var _ubisoft: ImageVector? = null
