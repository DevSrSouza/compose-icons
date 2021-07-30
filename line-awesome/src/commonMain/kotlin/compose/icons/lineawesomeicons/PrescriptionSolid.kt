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

public val LineAwesomeIcons.PrescriptionSolid: ImageVector
    get() {
        if (_prescriptionSolid != null) {
            return _prescriptionSolid!!
        }
        _prescriptionSolid = Builder(name = "PrescriptionSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 13.0f)
                lineTo(12.9941f, 13.0f)
                lineTo(17.7695f, 21.8281f)
                lineTo(13.1074f, 29.0f)
                lineTo(15.4922f, 29.0f)
                lineTo(19.3926f, 23.0f)
                lineTo(19.6074f, 23.0f)
                lineTo(23.5078f, 29.0f)
                lineTo(25.8926f, 29.0f)
                lineTo(21.2441f, 21.8516f)
                lineTo(25.2402f, 15.0f)
                lineTo(22.9258f, 15.0f)
                lineTo(19.5137f, 20.8496f)
                lineTo(15.0313f, 12.5605f)
                curveTo(16.777f, 11.7797f, 18.0f, 10.0328f, 18.0f, 8.0f)
                curveTo(18.0f, 5.243f, 15.757f, 3.0f, 13.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                curveTo(14.654f, 5.0f, 16.0f, 6.346f, 16.0f, 8.0f)
                curveTo(16.0f, 9.654f, 14.654f, 11.0f, 13.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 5.0f)
                close()
            }
        }
        .build()
        return _prescriptionSolid!!
    }

private var _prescriptionSolid: ImageVector? = null
