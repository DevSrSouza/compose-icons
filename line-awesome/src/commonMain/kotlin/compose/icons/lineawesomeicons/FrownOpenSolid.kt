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

public val LineAwesomeIcons.FrownOpenSolid: ImageVector
    get() {
        if (_frownOpenSolid != null) {
            return _frownOpenSolid!!
        }
        _frownOpenSolid = Builder(name = "FrownOpenSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.5f, 11.0f)
                curveTo(10.6719f, 11.0f, 10.0f, 12.1211f, 10.0f, 13.5f)
                curveTo(10.0f, 14.8789f, 10.6719f, 16.0f, 11.5f, 16.0f)
                curveTo(12.3281f, 16.0f, 13.0f, 14.8789f, 13.0f, 13.5f)
                curveTo(13.0f, 12.1211f, 12.3281f, 11.0f, 11.5f, 11.0f)
                close()
                moveTo(20.5f, 11.0f)
                curveTo(19.6719f, 11.0f, 19.0f, 12.1211f, 19.0f, 13.5f)
                curveTo(19.0f, 14.8789f, 19.6719f, 16.0f, 20.5f, 16.0f)
                curveTo(21.3281f, 16.0f, 22.0f, 14.8789f, 22.0f, 13.5f)
                curveTo(22.0f, 12.1211f, 21.3281f, 11.0f, 20.5f, 11.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(13.707f, 17.0f, 12.0f, 18.8555f, 12.0f, 21.0f)
                curveTo(12.0f, 21.9883f, 12.3555f, 22.9727f, 13.1563f, 23.4688f)
                curveTo(13.957f, 23.9648f, 14.8438f, 24.0f, 16.0f, 24.0f)
                curveTo(17.1563f, 24.0f, 18.043f, 23.9648f, 18.8438f, 23.4688f)
                curveTo(19.6445f, 22.9727f, 20.0f, 21.9883f, 20.0f, 21.0f)
                curveTo(20.0f, 18.8555f, 18.293f, 17.0f, 16.0f, 17.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(17.293f, 19.0f, 18.0f, 19.8281f, 18.0f, 21.0f)
                curveTo(18.0f, 21.668f, 17.9609f, 21.6914f, 17.8125f, 21.7813f)
                curveTo(17.6641f, 21.8711f, 17.0547f, 22.0f, 16.0f, 22.0f)
                curveTo(14.9453f, 22.0f, 14.3359f, 21.8711f, 14.1875f, 21.7813f)
                curveTo(14.0391f, 21.6914f, 14.0f, 21.668f, 14.0f, 21.0f)
                curveTo(14.0f, 19.8281f, 14.707f, 19.0f, 16.0f, 19.0f)
                close()
            }
        }
        .build()
        return _frownOpenSolid!!
    }

private var _frownOpenSolid: ImageVector? = null
