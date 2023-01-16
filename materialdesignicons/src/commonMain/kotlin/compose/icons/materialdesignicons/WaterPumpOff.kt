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

public val MaterialDesignIcons.WaterPumpOff: ImageVector
    get() {
        if (_waterPumpOff != null) {
            return _waterPumpOff!!
        }
        _waterPumpOff = Builder(name = "WaterPumpOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.7f, 2.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 7.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 13.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.2f)
                moveTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(11.0f, 10.34f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.65f, 5.54f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.89f)
                close()
            }
        }
        .build()
        return _waterPumpOff!!
    }

private var _waterPumpOff: ImageVector? = null
