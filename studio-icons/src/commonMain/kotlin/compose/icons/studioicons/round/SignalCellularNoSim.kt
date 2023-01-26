package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SignalCellularNoSim: ImageVector
    get() {
        if (_signalCellularNoSim != null) {
            return _signalCellularNoSim!!
        }
        _signalCellularNoSim = Builder(name = "SignalCellularNoSim", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.17f)
                curveToRelative(-0.53f, 0.0f, -1.04f, 0.21f, -1.42f, 0.59f)
                lineTo(7.95f, 5.06f)
                lineTo(19.0f, 16.11f)
                verticalLineTo(5.0f)
                close()
                moveTo(3.09f, 4.44f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(5.0f, 7.78f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.23f)
                lineToRelative(0.91f, 0.91f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(4.5f, 4.44f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                close()
            }
        }
        .build()
        return _signalCellularNoSim!!
    }

private var _signalCellularNoSim: ImageVector? = null
