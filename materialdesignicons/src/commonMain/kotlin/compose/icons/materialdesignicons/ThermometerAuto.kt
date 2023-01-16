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

public val MaterialDesignIcons.ThermometerAuto: ImageVector
    get() {
        if (_thermometerAuto != null) {
            return _thermometerAuto!!
        }
        _thermometerAuto = Builder(name = "ThermometerAuto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveTo(11.7f, 13.6f, 11.4f, 13.3f, 11.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(11.0f, 3.3f, 9.7f, 2.0f, 8.0f, 2.0f)
                reflectiveCurveTo(5.0f, 3.3f, 5.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(2.8f, 14.7f, 2.3f, 17.8f, 4.0f, 20.0f)
                reflectiveCurveTo(8.8f, 22.7f, 11.0f, 21.0f)
                reflectiveCurveTo(13.7f, 16.2f, 12.0f, 14.0f)
                moveTo(9.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                curveTo(7.0f, 4.5f, 7.5f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveTo(9.0f, 4.5f, 9.0f, 5.0f)
                verticalLineTo(8.0f)
                moveTo(18.0f, 3.0f)
                horizontalLineTo(16.0f)
                lineTo(12.8f, 12.0f)
                horizontalLineTo(14.7f)
                lineTo(15.4f, 10.0f)
                horizontalLineTo(18.6f)
                lineTo(19.3f, 12.0f)
                horizontalLineTo(21.2f)
                lineTo(18.0f, 3.0f)
                moveTo(15.8f, 8.7f)
                lineTo(17.0f, 5.0f)
                lineTo(18.2f, 8.7f)
                horizontalLineTo(15.8f)
                close()
            }
        }
        .build()
        return _thermometerAuto!!
    }

private var _thermometerAuto: ImageVector? = null
