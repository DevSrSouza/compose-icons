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

public val SolidGroup.HourglassEnd: ImageVector
    get() {
        if (_hourglassEnd != null) {
            return _hourglassEnd!!
        }
        _hourglassEnd = Builder(name = "HourglassEnd", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(360.0f, 64.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(24.0f)
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
                close()
                moveTo(192.0f, 208.0f)
                curveToRelative(-57.787f, 0.0f, -104.0f, -66.518f, -104.0f, -144.0f)
                horizontalLineToRelative(208.0f)
                curveToRelative(0.0f, 77.945f, -46.51f, 144.0f, -104.0f, 144.0f)
                close()
            }
        }
        .build()
        return _hourglassEnd!!
    }

private var _hourglassEnd: ImageVector? = null
