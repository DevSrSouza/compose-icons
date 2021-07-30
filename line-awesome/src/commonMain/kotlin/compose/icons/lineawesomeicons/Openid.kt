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

public val LineAwesomeIcons.Openid: ImageVector
    get() {
        if (_openid != null) {
            return _openid!!
        }
        _openid = Builder(name = "Openid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                lineTo(15.0f, 5.9375f)
                lineTo(15.0f, 25.625f)
                curveTo(9.8555f, 24.9531f, 6.9375f, 22.6016f, 6.9375f, 19.6563f)
                curveTo(6.9375f, 16.8945f, 9.9219f, 14.5547f, 14.0f, 13.8125f)
                lineTo(14.0f, 11.3125f)
                curveTo(7.7227f, 12.1094f, 3.0f, 15.543f, 3.0f, 19.6563f)
                curveTo(3.0f, 23.9492f, 7.5195f, 27.4727f, 15.0f, 28.0938f)
                lineTo(19.0f, 26.2188f)
                close()
                moveTo(20.0f, 11.375f)
                lineTo(20.0f, 13.9063f)
                curveTo(21.3125f, 14.1875f, 22.5039f, 14.6445f, 23.5f, 15.2188f)
                lineTo(21.375f, 16.4063f)
                lineTo(29.0f, 18.0625f)
                lineTo(28.4688f, 12.4375f)
                lineTo(26.4375f, 13.5625f)
                curveTo(24.6875f, 12.5f, 22.4688f, 11.7422f, 20.0f, 11.375f)
                close()
            }
        }
        .build()
        return _openid!!
    }

private var _openid: ImageVector? = null
