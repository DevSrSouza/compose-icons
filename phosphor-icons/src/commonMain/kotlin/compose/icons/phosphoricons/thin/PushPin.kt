package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.PushPin: ImageVector
    get() {
        if (_pushPin != null) {
            return _pushPin!!
        }
        _pushPin = Builder(name = "PushPin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.7f, 96.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -3.5f, -8.5f)
                lineTo(168.5f, 26.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -17.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(91.1f, 87.3f)
                curveToRelative(-8.1f, -3.1f, -32.8f, -9.5f, -59.0f, 11.6f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -4.5f, 8.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.5f, 9.1f)
                lineTo(82.3f, 168.0f)
                lineTo(45.2f, 205.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(88.0f, 173.7f)
                lineToRelative(51.0f, 51.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 8.5f, 3.5f)
                horizontalLineToRelative(0.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.7f, -4.8f)
                curveToRelative(19.8f, -26.3f, 16.5f, -47.2f, 11.7f, -58.5f)
                lineToRelative(60.4f, -60.4f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 232.7f, 96.0f)
                close()
                moveTo(223.5f, 98.8f)
                lineTo(161.2f, 161.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.8f, 4.6f)
                curveToRelative(10.4f, 20.8f, -1.6f, 42.0f, -9.7f, 52.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.9f, 1.6f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -3.1f, -1.2f)
                lineTo(36.8f, 111.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -1.2f, -3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.5f, -2.9f)
                curveTo(50.1f, 94.7f, 62.5f, 91.9f, 72.0f, 91.9f)
                reflectiveCurveToRelative(17.7f, 3.4f, 18.2f, 3.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 4.6f, -0.8f)
                lineToRelative(62.4f, -62.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(60.7f, 60.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                close()
            }
        }
        .build()
        return _pushPin!!
    }

private var _pushPin: ImageVector? = null
