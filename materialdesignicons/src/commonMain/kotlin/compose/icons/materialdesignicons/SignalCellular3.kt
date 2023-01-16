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

public val MaterialDesignIcons.SignalCellular3: ImageVector
    get() {
        if (_signalCellular3 != null) {
            return _signalCellular3!!
        }
        _signalCellular3 = Builder(name = "SignalCellular3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                moveTo(14.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                moveTo(7.0f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _signalCellular3!!
    }

private var _signalCellular3: ImageVector? = null
