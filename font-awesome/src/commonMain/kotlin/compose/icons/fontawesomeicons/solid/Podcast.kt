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

public val SolidGroup.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = Builder(name = "Podcast", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(319.4f, 372.0f)
                curveToRelative(48.5f, -31.3f, 80.6f, -85.9f, 80.6f, -148.0f)
                curveToRelative(0.0f, -97.2f, -78.8f, -176.0f, -176.0f, -176.0f)
                reflectiveCurveTo(48.0f, 126.8f, 48.0f, 224.0f)
                curveToRelative(0.0f, 62.1f, 32.1f, 116.6f, 80.6f, 148.0f)
                curveToRelative(1.2f, 17.3f, 4.0f, 38.0f, 7.2f, 57.1f)
                lineToRelative(0.2f, 1.0f)
                curveTo(56.0f, 395.8f, 0.0f, 316.5f, 0.0f, 224.0f)
                curveTo(0.0f, 100.3f, 100.3f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(448.0f, 100.3f, 448.0f, 224.0f)
                curveToRelative(0.0f, 92.5f, -56.0f, 171.9f, -136.0f, 206.1f)
                lineToRelative(0.2f, -1.1f)
                curveToRelative(3.1f, -19.2f, 6.0f, -39.8f, 7.2f, -57.0f)
                close()
                moveTo(317.1f, 333.9f)
                curveToRelative(-1.6f, -5.7f, -3.9f, -11.1f, -7.0f, -16.2f)
                curveToRelative(-5.8f, -9.7f, -13.5f, -17.0f, -21.9f, -22.4f)
                curveToRelative(19.5f, -17.6f, 31.8f, -43.0f, 31.8f, -71.3f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 28.3f, 12.3f, 53.8f, 31.8f, 71.3f)
                curveToRelative(-8.4f, 5.4f, -16.1f, 12.7f, -21.9f, 22.4f)
                curveToRelative(-3.1f, 5.1f, -5.4f, 10.5f, -7.0f, 16.2f)
                curveTo(99.8f, 307.5f, 80.0f, 268.0f, 80.0f, 224.0f)
                curveToRelative(0.0f, -79.5f, 64.5f, -144.0f, 144.0f, -144.0f)
                reflectiveCurveToRelative(144.0f, 64.5f, 144.0f, 144.0f)
                curveToRelative(0.0f, 44.0f, -19.8f, 83.5f, -50.9f, 109.9f)
                close()
                moveTo(224.0f, 312.0f)
                curveToRelative(32.9f, 0.0f, 64.0f, 8.6f, 64.0f, 43.8f)
                curveToRelative(0.0f, 33.0f, -12.9f, 104.1f, -20.6f, 132.9f)
                curveToRelative(-5.1f, 19.0f, -24.5f, 23.4f, -43.4f, 23.4f)
                reflectiveCurveToRelative(-38.2f, -4.4f, -43.4f, -23.4f)
                curveToRelative(-7.8f, -28.5f, -20.6f, -99.7f, -20.6f, -132.8f)
                curveToRelative(0.0f, -35.1f, 31.1f, -43.8f, 64.0f, -43.8f)
                close()
                moveTo(224.0f, 168.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, 112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 0.0f, -112.0f)
                close()
            }
        }
        .build()
        return _podcast!!
    }

private var _podcast: ImageVector? = null
