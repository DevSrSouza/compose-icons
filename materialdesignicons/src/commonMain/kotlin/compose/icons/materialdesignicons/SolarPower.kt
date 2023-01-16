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

public val MaterialDesignIcons.SolarPower: ImageVector
    get() {
        if (_solarPower != null) {
            return _solarPower!!
        }
        _solarPower = Builder(name = "SolarPower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.45f, 2.0f)
                verticalLineTo(5.55f)
                lineTo(15.0f, 3.77f)
                lineTo(11.45f, 2.0f)
                moveTo(10.45f, 8.0f)
                lineTo(8.0f, 10.46f)
                lineTo(11.75f, 11.71f)
                lineTo(10.45f, 8.0f)
                moveTo(2.0f, 11.45f)
                lineTo(3.77f, 15.0f)
                lineTo(5.55f, 11.45f)
                horizontalLineTo(2.0f)
                moveTo(10.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                curveTo(2.57f, 10.17f, 3.17f, 10.25f, 3.77f, 10.25f)
                curveTo(7.35f, 10.26f, 10.26f, 7.35f, 10.27f, 3.75f)
                curveTo(10.26f, 3.16f, 10.17f, 2.57f, 10.0f, 2.0f)
                moveTo(17.0f, 22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                lineTo(19.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                lineTo(17.0f, 22.0f)
                close()
            }
        }
        .build()
        return _solarPower!!
    }

private var _solarPower: ImageVector? = null
