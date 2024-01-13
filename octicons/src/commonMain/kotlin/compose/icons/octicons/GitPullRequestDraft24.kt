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

public val Octicons.GitPullRequestDraft24: ImageVector
    get() {
        if (_gitPullRequestDraft24 != null) {
            return _gitPullRequestDraft24!!
        }
        _gitPullRequestDraft24 = Builder(name = "GitPullRequestDraft24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 1.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.745f, 6.414f)
                arcTo(0.827f, 0.827f, 0.0f, false, true, 5.5f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(0.827f, 0.827f, 0.0f, false, true, -0.005f, 0.086f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 4.75f, 22.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -0.745f, -6.414f)
                arcTo(0.827f, 0.827f, 0.0f, false, true, 4.0f, 16.0f)
                lineTo(4.0f, 8.0f)
                curveToRelative(0.0f, -0.029f, 0.002f, -0.057f, 0.005f, -0.086f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 4.75f, 1.5f)
                close()
                moveTo(16.0f, 19.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -6.5f, 0.0f)
                close()
                moveTo(3.0f, 4.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.501f, -0.001f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 3.0f, 4.75f)
                close()
                moveTo(3.0f, 19.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.501f, -0.001f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 3.0f, 19.25f)
                close()
                moveTo(19.25f, 17.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.001f, 3.501f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.001f, -3.501f)
                close()
                moveTo(19.25f, 6.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, -3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, 3.5f)
                close()
                moveTo(21.0f, 11.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 3.5f, 0.0f)
                close()
            }
        }
        .build()
        return _gitPullRequestDraft24!!
    }

private var _gitPullRequestDraft24: ImageVector? = null
