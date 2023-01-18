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

public val ThinGroup.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 116.0f, 64.0f)
                close()
                moveTo(166.8f, 195.4f)
                lineTo(170.7f, 222.3f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -2.9f, 9.6f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -9.0f, 4.1f)
                lineTo(97.2f, 236.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -9.0f, -4.1f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, true, -2.9f, -9.6f)
                lineToRelative(3.9f, -26.9f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 36.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(60.0f, 108.0f)
                lineTo(60.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 28.0f)
                lineTo(184.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(68.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 166.8f, 195.4f)
                close()
                moveTo(68.0f, 108.0f)
                lineTo(188.0f, 108.0f)
                lineTo(188.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(72.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(159.2f, 198.6f)
                arcToRelative(92.8f, 92.8f, 0.0f, false, true, -62.4f, 0.0f)
                lineToRelative(-3.5f, 24.8f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 0.9f, 3.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.0f, 1.4f)
                horizontalLineToRelative(61.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.0f, -1.4f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 0.9f, -3.2f)
                close()
                moveTo(211.9f, 116.0f)
                lineTo(44.1f, 116.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 167.8f, 0.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
