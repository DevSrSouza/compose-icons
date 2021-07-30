package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Volkswagen: ImageVector
    get() {
        if (_volkswagen != null) {
            return _volkswagen!!
        }
        _volkswagen = Builder(name = "Volkswagen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.36f, 0.0f, 0.0f, 5.36f, 0.0f, 12.0f)
                reflectiveCurveTo(5.36f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveTo(24.0f, 18.64f, 24.0f, 12.0f)
                reflectiveCurveTo(18.64f, 0.0f, 12.0f, 0.0f)
                moveTo(12.0f, 1.41f)
                curveTo(13.2f, 1.41f, 14.36f, 1.63f, 15.43f, 2.0f)
                lineTo(12.13f, 9.13f)
                curveTo(12.09f, 9.17f, 12.09f, 9.26f, 12.0f, 9.26f)
                reflectiveCurveTo(11.91f, 9.17f, 11.87f, 9.13f)
                lineTo(8.57f, 2.0f)
                curveTo(9.64f, 1.63f, 10.8f, 1.42f, 12.0f, 1.42f)
                moveTo(6.9f, 2.74f)
                lineTo(10.72f, 10.97f)
                curveTo(10.8f, 11.14f, 10.89f, 11.19f, 11.0f, 11.19f)
                horizontalLineTo(13.0f)
                curveTo(13.12f, 11.19f, 13.2f, 11.14f, 13.29f, 10.97f)
                lineTo(17.06f, 2.74f)
                curveTo(18.64f, 3.64f, 20.0f, 4.93f, 20.96f, 6.47f)
                lineTo(15.6f, 16.84f)
                curveTo(15.56f, 16.93f, 15.5f, 16.97f, 15.47f, 16.97f)
                curveTo(15.39f, 16.97f, 15.39f, 16.89f, 15.34f, 16.84f)
                lineTo(13.29f, 12.3f)
                curveTo(13.2f, 12.13f, 13.12f, 12.09f, 13.0f, 12.09f)
                horizontalLineTo(11.0f)
                curveTo(10.89f, 12.09f, 10.8f, 12.13f, 10.71f, 12.3f)
                lineTo(8.66f, 16.84f)
                curveTo(8.61f, 16.89f, 8.62f, 16.97f, 8.53f, 16.97f)
                curveTo(8.44f, 16.97f, 8.44f, 16.89f, 8.4f, 16.84f)
                lineTo(3.0f, 6.47f)
                curveTo(3.94f, 4.93f, 5.32f, 3.64f, 6.9f, 2.74f)
                moveTo(2.06f, 8.53f)
                lineTo(8.23f, 20.53f)
                curveTo(8.31f, 20.7f, 8.4f, 20.83f, 8.62f, 20.83f)
                curveTo(8.83f, 20.83f, 8.91f, 20.7f, 9.0f, 20.53f)
                lineTo(11.87f, 14.14f)
                curveTo(11.91f, 14.06f, 11.96f, 14.0f, 12.0f, 14.0f)
                curveTo(12.09f, 14.0f, 12.09f, 14.1f, 12.13f, 14.14f)
                lineTo(15.04f, 20.53f)
                curveTo(15.13f, 20.7f, 15.21f, 20.83f, 15.43f, 20.83f)
                curveTo(15.64f, 20.83f, 15.73f, 20.7f, 15.81f, 20.53f)
                lineTo(22.0f, 8.53f)
                curveTo(22.37f, 9.6f, 22.59f, 10.76f, 22.59f, 12.0f)
                curveTo(22.54f, 17.79f, 17.79f, 22.59f, 12.0f, 22.59f)
                curveTo(6.21f, 22.59f, 1.46f, 17.79f, 1.46f, 12.0f)
                curveTo(1.46f, 10.8f, 1.67f, 9.65f, 2.06f, 8.53f)
                close()
            }
        }
        .build()
        return _volkswagen!!
    }

private var _volkswagen: ImageVector? = null
