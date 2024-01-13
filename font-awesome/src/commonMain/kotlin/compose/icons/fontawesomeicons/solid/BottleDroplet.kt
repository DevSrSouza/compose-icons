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

public val SolidGroup.BottleDroplet: ImageVector
    get() {
        if (_bottleDroplet != null) {
            return _bottleDroplet!!
        }
        _bottleDroplet = Builder(name = "BottleDroplet", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveTo(82.7f, 0.0f, 72.0f, 10.7f, 72.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(64.9f)
                curveToRelative(0.0f, 12.2f, -7.2f, 23.1f, -17.2f, 30.1f)
                curveTo(53.7f, 174.1f, 32.0f, 212.5f, 32.0f, 256.0f)
                lineTo(32.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(224.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(288.0f, 256.0f)
                curveToRelative(0.0f, -43.5f, -21.7f, -81.9f, -54.8f, -105.0f)
                curveToRelative(-10.0f, -7.0f, -17.2f, -17.9f, -17.2f, -30.1f)
                lineTo(216.0f, 56.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(104.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(96.0f, 0.0f)
                close()
                moveTo(160.0f, 382.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -20.1f, -48.0f, -45.0f)
                curveToRelative(0.0f, -16.8f, 22.1f, -48.1f, 36.3f, -66.4f)
                curveToRelative(6.0f, -7.8f, 17.5f, -7.8f, 23.5f, 0.0f)
                curveTo(185.9f, 288.9f, 208.0f, 320.2f, 208.0f, 337.0f)
                curveToRelative(0.0f, 24.9f, -21.5f, 45.0f, -48.0f, 45.0f)
                close()
            }
        }
        .build()
        return _bottleDroplet!!
    }

private var _bottleDroplet: ImageVector? = null
