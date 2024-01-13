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

public val SolidGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                curveTo(150.0f, 64.0f, 64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                curveTo(114.6f, 512.0f, 0.0f, 397.4f, 0.0f, 256.0f)
                reflectiveCurveTo(114.6f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(512.0f, 114.6f, 512.0f, 256.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                curveToRelative(-29.3f, 0.0f, -55.6f, -13.2f, -73.2f, -33.9f)
                curveTo(320.0f, 371.1f, 289.5f, 384.0f, 256.0f, 384.0f)
                curveToRelative(-70.7f, 0.0f, -128.0f, -57.3f, -128.0f, -128.0f)
                reflectiveCurveToRelative(57.3f, -128.0f, 128.0f, -128.0f)
                curveToRelative(27.9f, 0.0f, 53.7f, 8.9f, 74.7f, 24.1f)
                curveToRelative(5.7f, -5.0f, 13.1f, -8.1f, 21.3f, -8.1f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(80.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(448.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                close()
                moveTo(320.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 128.0f, 0.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
