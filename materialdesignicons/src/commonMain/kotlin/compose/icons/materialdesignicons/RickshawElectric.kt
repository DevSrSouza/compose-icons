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

public val MaterialDesignIcons.RickshawElectric: ImageVector
    get() {
        if (_rickshawElectric != null) {
            return _rickshawElectric!!
        }
        _rickshawElectric = Builder(name = "RickshawElectric", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.05f)
                verticalLineTo(10.73f)
                curveTo(20.0f, 10.26f, 19.84f, 9.8f, 19.54f, 9.44f)
                lineTo(15.6f, 4.72f)
                curveTo(15.22f, 4.26f, 14.66f, 4.0f, 14.06f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 14.1f, 2.9f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(4.05f)
                curveTo(4.28f, 16.14f, 5.29f, 17.0f, 6.5f, 17.0f)
                reflectiveCurveTo(8.72f, 16.14f, 8.95f, 15.0f)
                horizontalLineTo(17.05f)
                curveTo(17.28f, 16.14f, 18.29f, 17.0f, 19.5f, 17.0f)
                curveTo(20.88f, 17.0f, 22.0f, 15.88f, 22.0f, 14.5f)
                curveTo(22.0f, 13.29f, 21.14f, 12.28f, 20.0f, 12.05f)
                moveTo(3.5f, 6.0f)
                curveTo(3.5f, 5.73f, 3.73f, 5.5f, 4.0f, 5.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(6.0f)
                moveTo(6.5f, 15.5f)
                curveTo(5.95f, 15.5f, 5.5f, 15.05f, 5.5f, 14.5f)
                reflectiveCurveTo(5.95f, 13.5f, 6.5f, 13.5f)
                reflectiveCurveTo(7.5f, 13.95f, 7.5f, 14.5f)
                reflectiveCurveTo(7.05f, 15.5f, 6.5f, 15.5f)
                moveTo(13.0f, 13.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.5f)
                moveTo(15.0f, 6.34f)
                lineTo(18.05f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.34f)
                moveTo(19.5f, 15.5f)
                curveTo(18.95f, 15.5f, 18.5f, 15.05f, 18.5f, 14.5f)
                reflectiveCurveTo(18.95f, 13.5f, 19.5f, 13.5f)
                reflectiveCurveTo(20.5f, 13.95f, 20.5f, 14.5f)
                reflectiveCurveTo(20.05f, 15.5f, 19.5f, 15.5f)
                moveTo(11.0f, 20.0f)
                horizontalLineTo(7.0f)
                lineTo(13.0f, 23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                lineTo(11.0f, 18.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _rickshawElectric!!
    }

private var _rickshawElectric: ImageVector? = null
