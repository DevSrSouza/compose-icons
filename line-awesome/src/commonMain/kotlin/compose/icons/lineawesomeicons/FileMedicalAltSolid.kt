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
                lineTo(7.3672f, 14.0f)
                lineTo(8.0f, 12.4199f)
                lineTo(8.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 21.2461f)
                lineTo(7.9473f, 21.1934f)
                lineTo(6.7559f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 9.5938f)
                lineTo(25.7188f, 9.2813f)
                lineTo(19.7188f, 3.2813f)
                lineTo(19.4063f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(20.0f, 6.4375f)
                lineTo(22.5625f, 9.0f)
                lineTo(20.0f, 9.0f)
                lineTo(20.0f, 6.4375f)
                close()
                moveTo(10.9688f, 10.3867f)
                lineTo(8.6328f, 16.2188f)
                lineTo(8.4141f, 16.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 18.0f)
                lineTo(7.5859f, 18.0f)
                lineTo(9.3633f, 19.7813f)
                lineTo(11.0313f, 15.6133f)
                lineTo(14.0313f, 22.6133f)
                lineTo(16.1016f, 17.4375f)
                lineTo(16.3828f, 18.0f)
                lineTo(18.2695f, 18.0f)
                curveTo(18.6285f, 18.617f, 19.286f, 19.0f, 20.0f, 19.0f)
                curveTo(21.105f, 19.0f, 22.0f, 18.105f, 22.0f, 17.0f)
                curveTo(22.0f, 15.895f, 21.105f, 15.0f, 20.0f, 15.0f)
                curveTo(19.285f, 15.0f, 18.6245f, 15.383f, 18.2695f, 16.0f)
                lineTo(17.6172f, 16.0f)
                lineTo(15.8984f, 12.5625f)
                lineTo(13.9688f, 17.3867f)
                lineTo(10.9688f, 10.3867f)
                close()
            }
        }
        .build()
        return _fileMedicalAltSolid!!
    }

private var _fileMedicalAltSolid: ImageVector? = null
