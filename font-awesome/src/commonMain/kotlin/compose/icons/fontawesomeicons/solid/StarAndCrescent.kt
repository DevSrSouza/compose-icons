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

public val SolidGroup.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveTo(0.0f, 114.6f, 114.6f, 0.0f, 256.0f, 0.0f)
                curveToRelative(33.0f, 0.0f, 64.6f, 6.3f, 93.6f, 17.7f)
                curveToRelative(7.4f, 2.9f, 11.5f, 10.7f, 9.8f, 18.4f)
                reflectiveCurveToRelative(-8.8f, 13.0f, -16.7f, 12.4f)
                curveToRelative(-4.8f, -0.3f, -9.7f, -0.5f, -14.6f, -0.5f)
                curveToRelative(-114.9f, 0.0f, -208.0f, 93.1f, -208.0f, 208.0f)
                reflectiveCurveToRelative(93.1f, 208.0f, 208.0f, 208.0f)
                curveToRelative(4.9f, 0.0f, 9.8f, -0.2f, 14.6f, -0.5f)
                curveToRelative(7.9f, -0.5f, 15.0f, 4.7f, 16.7f, 12.4f)
                reflectiveCurveToRelative(-2.4f, 15.5f, -9.8f, 18.4f)
                curveTo(320.6f, 505.7f, 289.0f, 512.0f, 256.0f, 512.0f)
                curveTo(114.6f, 512.0f, 0.0f, 397.4f, 0.0f, 256.0f)
                close()
                moveTo(375.4f, 137.4f)
                curveToRelative(3.5f, -7.1f, 13.7f, -7.1f, 17.2f, 0.0f)
                lineToRelative(31.5f, 63.8f)
                curveToRelative(1.4f, 2.8f, 4.1f, 4.8f, 7.2f, 5.3f)
                lineToRelative(70.4f, 10.2f)
                curveToRelative(7.9f, 1.1f, 11.0f, 10.8f, 5.3f, 16.4f)
                lineToRelative(-50.9f, 49.6f)
                curveToRelative(-2.3f, 2.2f, -3.3f, 5.4f, -2.8f, 8.5f)
                lineToRelative(12.0f, 70.1f)
                curveToRelative(1.3f, 7.8f, -6.9f, 13.8f, -13.9f, 10.1f)
                lineToRelative(-63.0f, -33.1f)
                curveToRelative(-2.8f, -1.5f, -6.1f, -1.5f, -8.9f, 0.0f)
                lineToRelative(-63.0f, 33.1f)
                curveToRelative(-7.0f, 3.7f, -15.3f, -2.3f, -13.9f, -10.1f)
                lineToRelative(12.0f, -70.1f)
                curveToRelative(0.5f, -3.1f, -0.5f, -6.3f, -2.8f, -8.5f)
                lineTo(261.0f, 233.1f)
                curveToRelative(-5.7f, -5.6f, -2.6f, -15.2f, 5.3f, -16.4f)
                lineToRelative(70.4f, -10.2f)
                curveToRelative(3.1f, -0.5f, 5.8f, -2.4f, 7.2f, -5.3f)
                lineToRelative(31.5f, -63.8f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
