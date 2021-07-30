package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Voicemail: ImageVector
    get() {
        if (_voicemail != null) {
            return _voicemail!!
        }
        _voicemail = Builder(name = "Voicemail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0004f, 15.0f)
                curveTo(10.6281f, 14.1643f, 11.0f, 13.1256f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2386f, 8.7614f, 7.0f, 6.0f, 7.0f)
                curveTo(3.2386f, 7.0f, 1.0f, 9.2386f, 1.0f, 12.0f)
                curveTo(1.0f, 14.7614f, 3.2386f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(20.7614f, 17.0f, 23.0f, 14.7614f, 23.0f, 12.0f)
                curveTo(23.0f, 9.2386f, 20.7614f, 7.0f, 18.0f, 7.0f)
                curveTo(15.2386f, 7.0f, 13.0f, 9.2386f, 13.0f, 12.0f)
                curveTo(13.0f, 13.1256f, 13.3719f, 14.1643f, 13.9996f, 15.0f)
                horizontalLineTo(10.0004f)
                close()
                moveTo(6.0f, 15.0f)
                curveTo(7.6568f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 7.6568f, 9.0f, 6.0f, 9.0f)
                curveTo(4.3432f, 9.0f, 3.0f, 10.3431f, 3.0f, 12.0f)
                curveTo(3.0f, 13.6569f, 4.3432f, 15.0f, 6.0f, 15.0f)
                close()
                moveTo(18.0f, 15.0f)
                curveTo(19.6569f, 15.0f, 21.0f, 13.6569f, 21.0f, 12.0f)
                curveTo(21.0f, 10.3431f, 19.6569f, 9.0f, 18.0f, 9.0f)
                curveTo(16.3431f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 13.6569f, 16.3431f, 15.0f, 18.0f, 15.0f)
                close()
            }
        }
        .build()
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
