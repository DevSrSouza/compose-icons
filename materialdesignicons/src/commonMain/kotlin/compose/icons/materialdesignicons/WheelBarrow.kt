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

public val MaterialDesignIcons.WheelBarrow: ImageVector
    get() {
        if (_wheelBarrow != null) {
            return _wheelBarrow!!
        }
        _wheelBarrow = Builder(name = "WheelBarrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.5f)
                curveTo(18.83f, 15.5f, 19.5f, 16.17f, 19.5f, 17.0f)
                reflectiveCurveTo(18.83f, 18.5f, 18.0f, 18.5f)
                reflectiveCurveTo(16.5f, 17.83f, 16.5f, 17.0f)
                reflectiveCurveTo(17.17f, 15.5f, 18.0f, 15.5f)
                moveTo(18.0f, 14.0f)
                curveTo(16.34f, 14.0f, 15.0f, 15.34f, 15.0f, 17.0f)
                reflectiveCurveTo(16.34f, 20.0f, 18.0f, 20.0f)
                curveTo(19.66f, 20.0f, 21.0f, 18.66f, 21.0f, 17.0f)
                reflectiveCurveTo(19.66f, 14.0f, 18.0f, 14.0f)
                moveTo(7.0f, 8.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.13f)
                lineTo(8.0f, 11.3f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                lineTo(12.57f, 15.0f)
                horizontalLineTo(14.55f)
                curveTo(15.25f, 13.81f, 16.5f, 13.0f, 18.0f, 13.0f)
                curveTo(18.88f, 13.0f, 19.69f, 13.29f, 20.35f, 13.78f)
                lineTo(22.0f, 8.0f)
                horizontalLineTo(7.0f)
                moveTo(9.39f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.8f)
                lineTo(9.87f, 14.11f)
                curveTo(10.23f, 14.64f, 10.82f, 14.96f, 11.45f, 15.0f)
                lineTo(9.39f, 19.0f)
                close()
            }
        }
        .build()
        return _wheelBarrow!!
    }

private var _wheelBarrow: ImageVector? = null
