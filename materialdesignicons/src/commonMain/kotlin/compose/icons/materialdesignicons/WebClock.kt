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

public val MaterialDesignIcons.WebClock: ImageVector
    get() {
        if (_webClock != null) {
            return _webClock!!
        }
        _webClock = Builder(name = "WebClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.5f)
                verticalLineTo(16.5f)
                lineTo(18.0f, 18.5f)
                lineTo(18.75f, 17.25f)
                lineTo(16.5f, 15.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(15.0f)
                moveTo(22.0f, 12.39f)
                curveTo(22.0f, 12.26f, 22.0f, 12.13f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(12.13f, 22.0f, 12.24f, 22.0f, 12.37f, 21.97f)
                curveTo(13.43f, 22.62f, 14.67f, 23.0f, 16.0f, 23.0f)
                curveTo(19.86f, 23.0f, 23.0f, 19.86f, 23.0f, 16.0f)
                curveTo(23.0f, 14.68f, 22.62f, 13.44f, 22.0f, 12.39f)
                moveTo(19.76f, 10.11f)
                curveTo(19.7f, 10.07f, 19.65f, 10.04f, 19.59f, 10.0f)
                horizontalLineTo(19.74f)
                curveTo(19.75f, 10.03f, 19.75f, 10.07f, 19.76f, 10.11f)
                moveTo(18.92f, 8.0f)
                horizontalLineTo(15.97f)
                curveTo(15.65f, 6.75f, 15.19f, 5.55f, 14.59f, 4.44f)
                curveTo(16.43f, 5.07f, 17.96f, 6.34f, 18.92f, 8.0f)
                moveTo(12.0f, 4.03f)
                curveTo(12.83f, 5.23f, 13.5f, 6.57f, 13.91f, 8.0f)
                horizontalLineTo(10.09f)
                curveTo(10.5f, 6.57f, 11.17f, 5.23f, 12.0f, 4.03f)
                moveTo(9.66f, 10.0f)
                horizontalLineTo(12.41f)
                curveTo(11.16f, 10.75f, 10.15f, 11.88f, 9.57f, 13.24f)
                curveTo(9.53f, 12.83f, 9.5f, 12.42f, 9.5f, 12.0f)
                curveTo(9.5f, 11.32f, 9.56f, 10.65f, 9.66f, 10.0f)
                moveTo(9.4f, 4.44f)
                curveTo(8.8f, 5.55f, 8.35f, 6.75f, 8.0f, 8.0f)
                horizontalLineTo(5.08f)
                curveTo(6.03f, 6.34f, 7.57f, 5.06f, 9.4f, 4.44f)
                moveTo(4.26f, 14.0f)
                curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f)
                reflectiveCurveTo(4.1f, 10.64f, 4.26f, 10.0f)
                horizontalLineTo(7.64f)
                curveTo(7.56f, 10.66f, 7.5f, 11.32f, 7.5f, 12.0f)
                reflectiveCurveTo(7.56f, 13.34f, 7.64f, 14.0f)
                horizontalLineTo(4.26f)
                moveTo(5.08f, 16.0f)
                horizontalLineTo(8.0f)
                curveTo(8.35f, 17.25f, 8.8f, 18.45f, 9.4f, 19.56f)
                curveTo(7.57f, 18.93f, 6.03f, 17.65f, 5.08f, 16.0f)
                moveTo(16.0f, 21.0f)
                curveTo(13.24f, 21.0f, 11.0f, 18.76f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.24f, 21.0f, 16.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                close()
            }
        }
        .build()
        return _webClock!!
    }

private var _webClock: ImageVector? = null
