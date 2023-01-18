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

public val ThinGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 148.0f, 92.0f)
                close()
                moveTo(100.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 100.0f, 84.0f)
                close()
                moveTo(248.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(212.0f, 132.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(83.6f, 83.6f, 0.0f, false, true, -4.0f, 25.6f)
                lineToRelative(25.9f, 14.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, 7.5f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -2.0f, -0.5f)
                lineToRelative(-24.7f, -14.3f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, -154.4f, 0.0f)
                lineTo(26.1f, 191.5f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -2.0f, 0.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -7.5f)
                lineTo(48.0f, 169.6f)
                arcTo(83.6f, 83.6f, 0.0f, false, true, 44.0f, 144.0f)
                lineTo(44.0f, 132.0f)
                lineTo(12.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(44.0f, 124.0f)
                lineTo(44.0f, 112.0f)
                arcToRelative(83.6f, 83.6f, 0.0f, false, true, 4.0f, -25.6f)
                lineTo(22.1f, 71.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -7.0f)
                lineTo(50.8f, 78.8f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, 154.4f, 0.0f)
                lineToRelative(24.7f, -14.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, 7.0f)
                lineTo(208.0f, 86.4f)
                arcToRelative(83.6f, 83.6f, 0.0f, false, true, 4.0f, 25.6f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
                moveTo(52.0f, 124.0f)
                lineTo(204.0f, 124.0f)
                lineTo(204.0f, 112.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f)
                close()
                moveTo(124.0f, 219.9f)
                lineTo(124.0f, 132.0f)
                lineTo(52.0f, 132.0f)
                verticalLineToRelative(12.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, false, 124.0f, 219.9f)
                close()
                moveTo(204.0f, 132.0f)
                lineTo(132.0f, 132.0f)
                verticalLineToRelative(87.9f)
                arcTo(76.1f, 76.1f, 0.0f, false, false, 204.0f, 144.0f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
