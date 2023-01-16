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

public val MaterialDesignIcons.GoogleMyBusiness: ImageVector
    get() {
        if (_googleMyBusiness != null) {
            return _googleMyBusiness!!
        }
        _googleMyBusiness = Builder(name = "GoogleMyBusiness", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.5f)
                curveTo(22.0f, 9.87f, 20.88f, 11.0f, 19.5f, 11.0f)
                reflectiveCurveTo(17.0f, 9.87f, 17.0f, 8.5f)
                curveTo(17.0f, 9.87f, 15.88f, 11.0f, 14.5f, 11.0f)
                curveTo(13.12f, 11.0f, 12.0f, 9.87f, 12.0f, 8.5f)
                curveTo(12.0f, 9.87f, 10.88f, 11.0f, 9.5f, 11.0f)
                reflectiveCurveTo(7.0f, 9.87f, 7.0f, 8.5f)
                curveTo(7.0f, 9.87f, 5.88f, 11.0f, 4.5f, 11.0f)
                reflectiveCurveTo(2.0f, 9.87f, 2.0f, 8.5f)
                lineTo(3.39f, 3.08f)
                curveTo(3.39f, 3.08f, 3.68f, 2.0f, 4.7f, 2.0f)
                horizontalLineTo(19.3f)
                curveTo(20.32f, 2.0f, 20.61f, 3.08f, 20.61f, 3.08f)
                lineTo(22.0f, 8.5f)
                moveTo(21.0f, 12.2f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 21.1f, 20.1f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 22.0f, 3.0f, 21.1f, 3.0f, 20.0f)
                verticalLineTo(12.2f)
                curveTo(3.46f, 12.39f, 3.97f, 12.5f, 4.5f, 12.5f)
                curveTo(5.45f, 12.5f, 6.32f, 12.17f, 7.0f, 11.62f)
                curveTo(7.69f, 12.17f, 8.56f, 12.5f, 9.5f, 12.5f)
                curveTo(10.45f, 12.5f, 11.32f, 12.17f, 12.0f, 11.62f)
                curveTo(12.69f, 12.17f, 13.56f, 12.5f, 14.5f, 12.5f)
                curveTo(15.45f, 12.5f, 16.32f, 12.17f, 17.0f, 11.62f)
                curveTo(17.68f, 12.17f, 18.56f, 12.5f, 19.5f, 12.5f)
                curveTo(20.03f, 12.5f, 20.54f, 12.39f, 21.0f, 12.2f)
                moveTo(19.0f, 17.33f)
                curveTo(19.0f, 17.13f, 19.0f, 16.92f, 18.95f, 16.7f)
                lineTo(18.92f, 16.54f)
                horizontalLineTo(15.95f)
                verticalLineTo(17.71f)
                horizontalLineTo(17.76f)
                curveTo(17.7f, 17.93f, 17.62f, 18.15f, 17.45f, 18.33f)
                curveTo(17.12f, 18.66f, 16.67f, 18.84f, 16.19f, 18.84f)
                curveTo(15.69f, 18.84f, 15.2f, 18.63f, 14.84f, 18.28f)
                curveTo(14.15f, 17.57f, 14.15f, 16.42f, 14.86f, 15.7f)
                curveTo(15.55f, 15.0f, 16.69f, 15.0f, 17.41f, 15.67f)
                lineTo(17.55f, 15.8f)
                lineTo(18.39f, 14.95f)
                lineTo(18.23f, 14.81f)
                curveTo(17.67f, 14.29f, 16.93f, 14.0f, 16.15f, 14.0f)
                horizontalLineTo(16.14f)
                curveTo(15.33f, 14.0f, 14.57f, 14.31f, 14.0f, 14.87f)
                curveTo(13.41f, 15.45f, 13.08f, 16.21f, 13.08f, 17.0f)
                curveTo(13.08f, 17.8f, 13.39f, 18.54f, 13.96f, 19.09f)
                horizontalLineTo(13.96f)
                curveTo(14.54f, 19.66f, 15.35f, 20.0f, 16.18f, 20.0f)
                horizontalLineTo(16.2f)
                curveTo(17.0f, 20.0f, 17.71f, 19.71f, 18.23f, 19.2f)
                curveTo(18.7f, 18.72f, 19.0f, 18.0f, 19.0f, 17.33f)
                close()
            }
        }
        .build()
        return _googleMyBusiness!!
    }

private var _googleMyBusiness: ImageVector? = null
