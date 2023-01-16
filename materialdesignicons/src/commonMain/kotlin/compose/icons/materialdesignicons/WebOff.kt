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

public val MaterialDesignIcons.WebOff: ImageVector
    get() {
        if (_webOff != null) {
            return _webOff!!
        }
        _webOff = Builder(name = "WebOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4f, 4.44f)
                curveTo(9.19f, 4.83f, 9.0f, 5.23f, 8.84f, 5.64f)
                lineTo(10.37f, 7.17f)
                curveTo(10.78f, 6.05f, 11.33f, 5.0f, 12.0f, 4.03f)
                curveTo(12.83f, 5.23f, 13.5f, 6.57f, 13.91f, 8.0f)
                horizontalLineTo(11.2f)
                lineTo(13.2f, 10.0f)
                horizontalLineTo(14.34f)
                curveTo(14.4f, 10.41f, 14.44f, 10.84f, 14.47f, 11.27f)
                lineTo(16.44f, 13.24f)
                curveTo(16.47f, 12.83f, 16.5f, 12.42f, 16.5f, 12.0f)
                curveTo(16.5f, 11.32f, 16.44f, 10.66f, 16.36f, 10.0f)
                horizontalLineTo(19.74f)
                curveTo(19.9f, 10.64f, 20.0f, 11.31f, 20.0f, 12.0f)
                reflectiveCurveTo(19.9f, 13.36f, 19.74f, 14.0f)
                horizontalLineTo(17.2f)
                lineTo(20.5f, 17.28f)
                curveTo(21.44f, 15.75f, 22.0f, 13.94f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                curveTo(10.06f, 2.0f, 8.25f, 2.56f, 6.72f, 3.5f)
                lineTo(8.18f, 5.0f)
                curveTo(8.57f, 4.77f, 9.0f, 4.58f, 9.4f, 4.44f)
                moveTo(18.92f, 8.0f)
                horizontalLineTo(15.97f)
                curveTo(15.65f, 6.75f, 15.19f, 5.55f, 14.59f, 4.44f)
                curveTo(16.43f, 5.07f, 17.96f, 6.34f, 18.92f, 8.0f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.06f, 5.95f)
                curveTo(2.77f, 7.63f, 2.0f, 9.73f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(14.28f, 22.0f, 16.37f, 21.23f, 18.06f, 19.95f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(5.5f, 7.37f)
                lineTo(6.11f, 8.0f)
                horizontalLineTo(5.08f)
                curveTo(5.2f, 7.78f, 5.34f, 7.58f, 5.5f, 7.37f)
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
                moveTo(9.5f, 12.0f)
                curveTo(9.5f, 11.8f, 9.5f, 11.61f, 9.53f, 11.42f)
                lineTo(12.11f, 14.0f)
                horizontalLineTo(9.66f)
                curveTo(9.56f, 13.34f, 9.5f, 12.68f, 9.5f, 12.0f)
                moveTo(12.0f, 19.96f)
                curveTo(11.17f, 18.76f, 10.5f, 17.43f, 10.09f, 16.0f)
                horizontalLineTo(13.91f)
                curveTo(13.5f, 17.43f, 12.83f, 18.76f, 12.0f, 19.96f)
                moveTo(14.59f, 19.56f)
                curveTo(14.96f, 18.88f, 15.26f, 18.15f, 15.5f, 17.41f)
                lineTo(16.62f, 18.5f)
                curveTo(16.0f, 18.95f, 15.32f, 19.31f, 14.59f, 19.56f)
                close()
            }
        }
        .build()
        return _webOff!!
    }

private var _webOff: ImageVector? = null
