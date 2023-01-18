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

public val ThinGroup.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) {
            return _gitBranch!!
        }
        _gitBranch = Builder(name = "GitBranch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 68.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -36.0f, 31.7f)
                lineTo(184.0f, 104.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(92.0f, 124.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -20.0f, 8.4f)
                lineTo(72.0f, 99.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(56.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(72.0f, 152.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(192.0f, 99.7f)
                arcTo(31.9f, 31.9f, 0.0f, false, false, 220.0f, 68.0f)
                close()
                moveTo(44.0f, 68.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 68.0f, 92.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 44.0f, 68.0f)
                close()
                moveTo(92.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 92.0f, 188.0f)
                close()
                moveTo(188.0f, 92.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 188.0f, 92.0f)
                close()
            }
        }
        .build()
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
