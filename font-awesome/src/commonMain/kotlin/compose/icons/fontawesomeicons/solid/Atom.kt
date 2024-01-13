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

public val SolidGroup.Atom: ImageVector
    get() {
        if (_atom != null) {
            return _atom!!
        }
        _atom = Builder(name = "Atom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 398.8f)
                curveToRelative(-11.8f, 5.1f, -23.4f, 9.7f, -34.9f, 13.5f)
                curveToRelative(16.7f, 33.8f, 31.0f, 35.7f, 34.9f, 35.7f)
                reflectiveCurveToRelative(18.1f, -1.9f, 34.9f, -35.7f)
                curveToRelative(-11.4f, -3.9f, -23.1f, -8.4f, -34.9f, -13.5f)
                close()
                moveTo(446.0f, 256.0f)
                curveToRelative(33.0f, 45.2f, 44.3f, 90.9f, 23.6f, 128.0f)
                curveToRelative(-20.2f, 36.3f, -62.5f, 49.3f, -115.2f, 43.2f)
                curveToRelative(-22.0f, 52.1f, -55.6f, 84.8f, -98.4f, 84.8f)
                reflectiveCurveToRelative(-76.4f, -32.7f, -98.4f, -84.8f)
                curveToRelative(-52.7f, 6.1f, -95.0f, -6.8f, -115.2f, -43.2f)
                curveTo(21.7f, 346.9f, 33.0f, 301.2f, 66.0f, 256.0f)
                curveToRelative(-33.0f, -45.2f, -44.3f, -90.9f, -23.6f, -128.0f)
                curveToRelative(20.2f, -36.3f, 62.5f, -49.3f, 115.2f, -43.2f)
                curveTo(179.6f, 32.7f, 213.2f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(76.4f, 32.7f, 98.4f, 84.8f)
                curveToRelative(52.7f, -6.1f, 95.0f, 6.8f, 115.2f, 43.2f)
                curveToRelative(20.7f, 37.1f, 9.4f, 82.8f, -23.6f, 128.0f)
                close()
                moveTo(380.2f, 323.4f)
                curveToRelative(-1.7f, 14.2f, -3.9f, 28.0f, -6.7f, 41.2f)
                curveToRelative(31.8f, 1.4f, 38.6f, -8.7f, 40.2f, -11.7f)
                curveToRelative(2.3f, -4.2f, 7.0f, -17.9f, -11.9f, -48.1f)
                curveToRelative(-6.8f, 6.3f, -14.0f, 12.5f, -21.6f, 18.6f)
                close()
                moveTo(373.5f, 147.5f)
                curveToRelative(2.8f, 13.1f, 5.0f, 26.9f, 6.7f, 41.2f)
                curveToRelative(7.6f, 6.1f, 14.8f, 12.3f, 21.6f, 18.6f)
                curveToRelative(18.9f, -30.2f, 14.2f, -44.0f, 11.9f, -48.1f)
                curveToRelative(-1.6f, -2.9f, -8.4f, -13.0f, -40.2f, -11.7f)
                close()
                moveTo(290.9f, 99.7f)
                curveTo(274.1f, 65.9f, 259.9f, 64.0f, 256.0f, 64.0f)
                reflectiveCurveToRelative(-18.1f, 1.9f, -34.9f, 35.7f)
                curveToRelative(11.4f, 3.9f, 23.1f, 8.4f, 34.9f, 13.5f)
                curveToRelative(11.8f, -5.1f, 23.4f, -9.7f, 34.9f, -13.5f)
                close()
                moveTo(131.9f, 188.6f)
                curveToRelative(1.7f, -14.3f, 3.9f, -28.0f, 6.7f, -41.2f)
                curveToRelative(-31.8f, -1.4f, -38.6f, 8.7f, -40.2f, 11.7f)
                curveToRelative(-2.3f, 4.2f, -7.0f, 17.9f, 11.9f, 48.1f)
                curveToRelative(6.8f, -6.3f, 14.0f, -12.5f, 21.6f, -18.6f)
                close()
                moveTo(110.2f, 304.8f)
                curveTo(91.4f, 335.0f, 96.0f, 348.7f, 98.3f, 352.9f)
                curveToRelative(1.6f, 2.9f, 8.4f, 13.0f, 40.2f, 11.7f)
                curveToRelative(-2.8f, -13.1f, -5.0f, -26.9f, -6.7f, -41.2f)
                curveToRelative(-7.6f, -6.1f, -14.8f, -12.3f, -21.6f, -18.6f)
                close()
                moveTo(336.0f, 256.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -160.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 160.0f, 0.0f)
                close()
                moveTo(256.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _atom!!
    }

private var _atom: ImageVector? = null
