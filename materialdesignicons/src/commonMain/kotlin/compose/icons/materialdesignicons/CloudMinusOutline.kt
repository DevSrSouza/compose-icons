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

public val MaterialDesignIcons.CloudMinusOutline: ImageVector
    get() {
        if (_cloudMinusOutline != null) {
            return _cloudMinusOutline!!
        }
        _cloudMinusOutline = Builder(name = "CloudMinusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 19.34f, 13.04f, 19.67f, 13.09f, 20.0f)
                horizontalLineTo(6.5f)
                curveTo(5.0f, 20.0f, 3.69f, 19.5f, 2.61f, 18.43f)
                curveTo(1.54f, 17.38f, 1.0f, 16.09f, 1.0f, 14.58f)
                curveTo(1.0f, 13.28f, 1.39f, 12.12f, 2.17f, 11.1f)
                reflectiveCurveTo(4.0f, 9.43f, 5.25f, 9.15f)
                curveTo(5.67f, 7.62f, 6.5f, 6.38f, 7.75f, 5.43f)
                reflectiveCurveTo(10.42f, 4.0f, 12.0f, 4.0f)
                curveTo(13.95f, 4.0f, 15.6f, 4.68f, 16.96f, 6.04f)
                curveTo(18.32f, 7.4f, 19.0f, 9.05f, 19.0f, 11.0f)
                curveTo(20.15f, 11.13f, 21.1f, 11.63f, 21.86f, 12.5f)
                curveTo(22.37f, 13.07f, 22.7f, 13.71f, 22.86f, 14.42f)
                curveTo(21.82f, 13.54f, 20.5f, 13.0f, 19.0f, 13.0f)
                curveTo(18.89f, 13.0f, 18.79f, 13.0f, 18.68f, 13.0f)
                curveTo(18.62f, 13.0f, 18.56f, 13.0f, 18.5f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 9.62f, 16.5f, 8.44f, 15.54f, 7.46f)
                curveTo(14.56f, 6.5f, 13.38f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(9.44f, 6.5f, 8.46f, 7.46f)
                curveTo(7.5f, 8.44f, 7.0f, 9.62f, 7.0f, 11.0f)
                horizontalLineTo(6.5f)
                curveTo(5.53f, 11.0f, 4.71f, 11.34f, 4.03f, 12.03f)
                curveTo(3.34f, 12.71f, 3.0f, 13.53f, 3.0f, 14.5f)
                reflectiveCurveTo(3.34f, 16.29f, 4.03f, 17.0f)
                curveTo(4.71f, 17.66f, 5.53f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.33f, 13.0f, 18.66f, 13.0f, 19.0f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _cloudMinusOutline!!
    }

private var _cloudMinusOutline: ImageVector? = null