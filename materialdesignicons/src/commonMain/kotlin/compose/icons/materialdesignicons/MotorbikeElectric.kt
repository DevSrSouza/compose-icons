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

public val MaterialDesignIcons.MotorbikeElectric: ImageVector
    get() {
        if (_motorbikeElectric != null) {
            return _motorbikeElectric!!
        }
        _motorbikeElectric = Builder(name = "MotorbikeElectric", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.42f, 8.0f)
                lineTo(13.41f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.59f)
                lineTo(14.59f, 8.0f)
                horizontalLineTo(6.5f)
                curveTo(4.0f, 8.0f, 2.0f, 10.0f, 2.0f, 12.5f)
                reflectiveCurveTo(4.0f, 17.0f, 6.5f, 17.0f)
                curveTo(8.72f, 17.0f, 10.56f, 15.38f, 10.92f, 13.27f)
                lineTo(13.04f, 12.0f)
                curveTo(13.0f, 12.17f, 13.0f, 12.33f, 13.0f, 12.5f)
                curveTo(13.0f, 15.0f, 15.0f, 17.0f, 17.5f, 17.0f)
                reflectiveCurveTo(22.0f, 15.0f, 22.0f, 12.5f)
                reflectiveCurveTo(20.0f, 8.0f, 17.5f, 8.0f)
                moveTo(8.84f, 13.26f)
                curveTo(8.5f, 14.27f, 7.58f, 15.0f, 6.47f, 15.0f)
                curveTo(5.09f, 15.0f, 3.97f, 13.88f, 3.97f, 12.5f)
                reflectiveCurveTo(5.09f, 10.0f, 6.47f, 10.0f)
                curveTo(7.59f, 10.0f, 8.5f, 10.74f, 8.84f, 11.75f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.25f)
                lineTo(8.84f, 13.26f)
                moveTo(17.47f, 15.0f)
                curveTo(16.09f, 15.0f, 14.97f, 13.88f, 14.97f, 12.5f)
                reflectiveCurveTo(16.09f, 10.0f, 17.47f, 10.0f)
                curveTo(18.85f, 10.0f, 19.97f, 11.12f, 19.97f, 12.5f)
                reflectiveCurveTo(18.85f, 15.0f, 17.47f, 15.0f)
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
        return _motorbikeElectric!!
    }

private var _motorbikeElectric: ImageVector? = null
