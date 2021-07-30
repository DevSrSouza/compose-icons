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

public val LineAwesomeIcons.PencilAltSolid: ImageVector
    get() {
        if (_pencilAltSolid != null) {
            return _pencilAltSolid!!
        }
        _pencilAltSolid = Builder(name = "PencilAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.6875f, 4.0313f)
                curveTo(23.8516f, 4.0313f, 23.0391f, 4.3672f, 22.4063f, 5.0f)
                lineTo(22.3125f, 5.0938f)
                lineTo(21.6875f, 4.5f)
                lineTo(5.1875f, 21.0f)
                lineTo(5.125f, 21.3125f)
                lineTo(4.0313f, 26.8125f)
                lineTo(3.7188f, 28.2813f)
                lineTo(5.1875f, 27.9688f)
                lineTo(10.6875f, 26.875f)
                lineTo(11.0f, 26.8125f)
                lineTo(27.5f, 10.3125f)
                lineTo(26.9063f, 9.7188f)
                lineTo(26.9688f, 9.6563f)
                lineTo(27.0f, 9.5938f)
                curveTo(28.2656f, 8.3281f, 28.2656f, 6.2656f, 27.0f, 5.0f)
                curveTo(26.3672f, 4.3672f, 25.5234f, 4.0313f, 24.6875f, 4.0313f)
                close()
                moveTo(24.6875f, 6.0f)
                curveTo(25.0f, 6.0f, 25.3281f, 6.1406f, 25.5938f, 6.4063f)
                curveTo(26.1289f, 6.9414f, 26.1289f, 7.6523f, 25.5938f, 8.1875f)
                lineTo(25.5f, 8.2813f)
                lineTo(23.7188f, 6.5f)
                lineTo(23.8125f, 6.4063f)
                curveTo(24.0781f, 6.1406f, 24.375f, 6.0f, 24.6875f, 6.0f)
                close()
                moveTo(21.7188f, 7.3125f)
                lineTo(24.6875f, 10.2813f)
                lineTo(23.25f, 11.75f)
                lineTo(20.25f, 8.75f)
                close()
                moveTo(18.875f, 10.1875f)
                lineTo(21.8125f, 13.125f)
                lineTo(11.375f, 23.5938f)
                lineTo(10.9688f, 21.7813f)
                lineTo(10.8438f, 21.1563f)
                lineTo(10.2188f, 21.0313f)
                lineTo(8.4063f, 20.625f)
                close()
                moveTo(6.9688f, 22.3438f)
                lineTo(9.1563f, 22.8438f)
                lineTo(9.6563f, 25.0313f)
                lineTo(7.625f, 25.4375f)
                lineTo(6.5625f, 24.375f)
                close()
            }
        }
        .build()
        return _pencilAltSolid!!
    }

private var _pencilAltSolid: ImageVector? = null
