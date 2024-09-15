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

public val LineAwesomeIcons.PowerOffSolid: ImageVector
    get() {
        if (_powerOffSolid != null) {
            return _powerOffSolid!!
        }
        _powerOffSolid = Builder(name = "PowerOffSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(12.0f, 4.688f)
                curveTo(7.348f, 6.34f, 4.0f, 10.785f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 10.785f, 24.652f, 6.34f, 20.0f, 4.688f)
                lineTo(20.0f, 6.844f)
                curveTo(23.527f, 8.391f, 26.0f, 11.91f, 26.0f, 16.0f)
                curveTo(26.0f, 21.516f, 21.516f, 26.0f, 16.0f, 26.0f)
                curveTo(10.484f, 26.0f, 6.0f, 21.516f, 6.0f, 16.0f)
                curveTo(6.0f, 11.91f, 8.473f, 8.391f, 12.0f, 6.844f)
                close()
            }
        }
        .build()
        return _powerOffSolid!!
    }

private var _powerOffSolid: ImageVector? = null
