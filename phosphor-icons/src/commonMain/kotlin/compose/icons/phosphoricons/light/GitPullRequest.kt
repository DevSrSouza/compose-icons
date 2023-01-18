package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) {
            return _gitPullRequest!!
        }
        _gitPullRequest = Builder(name = "GitPullRequest", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.0f, 68.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -40.0f, 33.5f)
                verticalLineToRelative(53.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 12.0f, 0.0f)
                verticalLineToRelative(-53.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 102.0f, 68.0f)
                close()
                moveTo(46.0f, 68.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, true, 68.0f, 90.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 46.0f, 68.0f)
                close()
                moveTo(90.0f, 188.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 90.0f, 188.0f)
                close()
                moveTo(194.0f, 154.5f)
                lineTo(194.0f, 119.9f)
                arcToRelative(53.7f, 53.7f, 0.0f, false, false, -15.8f, -38.2f)
                lineTo(150.5f, 54.0f)
                lineTo(176.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(136.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(130.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(142.0f, 62.5f)
                lineToRelative(27.7f, 27.7f)
                arcTo(41.8f, 41.8f, 0.0f, false, true, 182.0f, 119.9f)
                verticalLineToRelative(34.6f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(188.0f, 210.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 188.0f, 210.0f)
                close()
            }
        }
        .build()
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
