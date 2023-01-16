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

public val MaterialDesignIcons.CloudAlertOutline: ImageVector
    get() {
        if (_cloudAlertOutline != null) {
            return _cloudAlertOutline!!
        }
        _cloudAlertOutline = Builder(name = "CloudAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.86f, 12.5f)
                curveTo(21.1f, 11.63f, 20.15f, 11.13f, 19.0f, 11.0f)
                curveTo(19.0f, 9.05f, 18.32f, 7.4f, 16.96f, 6.04f)
                curveTo(15.6f, 4.68f, 13.95f, 4.0f, 12.0f, 4.0f)
                curveTo(10.42f, 4.0f, 9.0f, 4.47f, 7.75f, 5.43f)
                reflectiveCurveTo(5.67f, 7.62f, 5.25f, 9.15f)
                curveTo(4.0f, 9.43f, 2.96f, 10.08f, 2.17f, 11.1f)
                reflectiveCurveTo(1.0f, 13.28f, 1.0f, 14.58f)
                curveTo(1.0f, 16.09f, 1.54f, 17.38f, 2.61f, 18.43f)
                curveTo(3.69f, 19.5f, 5.0f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(18.5f)
                curveTo(19.75f, 20.0f, 20.81f, 19.56f, 21.69f, 18.69f)
                curveTo(22.56f, 17.81f, 23.0f, 16.75f, 23.0f, 15.5f)
                curveTo(23.0f, 14.35f, 22.62f, 13.35f, 21.86f, 12.5f)
                moveTo(20.27f, 17.27f)
                curveTo(19.79f, 17.76f, 19.2f, 18.0f, 18.5f, 18.0f)
                horizontalLineTo(6.5f)
                curveTo(5.53f, 18.0f, 4.71f, 17.66f, 4.03f, 17.0f)
                curveTo(3.34f, 16.29f, 3.0f, 15.47f, 3.0f, 14.5f)
                reflectiveCurveTo(3.34f, 12.71f, 4.03f, 12.03f)
                curveTo(4.71f, 11.34f, 5.53f, 11.0f, 6.5f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 9.62f, 7.5f, 8.44f, 8.46f, 7.46f)
                curveTo(9.44f, 6.5f, 10.62f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(14.56f, 6.5f, 15.54f, 7.46f)
                curveTo(16.5f, 8.44f, 17.0f, 9.62f, 17.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.5f)
                curveTo(19.2f, 13.0f, 19.79f, 13.24f, 20.27f, 13.73f)
                reflectiveCurveTo(21.0f, 14.8f, 21.0f, 15.5f)
                reflectiveCurveTo(20.76f, 16.79f, 20.27f, 17.27f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                moveTo(11.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _cloudAlertOutline!!
    }

private var _cloudAlertOutline: ImageVector? = null
