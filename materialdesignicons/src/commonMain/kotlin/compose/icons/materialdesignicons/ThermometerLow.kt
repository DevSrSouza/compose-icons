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

public val MaterialDesignIcons.ThermometerLow: ImageVector
    get() {
        if (_thermometerLow != null) {
            return _thermometerLow!!
        }
        _thermometerLow = Builder(name = "ThermometerLow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.0f)
                verticalLineTo(13.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 15.0f, 13.0f)
                moveTo(12.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _thermometerLow!!
    }

private var _thermometerLow: ImageVector? = null
