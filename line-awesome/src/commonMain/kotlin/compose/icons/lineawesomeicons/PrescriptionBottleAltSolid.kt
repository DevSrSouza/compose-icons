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

public val LineAwesomeIcons.PrescriptionBottleAltSolid: ImageVector
    get() {
        if (_prescriptionBottleAltSolid != null) {
            return _prescriptionBottleAltSolid!!
        }
        _prescriptionBottleAltSolid = Builder(name = "PrescriptionBottleAltSolid", defaultWidth =
                32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight =
                32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9277f, 3.0f)
                curveTo(8.9747f, 3.0f, 8.1174f, 3.5308f, 7.6914f, 4.3828f)
                lineTo(7.3828f, 5.0f)
                lineTo(7.0f, 5.0f)
                curveTo(5.897f, 5.0f, 5.0f, 5.897f, 5.0f, 7.0f)
                lineTo(5.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 27.0f)
                curveTo(6.0f, 28.103f, 6.897f, 29.0f, 8.0f, 29.0f)
                lineTo(24.0f, 29.0f)
                curveTo(25.103f, 29.0f, 26.0f, 28.103f, 26.0f, 27.0f)
                lineTo(26.0f, 11.0f)
                lineTo(27.0f, 11.0f)
                lineTo(27.0f, 7.0f)
                curveTo(27.0f, 5.897f, 26.103f, 5.0f, 25.0f, 5.0f)
                lineTo(24.6172f, 5.0f)
                lineTo(24.3086f, 4.3828f)
                curveTo(23.8836f, 3.5308f, 23.0263f, 3.0f, 22.0723f, 3.0f)
                lineTo(9.9277f, 3.0f)
                close()
                moveTo(9.9277f, 5.0f)
                lineTo(22.0723f, 5.0f)
                curveTo(22.2633f, 5.0f, 22.4345f, 5.1054f, 22.5195f, 5.2754f)
                lineTo(23.3828f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 7.0f)
                lineTo(8.6172f, 7.0f)
                lineTo(9.4805f, 5.2754f)
                curveTo(9.5655f, 5.1054f, 9.7367f, 5.0f, 9.9277f, 5.0f)
                close()
                moveTo(8.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(15.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                lineTo(11.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                lineTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 20.0f)
                lineTo(21.0f, 20.0f)
                lineTo(21.0f, 18.0f)
                lineTo(17.0f, 18.0f)
                lineTo(17.0f, 14.0f)
                lineTo(15.0f, 14.0f)
                close()
            }
        }
        .build()
        return _prescriptionBottleAltSolid!!
    }

private var _prescriptionBottleAltSolid: ImageVector? = null
