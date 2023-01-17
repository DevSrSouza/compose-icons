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

public val SolidGroup.EyeLowVision: ImageVector
    get() {
        if (_eyeLowVision != null) {
            return _eyeLowVision!!
        }
        _eyeLowVision = Builder(name = "EyeLowVision", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(525.6f, 386.7f)
                curveToRelative(39.6f, -40.6f, 66.4f, -86.1f, 79.9f, -118.4f)
                curveToRelative(3.3f, -7.9f, 3.3f, -16.7f, 0.0f, -24.6f)
                curveToRelative(-14.9f, -35.7f, -46.2f, -87.7f, -93.0f, -131.1f)
                curveTo(465.5f, 68.8f, 400.8f, 32.0f, 320.0f, 32.0f)
                curveToRelative(-68.2f, 0.0f, -125.0f, 26.3f, -169.3f, 60.8f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(223.1f, 149.5f)
                curveTo(248.6f, 126.2f, 282.7f, 112.0f, 320.0f, 112.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, 64.5f, 144.0f, 144.0f)
                curveToRelative(0.0f, 24.9f, -6.3f, 48.3f, -17.4f, 68.7f)
                lineTo(408.0f, 294.5f)
                curveToRelative(5.2f, -11.8f, 8.0f, -24.8f, 8.0f, -38.5f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-2.8f, 0.0f, -5.6f, 0.1f, -8.4f, 0.4f)
                curveToRelative(5.3f, 9.3f, 8.4f, 20.1f, 8.4f, 31.6f)
                curveToRelative(0.0f, 10.2f, -2.4f, 19.8f, -6.6f, 28.3f)
                lineToRelative(-90.3f, -70.8f)
                close()
                moveTo(446.2f, 447.5f)
                lineTo(83.1f, 161.5f)
                curveToRelative(-11.0f, 14.4f, -20.5f, 28.7f, -28.4f, 42.2f)
                lineToRelative(339.0f, 265.7f)
                curveToRelative(18.7f, -5.5f, 36.2f, -13.0f, 52.6f, -21.8f)
                close()
                moveTo(34.5f, 268.3f)
                curveToRelative(14.9f, 35.7f, 46.2f, 87.7f, 93.0f, 131.1f)
                curveTo(174.5f, 443.2f, 239.2f, 480.0f, 320.0f, 480.0f)
                curveToRelative(3.1f, 0.0f, 6.1f, -0.1f, 9.2f, -0.2f)
                lineTo(33.1f, 247.8f)
                curveToRelative(-1.8f, 6.8f, -1.3f, 14.0f, 1.4f, 20.5f)
                close()
            }
        }
        .build()
        return _eyeLowVision!!
    }

private var _eyeLowVision: ImageVector? = null
