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

public val LineAwesomeIcons.PrescriptionBottleSolid: ImageVector
    get() {
        if (_prescriptionBottleSolid != null) {
            return _prescriptionBottleSolid!!
        }
        _prescriptionBottleSolid = Builder(name = "PrescriptionBottleSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.928f, 3.0f)
                curveTo(8.975f, 3.0f, 8.117f, 3.531f, 7.691f, 4.383f)
                lineTo(7.383f, 5.0f)
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
                lineTo(24.617f, 5.0f)
                lineTo(24.309f, 4.383f)
                curveTo(23.884f, 3.531f, 23.026f, 3.0f, 22.072f, 3.0f)
                lineTo(9.928f, 3.0f)
                close()
                moveTo(9.928f, 5.0f)
                lineTo(22.072f, 5.0f)
                curveTo(22.263f, 5.0f, 22.435f, 5.105f, 22.52f, 5.275f)
                lineTo(23.383f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 7.0f)
                lineTo(8.617f, 7.0f)
                lineTo(9.48f, 5.275f)
                curveTo(9.565f, 5.105f, 9.737f, 5.0f, 9.928f, 5.0f)
                close()
                moveTo(8.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                lineTo(14.0f, 22.0f)
                lineTo(8.0f, 22.0f)
                lineTo(8.0f, 20.0f)
                lineTo(14.0f, 20.0f)
                lineTo(14.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                lineTo(8.0f, 16.0f)
                lineTo(14.0f, 16.0f)
                lineTo(14.0f, 14.0f)
                lineTo(8.0f, 14.0f)
                lineTo(8.0f, 11.0f)
                close()
            }
        }
        .build()
        return _prescriptionBottleSolid!!
    }

private var _prescriptionBottleSolid: ImageVector? = null
