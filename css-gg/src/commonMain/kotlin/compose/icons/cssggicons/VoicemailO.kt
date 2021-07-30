package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.VoicemailO: ImageVector
    get() {
        if (_voicemailO != null) {
            return _voicemailO!!
        }
        _voicemailO = Builder(name = "VoicemailO", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 12.0f)
                curveTo(11.0f, 12.3506f, 10.9398f, 12.6872f, 10.8293f, 13.0f)
                horizontalLineTo(13.1707f)
                curveTo(13.0602f, 12.6872f, 13.0f, 12.3506f, 13.0f, 12.0f)
                curveTo(13.0f, 10.3431f, 14.3431f, 9.0f, 16.0f, 9.0f)
                curveTo(17.6569f, 9.0f, 19.0f, 10.3431f, 19.0f, 12.0f)
                curveTo(19.0f, 13.6569f, 17.6569f, 15.0f, 16.0f, 15.0f)
                horizontalLineTo(8.0f)
                curveTo(6.3432f, 15.0f, 5.0f, 13.6569f, 5.0f, 12.0f)
                curveTo(5.0f, 10.3431f, 6.3432f, 9.0f, 8.0f, 9.0f)
                curveTo(9.6568f, 9.0f, 11.0f, 10.3431f, 11.0f, 12.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 12.5523f, 8.5523f, 13.0f, 8.0f, 13.0f)
                curveTo(7.4477f, 13.0f, 7.0f, 12.5523f, 7.0f, 12.0f)
                curveTo(7.0f, 11.4477f, 7.4477f, 11.0f, 8.0f, 11.0f)
                curveTo(8.5523f, 11.0f, 9.0f, 11.4477f, 9.0f, 12.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.5523f, 16.5523f, 13.0f, 16.0f, 13.0f)
                curveTo(15.4477f, 13.0f, 15.0f, 12.5523f, 15.0f, 12.0f)
                curveTo(15.0f, 11.4477f, 15.4477f, 11.0f, 16.0f, 11.0f)
                curveTo(16.5523f, 11.0f, 17.0f, 11.4477f, 17.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 12.0f)
                curveTo(23.0f, 18.0751f, 18.0751f, 23.0f, 12.0f, 23.0f)
                curveTo(5.9249f, 23.0f, 1.0f, 18.0751f, 1.0f, 12.0f)
                curveTo(1.0f, 5.9249f, 5.9249f, 1.0f, 12.0f, 1.0f)
                curveTo(18.0751f, 1.0f, 23.0f, 5.9249f, 23.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _voicemailO!!
    }

private var _voicemailO: ImageVector? = null
