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

public val MaterialDesignIcons.ScooterElectric: ImageVector
    get() {
        if (_scooterElectric != null) {
            return _scooterElectric!!
        }
        _scooterElectric = Builder(name = "ScooterElectric", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.82f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 12.79f, 16.79f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(19.74f)
                lineTo(17.84f, 2.56f)
                curveTo(17.63f, 1.65f, 16.82f, 1.0f, 15.89f, 1.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.89f)
                lineTo(17.29f, 9.25f)
                horizontalLineTo(17.28f)
                curveTo(15.12f, 9.9f, 13.47f, 11.73f, 13.09f, 14.0f)
                horizontalLineTo(7.82f)
                curveTo(7.34f, 12.66f, 5.96f, 11.76f, 4.4f, 12.06f)
                curveTo(3.22f, 12.29f, 2.27f, 13.26f, 2.05f, 14.44f)
                curveTo(1.7f, 16.34f, 3.16f, 18.0f, 5.0f, 18.0f)
                curveTo(6.3f, 18.0f, 7.4f, 17.16f, 7.82f, 16.0f)
                moveTo(5.0f, 16.0f)
                curveTo(4.45f, 16.0f, 4.0f, 15.55f, 4.0f, 15.0f)
                reflectiveCurveTo(4.45f, 14.0f, 5.0f, 14.0f)
                reflectiveCurveTo(6.0f, 14.45f, 6.0f, 15.0f)
                reflectiveCurveTo(5.55f, 16.0f, 5.0f, 16.0f)
                moveTo(19.0f, 12.0f)
                curveTo(17.34f, 12.0f, 16.0f, 13.34f, 16.0f, 15.0f)
                reflectiveCurveTo(17.34f, 18.0f, 19.0f, 18.0f)
                reflectiveCurveTo(22.0f, 16.66f, 22.0f, 15.0f)
                reflectiveCurveTo(20.66f, 12.0f, 19.0f, 12.0f)
                moveTo(19.0f, 16.0f)
                curveTo(18.45f, 16.0f, 18.0f, 15.55f, 18.0f, 15.0f)
                reflectiveCurveTo(18.45f, 14.0f, 19.0f, 14.0f)
                reflectiveCurveTo(20.0f, 14.45f, 20.0f, 15.0f)
                reflectiveCurveTo(19.55f, 16.0f, 19.0f, 16.0f)
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
        return _scooterElectric!!
    }

private var _scooterElectric: ImageVector? = null
