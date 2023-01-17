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

public val SolidGroup.RupiahSign: ImageVector
    get() {
        if (_rupiahSign != null) {
            return _rupiahSign!!
        }
        _rupiahSign = Builder(name = "RupiahSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, 64.5f, 144.0f, 144.0f)
                curveToRelative(0.0f, 58.8f, -35.2f, 109.3f, -85.7f, 131.7f)
                lineToRelative(51.4f, 128.4f)
                curveToRelative(6.6f, 16.4f, -1.4f, 35.0f, -17.8f, 41.6f)
                reflectiveCurveToRelative(-35.0f, -1.4f, -41.6f, -17.8f)
                lineTo(106.3f, 320.0f)
                lineTo(64.0f, 320.0f)
                lineTo(64.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 288.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(64.0f, 256.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                reflectiveCurveToRelative(-35.8f, -80.0f, -80.0f, -80.0f)
                lineTo(64.0f, 96.0f)
                lineTo(64.0f, 256.0f)
                close()
                moveTo(320.0f, 160.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, 50.1f, 112.0f, 112.0f)
                reflectiveCurveToRelative(-50.1f, 112.0f, -112.0f, 112.0f)
                lineTo(352.0f, 384.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(288.0f, 352.0f)
                lineTo(288.0f, 192.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(400.0f, 320.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(352.0f, 224.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _rupiahSign!!
    }

private var _rupiahSign: ImageVector? = null
