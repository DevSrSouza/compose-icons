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

public val SimpleIcons.Trendmicro: ImageVector
    get() {
        if (_trendmicro != null) {
            return _trendmicro!!
        }
        _trendmicro = Builder(name = "Trendmicro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.37f, 0.0f, 12.0f)
                curveTo(0.0f, 14.45f, 0.734f, 16.72f, 2.0f, 18.62f)
                curveTo(1.5f, 17.45f, 1.58f, 15.94f, 2.19f, 14.29f)
                lineTo(2.2f, 14.25f)
                lineTo(2.25f, 14.12f)
                lineTo(2.3f, 14.0f)
                lineTo(2.32f, 13.95f)
                curveTo(2.54f, 13.4f, 2.82f, 12.83f, 3.16f, 12.26f)
                curveTo(3.21f, 12.16f, 3.25f, 12.07f, 3.3f, 12.0f)
                lineTo(1.86f, 12.0f)
                lineTo(2.21f, 11.21f)
                curveTo(3.4f, 10.88f, 5.38f, 10.22f, 7.27f, 8.39f)
                lineTo(7.32f, 8.39f)
                horizontalLineTo(8.32f)
                lineTo(7.03f, 11.14f)
                lineTo(9.1f, 11.14f)
                lineTo(8.72f, 11.96f)
                lineTo(6.66f, 11.96f)
                reflectiveCurveTo(5.69f, 13.9f, 5.36f, 15.28f)
                curveTo(5.11f, 16.82f, 5.36f, 18.0f, 6.74f, 18.41f)
                curveTo(7.59f, 18.67f, 8.66f, 18.61f, 9.81f, 18.29f)
                curveTo(12.5f, 17.45f, 15.34f, 15.62f, 17.43f, 13.18f)
                curveTo(20.87f, 9.19f, 20.94f, 5.1f, 17.58f, 4.05f)
                curveTo(15.43f, 3.38f, 12.39f, 4.13f, 9.58f, 5.8f)
                curveTo(13.08f, 3.54f, 16.94f, 2.5f, 19.59f, 3.31f)
                curveTo(20.09f, 3.46f, 20.53f, 3.68f, 20.89f, 3.94f)
                arcTo(11.97f, 11.97f, 0.0f, false, false, 12.0f, 0.0f)
                moveTo(22.17f, 5.63f)
                curveTo(23.0f, 7.81f, 21.97f, 11.07f, 19.2f, 14.29f)
                curveTo(15.04f, 19.13f, 8.47f, 22.05f, 4.5f, 20.83f)
                arcTo(4.46f, 4.46f, 0.0f, false, true, 3.24f, 20.21f)
                arcTo(11.96f, 11.96f, 0.0f, false, false, 12.0f, 24.0f)
                curveTo(18.63f, 24.0f, 24.0f, 18.63f, 24.0f, 12.0f)
                curveTo(24.0f, 9.66f, 23.33f, 7.5f, 22.17f, 5.63f)
                close()
            }
        }
        .build()
        return _trendmicro!!
    }

private var _trendmicro: ImageVector? = null
