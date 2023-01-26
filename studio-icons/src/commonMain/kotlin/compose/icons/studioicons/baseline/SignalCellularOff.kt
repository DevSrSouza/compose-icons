package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SignalCellularOff: ImageVector
    get() {
        if (_signalCellularOff != null) {
            return _signalCellularOff!!
        }
        _signalCellularOff = Builder(name = "SignalCellularOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                lineToRelative(-8.59f, 8.59f)
                lineTo(21.0f, 18.18f)
                verticalLineTo(1.0f)
                close()
                moveTo(4.77f, 4.5f)
                lineTo(3.5f, 5.77f)
                lineToRelative(6.36f, 6.36f)
                lineTo(1.0f, 21.0f)
                horizontalLineToRelative(17.73f)
                lineToRelative(2.0f, 2.0f)
                lineTo(22.0f, 21.73f)
                lineTo(4.77f, 4.5f)
                close()
            }
        }
        .build()
        return _signalCellularOff!!
    }

private var _signalCellularOff: ImageVector? = null
