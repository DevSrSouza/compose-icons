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

public val LineAwesomeIcons.ShekelSignSolid: ImageVector
    get() {
        if (_shekelSignSolid != null) {
            return _shekelSignSolid!!
        }
        _shekelSignSolid = Builder(name = "ShekelSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(7.0f, 27.0f)
                lineTo(9.0f, 27.0f)
                lineTo(9.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                curveTo(13.8789f, 7.0f, 17.0f, 10.1211f, 17.0f, 14.0f)
                lineTo(17.0f, 21.0f)
                lineTo(19.0f, 21.0f)
                lineTo(19.0f, 14.0f)
                curveTo(19.0f, 9.043f, 14.957f, 5.0f, 10.0f, 5.0f)
                close()
                moveTo(22.0f, 5.0f)
                lineTo(22.0f, 25.0f)
                lineTo(21.0f, 25.0f)
                curveTo(17.1211f, 25.0f, 14.0f, 21.8789f, 14.0f, 18.0f)
                lineTo(14.0f, 11.0f)
                lineTo(12.0f, 11.0f)
                lineTo(12.0f, 18.0f)
                curveTo(12.0f, 22.957f, 16.043f, 27.0f, 21.0f, 27.0f)
                lineTo(24.0f, 27.0f)
                lineTo(24.0f, 5.0f)
                close()
            }
        }
        .build()
        return _shekelSignSolid!!
    }

private var _shekelSignSolid: ImageVector? = null
