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

public val LineAwesomeIcons.CcDinersClub: ImageVector
    get() {
        if (_ccDinersClub != null) {
            return _ccDinersClub!!
        }
        _ccDinersClub = Builder(name = "CcDinersClub", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(15.0f, 10.0f)
                curveTo(11.6992f, 10.0f, 9.0f, 12.6992f, 9.0f, 16.0f)
                curveTo(9.0f, 19.3008f, 11.6992f, 22.0f, 15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                curveTo(20.3125f, 22.0f, 23.0f, 19.3125f, 23.0f, 16.0f)
                curveTo(23.0f, 12.6875f, 20.3125f, 10.0f, 17.0f, 10.0f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(17.2227f, 12.0f, 19.0f, 13.7773f, 19.0f, 16.0f)
                curveTo(19.0f, 18.2227f, 17.2227f, 20.0f, 15.0f, 20.0f)
                curveTo(12.7773f, 20.0f, 11.0f, 18.2227f, 11.0f, 16.0f)
                curveTo(11.0f, 13.7773f, 12.7773f, 12.0f, 15.0f, 12.0f)
                close()
                moveTo(14.1875f, 13.6563f)
                curveTo(13.2148f, 14.0f, 12.5f, 14.9102f, 12.5f, 16.0f)
                curveTo(12.5f, 17.0898f, 13.2148f, 18.0f, 14.1875f, 18.3438f)
                close()
                moveTo(15.8125f, 13.6563f)
                lineTo(15.8125f, 18.3438f)
                curveTo(16.7852f, 18.0f, 17.5f, 17.0898f, 17.5f, 16.0f)
                curveTo(17.5f, 14.9102f, 16.7852f, 14.0f, 15.8125f, 13.6563f)
                close()
            }
        }
        .build()
        return _ccDinersClub!!
    }

private var _ccDinersClub: ImageVector? = null
