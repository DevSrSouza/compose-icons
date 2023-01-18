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

public val LightGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 34.0f)
                arcToRelative(57.3f, 57.3f, 0.0f, false, false, -41.0f, 17.0f)
                lineToRelative(-7.6f, 7.6f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 22.0f, 92.0f)
                curveToRelative(0.0f, 30.0f, 17.5f, 60.9f, 52.0f, 92.0f)
                curveToRelative(25.2f, 22.6f, 50.0f, 36.7f, 51.1f, 37.2f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 5.8f, 0.0f)
                curveToRelative(1.1f, -0.5f, 25.9f, -14.6f, 51.1f, -37.2f)
                curveToRelative(34.5f, -31.1f, 52.0f, -62.0f, 52.0f, -92.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 176.0f, 34.0f)
                close()
                moveTo(128.0f, 209.0f)
                curveToRelative(-16.2f, -9.7f, -94.0f, -59.7f, -94.0f, -117.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 84.8f, -24.8f)
                lineTo(103.0f, 83.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 8.5f)
                lineToRelative(27.7f, 27.7f)
                lineTo(119.0f, 131.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 8.5f, 0.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, -8.5f)
                lineTo(115.7f, 87.2f)
                lineToRelative(14.7f, -14.7f)
                horizontalLineToRelative(0.2f)
                lineToRelative(12.9f, -12.9f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 222.0f, 92.0f)
                curveTo(222.0f, 149.3f, 144.2f, 199.3f, 128.0f, 209.0f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
