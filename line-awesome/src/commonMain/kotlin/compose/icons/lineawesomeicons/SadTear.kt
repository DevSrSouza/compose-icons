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

public val LineAwesomeIcons.SadTear: ImageVector
    get() {
        if (_sadTear != null) {
            return _sadTear!!
        }
        _sadTear = Builder(name = "SadTear", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.7617f, 10.0f, 9.8203f, 10.6914f, 9.1875f, 11.2813f)
                curveTo(8.5547f, 11.8711f, 8.1563f, 12.4375f, 8.1563f, 12.4375f)
                lineTo(9.8438f, 13.5625f)
                curveTo(9.8438f, 13.5625f, 10.0898f, 13.1289f, 10.5313f, 12.7188f)
                curveTo(10.9727f, 12.3086f, 11.5469f, 12.0f, 12.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 10.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(17.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                curveTo(20.4531f, 12.0f, 21.0273f, 12.3086f, 21.4688f, 12.7188f)
                curveTo(21.9102f, 13.1289f, 22.1563f, 13.5625f, 22.1563f, 13.5625f)
                lineTo(23.8438f, 12.4375f)
                curveTo(23.8438f, 12.4375f, 23.4453f, 11.8711f, 22.8125f, 11.2813f)
                curveTo(22.1797f, 10.6914f, 21.2383f, 10.0f, 20.0f, 10.0f)
                close()
                moveTo(8.5f, 14.0f)
                curveTo(8.5f, 14.0f, 7.0f, 16.6719f, 7.0f, 17.5f)
                curveTo(7.0f, 18.3281f, 7.6719f, 19.0f, 8.5f, 19.0f)
                curveTo(9.3281f, 19.0f, 10.0f, 18.3281f, 10.0f, 17.5f)
                curveTo(10.0f, 16.6719f, 8.5f, 14.0f, 8.5f, 14.0f)
                close()
                moveTo(16.0f, 16.0f)
                curveTo(13.6641f, 16.0f, 12.0664f, 17.2344f, 11.1875f, 18.4063f)
                curveTo(10.3086f, 19.5781f, 10.0313f, 20.75f, 10.0313f, 20.75f)
                lineTo(9.7188f, 22.0f)
                lineTo(22.2813f, 22.0f)
                lineTo(21.9688f, 20.75f)
                curveTo(21.9688f, 20.75f, 21.6914f, 19.5781f, 20.8125f, 18.4063f)
                curveTo(19.9336f, 17.2344f, 18.3359f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(17.6719f, 18.0f, 18.5664f, 18.7656f, 19.1875f, 19.5938f)
                curveTo(19.3398f, 19.8008f, 19.3008f, 19.8086f, 19.4063f, 20.0f)
                lineTo(12.5938f, 20.0f)
                curveTo(12.6992f, 19.8086f, 12.6602f, 19.8008f, 12.8125f, 19.5938f)
                curveTo(13.4336f, 18.7656f, 14.3281f, 18.0f, 16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _sadTear!!
    }

private var _sadTear: ImageVector? = null
