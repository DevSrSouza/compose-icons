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

public val LineAwesomeIcons.NotesMedicalSolid: ImageVector
    get() {
        if (_notesMedicalSolid != null) {
            return _notesMedicalSolid!!
        }
        _notesMedicalSolid = Builder(name = "NotesMedicalSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.742f, 3.0f, 13.848f, 3.891f, 13.406f, 5.0f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 5.0f)
                lineTo(18.594f, 5.0f)
                curveTo(18.152f, 3.891f, 17.258f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.555f, 5.0f, 17.0f, 5.445f, 17.0f, 6.0f)
                lineTo(17.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                lineTo(20.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 6.0f)
                curveTo(15.0f, 5.445f, 15.445f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                lineTo(10.0f, 11.0f)
                lineTo(22.0f, 11.0f)
                lineTo(22.0f, 7.0f)
                lineTo(24.0f, 7.0f)
                lineTo(24.0f, 26.0f)
                lineTo(8.0f, 26.0f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(15.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                lineTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                lineTo(20.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 14.0f)
                close()
            }
        }
        .build()
        return _notesMedicalSolid!!
    }

private var _notesMedicalSolid: ImageVector? = null
