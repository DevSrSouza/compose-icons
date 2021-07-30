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

public val LineAwesomeIcons.TramSolid: ImageVector
    get() {
        if (_tramSolid != null) {
            return _tramSolid!!
        }
        _tramSolid = Builder(name = "TramSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 2.0f)
                lineTo(8.5625f, 3.0938f)
                lineTo(9.4375f, 4.9063f)
                lineTo(11.25f, 4.0f)
                lineTo(20.75f, 4.0f)
                lineTo(22.5625f, 4.9063f)
                lineTo(23.4375f, 3.0938f)
                lineTo(21.25f, 2.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(15.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                curveTo(8.6992f, 6.0f, 6.0f, 8.6992f, 6.0f, 12.0f)
                lineTo(6.0f, 24.0f)
                curveTo(6.0f, 25.6445f, 7.3555f, 27.0f, 9.0f, 27.0f)
                lineTo(7.0f, 29.0f)
                lineTo(9.3438f, 29.0f)
                lineTo(11.3438f, 27.0f)
                lineTo(20.6563f, 27.0f)
                lineTo(22.6563f, 29.0f)
                lineTo(25.0f, 29.0f)
                lineTo(23.0f, 27.0f)
                curveTo(24.6445f, 27.0f, 26.0f, 25.6445f, 26.0f, 24.0f)
                lineTo(26.0f, 12.0f)
                curveTo(26.0f, 8.6992f, 23.3008f, 6.0f, 20.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(12.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                curveTo(22.2188f, 8.0f, 24.0f, 9.7813f, 24.0f, 12.0f)
                lineTo(24.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 12.0f)
                curveTo(8.0f, 9.7813f, 9.7813f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(24.0f, 18.0f)
                lineTo(24.0f, 24.0f)
                curveTo(24.0f, 24.5664f, 23.5664f, 25.0f, 23.0f, 25.0f)
                lineTo(9.0f, 25.0f)
                curveTo(8.4336f, 25.0f, 8.0f, 24.5664f, 8.0f, 24.0f)
                close()
                moveTo(11.5f, 20.0f)
                curveTo(10.6719f, 20.0f, 10.0f, 20.6719f, 10.0f, 21.5f)
                curveTo(10.0f, 22.3281f, 10.6719f, 23.0f, 11.5f, 23.0f)
                curveTo(12.3281f, 23.0f, 13.0f, 22.3281f, 13.0f, 21.5f)
                curveTo(13.0f, 20.6719f, 12.3281f, 20.0f, 11.5f, 20.0f)
                close()
                moveTo(20.5f, 20.0f)
                curveTo(19.6719f, 20.0f, 19.0f, 20.6719f, 19.0f, 21.5f)
                curveTo(19.0f, 22.3281f, 19.6719f, 23.0f, 20.5f, 23.0f)
                curveTo(21.3281f, 23.0f, 22.0f, 22.3281f, 22.0f, 21.5f)
                curveTo(22.0f, 20.6719f, 21.3281f, 20.0f, 20.5f, 20.0f)
                close()
            }
        }
        .build()
        return _tramSolid!!
    }

private var _tramSolid: ImageVector? = null
