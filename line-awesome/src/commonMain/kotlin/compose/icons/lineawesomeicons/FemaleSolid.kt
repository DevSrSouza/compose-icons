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

public val LineAwesomeIcons.FemaleSolid: ImageVector
    get() {
        if (_femaleSolid != null) {
            return _femaleSolid!!
        }
        _femaleSolid = Builder(name = "FemaleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(13.8008f, 2.0f, 12.0f, 3.8008f, 12.0f, 6.0f)
                curveTo(12.0f, 7.1289f, 12.4883f, 8.1445f, 13.25f, 8.875f)
                curveTo(13.0117f, 9.0469f, 12.793f, 9.2266f, 12.5938f, 9.4375f)
                curveTo(11.7539f, 10.3281f, 11.2305f, 11.5156f, 11.0f, 12.8125f)
                lineTo(11.0313f, 12.8125f)
                lineTo(9.0313f, 22.8125f)
                lineTo(8.7813f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 30.0f)
                lineTo(15.0f, 30.0f)
                lineTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 30.0f)
                lineTo(19.0f, 30.0f)
                lineTo(19.0f, 24.0f)
                lineTo(23.2188f, 24.0f)
                lineTo(22.9688f, 22.8125f)
                lineTo(20.9688f, 12.8125f)
                curveTo(20.7383f, 11.5781f, 20.2383f, 10.4023f, 19.4063f, 9.5f)
                curveTo(19.1992f, 9.2734f, 18.9688f, 9.0586f, 18.7188f, 8.875f)
                curveTo(19.4922f, 8.1445f, 20.0f, 7.1367f, 20.0f, 6.0f)
                curveTo(20.0f, 3.8008f, 18.1992f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(17.1172f, 4.0f, 18.0f, 4.8828f, 18.0f, 6.0f)
                curveTo(18.0f, 7.1172f, 17.1172f, 8.0f, 16.0f, 8.0f)
                curveTo(14.8828f, 8.0f, 14.0f, 7.1172f, 14.0f, 6.0f)
                curveTo(14.0f, 4.8828f, 14.8828f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(16.8281f, 10.0f, 17.4219f, 10.3164f, 17.9375f, 10.875f)
                curveTo(18.4531f, 11.4336f, 18.8594f, 12.2617f, 19.0313f, 13.1875f)
                lineTo(20.7813f, 22.0f)
                lineTo(11.2188f, 22.0f)
                lineTo(12.9688f, 13.1875f)
                lineTo(13.0f, 13.1875f)
                curveTo(13.1758f, 12.1875f, 13.5586f, 11.3477f, 14.0625f, 10.8125f)
                curveTo(14.5664f, 10.2773f, 15.1523f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _femaleSolid!!
    }

private var _femaleSolid: ImageVector? = null
