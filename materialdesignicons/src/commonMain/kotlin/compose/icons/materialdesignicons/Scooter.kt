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

public val MaterialDesignIcons.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.82f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                curveTo(15.0f, 15.79f, 16.79f, 14.0f, 19.0f, 14.0f)
                horizontalLineTo(19.74f)
                lineTo(17.84f, 5.56f)
                curveTo(17.63f, 4.65f, 16.82f, 4.0f, 15.89f, 4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.89f)
                lineTo(17.29f, 12.25f)
                horizontalLineTo(17.28f)
                curveTo(15.12f, 12.9f, 13.47f, 14.73f, 13.09f, 17.0f)
                horizontalLineTo(7.82f)
                curveTo(7.34f, 15.66f, 5.96f, 14.76f, 4.4f, 15.06f)
                curveTo(3.22f, 15.29f, 2.27f, 16.26f, 2.05f, 17.44f)
                curveTo(1.7f, 19.34f, 3.16f, 21.0f, 5.0f, 21.0f)
                curveTo(6.3f, 21.0f, 7.4f, 20.16f, 7.82f, 19.0f)
                moveTo(5.0f, 19.0f)
                curveTo(4.45f, 19.0f, 4.0f, 18.55f, 4.0f, 18.0f)
                reflectiveCurveTo(4.45f, 17.0f, 5.0f, 17.0f)
                reflectiveCurveTo(6.0f, 17.45f, 6.0f, 18.0f)
                reflectiveCurveTo(5.55f, 19.0f, 5.0f, 19.0f)
                moveTo(19.0f, 15.0f)
                curveTo(17.34f, 15.0f, 16.0f, 16.34f, 16.0f, 18.0f)
                reflectiveCurveTo(17.34f, 21.0f, 19.0f, 21.0f)
                reflectiveCurveTo(22.0f, 19.66f, 22.0f, 18.0f)
                reflectiveCurveTo(20.66f, 15.0f, 19.0f, 15.0f)
                moveTo(19.0f, 19.0f)
                curveTo(18.45f, 19.0f, 18.0f, 18.55f, 18.0f, 18.0f)
                reflectiveCurveTo(18.45f, 17.0f, 19.0f, 17.0f)
                reflectiveCurveTo(20.0f, 17.45f, 20.0f, 18.0f)
                reflectiveCurveTo(19.55f, 19.0f, 19.0f, 19.0f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
