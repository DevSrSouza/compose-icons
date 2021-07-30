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

public val LineAwesomeIcons.IdCardSolid: ImageVector
    get() {
        if (_idCardSolid != null) {
            return _idCardSolid!!
        }
        _idCardSolid = Builder(name = "IdCardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(11.0f, 10.0f)
                curveTo(8.8008f, 10.0f, 7.0f, 11.8008f, 7.0f, 14.0f)
                curveTo(7.0f, 15.1133f, 7.4766f, 16.1172f, 8.2188f, 16.8438f)
                curveTo(6.8867f, 17.7461f, 6.0f, 19.2813f, 6.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                curveTo(8.0f, 19.332f, 9.332f, 18.0f, 11.0f, 18.0f)
                curveTo(12.668f, 18.0f, 14.0f, 19.332f, 14.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                curveTo(16.0f, 19.2813f, 15.1133f, 17.7461f, 13.7813f, 16.8438f)
                curveTo(14.5234f, 16.1172f, 15.0f, 15.1133f, 15.0f, 14.0f)
                curveTo(15.0f, 11.8008f, 13.1992f, 10.0f, 11.0f, 10.0f)
                close()
                moveTo(18.0f, 11.0f)
                lineTo(18.0f, 13.0f)
                lineTo(26.0f, 13.0f)
                lineTo(26.0f, 11.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(12.1172f, 12.0f, 13.0f, 12.8828f, 13.0f, 14.0f)
                curveTo(13.0f, 15.1172f, 12.1172f, 16.0f, 11.0f, 16.0f)
                curveTo(9.8828f, 16.0f, 9.0f, 15.1172f, 9.0f, 14.0f)
                curveTo(9.0f, 12.8828f, 9.8828f, 12.0f, 11.0f, 12.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(18.0f, 17.0f)
                lineTo(26.0f, 17.0f)
                lineTo(26.0f, 15.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(18.0f, 21.0f)
                lineTo(23.0f, 21.0f)
                lineTo(23.0f, 19.0f)
                close()
            }
        }
        .build()
        return _idCardSolid!!
    }

private var _idCardSolid: ImageVector? = null
