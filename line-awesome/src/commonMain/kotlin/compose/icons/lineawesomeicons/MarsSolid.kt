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

public val LineAwesomeIcons.MarsSolid: ImageVector
    get() {
        if (_marsSolid != null) {
            return _marsSolid!!
        }
        _marsSolid = Builder(name = "MarsSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                lineTo(17.0f, 6.0f)
                lineTo(24.5625f, 6.0f)
                lineTo(16.875f, 13.6875f)
                curveTo(15.5234f, 12.6445f, 13.832f, 12.0f, 12.0f, 12.0f)
                curveTo(7.5938f, 12.0f, 4.0f, 15.5938f, 4.0f, 20.0f)
                curveTo(4.0f, 24.4063f, 7.5938f, 28.0f, 12.0f, 28.0f)
                curveTo(16.4063f, 28.0f, 20.0f, 24.4063f, 20.0f, 20.0f)
                curveTo(20.0f, 18.168f, 19.3555f, 16.4766f, 18.3125f, 15.125f)
                lineTo(26.0f, 7.4375f)
                lineTo(26.0f, 15.0f)
                lineTo(28.0f, 15.0f)
                lineTo(28.0f, 4.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(15.3242f, 14.0f, 18.0f, 16.6758f, 18.0f, 20.0f)
                curveTo(18.0f, 23.3242f, 15.3242f, 26.0f, 12.0f, 26.0f)
                curveTo(8.6758f, 26.0f, 6.0f, 23.3242f, 6.0f, 20.0f)
                curveTo(6.0f, 16.6758f, 8.6758f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _marsSolid!!
    }

private var _marsSolid: ImageVector? = null
