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

public val LineAwesomeIcons.Kaggle: ImageVector
    get() {
        if (_kaggle != null) {
            return _kaggle!!
        }
        _kaggle = Builder(name = "Kaggle", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.352f, 4.0f)
                curveTo(10.118f, 4.0f, 10.0f, 4.117f, 10.0f, 4.352f)
                lineTo(10.0f, 27.645f)
                curveTo(10.0f, 27.879f, 10.117f, 27.996f, 10.352f, 27.996f)
                lineTo(12.648f, 27.996f)
                curveTo(12.882f, 27.996f, 13.002f, 27.88f, 13.002f, 27.645f)
                lineTo(13.002f, 22.809f)
                lineTo(14.811f, 21.086f)
                lineTo(20.049f, 27.75f)
                curveTo(20.191f, 27.915f, 20.355f, 28.0f, 20.545f, 28.0f)
                lineTo(23.717f, 28.0f)
                curveTo(23.883f, 28.0f, 23.977f, 27.952f, 24.0f, 27.857f)
                lineTo(23.934f, 27.498f)
                lineTo(17.023f, 18.91f)
                lineTo(23.65f, 12.498f)
                curveTo(23.773f, 12.37f, 23.73f, 12.0f, 23.398f, 12.0f)
                lineTo(20.117f, 12.0f)
                curveTo(19.951f, 12.0f, 19.785f, 12.086f, 19.619f, 12.252f)
                lineTo(13.0f, 18.975f)
                lineTo(13.0f, 4.352f)
                curveTo(13.0f, 4.117f, 12.883f, 4.0f, 12.648f, 4.0f)
                lineTo(10.352f, 4.0f)
                close()
            }
        }
        .build()
        return _kaggle!!
    }

private var _kaggle: ImageVector? = null
