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

public val ThinGroup.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) {
            return _gitMerge!!
        }
        _gitMerge = Builder(name = "GitMerge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 108.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -32.0f, 32.0f)
                lineTo(130.5f, 140.0f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, true, -33.8f, -15.8f)
                lineTo(75.7f, 99.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -11.7f, 0.7f)
                verticalLineToRelative(56.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(72.0f, 107.0f)
                lineToRelative(18.5f, 22.3f)
                arcToRelative(51.9f, 51.9f, 0.0f, false, false, 40.0f, 18.7f)
                lineTo(157.0f, 148.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 31.0f, -40.0f)
                close()
                moveTo(44.0f, 68.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 68.0f, 92.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 44.0f, 68.0f)
                close()
                moveTo(92.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 92.0f, 188.0f)
                close()
                moveTo(188.0f, 164.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 188.0f, 164.0f)
                close()
            }
        }
        .build()
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
