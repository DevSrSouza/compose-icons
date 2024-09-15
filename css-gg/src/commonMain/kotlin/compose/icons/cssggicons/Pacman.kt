package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val CssGgIcons.Pacman: ImageVector
    get() {
        if (_pacman != null) {
            return _pacman!!
        }
        _pacman = Builder(name = "Pacman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.064f, 8.0f)
                curveTo(14.616f, 8.0f, 15.064f, 7.552f, 15.064f, 7.0f)
                curveTo(15.064f, 6.448f, 14.616f, 6.0f, 14.064f, 6.0f)
                curveTo(13.511f, 6.0f, 13.064f, 6.448f, 13.064f, 7.0f)
                curveTo(13.064f, 7.552f, 13.511f, 8.0f, 14.064f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 3.0f)
                curveTo(15.152f, 3.0f, 17.128f, 3.756f, 18.677f, 5.016f)
                lineTo(20.124f, 6.463f)
                lineTo(18.829f, 7.758f)
                lineTo(18.828f, 7.757f)
                lineTo(14.585f, 12.0f)
                lineTo(18.224f, 15.638f)
                lineTo(18.222f, 15.64f)
                lineTo(20.127f, 17.545f)
                lineTo(18.714f, 18.958f)
                lineTo(18.712f, 18.955f)
                curveTo(17.158f, 20.233f, 15.169f, 21.0f, 13.0f, 21.0f)
                curveTo(8.029f, 21.0f, 4.0f, 16.971f, 4.0f, 12.0f)
                curveTo(4.0f, 7.029f, 8.029f, 3.0f, 13.0f, 3.0f)
                close()
                moveTo(11.757f, 12.0f)
                lineTo(17.289f, 17.532f)
                curveTo(16.104f, 18.452f, 14.616f, 19.0f, 13.0f, 19.0f)
                curveTo(9.134f, 19.0f, 6.0f, 15.866f, 6.0f, 12.0f)
                curveTo(6.0f, 8.134f, 9.134f, 5.0f, 13.0f, 5.0f)
                curveTo(14.616f, 5.0f, 16.104f, 5.548f, 17.289f, 6.468f)
                lineTo(11.757f, 12.0f)
                close()
            }
        }
        .build()
        return _pacman!!
    }

private var _pacman: ImageVector? = null
