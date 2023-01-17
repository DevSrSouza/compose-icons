package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.GitPullRequest24: ImageVector
    get() {
        if (_gitPullRequest24 != null) {
            return _gitPullRequest24!!
        }
        _gitPullRequest24 = Builder(name = "GitPullRequest24", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 19.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(1.5f, 19.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(1.5f, 4.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(4.75f, 3.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.001f, 3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 4.75f, 3.0f)
                close()
                moveTo(4.75f, 17.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.001f, 3.501f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 4.75f, 17.5f)
                close()
                moveTo(19.25f, 17.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.001f, 3.501f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.001f, -3.501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.405f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineTo(12.185f, 4.0f)
                horizontalLineToRelative(4.065f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 20.0f, 7.75f)
                verticalLineToRelative(8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(7.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.25f, -2.25f)
                horizontalLineToRelative(-4.064f)
                lineToRelative(1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.061f, 1.06f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
                moveTo(4.75f, 7.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.5f, 8.0f)
                verticalLineToRelative(8.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 16.0f)
                verticalLineTo(8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _gitPullRequest24!!
    }

private var _gitPullRequest24: ImageVector? = null
