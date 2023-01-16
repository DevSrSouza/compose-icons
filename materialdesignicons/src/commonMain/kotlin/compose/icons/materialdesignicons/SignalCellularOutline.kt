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

public val MaterialDesignIcons.SignalCellularOutline: ImageVector
    get() {
        if (_signalCellularOutline != null) {
            return _signalCellularOutline!!
        }
        _signalCellularOutline = Builder(name = "SignalCellularOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(19.5f)
                moveTo(12.5f, 10.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(12.5f)
                moveTo(5.5f, 15.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(5.5f)
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
        return _signalCellularOutline!!
    }

private var _signalCellularOutline: ImageVector? = null
