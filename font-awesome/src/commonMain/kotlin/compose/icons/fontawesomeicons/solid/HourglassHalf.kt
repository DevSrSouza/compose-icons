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
                curveTo(10.74f, 0.0f, 0.0f, 10.74f, 0.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                curveToRelative(0.0f, 90.96f, 51.02f, 167.73f, 120.84f, 192.0f)
                curveTo(75.02f, 280.27f, 24.0f, 357.04f, 24.0f, 448.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                curveToRelative(0.0f, -90.96f, -51.02f, -167.73f, -120.84f, -192.0f)
                curveTo(308.98f, 231.73f, 360.0f, 154.96f, 360.0f, 64.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                lineTo(384.0f, 24.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(284.92f, 384.0f)
                lineTo(99.08f, 384.0f)
                curveToRelative(17.06f, -46.8f, 52.1f, -80.0f, 92.92f, -80.0f)
                curveToRelative(40.82f, 0.0f, 75.86f, 33.2f, 92.92f, 80.0f)
                close()
                moveTo(284.94f, 128.0f)
                lineTo(99.08f, 128.0f)
                curveTo(91.99f, 108.55f, 88.0f, 86.75f, 88.0f, 64.0f)
                horizontalLineToRelative(208.0f)
                curveToRelative(0.0f, 22.81f, -3.99f, 44.59f, -11.06f, 64.0f)
                close()
            }
        }
        .build()
        return _hourglassHalf!!
    }

private var _hourglassHalf: ImageVector? = null
