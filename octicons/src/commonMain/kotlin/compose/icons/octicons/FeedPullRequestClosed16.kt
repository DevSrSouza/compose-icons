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

public val Octicons.FeedPullRequestClosed16: ImageVector
    get() {
        if (_feedPullRequestClosed16 != null) {
            return _feedPullRequestClosed16!!
        }
        _feedPullRequestClosed16 = Builder(name = "FeedPullRequestClosed16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(5.5f, 12.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 6.0f, 8.822f)
                lineTo(6.0f, 6.928f)
                arcTo(1.752f, 1.752f, 0.0f, false, false, 5.5f, 3.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 5.0f, 6.928f)
                verticalLineToRelative(1.894f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, false, 0.5f, 3.428f)
                close()
                moveTo(10.5f, 7.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.072f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, false, 0.5f, 3.428f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.5f, -3.428f)
                lineTo(11.0f, 7.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(11.755f, 4.487f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, -0.707f)
                lineToRelative(-0.53f, 0.531f)
                lineToRelative(-0.531f, -0.531f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.707f)
                lineToRelative(0.531f, 0.531f)
                lineToRelative(-0.531f, 0.53f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.707f)
                lineToRelative(0.531f, -0.53f)
                lineToRelative(0.53f, 0.53f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, -0.707f)
                lineToRelative(-0.53f, -0.53f)
                close()
            }
        }
        .build()
        return _feedPullRequestClosed16!!
    }

private var _feedPullRequestClosed16: ImageVector? = null
