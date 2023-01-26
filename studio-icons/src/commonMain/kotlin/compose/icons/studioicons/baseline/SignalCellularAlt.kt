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

public val BaselineGroup.SignalCellularAlt: ImageVector
    get() {
        if (_signalCellularAlt != null) {
            return _signalCellularAlt!!
        }
        _signalCellularAlt = Builder(name = "SignalCellularAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 20.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _signalCellularAlt!!
    }

private var _signalCellularAlt: ImageVector? = null
