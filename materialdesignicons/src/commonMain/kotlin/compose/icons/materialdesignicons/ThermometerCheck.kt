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

public val MaterialDesignIcons.ThermometerCheck: ImageVector
    get() {
        if (_thermometerCheck != null) {
            return _thermometerCheck!!
        }
        _thermometerCheck = Builder(name = "ThermometerCheck", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                verticalLineTo(5.0f)
                curveTo(10.0f, 3.34f, 8.66f, 2.0f, 7.0f, 2.0f)
                reflectiveCurveTo(4.0f, 3.34f, 4.0f, 5.0f)
                verticalLineTo(13.0f)
                curveTo(1.79f, 14.66f, 1.34f, 17.79f, 3.0f, 20.0f)
                reflectiveCurveTo(7.79f, 22.66f, 10.0f, 21.0f)
                reflectiveCurveTo(12.66f, 16.21f, 11.0f, 14.0f)
                curveTo(10.72f, 13.62f, 10.38f, 13.28f, 10.0f, 13.0f)
                moveTo(7.0f, 4.0f)
                curveTo(7.55f, 4.0f, 8.0f, 4.45f, 8.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                curveTo(6.0f, 4.45f, 6.45f, 4.0f, 7.0f, 4.0f)
                moveTo(16.25f, 15.16f)
                lineTo(13.5f, 12.16f)
                lineTo(14.66f, 11.0f)
                lineTo(16.25f, 12.59f)
                lineTo(19.84f, 9.0f)
                lineTo(21.0f, 10.41f)
                lineTo(16.25f, 15.16f)
            }
        }
        .build()
        return _thermometerCheck!!
    }

private var _thermometerCheck: ImageVector? = null
