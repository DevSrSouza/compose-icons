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

public val Octicons.FeedPullRequestDraft16: ImageVector
    get() {
        if (_feedPullRequestDraft16 != null) {
            return _feedPullRequestDraft16!!
        }
        _feedPullRequestDraft16 = Builder(name = "FeedPullRequestDraft16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(7.25f, 10.5f)
                curveToRelative(0.0f, -0.793f, -0.527f, -1.462f, -1.25f, -1.678f)
                lineTo(6.0f, 6.928f)
                arcTo(1.752f, 1.752f, 0.0f, false, false, 5.5f, 3.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 5.0f, 6.928f)
                verticalLineToRelative(1.894f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, false, 0.5f, 3.428f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.75f, -1.75f)
                close()
                moveTo(10.5f, 12.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.001f, -3.499f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.001f, 3.499f)
                close()
                moveTo(10.5f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
                moveTo(11.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _feedPullRequestDraft16!!
    }

private var _feedPullRequestDraft16: ImageVector? = null
