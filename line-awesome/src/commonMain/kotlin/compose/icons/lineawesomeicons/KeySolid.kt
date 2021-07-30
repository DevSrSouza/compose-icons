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

public val LineAwesomeIcons.KeySolid: ImageVector
    get() {
        if (_keySolid != null) {
            return _keySolid!!
        }
        _keySolid = Builder(name = "KeySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveTo(15.0547f, 3.0f, 11.0f, 7.0547f, 11.0f, 12.0f)
                curveTo(11.0f, 12.5195f, 11.0859f, 12.9766f, 11.1563f, 13.4375f)
                lineTo(3.2813f, 21.2813f)
                lineTo(3.0f, 21.5938f)
                lineTo(3.0f, 29.0f)
                lineTo(10.0f, 29.0f)
                lineTo(10.0f, 26.0f)
                lineTo(13.0f, 26.0f)
                lineTo(13.0f, 23.0f)
                lineTo(16.0f, 23.0f)
                lineTo(16.0f, 20.0313f)
                curveTo(17.1797f, 20.6094f, 18.5547f, 21.0f, 20.0f, 21.0f)
                curveTo(24.9453f, 21.0f, 29.0f, 16.9453f, 29.0f, 12.0f)
                curveTo(29.0f, 7.0547f, 24.9453f, 3.0f, 20.0f, 3.0f)
                close()
                moveTo(20.0f, 5.0f)
                curveTo(23.8555f, 5.0f, 27.0f, 8.1445f, 27.0f, 12.0f)
                curveTo(27.0f, 15.8555f, 23.8555f, 19.0f, 20.0f, 19.0f)
                curveTo(18.7891f, 19.0f, 17.543f, 18.6445f, 16.5938f, 18.125f)
                lineTo(16.3438f, 18.0f)
                lineTo(14.0f, 18.0f)
                lineTo(14.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                lineTo(11.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 27.0f)
                lineTo(5.0f, 27.0f)
                lineTo(5.0f, 22.4375f)
                lineTo(12.9063f, 14.5f)
                lineTo(13.2813f, 14.1563f)
                lineTo(13.1875f, 13.625f)
                curveTo(13.0859f, 13.0234f, 13.0f, 12.4883f, 13.0f, 12.0f)
                curveTo(13.0f, 8.1445f, 16.1445f, 5.0f, 20.0f, 5.0f)
                close()
                moveTo(22.0f, 8.0f)
                curveTo(20.8945f, 8.0f, 20.0f, 8.8945f, 20.0f, 10.0f)
                curveTo(20.0f, 11.1055f, 20.8945f, 12.0f, 22.0f, 12.0f)
                curveTo(23.1055f, 12.0f, 24.0f, 11.1055f, 24.0f, 10.0f)
                curveTo(24.0f, 8.8945f, 23.1055f, 8.0f, 22.0f, 8.0f)
                close()
            }
        }
        .build()
        return _keySolid!!
    }

private var _keySolid: ImageVector? = null
