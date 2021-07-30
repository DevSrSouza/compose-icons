package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.StepBackwardSolid: ImageVector
    get() {
        if (_stepBackwardSolid != null) {
            return _stepBackwardSolid!!
        }
        _stepBackwardSolid = Builder(name = "StepBackwardSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                lineTo(8.0f, 27.0f)
                lineTo(10.0f, 27.0f)
                lineTo(10.0f, 16.5f)
                lineTo(10.4375f, 16.8125f)
                lineTo(23.4375f, 25.8125f)
                lineTo(25.0f, 26.9063f)
                lineTo(25.0f, 5.0938f)
                lineTo(23.4375f, 6.1875f)
                lineTo(10.4375f, 15.1875f)
                lineTo(10.0f, 15.5f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(23.0f, 8.9063f)
                lineTo(23.0f, 23.0938f)
                lineTo(12.75f, 16.0f)
                close()
            }
        }
        .build()
        return _stepBackwardSolid!!
    }

private var _stepBackwardSolid: ImageVector? = null
