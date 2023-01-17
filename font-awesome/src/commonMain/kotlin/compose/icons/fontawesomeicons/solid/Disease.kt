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

public val SolidGroup.Disease: ImageVector
    get() {
        if (_disease != null) {
            return _disease!!
        }
        _disease = Builder(name = "Disease", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.5f, 53.1f)
                curveTo(251.0f, 39.6f, 268.6f, 32.0f, 287.0f, 32.0f)
                curveToRelative(28.9f, 0.0f, 54.5f, 18.7f, 63.2f, 46.3f)
                lineTo(366.0f, 128.6f)
                curveToRelative(7.3f, 23.0f, 25.2f, 41.0f, 48.2f, 48.3f)
                lineToRelative(62.2f, 19.9f)
                curveToRelative(21.2f, 6.8f, 35.6f, 26.5f, 35.6f, 48.7f)
                curveToRelative(0.0f, 17.5f, -8.9f, 33.7f, -23.6f, 43.1f)
                lineToRelative(-85.9f, 54.8f)
                curveToRelative(-10.6f, 6.8f, -16.6f, 18.8f, -15.7f, 31.3f)
                lineToRelative(2.5f, 33.9f)
                curveToRelative(2.8f, 38.5f, -27.7f, 71.4f, -66.4f, 71.4f)
                curveToRelative(-13.6f, 0.0f, -26.9f, -4.2f, -38.1f, -12.0f)
                lineToRelative(-48.2f, -33.6f)
                curveToRelative(-14.8f, -10.3f, -32.3f, -15.8f, -50.3f, -15.8f)
                lineTo(170.2f, 418.6f)
                curveToRelative(-4.9f, 0.0f, -9.9f, 0.4f, -14.8f, 1.2f)
                lineTo(83.9f, 432.1f)
                curveToRelative(-21.3f, 3.6f, -42.8f, -5.7f, -54.6f, -23.9f)
                curveToRelative(-11.8f, -18.1f, -11.8f, -41.4f, 0.0f, -59.4f)
                lineTo(56.5f, 307.0f)
                curveToRelative(4.9f, -7.5f, 7.5f, -16.3f, 7.5f, -25.3f)
                curveToRelative(0.0f, -9.9f, -3.2f, -19.5f, -9.0f, -27.4f)
                lineTo(11.3f, 194.6f)
                curveTo(-6.5f, 170.3f, -0.7f, 136.2f, 24.2f, 119.2f)
                curveToRelative(9.7f, -6.6f, 21.2f, -9.8f, 32.9f, -9.1f)
                lineToRelative(80.6f, 4.6f)
                curveToRelative(26.1f, 1.5f, 51.5f, -8.7f, 69.4f, -27.9f)
                lineToRelative(31.5f, -33.8f)
                close()
                moveTo(160.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(320.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                close()
                moveTo(288.0f, 352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _disease!!
    }

private var _disease: ImageVector? = null
