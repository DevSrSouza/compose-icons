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

public val LineAwesomeIcons.YenSignSolid: ImageVector
    get() {
        if (_yenSignSolid != null) {
            return _yenSignSolid!!
        }
        _yenSignSolid = Builder(name = "YenSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1875f, 5.0f)
                lineTo(14.0625f, 16.0f)
                lineTo(10.0f, 16.0f)
                lineTo(10.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(15.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                lineTo(10.0f, 22.0f)
                lineTo(15.0f, 22.0f)
                lineTo(15.0f, 27.0f)
                lineTo(17.0f, 27.0f)
                lineTo(17.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 20.0f)
                lineTo(17.0f, 20.0f)
                lineTo(17.0f, 18.0f)
                lineTo(22.0f, 18.0f)
                lineTo(22.0f, 16.0f)
                lineTo(17.9375f, 16.0f)
                lineTo(24.8125f, 5.0f)
                lineTo(22.4375f, 5.0f)
                lineTo(16.0f, 15.3438f)
                lineTo(9.5625f, 5.0f)
                close()
            }
        }
        .build()
        return _yenSignSolid!!
    }

private var _yenSignSolid: ImageVector? = null
