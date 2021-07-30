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

public val LineAwesomeIcons.PrayingHandsSolid: ImageVector
    get() {
        if (_prayingHandsSolid != null) {
            return _prayingHandsSolid!!
        }
        _prayingHandsSolid = Builder(name = "PrayingHandsSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveTo(13.3555f, 3.0f, 12.0f, 4.3555f, 12.0f, 6.0f)
                lineTo(12.0156f, 5.8359f)
                lineTo(11.0313f, 11.7461f)
                lineTo(9.1406f, 16.918f)
                curveTo(9.1055f, 16.9648f, 9.0625f, 17.0f, 9.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 29.0f)
                lineTo(8.0f, 29.0f)
                lineTo(8.0f, 26.0f)
                lineTo(11.9258f, 26.0f)
                curveTo(13.5703f, 26.0f, 15.0508f, 25.2031f, 16.0f, 23.9648f)
                curveTo(16.9492f, 25.2031f, 18.4297f, 26.0f, 20.0742f, 26.0f)
                lineTo(24.0f, 26.0f)
                lineTo(24.0f, 29.0f)
                lineTo(29.0f, 29.0f)
                lineTo(29.0f, 16.0f)
                lineTo(24.0f, 16.0f)
                lineTo(24.0f, 17.0f)
                lineTo(23.0f, 17.0f)
                curveTo(22.9375f, 17.0f, 22.8945f, 16.9648f, 22.8594f, 16.918f)
                lineTo(20.9688f, 11.7461f)
                lineTo(19.9844f, 5.8359f)
                lineTo(20.0f, 6.0f)
                curveTo(20.0f, 4.3555f, 18.6445f, 3.0f, 17.0f, 3.0f)
                curveTo(16.6602f, 3.0f, 16.3125f, 3.0664f, 16.0f, 3.2266f)
                curveTo(15.6875f, 3.0664f, 15.3398f, 3.0f, 15.0f, 3.0f)
                close()
                moveTo(14.9648f, 5.0156f)
                curveTo(14.9844f, 5.1602f, 15.0f, 5.4883f, 15.0f, 6.0f)
                lineTo(15.0f, 21.4375f)
                curveTo(14.7227f, 22.9219f, 13.4453f, 24.0f, 11.9258f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                curveTo(9.7852f, 19.0f, 10.5156f, 18.5742f, 10.9023f, 17.8906f)
                lineTo(10.9414f, 17.8164f)
                lineTo(12.9688f, 12.2539f)
                lineTo(14.0f, 6.082f)
                lineTo(14.0f, 6.0f)
                curveTo(14.0f, 5.4492f, 14.4219f, 5.0352f, 14.9648f, 5.0156f)
                close()
                moveTo(17.0352f, 5.0156f)
                curveTo(17.5781f, 5.0352f, 18.0f, 5.4492f, 18.0f, 6.0f)
                lineTo(18.0f, 6.082f)
                lineTo(19.0313f, 12.2539f)
                lineTo(21.0586f, 17.8164f)
                lineTo(21.0977f, 17.8906f)
                curveTo(21.4844f, 18.5742f, 22.2148f, 19.0f, 23.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 24.0f)
                lineTo(20.0742f, 24.0f)
                curveTo(18.5547f, 24.0f, 17.2773f, 22.9219f, 17.0f, 21.4375f)
                lineTo(17.0f, 6.0f)
                curveTo(17.0f, 5.4883f, 17.0156f, 5.1602f, 17.0352f, 5.0156f)
                close()
                moveTo(5.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                lineTo(6.0f, 27.0f)
                lineTo(5.0f, 27.0f)
                close()
                moveTo(26.0f, 18.0f)
                lineTo(27.0f, 18.0f)
                lineTo(27.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                close()
            }
        }
        .build()
        return _prayingHandsSolid!!
    }

private var _prayingHandsSolid: ImageVector? = null
