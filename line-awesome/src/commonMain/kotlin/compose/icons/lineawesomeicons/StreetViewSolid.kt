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

public val LineAwesomeIcons.StreetViewSolid: ImageVector
    get() {
        if (_streetViewSolid != null) {
            return _streetViewSolid!!
        }
        _streetViewSolid = Builder(name = "StreetViewSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.8008f, 4.0f, 12.0f, 5.8008f, 12.0f, 8.0f)
                curveTo(12.0f, 9.1133f, 12.4766f, 10.1172f, 13.2188f, 10.8438f)
                curveTo(11.8867f, 11.7461f, 11.0f, 13.2813f, 11.0f, 15.0f)
                lineTo(11.0f, 19.625f)
                lineTo(13.0f, 20.625f)
                lineTo(13.0f, 25.0f)
                lineTo(19.0f, 25.0f)
                lineTo(19.0f, 20.625f)
                lineTo(21.0f, 19.625f)
                lineTo(21.0f, 15.0f)
                curveTo(21.0f, 13.2813f, 20.1133f, 11.7461f, 18.7813f, 10.8438f)
                curveTo(19.5234f, 10.1172f, 20.0f, 9.1133f, 20.0f, 8.0f)
                curveTo(20.0f, 5.8008f, 18.1992f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.1172f, 6.0f, 18.0f, 6.8828f, 18.0f, 8.0f)
                curveTo(18.0f, 9.1172f, 17.1172f, 10.0f, 16.0f, 10.0f)
                curveTo(14.8828f, 10.0f, 14.0f, 9.1172f, 14.0f, 8.0f)
                curveTo(14.0f, 6.8828f, 14.8828f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(17.668f, 12.0f, 19.0f, 13.332f, 19.0f, 15.0f)
                lineTo(19.0f, 18.375f)
                lineTo(17.0f, 19.375f)
                lineTo(17.0f, 23.0f)
                lineTo(15.0f, 23.0f)
                lineTo(15.0f, 19.375f)
                lineTo(13.0f, 18.375f)
                lineTo(13.0f, 15.0f)
                curveTo(13.0f, 13.332f, 14.332f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(9.0f, 18.875f)
                curveTo(6.082f, 19.6914f, 4.0f, 21.0742f, 4.0f, 23.0f)
                curveTo(4.0f, 26.2813f, 10.0352f, 28.0f, 16.0f, 28.0f)
                curveTo(21.9648f, 28.0f, 28.0f, 26.2813f, 28.0f, 23.0f)
                curveTo(28.0f, 21.0742f, 25.918f, 19.6914f, 23.0f, 18.875f)
                lineTo(23.0f, 20.9688f)
                curveTo(24.9023f, 21.582f, 26.0f, 22.375f, 26.0f, 23.0f)
                curveTo(26.0f, 24.1953f, 22.0117f, 26.0f, 16.0f, 26.0f)
                curveTo(9.9883f, 26.0f, 6.0f, 24.1953f, 6.0f, 23.0f)
                curveTo(6.0f, 22.375f, 7.0977f, 21.582f, 9.0f, 20.9688f)
                close()
            }
        }
        .build()
        return _streetViewSolid!!
    }

private var _streetViewSolid: ImageVector? = null
