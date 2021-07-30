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

public val LineAwesomeIcons.ClinicMedicalSolid: ImageVector
    get() {
        if (_clinicMedicalSolid != null) {
            return _clinicMedicalSolid!!
        }
        _clinicMedicalSolid = Builder(name = "ClinicMedicalSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.9063f)
                lineTo(3.625f, 10.0625f)
                lineTo(3.0f, 10.3438f)
                lineTo(3.0f, 27.0f)
                lineTo(29.0f, 27.0f)
                lineTo(29.0f, 10.3438f)
                lineTo(28.375f, 10.0625f)
                close()
                moveTo(16.0f, 7.0938f)
                lineTo(27.0f, 11.6875f)
                lineTo(27.0f, 25.0f)
                lineTo(5.0f, 25.0f)
                lineTo(5.0f, 11.6875f)
                close()
                moveTo(15.0f, 13.0f)
                lineTo(15.0f, 16.0f)
                lineTo(12.0f, 16.0f)
                lineTo(12.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(15.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 18.0f)
                lineTo(20.0f, 18.0f)
                lineTo(20.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 13.0f)
                close()
            }
        }
        .build()
        return _clinicMedicalSolid!!
    }

private var _clinicMedicalSolid: ImageVector? = null
