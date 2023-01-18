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

public val ThinGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 64.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 128.0f, 64.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, -56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 128.0f, 184.0f)
                close()
                moveTo(124.0f, 36.0f)
                lineTo(124.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(132.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(46.0f, 51.6f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 51.6f, 46.0f)
                lineTo(65.8f, 60.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, 5.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.9f, 1.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, -1.1f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(16.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(36.0f, 124.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(65.8f, 190.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, 5.7f)
                lineTo(51.6f, 210.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, 1.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 46.0f, 210.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(14.1f, -14.2f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 65.8f, 190.2f)
                close()
                moveTo(132.0f, 220.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(210.0f, 204.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, 1.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, -1.2f)
                lineToRelative(-14.2f, -14.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.7f, -5.7f)
                close()
                moveTo(244.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(220.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 128.0f)
                close()
                moveTo(210.0f, 46.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineTo(195.9f, 65.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, 1.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.9f, -1.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.0f, -5.7f)
                lineTo(204.4f, 46.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 210.0f, 46.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
