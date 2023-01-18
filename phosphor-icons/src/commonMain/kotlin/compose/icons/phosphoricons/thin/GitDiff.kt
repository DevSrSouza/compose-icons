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

public val ThinGroup.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) {
            return _gitDiff!!
        }
        _gitDiff = Builder(name = "GitDiff", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 156.3f)
                lineTo(200.0f, 119.9f)
                arcToRelative(51.7f, 51.7f, 0.0f, false, false, -15.2f, -36.8f)
                lineTo(153.7f, 52.0f)
                lineTo(184.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(144.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(140.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(148.0f, 57.7f)
                lineToRelative(31.1f, 31.1f)
                arcTo(43.6f, 43.6f, 0.0f, false, true, 192.0f, 119.9f)
                verticalLineToRelative(36.4f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(196.0f, 212.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 196.0f, 212.0f)
                close()
                moveTo(112.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(30.3f)
                lineTo(76.9f, 167.2f)
                arcTo(43.6f, 43.6f, 0.0f, false, true, 64.0f, 136.1f)
                lineTo(64.0f, 99.7f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(36.4f)
                arcToRelative(51.7f, 51.7f, 0.0f, false, false, 15.2f, 36.8f)
                lineTo(102.3f, 204.0f)
                lineTo(72.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(116.0f, 168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 112.0f, 164.0f)
                close()
                moveTo(36.0f, 68.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 60.0f, 92.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 36.0f, 68.0f)
                close()
            }
        }
        .build()
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
