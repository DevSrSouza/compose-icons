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

public val SolidGroup.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = Builder(name = "Guitar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(465.0f, 7.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(383.0f, 55.0f)
                curveToRelative(-2.4f, 2.4f, -4.3f, 5.3f, -5.5f, 8.5f)
                lineToRelative(-15.4f, 41.0f)
                lineToRelative(-77.5f, 77.6f)
                curveToRelative(-45.1f, -29.4f, -99.3f, -30.2f, -131.0f, 1.6f)
                curveToRelative(-11.0f, 11.0f, -18.0f, 24.6f, -21.4f, 39.6f)
                curveToRelative(-3.7f, 16.6f, -19.1f, 30.7f, -36.1f, 31.6f)
                curveToRelative(-25.6f, 1.3f, -49.3f, 10.7f, -67.3f, 28.6f)
                curveTo(-16.0f, 328.4f, -7.6f, 409.4f, 47.5f, 464.5f)
                reflectiveCurveToRelative(136.1f, 63.5f, 180.9f, 18.7f)
                curveToRelative(17.9f, -17.9f, 27.4f, -41.7f, 28.6f, -67.3f)
                curveToRelative(0.9f, -17.0f, 15.0f, -32.3f, 31.6f, -36.1f)
                curveToRelative(15.0f, -3.4f, 28.6f, -10.5f, 39.6f, -21.4f)
                curveToRelative(31.8f, -31.8f, 31.0f, -85.9f, 1.6f, -131.0f)
                lineToRelative(77.6f, -77.6f)
                lineToRelative(41.0f, -15.4f)
                curveToRelative(3.2f, -1.2f, 6.1f, -3.1f, 8.5f, -5.5f)
                lineToRelative(48.0f, -48.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(465.0f, 7.0f)
                close()
                moveTo(208.0f, 256.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _guitar!!
    }

private var _guitar: ImageVector? = null
