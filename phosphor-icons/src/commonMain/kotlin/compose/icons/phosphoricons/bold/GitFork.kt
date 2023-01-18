package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.GitFork: ImageVector
    get() {
        if (_gitFork != null) {
            return _gitFork!!
        }
        _gitFork = Builder(name = "GitFork", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 68.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -52.2f, 38.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 116.0f)
                lineTo(92.0f, 116.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.5f, -3.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, -3.3f, -6.4f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -24.1f, 0.1f)
                arcTo(35.8f, 35.8f, 0.0f, false, false, 92.0f, 140.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(9.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 24.0f, 0.0f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 35.9f, -33.8f)
                arcTo(40.1f, 40.1f, 0.0f, false, false, 228.0f, 68.0f)
                close()
                moveTo(68.0f, 52.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 52.0f, 68.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 68.0f, 52.0f)
                close()
                moveTo(128.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 204.0f)
                close()
                moveTo(188.0f, 84.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 188.0f, 84.0f)
                close()
            }
        }
        .build()
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
