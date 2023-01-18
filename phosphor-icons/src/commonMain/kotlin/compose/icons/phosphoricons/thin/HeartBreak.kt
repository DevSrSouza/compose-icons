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

public val ThinGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 36.0f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, false, -39.6f, 16.4f)
                lineToRelative(-9.3f, 9.3f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 24.0f, 92.0f)
                curveToRelative(0.0f, 29.4f, 17.3f, 59.8f, 51.3f, 90.5f)
                arcToRelative(321.4f, 321.4f, 0.0f, false, false, 50.7f, 37.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(321.4f, 321.4f, 0.0f, false, false, 50.7f, -37.0f)
                curveToRelative(34.0f, -30.7f, 51.3f, -61.1f, 51.3f, -90.5f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 176.0f, 36.0f)
                close()
                moveTo(128.0f, 211.4f)
                curveTo(114.2f, 203.1f, 32.0f, 151.7f, 32.0f, 92.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 89.3f, -24.5f)
                lineTo(104.4f, 84.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.7f)
                lineToRelative(29.2f, 29.1f)
                lineToRelative(-13.2f, 13.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 5.7f, 0.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.0f, -5.7f)
                lineTo(112.9f, 87.2f)
                lineTo(129.0f, 71.1f)
                horizontalLineToRelative(0.1f)
                lineToRelative(13.0f, -12.9f)
                arcTo(47.4f, 47.4f, 0.0f, false, true, 176.0f, 44.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, 48.0f)
                curveTo(224.0f, 151.7f, 141.8f, 203.1f, 128.0f, 211.4f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
