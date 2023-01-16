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

public val MaterialDesignIcons.ThermometerProbe: ImageVector
    get() {
        if (_thermometerProbe != null) {
            return _thermometerProbe!!
        }
        _thermometerProbe = Builder(name = "ThermometerProbe", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.47f, 3.47f)
                lineTo(13.47f, 9.47f)
                lineTo(10.53f, 10.0f)
                curveTo(10.22f, 10.03f, 9.94f, 10.18f, 9.72f, 10.4f)
                lineTo(2.81f, 17.31f)
                curveTo(1.74f, 18.38f, 1.74f, 20.12f, 2.81f, 21.2f)
                curveTo(3.88f, 22.27f, 5.62f, 22.27f, 6.7f, 21.2f)
                lineTo(13.61f, 14.29f)
                curveTo(13.83f, 14.07f, 14.0f, 13.79f, 14.03f, 13.5f)
                lineTo(14.54f, 10.54f)
                lineTo(20.54f, 4.54f)
                lineTo(22.0f, 2.0f)
                lineTo(19.47f, 3.47f)
                moveTo(11.0f, 14.38f)
                curveTo(10.24f, 14.38f, 9.62f, 13.76f, 9.62f, 13.0f)
                reflectiveCurveTo(10.24f, 11.62f, 11.0f, 11.62f)
                reflectiveCurveTo(12.38f, 12.24f, 12.38f, 13.0f)
                curveTo(12.37f, 13.76f, 11.76f, 14.38f, 11.0f, 14.38f)
                close()
            }
        }
        .build()
        return _thermometerProbe!!
    }

private var _thermometerProbe: ImageVector? = null
