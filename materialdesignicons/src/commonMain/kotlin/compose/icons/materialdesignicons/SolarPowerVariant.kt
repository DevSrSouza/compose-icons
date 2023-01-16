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

public val MaterialDesignIcons.SolarPowerVariant: ImageVector
    get() {
        if (_solarPowerVariant != null) {
            return _solarPowerVariant!!
        }
        _solarPowerVariant = Builder(name = "SolarPowerVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.33f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                lineTo(3.33f, 16.0f)
                moveTo(13.0f, 16.0f)
                horizontalLineTo(20.67f)
                lineTo(20.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                moveTo(21.11f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                lineTo(21.11f, 18.0f)
                moveTo(2.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.89f)
                lineTo(2.0f, 22.0f)
                moveTo(11.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                moveTo(15.76f, 7.21f)
                lineTo(17.18f, 5.79f)
                lineTo(19.3f, 7.91f)
                lineTo(17.89f, 9.33f)
                lineTo(15.76f, 7.21f)
                moveTo(4.71f, 7.91f)
                lineTo(6.83f, 5.79f)
                lineTo(8.24f, 7.21f)
                lineTo(6.12f, 9.33f)
                lineTo(4.71f, 7.91f)
                moveTo(3.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                moveTo(18.0f, 2.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                moveTo(12.0f, 7.0f)
                curveTo(14.76f, 7.0f, 17.0f, 4.76f, 17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 4.76f, 9.24f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _solarPowerVariant!!
    }

private var _solarPowerVariant: ImageVector? = null
