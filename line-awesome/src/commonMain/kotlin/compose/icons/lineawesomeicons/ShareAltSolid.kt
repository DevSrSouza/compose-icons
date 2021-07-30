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

public val LineAwesomeIcons.ShareAltSolid: ImageVector
    get() {
        if (_shareAltSolid != null) {
            return _shareAltSolid!!
        }
        _shareAltSolid = Builder(name = "ShareAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.8555f, 4.0f, 12.1172f, 5.7188f, 12.0313f, 7.8438f)
                curveTo(8.4258f, 9.375f, 6.0f, 12.9414f, 6.0f, 17.0f)
                curveTo(6.0f, 17.1719f, 5.9922f, 17.3594f, 6.0f, 17.5625f)
                curveTo(4.8164f, 18.2578f, 4.0f, 19.5352f, 4.0f, 21.0f)
                curveTo(4.0f, 23.1992f, 5.8008f, 25.0f, 8.0f, 25.0f)
                curveTo(8.5742f, 25.0f, 9.1289f, 24.8789f, 9.625f, 24.6563f)
                curveTo(11.3594f, 26.1133f, 13.6172f, 27.0f, 16.0f, 27.0f)
                curveTo(18.3828f, 27.0f, 20.6406f, 26.1133f, 22.375f, 24.6563f)
                curveTo(22.8711f, 24.8789f, 23.4258f, 25.0f, 24.0f, 25.0f)
                curveTo(26.1992f, 25.0f, 28.0f, 23.1992f, 28.0f, 21.0f)
                curveTo(28.0f, 19.5195f, 27.1758f, 18.2227f, 25.9688f, 17.5313f)
                curveTo(25.9844f, 17.3711f, 26.0f, 17.207f, 26.0f, 17.0f)
                curveTo(26.0f, 12.9414f, 23.5742f, 9.375f, 19.9688f, 7.8438f)
                curveTo(19.8828f, 5.7188f, 18.1445f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.1172f, 6.0f, 18.0f, 6.8828f, 18.0f, 8.0f)
                curveTo(18.0f, 9.1172f, 17.1172f, 10.0f, 16.0f, 10.0f)
                curveTo(14.8828f, 10.0f, 14.0f, 9.1172f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8828f, 14.8828f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(12.4688f, 9.8438f)
                curveTo(13.1406f, 11.1172f, 14.4688f, 12.0f, 16.0f, 12.0f)
                curveTo(17.5313f, 12.0f, 18.8594f, 11.1172f, 19.5313f, 9.8438f)
                curveTo(22.2109f, 11.1445f, 24.0f, 13.8789f, 24.0f, 17.0f)
                curveTo(21.8008f, 17.0f, 20.0f, 18.8008f, 20.0f, 21.0f)
                curveTo(20.0f, 21.8945f, 20.3086f, 22.707f, 20.8125f, 23.375f)
                curveTo(19.4766f, 24.3867f, 17.7578f, 25.0f, 16.0f, 25.0f)
                curveTo(14.2422f, 25.0f, 12.5234f, 24.3867f, 11.1875f, 23.375f)
                curveTo(11.6914f, 22.707f, 12.0f, 21.8945f, 12.0f, 21.0f)
                curveTo(12.0f, 18.8008f, 10.1992f, 17.0f, 8.0f, 17.0f)
                curveTo(8.0f, 13.8789f, 9.7891f, 11.1445f, 12.4688f, 9.8438f)
                close()
                moveTo(8.0f, 19.0f)
                curveTo(9.1172f, 19.0f, 10.0f, 19.8828f, 10.0f, 21.0f)
                curveTo(10.0f, 22.1172f, 9.1172f, 23.0f, 8.0f, 23.0f)
                curveTo(6.8828f, 23.0f, 6.0f, 22.1172f, 6.0f, 21.0f)
                curveTo(6.0f, 19.8828f, 6.8828f, 19.0f, 8.0f, 19.0f)
                close()
                moveTo(24.0f, 19.0f)
                curveTo(25.1172f, 19.0f, 26.0f, 19.8828f, 26.0f, 21.0f)
                curveTo(26.0f, 22.1172f, 25.1172f, 23.0f, 24.0f, 23.0f)
                curveTo(22.8828f, 23.0f, 22.0f, 22.1172f, 22.0f, 21.0f)
                curveTo(22.0f, 19.8828f, 22.8828f, 19.0f, 24.0f, 19.0f)
                close()
            }
        }
        .build()
        return _shareAltSolid!!
    }

private var _shareAltSolid: ImageVector? = null
