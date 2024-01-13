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

public val SolidGroup.DrumSteelpan: ImageVector
    get() {
        if (_drumSteelpan != null) {
            return _drumSteelpan!!
        }
        _drumSteelpan = Builder(name = "DrumSteelpan", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                curveToRelative(159.1f, 0.0f, 288.0f, 48.0f, 288.0f, 128.0f)
                lineTo(576.0f, 352.0f)
                curveToRelative(0.0f, 80.0f, -128.9f, 128.0f, -288.0f, 128.0f)
                reflectiveCurveTo(0.0f, 432.0f, 0.0f, 352.0f)
                lineTo(0.0f, 160.0f)
                curveTo(0.0f, 80.0f, 128.9f, 32.0f, 288.0f, 32.0f)
                close()
                moveTo(528.0f, 160.0f)
                curveToRelative(0.0f, -9.9f, -8.0f, -29.9f, -55.0f, -49.8f)
                curveToRelative(-18.6f, -7.9f, -40.9f, -14.4f, -66.0f, -19.4f)
                lineToRelative(-27.8f, 43.6f)
                curveToRelative(-7.3f, 11.5f, -11.2f, 24.8f, -11.2f, 38.4f)
                curveToRelative(0.0f, 17.5f, 6.4f, 34.4f, 18.1f, 47.5f)
                lineToRelative(9.8f, 11.0f)
                curveToRelative(29.8f, -5.2f, 55.9f, -12.5f, 77.2f, -21.5f)
                curveToRelative(47.1f, -19.9f, 55.0f, -39.9f, 55.0f, -49.8f)
                close()
                moveTo(349.2f, 237.3f)
                curveToRelative(-8.0f, -26.2f, -32.4f, -45.3f, -61.2f, -45.3f)
                reflectiveCurveToRelative(-53.3f, 19.1f, -61.2f, 45.3f)
                curveToRelative(19.4f, 1.7f, 39.9f, 2.7f, 61.2f, 2.7f)
                reflectiveCurveToRelative(41.8f, -0.9f, 61.2f, -2.7f)
                close()
                moveTo(169.0f, 90.8f)
                curveToRelative(-25.2f, 5.0f, -47.4f, 11.6f, -66.0f, 19.4f)
                curveTo(56.0f, 130.1f, 48.0f, 150.1f, 48.0f, 160.0f)
                reflectiveCurveToRelative(8.0f, 29.9f, 55.0f, 49.8f)
                curveToRelative(21.3f, 9.0f, 47.4f, 16.3f, 77.2f, 21.5f)
                lineToRelative(9.8f, -11.0f)
                curveToRelative(11.6f, -13.1f, 18.1f, -30.0f, 18.1f, -47.5f)
                curveToRelative(0.0f, -13.6f, -3.9f, -26.9f, -11.2f, -38.4f)
                lineTo(169.0f, 90.8f)
                close()
                moveTo(225.3f, 82.8f)
                curveTo(224.5f, 87.0f, 224.0f, 91.5f, 224.0f, 96.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                curveToRelative(0.0f, -4.5f, -0.5f, -9.0f, -1.4f, -13.2f)
                curveTo(330.8f, 81.0f, 309.8f, 80.0f, 288.0f, 80.0f)
                reflectiveCurveToRelative(-42.8f, 1.0f, -62.6f, 2.8f)
                close()
            }
        }
        .build()
        return _drumSteelpan!!
    }

private var _drumSteelpan: ImageVector? = null
