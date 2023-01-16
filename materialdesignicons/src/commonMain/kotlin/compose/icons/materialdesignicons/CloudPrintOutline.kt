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

public val MaterialDesignIcons.CloudPrintOutline: ImageVector
    get() {
        if (_cloudPrintOutline != null) {
            return _cloudPrintOutline!!
        }
        _cloudPrintOutline = Builder(name = "CloudPrintOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                moveTo(15.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                moveTo(15.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                moveTo(23.0f, 13.5f)
                curveTo(23.0f, 14.75f, 22.56f, 15.81f, 21.69f, 16.69f)
                curveTo(20.81f, 17.56f, 19.75f, 18.0f, 18.5f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.95f)
                curveTo(4.7f, 17.85f, 3.57f, 17.36f, 2.61f, 16.43f)
                curveTo(1.54f, 15.38f, 1.0f, 14.09f, 1.0f, 12.58f)
                curveTo(1.0f, 11.28f, 1.39f, 10.12f, 2.17f, 9.1f)
                reflectiveCurveTo(4.0f, 7.43f, 5.25f, 7.15f)
                curveTo(5.67f, 5.62f, 6.5f, 4.38f, 7.75f, 3.43f)
                reflectiveCurveTo(10.42f, 2.0f, 12.0f, 2.0f)
                curveTo(13.95f, 2.0f, 15.6f, 2.68f, 16.96f, 4.04f)
                curveTo(18.32f, 5.4f, 19.0f, 7.05f, 19.0f, 9.0f)
                curveTo(20.15f, 9.13f, 21.1f, 9.63f, 21.86f, 10.5f)
                curveTo(22.62f, 11.35f, 23.0f, 12.35f, 23.0f, 13.5f)
                moveTo(6.0f, 15.95f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                curveTo(17.0f, 7.62f, 16.5f, 6.44f, 15.54f, 5.46f)
                curveTo(14.56f, 4.5f, 13.38f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(9.44f, 4.5f, 8.46f, 5.46f)
                curveTo(7.5f, 6.44f, 7.0f, 7.62f, 7.0f, 9.0f)
                horizontalLineTo(6.5f)
                curveTo(5.53f, 9.0f, 4.71f, 9.34f, 4.03f, 10.03f)
                curveTo(3.34f, 10.71f, 3.0f, 11.53f, 3.0f, 12.5f)
                reflectiveCurveTo(3.34f, 14.29f, 4.03f, 15.0f)
                curveTo(4.59f, 15.54f, 5.25f, 15.85f, 6.0f, 15.95f)
                moveTo(16.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                moveTo(21.0f, 13.5f)
                curveTo(21.0f, 12.8f, 20.76f, 12.21f, 20.27f, 11.73f)
                reflectiveCurveTo(19.2f, 11.0f, 18.5f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.5f)
                curveTo(19.2f, 16.0f, 19.79f, 15.76f, 20.27f, 15.28f)
                reflectiveCurveTo(21.0f, 14.2f, 21.0f, 13.5f)
                close()
            }
        }
        .build()
        return _cloudPrintOutline!!
    }

private var _cloudPrintOutline: ImageVector? = null
