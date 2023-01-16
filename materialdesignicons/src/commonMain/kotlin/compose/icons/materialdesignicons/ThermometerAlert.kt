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

public val MaterialDesignIcons.ThermometerAlert: ImageVector
    get() {
        if (_thermometerAlert != null) {
            return _thermometerAlert!!
        }
        _thermometerAlert = Builder(name = "ThermometerAlert", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 3.3f, 11.7f, 2.0f, 10.0f, 2.0f)
                reflectiveCurveTo(7.0f, 3.3f, 7.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(4.8f, 14.7f, 4.3f, 17.8f, 6.0f, 20.0f)
                reflectiveCurveTo(10.8f, 22.7f, 13.0f, 21.0f)
                reflectiveCurveTo(15.7f, 16.2f, 14.0f, 14.0f)
                curveTo(13.7f, 13.6f, 13.4f, 13.3f, 13.0f, 13.0f)
                moveTo(10.0f, 4.0f)
                curveTo(10.6f, 4.0f, 11.0f, 4.4f, 11.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 4.4f, 9.4f, 4.0f, 10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _thermometerAlert!!
    }

private var _thermometerAlert: ImageVector? = null
