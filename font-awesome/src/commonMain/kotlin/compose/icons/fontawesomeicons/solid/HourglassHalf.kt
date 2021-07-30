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

public val SolidGroup.HourglassHalf: ImageVector
    get() {
        if (_hourglassHalf != null) {
            return _hourglassHalf!!
        }
        _hourglassHalf = Builder(name = "HourglassHalf", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.745f, 0.0f, 0.0f, 10.745f, 0.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                curveToRelative(0.0f, 90.965f, 51.016f, 167.734f, 120.842f, 192.0f)
                curveTo(75.016f, 280.266f, 24.0f, 357.035f, 24.0f, 448.0f)
                curveToRelative(-13.255f, 0.0f, -24.0f, 10.745f, -24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                curveToRelative(0.0f, -90.965f, -51.016f, -167.734f, -120.842f, -192.0f)
                curveTo(308.984f, 231.734f, 360.0f, 154.965f, 360.0f, 64.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                lineTo(384.0f, 24.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(284.922f, 384.0f)
                lineTo(99.08f, 384.0f)
                curveToRelative(17.059f, -46.797f, 52.096f, -80.0f, 92.92f, -80.0f)
                curveToRelative(40.821f, 0.0f, 75.862f, 33.196f, 92.922f, 80.0f)
                close()
                moveTo(284.941f, 128.0f)
                lineTo(99.078f, 128.0f)
                curveTo(91.988f, 108.548f, 88.0f, 86.748f, 88.0f, 64.0f)
                horizontalLineToRelative(208.0f)
                curveToRelative(0.0f, 22.805f, -3.987f, 44.587f, -11.059f, 64.0f)
                close()
            }
        }
        .build()
        return _hourglassHalf!!
    }

private var _hourglassHalf: ImageVector? = null
