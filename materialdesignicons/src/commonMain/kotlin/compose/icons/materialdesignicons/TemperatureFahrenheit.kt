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

public val MaterialDesignIcons.TemperatureFahrenheit: ImageVector
    get() {
        if (_temperatureFahrenheit != null) {
            return _temperatureFahrenheit!!
        }
        _temperatureFahrenheit = Builder(name = "TemperatureFahrenheit", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                moveTo(6.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 3.0f)
                moveTo(6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _temperatureFahrenheit!!
    }

private var _temperatureFahrenheit: ImageVector? = null
