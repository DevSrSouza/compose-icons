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

public val LineAwesomeIcons.SyncAltSolid: ImageVector
    get() {
        if (_syncAltSolid != null) {
            return _syncAltSolid!!
        }
        _syncAltSolid = Builder(name = "SyncAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(10.8867f, 4.0f, 6.6172f, 7.1602f, 4.875f, 11.625f)
                lineTo(6.7188f, 12.375f)
                curveTo(8.1758f, 8.6406f, 11.7109f, 6.0f, 16.0f, 6.0f)
                curveTo(19.2422f, 6.0f, 22.1328f, 7.5898f, 23.9375f, 10.0f)
                lineTo(20.0f, 10.0f)
                lineTo(20.0f, 12.0f)
                lineTo(27.0f, 12.0f)
                lineTo(27.0f, 5.0f)
                lineTo(25.0f, 5.0f)
                lineTo(25.0f, 8.0938f)
                curveTo(22.8086f, 5.582f, 19.5703f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(25.2813f, 19.625f)
                curveTo(23.8242f, 23.3594f, 20.2891f, 26.0f, 16.0f, 26.0f)
                curveTo(12.7227f, 26.0f, 9.8438f, 24.3867f, 8.0313f, 22.0f)
                lineTo(12.0f, 22.0f)
                lineTo(12.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                lineTo(7.0f, 23.9063f)
                curveTo(9.1875f, 26.3867f, 12.3945f, 28.0f, 16.0f, 28.0f)
                curveTo(21.1133f, 28.0f, 25.3828f, 24.8398f, 27.125f, 20.375f)
                close()
            }
        }
        .build()
        return _syncAltSolid!!
    }

private var _syncAltSolid: ImageVector? = null
