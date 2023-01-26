package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SignalCellularNoSim: ImageVector
    get() {
        if (_signalCellularNoSim != null) {
            return _signalCellularNoSim!!
        }
        _signalCellularNoSim = Builder(name = "SignalCellularNoSim", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.83f, 5.0f)
                lineTo(17.0f, 5.0f)
                verticalLineToRelative(9.11f)
                lineToRelative(2.0f, 2.0f)
                lineTo(19.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(7.94f, 5.06f)
                lineToRelative(1.42f, 1.42f)
                lineTo(10.83f, 5.0f)
                close()
                moveTo(21.26f, 21.21f)
                lineTo(3.79f, 3.74f)
                lineTo(2.38f, 5.15f)
                lineTo(5.0f, 7.77f)
                lineTo(5.0f, 19.0f)
                curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.23f)
                lineToRelative(1.62f, 1.62f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(7.0f, 19.0f)
                lineTo(7.0f, 9.79f)
                lineTo(16.23f, 19.0f)
                lineTo(7.0f, 19.0f)
                close()
            }
        }
        .build()
        return _signalCellularNoSim!!
    }

private var _signalCellularNoSim: ImageVector? = null
