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
                moveTo(432.0f, 256.0f)
                curveToRelative(0.0f, 79.5f, -64.5f, 144.0f, -144.0f, 144.0f)
                reflectiveCurveToRelative(-144.0f, -64.5f, -144.0f, -144.0f)
                reflectiveCurveToRelative(64.5f, -144.0f, 144.0f, -144.0f)
                reflectiveCurveToRelative(144.0f, 64.5f, 144.0f, 144.0f)
                close()
                moveTo(288.0f, 192.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-11.5f, 0.0f, -22.3f, -3.0f, -31.6f, -8.4f)
                curveToRelative(-0.2f, 2.8f, -0.4f, 5.5f, -0.4f, 8.4f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-2.8f, 0.0f, -5.6f, 0.1f, -8.4f, 0.4f)
                curveToRelative(5.3f, 9.3f, 8.4f, 20.1f, 8.4f, 31.6f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
