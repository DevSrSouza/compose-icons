package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Poo: ImageVector
    get() {
        if (_poo != null) {
            return _poo!!
        }
        _poo = Builder(name = "Poo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.9f, 0.9f)
                curveToRelative(-5.5f, -0.7f, -11.0f, 1.4f, -14.5f, 5.7f)
                reflectiveCurveToRelative(-4.6f, 10.1f, -2.8f, 15.4f)
                curveToRelative(2.8f, 8.2f, 4.3f, 16.9f, 4.3f, 26.1f)
                curveToRelative(0.0f, 44.1f, -35.7f, 79.9f, -79.8f, 80.0f)
                lineTo(160.0f, 128.1f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                curveToRelative(0.0f, 19.1f, 8.4f, 36.3f, 21.7f, 48.0f)
                lineTo(104.0f, 240.1f)
                curveToRelative(-39.8f, 0.0f, -72.0f, 32.2f, -72.0f, 72.0f)
                curveToRelative(0.0f, 23.2f, 11.0f, 43.8f, 28.0f, 57.0f)
                curveToRelative(-34.1f, 5.7f, -60.0f, 35.3f, -60.0f, 71.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                lineTo(440.0f, 512.1f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                curveToRelative(0.0f, -35.7f, -25.9f, -65.3f, -60.0f, -71.0f)
                curveToRelative(17.0f, -13.2f, 28.0f, -33.8f, 28.0f, -57.0f)
                curveToRelative(0.0f, -39.8f, -32.2f, -72.0f, -72.0f, -72.0f)
                lineTo(394.3f, 240.1f)
                curveToRelative(13.3f, -11.7f, 21.7f, -28.9f, 21.7f, -48.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(3.5f, -10.0f, 5.5f, -20.8f, 5.5f, -32.0f)
                curveToRelative(0.0f, -48.6f, -36.2f, -88.8f, -83.1f, -95.1f)
                close()
                moveTo(192.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(288.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(352.0f, 396.3f)
                curveToRelative(0.0f, 2.4f, -0.7f, 4.8f, -2.2f, 6.7f)
                curveToRelative(-8.2f, 10.5f, -39.5f, 45.0f, -93.8f, 45.0f)
                reflectiveCurveToRelative(-85.6f, -34.6f, -93.8f, -45.0f)
                curveToRelative(-1.5f, -1.9f, -2.2f, -4.3f, -2.2f, -6.7f)
                curveToRelative(0.0f, -6.8f, 5.5f, -12.3f, 12.3f, -12.3f)
                lineTo(339.7f, 384.0f)
                curveToRelative(6.8f, 0.0f, 12.3f, 5.5f, 12.3f, 12.3f)
                close()
            }
        }
        .build()
        return _poo!!
    }

private var _poo: ImageVector? = null
