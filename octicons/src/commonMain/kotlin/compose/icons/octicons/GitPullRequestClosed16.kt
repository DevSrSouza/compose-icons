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

public val Octicons.GitPullRequestClosed16: ImageVector
    get() {
        if (_gitPullRequestClosed16 != null) {
            return _gitPullRequestClosed16!!
        }
        _gitPullRequestClosed16 = Builder(name = "GitPullRequestClosed16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.25f, 1.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 4.0f, 5.372f)
                verticalLineToRelative(5.256f)
                arcToRelative(2.251f, 2.251f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(2.5f, 5.372f)
                arcTo(2.251f, 2.251f, 0.0f, false, true, 3.25f, 1.0f)
                close()
                moveTo(12.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.378f)
                arcToRelative(2.251f, 2.251f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(12.0f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(10.72f, 1.227f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(0.97f, 0.97f)
                lineToRelative(0.97f, -0.97f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, 1.265f, 0.332f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.205f, 0.729f)
                lineToRelative(-0.97f, 0.97f)
                lineToRelative(0.97f, 0.97f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.018f, 1.042f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.042f, 0.018f)
                lineToRelative(-0.97f, -0.97f)
                lineToRelative(-0.97f, 0.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.275f, -0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.215f, -0.734f)
                lineToRelative(0.97f, -0.97f)
                lineToRelative(-0.97f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(2.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                close()
                moveTo(3.25f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(12.75f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        .build()
        return _gitPullRequestClosed16!!
    }

private var _gitPullRequestClosed16: ImageVector? = null
