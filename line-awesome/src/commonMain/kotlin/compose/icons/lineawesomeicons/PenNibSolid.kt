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

public val LineAwesomeIcons.PenNibSolid: ImageVector
    get() {
        if (_penNibSolid != null) {
            return _penNibSolid!!
        }
        _penNibSolid = Builder(name = "PenNibSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.586f)
                lineTo(17.479f, 8.107f)
                lineTo(10.738f, 10.035f)
                curveTo(9.417f, 10.392f, 8.372f, 11.381f, 7.938f, 12.686f)
                lineTo(3.859f, 25.273f)
                lineTo(5.293f, 26.707f)
                lineTo(6.727f, 28.141f)
                lineTo(19.32f, 24.061f)
                curveTo(20.618f, 23.629f, 21.607f, 22.581f, 21.961f, 21.273f)
                lineTo(23.889f, 14.525f)
                lineTo(28.414f, 10.0f)
                lineTo(22.0f, 3.586f)
                close()
                moveTo(22.0f, 6.414f)
                lineTo(25.586f, 10.0f)
                lineTo(23.0f, 12.586f)
                lineTo(19.414f, 9.0f)
                lineTo(22.0f, 6.414f)
                close()
                moveTo(17.711f, 10.125f)
                lineTo(21.875f, 14.289f)
                lineTo(20.033f, 20.738f)
                curveTo(19.851f, 21.41f, 19.349f, 21.942f, 18.697f, 22.16f)
                lineTo(7.689f, 25.725f)
                lineTo(13.484f, 19.93f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.07f, 18.516f)
                lineTo(6.275f, 24.311f)
                lineTo(9.838f, 13.311f)
                curveTo(10.058f, 12.65f, 10.59f, 12.149f, 11.275f, 11.963f)
                lineTo(17.711f, 10.125f)
                close()
            }
        }
        .build()
        return _penNibSolid!!
    }

private var _penNibSolid: ImageVector? = null
