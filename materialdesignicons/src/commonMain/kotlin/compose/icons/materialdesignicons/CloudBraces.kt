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

public val MaterialDesignIcons.CloudBraces: ImageVector
    get() {
        if (_cloudBraces != null) {
            return _cloudBraces!!
        }
        _cloudBraces = Builder(name = "CloudBraces", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.5f, 10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                curveTo(9.0f, 12.11f, 8.11f, 13.0f, 7.0f, 13.0f)
                curveTo(8.11f, 13.0f, 9.0f, 13.9f, 9.0f, 15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 18.0f, 7.0f, 17.11f, 7.0f, 16.0f)
                verticalLineTo(15.0f)
                curveTo(7.0f, 14.45f, 6.55f, 14.0f, 6.0f, 14.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                curveTo(6.55f, 12.0f, 7.0f, 11.55f, 7.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 8.9f, 7.9f, 8.0f, 9.0f, 8.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.0f)
                moveTo(18.5f, 14.0f)
                horizontalLineTo(18.0f)
                curveTo(17.45f, 14.0f, 17.0f, 14.45f, 17.0f, 15.0f)
                verticalLineTo(16.0f)
                curveTo(17.0f, 17.11f, 16.11f, 18.0f, 15.0f, 18.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 13.9f, 15.9f, 13.0f, 17.0f, 13.0f)
                curveTo(15.9f, 13.0f, 15.0f, 12.11f, 15.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                curveTo(16.11f, 8.0f, 17.0f, 8.9f, 17.0f, 10.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 11.55f, 17.45f, 12.0f, 18.0f, 12.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _cloudBraces!!
    }

private var _cloudBraces: ImageVector? = null
