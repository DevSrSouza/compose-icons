package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) {
            return _gitPullRequest!!
        }
        _gitPullRequest = Builder(name = "GitPullRequest", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 68.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 68.0f, 40.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 96.0f, 68.0f)
                close()
                moveTo(188.0f, 160.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 188.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -44.0f, 35.1f)
                verticalLineToRelative(49.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 16.0f, 0.0f)
                lineTo(76.0f, 103.1f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 104.0f, 68.0f)
                close()
                moveTo(48.0f, 68.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 68.0f, 88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 68.0f)
                close()
                moveTo(88.0f, 188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 88.0f, 188.0f)
                close()
                moveTo(196.0f, 152.9f)
                verticalLineToRelative(-33.0f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, false, -16.4f, -39.6f)
                lineTo(155.3f, 56.0f)
                lineTo(176.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(128.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(144.0f, 67.3f)
                lineToRelative(24.3f, 24.3f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 180.0f, 119.9f)
                verticalLineToRelative(33.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(188.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 188.0f, 208.0f)
                close()
            }
        }
        .build()
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
