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

public val LineAwesomeIcons.CcAmex: ImageVector
    get() {
        if (_ccAmex != null) {
            return _ccAmex!!
        }
        _ccAmex = Builder(name = "CcAmex", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.3555f, 6.0f, 2.0f, 7.3555f, 2.0f, 9.0f)
                lineTo(2.0f, 23.0f)
                curveTo(2.0f, 24.6445f, 3.3555f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.6445f, 26.0f, 30.0f, 24.6445f, 30.0f, 23.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.3555f, 28.6445f, 6.0f, 27.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.5664f, 8.0f, 28.0f, 8.4336f, 28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                curveTo(28.0f, 23.5664f, 27.5664f, 24.0f, 27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveTo(4.4336f, 24.0f, 4.0f, 23.5664f, 4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.4336f, 4.4336f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(7.0625f, 13.25f)
                lineTo(5.0f, 18.75f)
                lineTo(6.25f, 18.75f)
                lineTo(6.6563f, 17.5f)
                lineTo(9.0f, 17.5f)
                lineTo(9.4063f, 18.75f)
                lineTo(11.75f, 18.75f)
                lineTo(11.75f, 14.625f)
                lineTo(13.25f, 18.75f)
                lineTo(14.3438f, 18.75f)
                lineTo(15.875f, 14.75f)
                lineTo(15.875f, 18.75f)
                lineTo(16.9688f, 18.75f)
                lineTo(16.9688f, 13.25f)
                lineTo(15.1875f, 13.25f)
                lineTo(13.8125f, 16.9688f)
                lineTo(12.4375f, 13.25f)
                lineTo(10.5f, 13.25f)
                lineTo(10.5f, 18.4688f)
                lineTo(8.5625f, 13.25f)
                close()
                moveTo(18.4688f, 13.25f)
                lineTo(18.4688f, 18.75f)
                lineTo(22.875f, 18.75f)
                lineTo(24.25f, 16.9688f)
                lineTo(25.625f, 18.75f)
                lineTo(27.0f, 18.75f)
                lineTo(24.9375f, 16.0f)
                lineTo(27.0f, 13.25f)
                lineTo(25.5f, 13.25f)
                lineTo(24.125f, 14.9063f)
                lineTo(23.0f, 13.25f)
                close()
                moveTo(7.75f, 14.3438f)
                lineTo(8.4375f, 16.2813f)
                lineTo(7.0625f, 16.2813f)
                close()
                moveTo(19.5625f, 14.5f)
                lineTo(22.3125f, 14.5f)
                lineTo(23.4375f, 16.0f)
                lineTo(22.1875f, 17.6563f)
                lineTo(19.5625f, 17.6563f)
                lineTo(19.5625f, 16.5625f)
                lineTo(22.0625f, 16.5625f)
                lineTo(22.0625f, 15.4375f)
                lineTo(19.5625f, 15.4375f)
                close()
            }
        }
        .build()
        return _ccAmex!!
    }

private var _ccAmex: ImageVector? = null
