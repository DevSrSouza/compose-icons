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

public val SolidGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                curveToRelative(-80.8f, 0.0f, -145.5f, 36.8f, -192.6f, 80.6f)
                curveTo(48.6f, 156.0f, 17.3f, 208.0f, 2.5f, 243.7f)
                curveToRelative(-3.3f, 7.9f, -3.3f, 16.7f, 0.0f, 24.6f)
                curveTo(17.3f, 304.0f, 48.6f, 356.0f, 95.4f, 399.4f)
                curveTo(142.5f, 443.2f, 207.2f, 480.0f, 288.0f, 480.0f)
                reflectiveCurveToRelative(145.5f, -36.8f, 192.6f, -80.6f)
                curveToRelative(46.8f, -43.5f, 78.1f, -95.4f, 93.0f, -131.1f)
                curveToRelative(3.3f, -7.9f, 3.3f, -16.7f, 0.0f, -24.6f)
                curveToRelative(-14.9f, -35.7f, -46.2f, -87.7f, -93.0f, -131.1f)
                curveTo(433.5f, 68.8f, 368.8f, 32.0f, 288.0f, 32.0f)
                close()
                moveTo(144.0f, 256.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, -288.0f, 0.0f)
                close()
                moveTo(288.0f, 192.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-7.1f, 0.0f, -13.9f, -1.2f, -20.3f, -3.3f)
                curveToRelative(-5.5f, -1.8f, -11.9f, 1.6f, -11.7f, 7.4f)
                curveToRelative(0.3f, 6.9f, 1.3f, 13.8f, 3.2f, 20.7f)
                curveToRelative(13.7f, 51.2f, 66.4f, 81.6f, 117.6f, 67.9f)
                reflectiveCurveToRelative(81.6f, -66.4f, 67.9f, -117.6f)
                curveToRelative(-11.1f, -41.5f, -47.8f, -69.4f, -88.6f, -71.1f)
                curveToRelative(-5.8f, -0.2f, -9.2f, 6.1f, -7.4f, 11.7f)
                curveToRelative(2.1f, 6.4f, 3.3f, 13.2f, 3.3f, 20.3f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
