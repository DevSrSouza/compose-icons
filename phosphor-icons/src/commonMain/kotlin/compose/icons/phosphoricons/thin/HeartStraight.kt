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

public val ThinGroup.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) {
            return _heartStraight!!
        }
        _heartStraight = Builder(name = "HeartStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 218.2f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -8.5f, -3.5f)
                lineTo(36.4f, 131.6f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 2.2f, -81.3f)
                arcTo(54.0f, 54.0f, 0.0f, false, true, 78.7f, 36.8f)
                arcToRelative(60.3f, 60.3f, 0.0f, false, true, 39.0f, 17.7f)
                lineTo(128.0f, 64.8f)
                lineToRelative(12.4f, -12.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 81.3f, 2.2f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, 13.5f, 40.1f)
                arcToRelative(60.3f, 60.3f, 0.0f, false, true, -17.7f, 39.0f)
                lineToRelative(-81.0f, 81.0f)
                horizontalLineToRelative(0.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 128.0f, 218.2f)
                close()
                moveTo(133.7f, 211.9f)
                close()
                moveTo(75.0f, 44.7f)
                arcTo(45.9f, 45.9f, 0.0f, false, false, 43.9f, 56.3f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, -1.8f, 69.6f)
                lineToRelative(83.1f, 83.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(211.9f, 128.0f)
                curveToRelative(18.9f, -18.9f, 20.6f, -49.4f, 3.8f, -68.1f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, -69.6f, -1.8f)
                lineTo(130.8f, 73.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(112.0f, 60.1f)
                arcTo(52.6f, 52.6f, 0.0f, false, false, 75.0f, 44.7f)
                close()
            }
        }
        .build()
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
