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

public val LineAwesomeIcons.GrinHeartsSolid: ImageVector
    get() {
        if (_grinHeartsSolid != null) {
            return _grinHeartsSolid!!
        }
        _grinHeartsSolid = Builder(name = "GrinHeartsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(10.5f, 11.0f)
                curveTo(9.6719f, 11.0f, 9.0f, 11.6719f, 9.0f, 12.5f)
                curveTo(9.0f, 12.5938f, 9.0078f, 12.6836f, 9.0313f, 12.7813f)
                curveTo(9.0742f, 13.0195f, 9.1719f, 13.2227f, 9.3125f, 13.4063f)
                curveTo(10.0625f, 14.6992f, 12.0f, 16.0f, 12.0f, 16.0f)
                curveTo(12.0f, 16.0f, 15.0f, 14.0938f, 15.0f, 12.5f)
                curveTo(15.0f, 11.6719f, 14.3281f, 11.0f, 13.5f, 11.0f)
                curveTo(12.6719f, 11.0f, 12.0f, 11.6719f, 12.0f, 12.5f)
                curveTo(12.0f, 11.6719f, 11.3281f, 11.0f, 10.5f, 11.0f)
                close()
                moveTo(18.5f, 11.0f)
                curveTo(17.6719f, 11.0f, 17.0f, 11.6719f, 17.0f, 12.5f)
                curveTo(17.0f, 12.5938f, 17.0078f, 12.6836f, 17.0313f, 12.7813f)
                curveTo(17.0742f, 13.0195f, 17.1719f, 13.2227f, 17.3125f, 13.4063f)
                curveTo(18.0625f, 14.6992f, 20.0f, 16.0f, 20.0f, 16.0f)
                curveTo(20.0f, 16.0f, 21.9883f, 14.7109f, 22.7188f, 13.375f)
                curveTo(22.8789f, 13.0781f, 23.0f, 12.7891f, 23.0f, 12.5f)
                curveTo(23.0f, 11.6719f, 22.3281f, 11.0f, 21.5f, 11.0f)
                curveTo(20.6719f, 11.0f, 20.0f, 11.6719f, 20.0f, 12.5f)
                curveTo(20.0f, 11.6719f, 19.3281f, 11.0f, 18.5f, 11.0f)
                close()
                moveTo(10.8125f, 19.0f)
                lineTo(9.0938f, 20.0f)
                curveTo(10.4766f, 22.3867f, 13.0469f, 24.0f, 16.0f, 24.0f)
                curveTo(18.9531f, 24.0f, 21.5234f, 22.3867f, 22.9063f, 20.0f)
                lineTo(21.1875f, 19.0f)
                curveTo(20.1484f, 20.793f, 18.2266f, 22.0f, 16.0f, 22.0f)
                curveTo(13.7734f, 22.0f, 11.8516f, 20.793f, 10.8125f, 19.0f)
                close()
            }
        }
        .build()
        return _grinHeartsSolid!!
    }

private var _grinHeartsSolid: ImageVector? = null
