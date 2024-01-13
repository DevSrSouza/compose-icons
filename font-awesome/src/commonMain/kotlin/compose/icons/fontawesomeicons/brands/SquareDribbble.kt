package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.SquareDribbble: ImageVector
    get() {
        if (_squareDribbble != null) {
            return _squareDribbble!!
        }
        _squareDribbble = Builder(name = "SquareDribbble", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.9f, 132.5f)
                curveToRelative(-38.3f, 18.0f, -66.8f, 53.3f, -75.7f, 95.7f)
                curveToRelative(6.1f, 0.1f, 62.4f, 0.3f, 126.4f, -16.7f)
                curveToRelative(-22.7f, -40.2f, -47.1f, -74.1f, -50.7f, -79.0f)
                close()
                moveTo(192.0f, 123.4f)
                curveToRelative(3.8f, 5.1f, 28.6f, 38.9f, 51.0f, 80.0f)
                curveToRelative(48.6f, -18.3f, 69.1f, -45.9f, 71.6f, -49.4f)
                curveTo(281.0f, 124.2f, 235.3f, 112.9f, 192.0f, 123.4f)
                close()
                moveTo(277.4f, 382.0f)
                curveToRelative(-2.0f, -12.0f, -10.0f, -53.8f, -29.2f, -103.6f)
                curveToRelative(-55.1f, 18.8f, -93.8f, 56.4f, -108.1f, 85.6f)
                curveToRelative(40.5f, 31.6f, 93.3f, 36.7f, 137.3f, 18.0f)
                close()
                moveTo(227.8f, 232.6f)
                curveTo(159.6f, 253.0f, 93.4f, 252.2f, 87.4f, 252.0f)
                curveToRelative(0.0f, 0.7f, 0.0f, 1.4f, 0.0f, 2.1f)
                reflectiveCurveToRelative(0.0f, 1.4f, 0.0f, 2.1f)
                curveToRelative(0.0f, 35.1f, 13.3f, 67.1f, 35.1f, 91.4f)
                curveToRelative(22.2f, -37.9f, 67.1f, -77.9f, 116.5f, -91.8f)
                curveToRelative(-3.4f, -7.8f, -7.2f, -15.5f, -11.1f, -23.2f)
                close()
                moveTo(300.3f, 369.5f)
                curveToRelative(30.7f, -20.7f, 52.5f, -53.6f, 58.6f, -91.6f)
                curveToRelative(-4.6f, -1.5f, -42.3f, -12.7f, -85.1f, -5.8f)
                curveToRelative(17.9f, 49.1f, 25.1f, 89.1f, 26.5f, 97.4f)
                close()
                moveTo(265.5f, 250.5f)
                curveToRelative(45.5f, -5.7f, 90.7f, 3.4f, 95.2f, 4.4f)
                curveToRelative(-0.3f, -32.3f, -11.8f, -61.9f, -30.9f, -85.1f)
                curveToRelative(-2.9f, 3.9f, -25.8f, 33.2f, -76.3f, 53.9f)
                curveToRelative(4.8f, 9.8f, 8.3f, 17.8f, 12.0f, 26.8f)
                close()
                moveTo(384.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(224.0f, 416.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, true, 0.0f, -320.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, true, 0.0f, 320.0f)
                close()
            }
        }
        .build()
        return _squareDribbble!!
    }

private var _squareDribbble: ImageVector? = null
