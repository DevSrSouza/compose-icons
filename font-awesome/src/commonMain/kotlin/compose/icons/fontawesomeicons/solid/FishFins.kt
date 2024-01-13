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

public val SolidGroup.FishFins: ImageVector
    get() {
        if (_fishFins != null) {
            return _fishFins!!
        }
        _fishFins = Builder(name = "FishFins", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(275.2f, 38.4f)
                curveToRelative(-10.6f, -8.0f, -25.0f, -8.5f, -36.3f, -1.5f)
                reflectiveCurveTo(222.0f, 57.3f, 224.6f, 70.3f)
                lineToRelative(9.7f, 48.6f)
                curveToRelative(-19.4f, 9.0f, -36.9f, 19.9f, -52.4f, 31.5f)
                curveToRelative(-15.3f, 11.5f, -29.0f, 23.9f, -40.7f, 36.3f)
                lineTo(48.1f, 132.4f)
                curveToRelative(-12.5f, -7.3f, -28.4f, -5.3f, -38.6f, 4.9f)
                reflectiveCurveTo(-3.0f, 163.3f, 4.2f, 175.9f)
                lineTo(50.0f, 256.0f)
                lineTo(4.2f, 336.1f)
                curveToRelative(-7.2f, 12.6f, -5.0f, 28.4f, 5.3f, 38.6f)
                reflectiveCurveToRelative(26.1f, 12.2f, 38.6f, 4.9f)
                lineToRelative(93.1f, -54.3f)
                curveToRelative(11.8f, 12.3f, 25.4f, 24.8f, 40.7f, 36.3f)
                curveToRelative(15.5f, 11.6f, 33.0f, 22.5f, 52.4f, 31.5f)
                lineToRelative(-9.7f, 48.6f)
                curveToRelative(-2.6f, 13.0f, 3.1f, 26.3f, 14.3f, 33.3f)
                reflectiveCurveToRelative(25.6f, 6.5f, 36.3f, -1.5f)
                lineToRelative(77.6f, -58.2f)
                curveToRelative(54.9f, -4.0f, 101.5f, -27.0f, 137.2f, -53.8f)
                curveToRelative(39.2f, -29.4f, 67.2f, -64.7f, 81.6f, -89.5f)
                curveToRelative(5.8f, -9.9f, 5.8f, -22.2f, 0.0f, -32.1f)
                curveToRelative(-14.4f, -24.8f, -42.5f, -60.1f, -81.6f, -89.5f)
                curveToRelative(-35.8f, -26.8f, -82.3f, -49.8f, -137.2f, -53.8f)
                lineTo(275.2f, 38.4f)
                close()
                moveTo(384.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fishFins!!
    }

private var _fishFins: ImageVector? = null
