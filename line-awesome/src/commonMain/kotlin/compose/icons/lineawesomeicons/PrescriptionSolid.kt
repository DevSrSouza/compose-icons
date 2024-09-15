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
                lineTo(12.994f, 13.0f)
                lineTo(17.77f, 21.828f)
                lineTo(13.107f, 29.0f)
                lineTo(15.492f, 29.0f)
                lineTo(19.393f, 23.0f)
                lineTo(19.607f, 23.0f)
                lineTo(23.508f, 29.0f)
                lineTo(25.893f, 29.0f)
                lineTo(21.244f, 21.852f)
                lineTo(25.24f, 15.0f)
                lineTo(22.926f, 15.0f)
                lineTo(19.514f, 20.85f)
                lineTo(15.031f, 12.561f)
                curveTo(16.777f, 11.78f, 18.0f, 10.033f, 18.0f, 8.0f)
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
