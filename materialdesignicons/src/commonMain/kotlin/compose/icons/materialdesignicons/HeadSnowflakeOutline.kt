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

public val MaterialDesignIcons.HeadSnowflakeOutline: ImageVector
    get() {
        if (_headSnowflakeOutline != null) {
            return _headSnowflakeOutline!!
        }
        _headSnowflakeOutline = Builder(name = "HeadSnowflakeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                curveTo(16.88f, 3.0f, 20.0f, 6.14f, 20.0f, 10.0f)
                curveTo(20.0f, 12.8f, 18.37f, 15.19f, 16.0f, 16.31f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 18.0f, 6.0f, 17.11f, 6.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13.0f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6.0f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3.0f, 13.0f, 3.0f)
                moveTo(13.0f, 1.0f)
                curveTo(8.41f, 1.0f, 4.61f, 4.42f, 4.06f, 8.9f)
                lineTo(2.5f, 11.0f)
                lineTo(2.47f, 11.0f)
                lineTo(2.45f, 11.03f)
                curveTo(1.9f, 11.79f, 1.83f, 12.79f, 2.26f, 13.62f)
                curveTo(2.62f, 14.31f, 3.26f, 14.79f, 4.0f, 14.94f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.85f, 5.28f, 19.42f, 7.0f, 19.87f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.83f, 22.0f, 13.06f, 22.0f, 10.0f)
                curveTo(22.0f, 5.03f, 17.96f, 1.0f, 13.0f, 1.0f)
                moveTo(17.33f, 9.3f)
                lineTo(15.37f, 9.81f)
                lineTo(16.81f, 11.27f)
                curveTo(17.16f, 11.61f, 17.16f, 12.19f, 16.81f, 12.54f)
                reflectiveCurveTo(15.88f, 12.89f, 15.54f, 12.54f)
                lineTo(14.09f, 11.1f)
                lineTo(13.57f, 13.06f)
                curveTo(13.45f, 13.55f, 12.96f, 13.82f, 12.5f, 13.7f)
                curveTo(12.0f, 13.57f, 11.72f, 13.08f, 11.84f, 12.59f)
                lineTo(12.37f, 10.63f)
                lineTo(10.41f, 11.16f)
                curveTo(9.92f, 11.28f, 9.43f, 11.0f, 9.3f, 10.5f)
                curveTo(9.18f, 10.05f, 9.46f, 9.55f, 9.94f, 9.43f)
                lineTo(11.9f, 8.91f)
                lineTo(10.46f, 7.46f)
                curveTo(10.11f, 7.12f, 10.11f, 6.55f, 10.46f, 6.19f)
                curveTo(10.81f, 5.84f, 11.39f, 5.84f, 11.73f, 6.19f)
                lineTo(13.19f, 7.63f)
                lineTo(13.7f, 5.67f)
                curveTo(13.82f, 5.18f, 14.32f, 4.9f, 14.79f, 5.03f)
                curveTo(15.28f, 5.16f, 15.56f, 5.65f, 15.43f, 6.13f)
                lineTo(14.9f, 8.1f)
                lineTo(16.87f, 7.57f)
                curveTo(17.35f, 7.44f, 17.84f, 7.72f, 17.97f, 8.21f)
                curveTo(18.1f, 8.68f, 17.82f, 9.18f, 17.33f, 9.3f)
                close()
            }
        }
        .build()
        return _headSnowflakeOutline!!
    }

private var _headSnowflakeOutline: ImageVector? = null
