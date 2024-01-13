package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FeedPullRequestOpen16: ImageVector
    get() {
        if (_feedPullRequestOpen16 != null) {
            return _feedPullRequestOpen16!!
        }
        _feedPullRequestOpen16 = Builder(name = "FeedPullRequestOpen16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(6.75f, 10.5f)
                curveToRelative(0.0f, -0.793f, -0.527f, -1.462f, -1.25f, -1.678f)
                lineTo(5.5f, 6.928f)
                arcTo(1.752f, 1.752f, 0.0f, false, false, 5.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.5f, 3.428f)
                verticalLineToRelative(1.894f)
                arcTo(1.752f, 1.752f, 0.0f, false, false, 5.0f, 12.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.75f, -1.75f)
                close()
                moveTo(10.0f, 5.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.822f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, false, 0.5f, 3.428f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.5f, -3.428f)
                lineTo(11.75f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(10.0f, 4.5f)
                lineTo(10.0f, 3.129f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.427f, -0.177f)
                lineTo(7.702f, 4.823f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, 0.354f)
                lineToRelative(1.871f, 1.871f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 10.0f, 6.871f)
                close()
            }
        }
        .build()
        return _feedPullRequestOpen16!!
    }

private var _feedPullRequestOpen16: ImageVector? = null
