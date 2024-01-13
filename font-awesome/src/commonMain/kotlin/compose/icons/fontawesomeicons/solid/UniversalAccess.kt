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

public val SolidGroup.UniversalAccess: ImageVector
    get() {
        if (_universalAccess != null) {
            return _universalAccess!!
        }
        _universalAccess = Builder(name = "UniversalAccess", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, true, 0.0f, 256.0f)
                close()
                moveTo(161.5f, 169.9f)
                curveToRelative(-12.2f, -5.2f, -26.3f, 0.4f, -31.5f, 12.6f)
                reflectiveCurveToRelative(0.4f, 26.3f, 12.6f, 31.5f)
                lineToRelative(11.9f, 5.1f)
                curveToRelative(17.3f, 7.4f, 35.2f, 12.9f, 53.6f, 16.3f)
                verticalLineToRelative(50.1f)
                curveToRelative(0.0f, 4.3f, -0.7f, 8.6f, -2.1f, 12.6f)
                lineToRelative(-28.7f, 86.1f)
                curveToRelative(-4.2f, 12.6f, 2.6f, 26.2f, 15.2f, 30.4f)
                reflectiveCurveToRelative(26.2f, -2.6f, 30.4f, -15.2f)
                lineToRelative(24.4f, -73.2f)
                curveToRelative(1.3f, -3.8f, 4.8f, -6.4f, 8.8f, -6.4f)
                reflectiveCurveToRelative(7.6f, 2.6f, 8.8f, 6.4f)
                lineToRelative(24.4f, 73.2f)
                curveToRelative(4.2f, 12.6f, 17.8f, 19.4f, 30.4f, 15.2f)
                reflectiveCurveToRelative(19.4f, -17.8f, 15.2f, -30.4f)
                lineToRelative(-28.7f, -86.1f)
                curveToRelative(-1.4f, -4.1f, -2.1f, -8.3f, -2.1f, -12.6f)
                lineTo(304.1f, 235.5f)
                curveToRelative(18.4f, -3.5f, 36.3f, -8.9f, 53.6f, -16.3f)
                lineToRelative(11.9f, -5.1f)
                curveToRelative(12.2f, -5.2f, 17.8f, -19.3f, 12.6f, -31.5f)
                reflectiveCurveToRelative(-19.3f, -17.8f, -31.5f, -12.6f)
                lineTo(338.7f, 175.0f)
                curveToRelative(-26.1f, 11.2f, -54.2f, 17.0f, -82.7f, 17.0f)
                reflectiveCurveToRelative(-56.5f, -5.8f, -82.7f, -17.0f)
                lineToRelative(-11.9f, -5.1f)
                close()
                moveTo(256.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _universalAccess!!
    }

private var _universalAccess: ImageVector? = null
