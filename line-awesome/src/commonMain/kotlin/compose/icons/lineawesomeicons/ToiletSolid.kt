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

public val LineAwesomeIcons.ToiletSolid: ImageVector
    get() {
        if (_toiletSolid != null) {
            return _toiletSolid!!
        }
        _toiletSolid = Builder(name = "ToiletSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveTo(5.4766f, 4.0f, 4.9414f, 4.1836f, 4.5625f, 4.5625f)
                curveTo(4.1836f, 4.9414f, 4.0f, 5.4766f, 4.0f, 6.0f)
                lineTo(4.0f, 17.0f)
                curveTo(4.0f, 19.7891f, 5.6523f, 22.1172f, 8.0f, 23.5938f)
                lineTo(8.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 23.5938f)
                curveTo(25.3477f, 22.1172f, 27.0f, 19.7891f, 27.0f, 17.0f)
                lineTo(27.0f, 16.0f)
                lineTo(14.0f, 16.0f)
                lineTo(14.0f, 6.0f)
                curveTo(14.0f, 5.4766f, 13.8164f, 4.9414f, 13.4375f, 4.5625f)
                curveTo(13.0586f, 4.1836f, 12.5234f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                close()
                moveTo(8.0f, 8.0f)
                lineTo(8.0f, 11.0f)
                lineTo(10.0f, 11.0f)
                lineTo(10.0f, 8.0f)
                close()
                moveTo(6.3125f, 18.0f)
                lineTo(24.6875f, 18.0f)
                curveTo(24.332f, 19.7266f, 23.3203f, 21.25f, 21.5313f, 22.2188f)
                lineTo(21.0f, 22.5f)
                lineTo(21.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 22.5f)
                lineTo(9.4688f, 22.2188f)
                curveTo(7.6797f, 21.25f, 6.668f, 19.7266f, 6.3125f, 18.0f)
                close()
            }
        }
        .build()
        return _toiletSolid!!
    }

private var _toiletSolid: ImageVector? = null
