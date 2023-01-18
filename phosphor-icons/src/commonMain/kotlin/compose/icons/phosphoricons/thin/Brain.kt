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

public val ThinGroup.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 132.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -32.0f, -48.0f)
                lineTo(212.0f, 72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -84.0f, -18.3f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 44.0f, 72.0f)
                lineTo(44.0f, 84.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 96.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 84.0f, 18.3f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 212.0f, 184.0f)
                verticalLineToRelative(-4.0f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 244.0f, 132.0f)
                close()
                moveTo(88.0f, 220.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                verticalLineToRelative(-1.4f)
                arcTo(53.2f, 53.2f, 0.0f, false, false, 64.0f, 184.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(64.0f, 176.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 49.3f, 90.5f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 52.0f, 86.7f)
                lineTo(52.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(86.7f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 88.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
                moveTo(192.0f, 176.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(53.2f, 53.2f, 0.0f, false, false, 12.0f, -1.4f)
                lineTo(204.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -36.0f, 18.7f)
                lineTo(132.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                lineTo(204.0f, 86.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.7f, 3.8f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 192.0f, 176.0f)
                close()
                moveTo(92.0f, 92.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 84.0f, 92.0f)
                lineTo(84.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(200.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(164.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 120.0f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
