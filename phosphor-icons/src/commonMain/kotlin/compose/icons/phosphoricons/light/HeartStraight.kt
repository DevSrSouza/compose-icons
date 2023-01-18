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

public val LightGroup.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) {
            return _heartStraight!!
        }
        _heartStraight = Builder(name = "HeartStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 220.2f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, true, -9.9f, -4.1f)
                lineTo(35.0f, 133.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 2.2f, -84.2f)
                arcToRelative(56.5f, 56.5f, 0.0f, false, true, 41.6f, -14.0f)
                arcToRelative(62.8f, 62.8f, 0.0f, false, true, 40.3f, 18.3f)
                lineTo(128.0f, 62.0f)
                lineToRelative(11.0f, -11.0f)
                arcToRelative(57.9f, 57.9f, 0.0f, false, true, 84.1f, 2.2f)
                arcToRelative(56.2f, 56.2f, 0.0f, false, true, 14.1f, 41.6f)
                arcToRelative(62.8f, 62.8f, 0.0f, false, true, -18.3f, 40.3f)
                lineToRelative(-81.0f, 81.0f)
                horizontalLineToRelative(0.0f)
                arcTo(13.6f, 13.6f, 0.0f, false, true, 128.0f, 220.2f)
                close()
                moveTo(133.6f, 211.9f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(75.0f, 46.7f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 45.3f, 57.8f)
                arcToRelative(45.8f, 45.8f, 0.0f, false, false, -1.8f, 66.7f)
                lineToRelative(83.1f, 83.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 2.8f, 0.0f)
                lineToRelative(81.0f, -81.0f)
                curveToRelative(18.2f, -18.2f, 19.9f, -47.5f, 3.8f, -65.3f)
                arcToRelative(45.8f, 45.8f, 0.0f, false, false, -66.7f, -1.8f)
                lineTo(132.2f, 74.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.5f, 0.0f)
                lineTo(110.6f, 61.6f)
                arcTo(50.3f, 50.3f, 0.0f, false, false, 75.0f, 46.7f)
                close()
            }
        }
        .build()
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
