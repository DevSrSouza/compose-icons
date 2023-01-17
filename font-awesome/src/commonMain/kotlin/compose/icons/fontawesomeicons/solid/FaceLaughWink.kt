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

public val SolidGroup.FaceLaughWink: ImageVector
    get() {
        if (_faceLaughWink != null) {
            return _faceLaughWink!!
        }
        _faceLaughWink = Builder(name = "FaceLaughWink", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -114.6f, 256.0f, -256.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveTo(114.6f, 512.0f, 256.0f, 512.0f)
                close()
                moveTo(96.8f, 314.1f)
                curveToRelative(-3.8f, -13.7f, 7.4f, -26.1f, 21.6f, -26.1f)
                lineTo(393.6f, 288.0f)
                curveToRelative(14.2f, 0.0f, 25.5f, 12.4f, 21.6f, 26.1f)
                curveTo(396.2f, 382.0f, 332.1f, 432.0f, 256.0f, 432.0f)
                reflectiveCurveToRelative(-140.2f, -50.0f, -159.2f, -117.9f)
                close()
                moveTo(208.4f, 192.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(300.8f, 217.6f)
                curveToRelative(-5.3f, 7.1f, -15.3f, 8.5f, -22.4f, 3.2f)
                reflectiveCurveToRelative(-8.5f, -15.3f, -3.2f, -22.4f)
                curveToRelative(30.4f, -40.5f, 91.2f, -40.5f, 121.6f, 0.0f)
                curveToRelative(5.3f, 7.1f, 3.9f, 17.1f, -3.2f, 22.4f)
                reflectiveCurveToRelative(-17.1f, 3.9f, -22.4f, -3.2f)
                curveToRelative(-17.6f, -23.5f, -52.8f, -23.5f, -70.4f, 0.0f)
                close()
            }
        }
        .build()
        return _faceLaughWink!!
    }

private var _faceLaughWink: ImageVector? = null
