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

public val LineAwesomeIcons.MicrophoneSolid: ImageVector
    get() {
        if (_microphoneSolid != null) {
            return _microphoneSolid!!
        }
        _microphoneSolid = Builder(name = "MicrophoneSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                curveTo(11.906f, 4.0f, 11.0f, 4.906f, 11.0f, 6.0f)
                lineTo(11.0f, 18.0f)
                curveTo(11.0f, 19.094f, 11.906f, 20.0f, 13.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                curveTo(20.094f, 20.0f, 21.0f, 19.094f, 21.0f, 18.0f)
                lineTo(21.0f, 6.0f)
                curveTo(21.0f, 4.906f, 20.094f, 4.0f, 19.0f, 4.0f)
                close()
                moveTo(13.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(7.0f, 18.0f)
                curveTo(7.0f, 21.301f, 9.699f, 24.0f, 13.0f, 24.0f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 28.0f)
                lineTo(21.0f, 28.0f)
                lineTo(21.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 24.0f)
                lineTo(19.0f, 24.0f)
                curveTo(22.301f, 24.0f, 25.0f, 21.301f, 25.0f, 18.0f)
                lineTo(25.0f, 14.0f)
                lineTo(23.0f, 14.0f)
                lineTo(23.0f, 18.0f)
                curveTo(23.0f, 20.219f, 21.219f, 22.0f, 19.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                curveTo(10.781f, 22.0f, 9.0f, 20.219f, 9.0f, 18.0f)
                lineTo(9.0f, 14.0f)
                close()
            }
        }
        .build()
        return _microphoneSolid!!
    }

private var _microphoneSolid: ImageVector? = null
