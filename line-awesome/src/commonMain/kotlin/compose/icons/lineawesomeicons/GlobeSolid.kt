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

public val LineAwesomeIcons.GlobeSolid: ImageVector
    get() {
        if (_globeSolid != null) {
            return _globeSolid!!
        }
        _globeSolid = Builder(name = "GlobeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                curveTo(17.9688f, 6.0f, 19.7969f, 6.5859f, 21.3438f, 7.5625f)
                lineTo(20.5313f, 7.6563f)
                lineTo(20.7188f, 9.6563f)
                lineTo(19.6563f, 9.1875f)
                lineTo(18.7813f, 9.9375f)
                lineTo(18.9375f, 12.0f)
                lineTo(21.0938f, 11.3125f)
                lineTo(23.7813f, 12.1875f)
                lineTo(23.0938f, 13.4375f)
                lineTo(21.4688f, 12.4375f)
                lineTo(19.7188f, 12.6875f)
                lineTo(18.0f, 13.9688f)
                lineTo(17.0313f, 16.9688f)
                lineTo(18.9688f, 18.5625f)
                curveTo(18.9688f, 18.5625f, 20.957f, 18.2188f, 21.0625f, 18.2188f)
                curveTo(21.168f, 18.2188f, 21.9063f, 20.0313f, 21.9063f, 20.0313f)
                lineTo(20.3125f, 25.0313f)
                curveTo(19.0117f, 25.6523f, 17.543f, 26.0f, 16.0f, 26.0f)
                curveTo(15.6836f, 26.0f, 15.3711f, 25.9648f, 15.0625f, 25.9375f)
                lineTo(13.9688f, 24.0313f)
                lineTo(15.0313f, 20.0313f)
                lineTo(11.0f, 17.0f)
                lineTo(7.2813f, 17.0f)
                lineTo(6.3125f, 15.0313f)
                lineTo(9.0f, 12.9063f)
                lineTo(13.0f, 11.0f)
                lineTo(12.4063f, 8.3438f)
                lineTo(14.125f, 7.9688f)
                lineTo(14.9375f, 9.0938f)
                lineTo(17.9375f, 8.5313f)
                lineTo(17.4063f, 6.2188f)
                lineTo(15.1875f, 6.0625f)
                curveTo(15.4531f, 6.043f, 15.7266f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(14.875f, 6.0625f)
                lineTo(13.3125f, 6.7188f)
                lineTo(12.5625f, 6.5938f)
                curveTo(13.3008f, 6.3242f, 14.0664f, 6.1523f, 14.875f, 6.0625f)
                close()
                moveTo(6.0625f, 16.7813f)
                lineTo(7.0313f, 17.9063f)
                lineTo(7.0313f, 19.9688f)
                lineTo(8.9063f, 22.0313f)
                lineTo(10.0625f, 22.0313f)
                lineTo(12.9063f, 25.5313f)
                curveTo(9.1328f, 24.3086f, 6.3789f, 20.8906f, 6.0625f, 16.7813f)
                close()
            }
        }
        .build()
        return _globeSolid!!
    }

private var _globeSolid: ImageVector? = null
