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
                curveTo(11.0f, 12.351f, 10.94f, 12.687f, 10.829f, 13.0f)
                horizontalLineTo(13.171f)
                curveTo(13.06f, 12.687f, 13.0f, 12.351f, 13.0f, 12.0f)
                curveTo(13.0f, 10.343f, 14.343f, 9.0f, 16.0f, 9.0f)
                curveTo(17.657f, 9.0f, 19.0f, 10.343f, 19.0f, 12.0f)
                curveTo(19.0f, 13.657f, 17.657f, 15.0f, 16.0f, 15.0f)
                horizontalLineTo(8.0f)
                curveTo(6.343f, 15.0f, 5.0f, 13.657f, 5.0f, 12.0f)
                curveTo(5.0f, 10.343f, 6.343f, 9.0f, 8.0f, 9.0f)
                curveTo(9.657f, 9.0f, 11.0f, 10.343f, 11.0f, 12.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 12.552f, 8.552f, 13.0f, 8.0f, 13.0f)
                curveTo(7.448f, 13.0f, 7.0f, 12.552f, 7.0f, 12.0f)
                curveTo(7.0f, 11.448f, 7.448f, 11.0f, 8.0f, 11.0f)
                curveTo(8.552f, 11.0f, 9.0f, 11.448f, 9.0f, 12.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.552f, 16.552f, 13.0f, 16.0f, 13.0f)
                curveTo(15.448f, 13.0f, 15.0f, 12.552f, 15.0f, 12.0f)
                curveTo(15.0f, 11.448f, 15.448f, 11.0f, 16.0f, 11.0f)
                curveTo(16.552f, 11.0f, 17.0f, 11.448f, 17.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 12.0f)
                curveTo(23.0f, 18.075f, 18.075f, 23.0f, 12.0f, 23.0f)
                curveTo(5.925f, 23.0f, 1.0f, 18.075f, 1.0f, 12.0f)
                curveTo(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f)
                curveTo(18.075f, 1.0f, 23.0f, 5.925f, 23.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _voicemailO!!
    }

private var _voicemailO: ImageVector? = null
