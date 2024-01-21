package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.CaretLeftFilled: ImageVector
    get() {
        if (_caretLeftFilled != null) {
            return _caretLeftFilled!!
        }
        _caretLeftFilled = Builder(name = "CaretLeftFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.883f, 5.007f)
                lineToRelative(0.058f, -0.005f)
                horizontalLineToRelative(0.118f)
                lineToRelative(0.058f, 0.005f)
                lineToRelative(0.06f, 0.009f)
                lineToRelative(0.052f, 0.01f)
                lineToRelative(0.108f, 0.032f)
                lineToRelative(0.067f, 0.027f)
                lineToRelative(0.132f, 0.07f)
                lineToRelative(0.09f, 0.065f)
                lineToRelative(0.081f, 0.073f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(0.054f, 0.077f)
                lineToRelative(0.054f, 0.096f)
                lineToRelative(0.017f, 0.036f)
                lineToRelative(0.027f, 0.067f)
                lineToRelative(0.032f, 0.108f)
                lineToRelative(0.01f, 0.053f)
                lineToRelative(0.01f, 0.06f)
                lineToRelative(0.004f, 0.057f)
                lineToRelative(0.002f, 0.059f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.852f, -0.986f, 1.297f, -1.623f, 0.783f)
                lineToRelative(-0.084f, -0.076f)
                lineToRelative(-6.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(0.077f, -0.054f)
                lineToRelative(0.096f, -0.054f)
                lineToRelative(0.036f, -0.017f)
                lineToRelative(0.067f, -0.027f)
                lineToRelative(0.108f, -0.032f)
                lineToRelative(0.053f, -0.01f)
                lineToRelative(0.06f, -0.01f)
                close()
            }
        }
        .build()
        return _caretLeftFilled!!
    }

private var _caretLeftFilled: ImageVector? = null
