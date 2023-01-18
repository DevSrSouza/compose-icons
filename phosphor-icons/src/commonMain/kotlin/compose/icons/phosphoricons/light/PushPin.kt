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

public val LightGroup.PushPin: ImageVector
    get() {
        if (_pushPin != null) {
            return _pushPin!!
        }
        _pushPin = Builder(name = "PushPin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.7f, 96.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -4.1f, -9.9f)
                lineTo(169.9f, 25.4f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -19.8f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(90.5f, 85.0f)
                curveTo(81.0f, 81.7f, 56.6f, 76.6f, 30.8f, 97.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -1.1f, 20.8f)
                lineTo(79.5f, 168.0f)
                lineTo(43.8f, 203.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineTo(88.0f, 176.5f)
                lineToRelative(49.6f, 49.6f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 9.9f, 4.1f)
                horizontalLineToRelative(1.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 10.2f, -5.6f)
                curveToRelative(19.7f, -26.2f, 17.1f, -47.2f, 12.4f, -59.3f)
                lineToRelative(59.5f, -59.4f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 234.7f, 96.0f)
                close()
                moveTo(222.1f, 97.4f)
                lineTo(159.8f, 159.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -1.2f, 6.9f)
                curveToRelative(10.0f, 19.9f, -1.7f, 40.3f, -9.5f, 50.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, 0.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.6f, -0.6f)
                lineTo(38.2f, 109.7f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.6f, -1.5f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.8f, -1.5f)
                curveTo(50.9f, 96.6f, 62.9f, 94.0f, 72.1f, 94.0f)
                reflectiveCurveToRelative(16.7f, 3.1f, 17.2f, 3.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.9f, -1.2f)
                lineToRelative(62.4f, -62.3f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineToRelative(60.7f, 60.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, 2.8f)
                close()
            }
        }
        .build()
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
