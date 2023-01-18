package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.3f, 116.0f)
                arcToRelative(117.3f, 117.3f, 0.0f, false, true, 0.7f, 12.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 70.0f, 204.5f)
                curveToRelative(24.6f, -6.2f, 53.5f, -18.5f, 82.0f, -34.9f)
                reflectiveCurveTo(205.6f, 134.2f, 223.3f, 116.0f)
                close()
                moveTo(245.8f, 60.0f)
                curveToRelative(-5.5f, -9.5f, -20.3f, -18.4f, -59.8f, -8.5f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 32.0f, 128.0f)
                arcToRelative(117.3f, 117.3f, 0.0f, false, false, 0.7f, 12.0f)
                curveTo(4.4f, 169.2f, 4.8f, 186.5f, 10.2f, 196.0f)
                curveToRelative(3.7f, 6.4f, 11.9f, 12.8f, 29.8f, 12.8f)
                arcToRelative(121.7f, 121.7f, 0.0f, false, false, 25.5f, -3.2f)
                lineToRelative(4.5f, -1.1f)
                arcToRelative(105.0f, 105.0f, 0.0f, false, true, -14.2f, -13.3f)
                curveToRelative(-18.7f, 3.3f, -29.3f, 1.0f, -31.7f, -3.2f)
                curveToRelative(-1.5f, -2.6f, -0.7f, -7.5f, 2.3f, -13.4f)
                arcTo(85.7f, 85.7f, 0.0f, false, true, 37.1f, 159.0f)
                arcToRelative(95.2f, 95.2f, 0.0f, false, false, 18.7f, 32.2f)
                lineToRelative(6.2f, -1.3f)
                curveToRelative(24.0f, -5.3f, 53.1f, -17.5f, 82.0f, -34.2f)
                reflectiveCurveToRelative(54.0f, -35.8f, 70.6f, -53.9f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 4.3f, -4.8f)
                arcToRelative(95.2f, 95.2f, 0.0f, false, false, -18.7f, -32.2f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, true, 19.0f, -1.5f)
                curveToRelative(6.6f, 0.4f, 11.2f, 2.1f, 12.7f, 4.7f)
                curveToRelative(2.4f, 4.2f, -0.9f, 14.5f, -13.0f, 29.0f)
                arcToRelative(107.3f, 107.3f, 0.0f, false, true, 4.4f, 19.0f)
                lineToRelative(3.1f, -3.3f)
                curveTo(251.7f, 85.2f, 250.9f, 68.9f, 245.8f, 60.0f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
