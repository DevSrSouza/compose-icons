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

public val LineAwesomeIcons.FileMedicalAltSolid: ImageVector
    get() {
        if (_fileMedicalAltSolid != null) {
            return _fileMedicalAltSolid!!
        }
        _fileMedicalAltSolid = Builder(name = "FileMedicalAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 14.0f)
                lineTo(7.367f, 14.0f)
                lineTo(8.0f, 12.42f)
                lineTo(8.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 21.246f)
                lineTo(7.947f, 21.193f)
                lineTo(6.756f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 9.594f)
                lineTo(25.719f, 9.281f)
                lineTo(19.719f, 3.281f)
                lineTo(19.406f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(20.0f, 6.438f)
                lineTo(22.563f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 6.438f)
                close()
                moveTo(10.969f, 10.387f)
                lineTo(8.633f, 16.219f)
                lineTo(8.414f, 16.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 18.0f)
                lineTo(7.586f, 18.0f)
                lineTo(9.363f, 19.781f)
                lineTo(11.031f, 15.613f)
                lineTo(14.031f, 22.613f)
                lineTo(16.102f, 17.438f)
                lineTo(16.383f, 18.0f)
                lineTo(18.27f, 18.0f)
                curveTo(18.629f, 18.617f, 19.286f, 19.0f, 20.0f, 19.0f)
                curveTo(21.105f, 19.0f, 22.0f, 18.105f, 22.0f, 17.0f)
                curveTo(22.0f, 15.895f, 21.105f, 15.0f, 20.0f, 15.0f)
                curveTo(19.285f, 15.0f, 18.625f, 15.383f, 18.27f, 16.0f)
                lineTo(17.617f, 16.0f)
                lineTo(15.898f, 12.563f)
                lineTo(13.969f, 17.387f)
                lineTo(10.969f, 10.387f)
                close()
            }
        }
        .build()
        return _fileMedicalAltSolid!!
    }

private var _fileMedicalAltSolid: ImageVector? = null
