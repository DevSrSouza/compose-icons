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

public val LineAwesomeIcons.MapSignsSolid: ImageVector
    get() {
        if (_mapSignsSolid != null) {
            return _mapSignsSolid!!
        }
        _mapSignsSolid = Builder(name = "MapSignsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                lineTo(15.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 16.0f)
                lineTo(25.4688f, 16.0f)
                lineTo(25.75f, 15.6563f)
                lineTo(29.3125f, 11.5f)
                lineTo(25.75f, 7.3438f)
                lineTo(25.4688f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(7.0f, 9.0f)
                lineTo(24.5313f, 9.0f)
                lineTo(26.6875f, 11.5f)
                lineTo(24.5313f, 14.0f)
                lineTo(7.0f, 14.0f)
                close()
                moveTo(15.0f, 17.0f)
                lineTo(15.0f, 27.0f)
                lineTo(17.0f, 27.0f)
                lineTo(17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _mapSignsSolid!!
    }

private var _mapSignsSolid: ImageVector? = null
