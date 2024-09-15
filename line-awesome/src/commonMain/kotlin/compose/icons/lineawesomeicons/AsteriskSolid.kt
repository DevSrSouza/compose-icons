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

public val LineAwesomeIcons.AsteriskSolid: ImageVector
    get() {
        if (_asteriskSolid != null) {
            return _asteriskSolid!!
        }
        _asteriskSolid = Builder(name = "AsteriskSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.699f, 17.0f)
                lineTo(23.898f, 25.398f)
                lineTo(21.5f, 27.0f)
                lineTo(16.0f, 18.301f)
                lineTo(10.5f, 27.0f)
                lineTo(8.199f, 25.398f)
                lineTo(14.398f, 17.0f)
                lineTo(5.102f, 14.602f)
                lineTo(6.0f, 12.0f)
                lineTo(15.102f, 15.199f)
                lineTo(14.5f, 5.0f)
                lineTo(17.5f, 5.0f)
                lineTo(17.0f, 15.199f)
                lineTo(26.0f, 12.0f)
                lineTo(26.801f, 14.699f)
                close()
            }
        }
        .build()
        return _asteriskSolid!!
    }

private var _asteriskSolid: ImageVector? = null
