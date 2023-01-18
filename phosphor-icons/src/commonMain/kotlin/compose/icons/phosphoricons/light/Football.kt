package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 56.6f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 199.4f, 32.0f)
                curveToRelative(-31.0f, -5.3f, -89.4f, -7.7f, -132.2f, 35.2f)
                reflectiveCurveTo(26.7f, 168.4f, 32.0f, 199.4f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 56.6f, 224.0f)
                arcToRelative(203.3f, 203.3f, 0.0f, false, false, 33.0f, 2.8f)
                curveToRelative(30.7f, 0.0f, 68.8f, -7.6f, 99.2f, -38.0f)
                curveTo(231.7f, 146.0f, 229.3f, 87.6f, 224.0f, 56.6f)
                close()
                moveTo(166.1f, 41.1f)
                arcToRelative(187.4f, 187.4f, 0.0f, false, true, 31.3f, 2.7f)
                arcToRelative(18.3f, 18.3f, 0.0f, false, true, 14.8f, 14.8f)
                arcToRelative(183.5f, 183.5f, 0.0f, false, true, 2.6f, 35.8f)
                lineTo(161.6f, 41.2f)
                close()
                moveTo(58.6f, 212.2f)
                arcToRelative(18.3f, 18.3f, 0.0f, false, true, -14.8f, -14.8f)
                arcToRelative(183.5f, 183.5f, 0.0f, false, true, -2.6f, -35.8f)
                lineToRelative(53.2f, 53.2f)
                arcTo(183.5f, 183.5f, 0.0f, false, true, 58.6f, 212.2f)
                close()
                moveTo(180.3f, 180.3f)
                curveToRelative(-11.8f, 11.9f, -34.4f, 28.6f, -70.2f, 33.3f)
                lineTo(42.4f, 145.9f)
                curveToRelative(4.7f, -35.8f, 21.4f, -58.4f, 33.3f, -70.2f)
                reflectiveCurveToRelative(34.4f, -28.6f, 70.2f, -33.3f)
                lineToRelative(67.7f, 67.7f)
                curveTo(208.9f, 145.9f, 192.2f, 168.5f, 180.3f, 180.3f)
                close()
                moveTo(164.2f, 91.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                lineToRelative(-16.4f, 16.5f)
                lineToRelative(10.4f, 10.4f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -8.5f, 0.0f)
                lineToRelative(-10.4f, -10.4f)
                lineToRelative(-14.1f, 14.1f)
                lineToRelative(10.4f, 10.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.3f, 10.2f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.2f, -1.7f)
                lineToRelative(-10.4f, -10.4f)
                lineToRelative(-16.5f, 16.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineToRelative(16.4f, -16.5f)
                lineTo(97.8f, 128.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, -8.5f)
                lineToRelative(10.4f, 10.4f)
                lineToRelative(14.1f, -14.1f)
                lineToRelative(-10.4f, -10.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, -8.5f)
                lineToRelative(10.4f, 10.4f)
                lineToRelative(16.5f, -16.4f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 164.2f, 91.8f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
