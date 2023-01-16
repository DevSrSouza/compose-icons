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

public val MaterialDesignIcons.ShoeCleat: ImageVector
    get() {
        if (_shoeCleat != null) {
            return _shoeCleat!!
        }
        _shoeCleat = Builder(name = "ShoeCleat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                curveTo(20.76f, 8.0f, 20.53f, 8.0f, 20.3f, 8.0f)
                lineTo(20.25f, 7.97f)
                curveTo(18.14f, 7.84f, 16.38f, 7.17f, 15.53f, 6.23f)
                lineTo(14.0f, 7.0f)
                curveTo(13.95f, 7.1f, 13.89f, 7.19f, 13.84f, 7.28f)
                curveTo(14.55f, 7.89f, 15.0f, 8.65f, 15.0f, 9.5f)
                curveTo(15.0f, 9.83f, 14.91f, 10.14f, 14.79f, 10.45f)
                lineTo(12.92f, 8.58f)
                curveTo(12.7f, 8.83f, 12.47f, 9.07f, 12.22f, 9.29f)
                lineTo(14.25f, 11.32f)
                curveTo(14.04f, 11.57f, 13.8f, 11.79f, 13.5f, 12.0f)
                lineTo(11.43f, 9.91f)
                curveTo(11.14f, 10.11f, 10.85f, 10.28f, 10.55f, 10.45f)
                lineTo(12.58f, 12.5f)
                curveTo(12.25f, 12.63f, 11.89f, 12.74f, 11.5f, 12.82f)
                lineTo(9.59f, 10.91f)
                curveTo(9.25f, 11.05f, 8.91f, 11.18f, 8.56f, 11.29f)
                lineTo(10.26f, 13.0f)
                curveTo(10.17f, 13.0f, 10.09f, 13.0f, 10.0f, 13.0f)
                curveTo(8.5f, 13.0f, 7.2f, 12.54f, 6.28f, 11.82f)
                curveTo(5.46f, 11.95f, 4.68f, 12.0f, 4.0f, 12.0f)
                curveTo(2.0f, 12.0f, 2.0f, 15.0f, 2.0f, 15.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 16.11f, 2.89f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 18.55f, 4.45f, 19.0f, 5.0f, 19.0f)
                reflectiveCurveTo(6.0f, 18.55f, 6.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                curveTo(7.0f, 18.55f, 7.45f, 19.0f, 8.0f, 19.0f)
                reflectiveCurveTo(9.0f, 18.55f, 9.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 18.55f, 10.45f, 19.0f, 11.0f, 19.0f)
                reflectiveCurveTo(12.0f, 18.55f, 12.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                curveTo(15.0f, 18.55f, 15.45f, 19.0f, 16.0f, 19.0f)
                reflectiveCurveTo(17.0f, 18.55f, 17.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                curveTo(18.0f, 18.55f, 18.45f, 19.0f, 19.0f, 19.0f)
                reflectiveCurveTo(20.0f, 18.55f, 20.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 17.0f, 22.0f, 17.0f, 22.0f, 12.5f)
                curveTo(22.0f, 9.0f, 21.0f, 8.0f, 21.0f, 8.0f)
                close()
            }
        }
        .build()
        return _shoeCleat!!
    }

private var _shoeCleat: ImageVector? = null
