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

public val LineAwesomeIcons.DumpsterSolid: ImageVector
    get() {
        if (_dumpsterSolid != null) {
            return _dumpsterSolid!!
        }
        _dumpsterSolid = Builder(name = "DumpsterSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                lineTo(3.0f, 14.0f)
                lineTo(4.334f, 14.0f)
                lineTo(4.666f, 16.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 26.0f)
                lineTo(8.0f, 26.0f)
                lineTo(8.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 26.0f)
                lineTo(26.0f, 26.0f)
                lineTo(26.0f, 24.0f)
                lineTo(27.0f, 18.0f)
                lineTo(29.0f, 18.0f)
                lineTo(29.0f, 16.0f)
                lineTo(27.334f, 16.0f)
                lineTo(27.666f, 14.0f)
                lineTo(29.0f, 14.0f)
                lineTo(27.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(6.563f, 8.0f)
                lineTo(9.338f, 8.0f)
                lineTo(8.572f, 12.0f)
                lineTo(5.563f, 12.0f)
                lineTo(6.563f, 8.0f)
                close()
                moveTo(11.391f, 8.0f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 12.0f)
                lineTo(10.631f, 12.0f)
                lineTo(11.391f, 8.0f)
                close()
                moveTo(17.0f, 8.0f)
                lineTo(20.609f, 8.0f)
                lineTo(21.369f, 12.0f)
                lineTo(17.0f, 12.0f)
                lineTo(17.0f, 8.0f)
                close()
                moveTo(22.662f, 8.0f)
                lineTo(25.438f, 8.0f)
                lineTo(26.438f, 12.0f)
                lineTo(23.428f, 12.0f)
                lineTo(22.662f, 8.0f)
                close()
                moveTo(6.361f, 14.0f)
                lineTo(8.189f, 14.0f)
                lineTo(10.25f, 14.0f)
                lineTo(15.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(21.75f, 14.0f)
                lineTo(23.811f, 14.0f)
                lineTo(25.639f, 14.0f)
                lineTo(24.307f, 22.0f)
                lineTo(7.693f, 22.0f)
                lineTo(6.361f, 14.0f)
                close()
            }
        }
        .build()
        return _dumpsterSolid!!
    }

private var _dumpsterSolid: ImageVector? = null
