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

public val SolidGroup.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) {
            return _toiletPaper!!
        }
        _toiletPaper = Builder(name = "ToiletPaper", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.2f, 0.0f)
                curveTo(397.2f, 49.6f, 384.0f, 126.5f, 384.0f, 192.0f)
                curveToRelative(0.0f, 158.8f, -27.3f, 247.0f, -42.7f, 283.9f)
                curveToRelative(-10.0f, 24.0f, -33.2f, 36.1f, -55.4f, 36.1f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-11.5f, 0.0f, -22.2f, -6.2f, -27.8f, -16.2f)
                reflectiveCurveToRelative(-5.6f, -22.3f, 0.4f, -32.2f)
                curveToRelative(9.8f, -17.7f, 15.4f, -38.2f, 20.5f, -57.7f)
                curveTo(52.3f, 362.8f, 64.0f, 293.5f, 64.0f, 192.0f)
                curveTo(64.0f, 86.0f, 107.0f, 0.0f, 160.0f, 0.0f)
                lineTo(444.2f, 0.0f)
                close()
                moveTo(512.0f, 384.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -86.0f, -96.0f, -192.0f)
                reflectiveCurveTo(459.0f, 0.0f, 512.0f, 0.0f)
                reflectiveCurveToRelative(96.0f, 86.0f, 96.0f, 192.0f)
                reflectiveCurveToRelative(-43.0f, 192.0f, -96.0f, 192.0f)
                close()
                moveTo(512.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -28.7f, 32.0f, -64.0f)
                reflectiveCurveToRelative(-14.3f, -64.0f, -32.0f, -64.0f)
                reflectiveCurveToRelative(-32.0f, 28.7f, -32.0f, 64.0f)
                reflectiveCurveToRelative(14.3f, 64.0f, 32.0f, 64.0f)
                close()
                moveTo(144.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
                moveTo(208.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
                moveTo(256.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
                moveTo(336.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
