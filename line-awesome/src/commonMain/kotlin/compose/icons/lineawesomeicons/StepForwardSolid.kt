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

public val LineAwesomeIcons.StepForwardSolid: ImageVector
    get() {
        if (_stepForwardSolid != null) {
            return _stepForwardSolid!!
        }
        _stepForwardSolid = Builder(name = "StepForwardSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0f)
                lineTo(22.0f, 15.5f)
                lineTo(21.563f, 15.188f)
                lineTo(8.563f, 6.188f)
                lineTo(7.0f, 5.094f)
                lineTo(7.0f, 26.906f)
                lineTo(8.563f, 25.813f)
                lineTo(21.563f, 16.813f)
                lineTo(22.0f, 16.5f)
                lineTo(22.0f, 27.0f)
                lineTo(24.0f, 27.0f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(9.0f, 8.906f)
                lineTo(19.25f, 16.0f)
                lineTo(9.0f, 23.094f)
                close()
            }
        }
        .build()
        return _stepForwardSolid!!
    }

private var _stepForwardSolid: ImageVector? = null
