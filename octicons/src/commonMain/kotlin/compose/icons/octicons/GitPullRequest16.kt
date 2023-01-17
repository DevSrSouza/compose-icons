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

public val Octicons.GitPullRequest16: ImageVector
    get() {
        if (_gitPullRequest16 != null) {
            return _gitPullRequest16!!
        }
        _gitPullRequest16 = Builder(name = "GitPullRequest16", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 3.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 3.0f, 2.122f)
                verticalLineToRelative(5.256f)
                arcToRelative(2.251f, 2.251f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(3.0f, 5.372f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 1.5f, 3.25f)
                close()
                moveTo(7.177f, 3.073f)
                lineTo(9.573f, 0.677f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 10.0f, 0.854f)
                lineTo(10.0f, 2.5f)
                horizontalLineToRelative(1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 5.0f)
                verticalLineToRelative(5.628f)
                arcToRelative(2.251f, 2.251f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(12.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.646f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.427f, 0.177f)
                lineTo(7.177f, 3.427f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.354f)
                close()
                moveTo(3.75f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(3.75f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(12.0f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _gitPullRequest16!!
    }

private var _gitPullRequest16: ImageVector? = null
