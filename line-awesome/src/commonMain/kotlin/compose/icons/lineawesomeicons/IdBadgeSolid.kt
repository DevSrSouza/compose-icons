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

public val LineAwesomeIcons.IdBadgeSolid: ImageVector
    get() {
        if (_idBadgeSolid != null) {
            return _idBadgeSolid!!
        }
        _idBadgeSolid = Builder(name = "IdBadgeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveTo(13.9063f, 3.0f, 13.0f, 3.9063f, 13.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                lineTo(25.0f, 5.0f)
                lineTo(19.0f, 5.0f)
                curveTo(19.0f, 3.9063f, 18.0938f, 3.0f, 17.0f, 3.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                lineTo(13.0f, 9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 7.0f)
                lineTo(23.0f, 7.0f)
                lineTo(23.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(13.8008f, 11.0f, 12.0f, 12.8008f, 12.0f, 15.0f)
                curveTo(12.0f, 16.1133f, 12.4766f, 17.1172f, 13.2188f, 17.8438f)
                curveTo(11.8867f, 18.7461f, 11.0f, 20.2813f, 11.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                curveTo(13.0f, 20.332f, 14.332f, 19.0f, 16.0f, 19.0f)
                curveTo(17.668f, 19.0f, 19.0f, 20.332f, 19.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                curveTo(21.0f, 20.2813f, 20.1133f, 18.7461f, 18.7813f, 17.8438f)
                curveTo(19.5234f, 17.1172f, 20.0f, 16.1133f, 20.0f, 15.0f)
                curveTo(20.0f, 12.8008f, 18.1992f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(17.1172f, 13.0f, 18.0f, 13.8828f, 18.0f, 15.0f)
                curveTo(18.0f, 16.1172f, 17.1172f, 17.0f, 16.0f, 17.0f)
                curveTo(14.8828f, 17.0f, 14.0f, 16.1172f, 14.0f, 15.0f)
                curveTo(14.0f, 13.8828f, 14.8828f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _idBadgeSolid!!
    }

private var _idBadgeSolid: ImageVector? = null
