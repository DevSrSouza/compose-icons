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

public val LineAwesomeIcons.VoicemailSolid: ImageVector
    get() {
        if (_voicemailSolid != null) {
            return _voicemailSolid!!
        }
        _voicemailSolid = Builder(name = "VoicemailSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.0f)
                curveTo(4.1445f, 9.0f, 1.0f, 12.1445f, 1.0f, 16.0f)
                curveTo(1.0f, 19.8555f, 4.1445f, 23.0f, 8.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                curveTo(27.8555f, 23.0f, 31.0f, 19.8555f, 31.0f, 16.0f)
                curveTo(31.0f, 12.1445f, 27.8555f, 9.0f, 24.0f, 9.0f)
                curveTo(20.1445f, 9.0f, 17.0f, 12.1445f, 17.0f, 16.0f)
                curveTo(17.0f, 17.957f, 17.8203f, 19.7266f, 19.125f, 21.0f)
                lineTo(12.875f, 21.0f)
                curveTo(14.1797f, 19.7266f, 15.0f, 17.957f, 15.0f, 16.0f)
                curveTo(15.0f, 12.1445f, 11.8555f, 9.0f, 8.0f, 9.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(10.7734f, 11.0f, 13.0f, 13.2266f, 13.0f, 16.0f)
                curveTo(13.0f, 18.7734f, 10.7734f, 21.0f, 8.0f, 21.0f)
                curveTo(5.2266f, 21.0f, 3.0f, 18.7734f, 3.0f, 16.0f)
                curveTo(3.0f, 13.2266f, 5.2266f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(24.0f, 11.0f)
                curveTo(26.7734f, 11.0f, 29.0f, 13.2266f, 29.0f, 16.0f)
                curveTo(29.0f, 18.7734f, 26.7734f, 21.0f, 24.0f, 21.0f)
                curveTo(21.2266f, 21.0f, 19.0f, 18.7734f, 19.0f, 16.0f)
                curveTo(19.0f, 13.2266f, 21.2266f, 11.0f, 24.0f, 11.0f)
                close()
            }
        }
        .build()
        return _voicemailSolid!!
    }

private var _voicemailSolid: ImageVector? = null
