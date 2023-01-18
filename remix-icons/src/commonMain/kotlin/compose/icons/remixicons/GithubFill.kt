package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.GithubFill: ImageVector
    get() {
        if (_githubFill != null) {
            return _githubFill!!
        }
        _githubFill = Builder(name = "GithubFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.475f, 2.0f, 2.0f, 6.475f, 2.0f, 12.0f)
                arcToRelative(9.994f, 9.994f, 0.0f, false, false, 6.838f, 9.488f)
                curveToRelative(0.5f, 0.087f, 0.687f, -0.213f, 0.687f, -0.476f)
                curveToRelative(0.0f, -0.237f, -0.013f, -1.024f, -0.013f, -1.862f)
                curveToRelative(-2.512f, 0.463f, -3.162f, -0.612f, -3.362f, -1.175f)
                curveToRelative(-0.113f, -0.288f, -0.6f, -1.175f, -1.025f, -1.413f)
                curveToRelative(-0.35f, -0.187f, -0.85f, -0.65f, -0.013f, -0.662f)
                curveToRelative(0.788f, -0.013f, 1.35f, 0.725f, 1.538f, 1.025f)
                curveToRelative(0.9f, 1.512f, 2.338f, 1.087f, 2.912f, 0.825f)
                curveToRelative(0.088f, -0.65f, 0.35f, -1.087f, 0.638f, -1.337f)
                curveToRelative(-2.225f, -0.25f, -4.55f, -1.113f, -4.55f, -4.938f)
                curveToRelative(0.0f, -1.088f, 0.387f, -1.987f, 1.025f, -2.688f)
                curveToRelative(-0.1f, -0.25f, -0.45f, -1.275f, 0.1f, -2.65f)
                curveToRelative(0.0f, 0.0f, 0.837f, -0.262f, 2.75f, 1.026f)
                arcToRelative(9.28f, 9.28f, 0.0f, false, true, 2.5f, -0.338f)
                curveToRelative(0.85f, 0.0f, 1.7f, 0.112f, 2.5f, 0.337f)
                curveToRelative(1.912f, -1.3f, 2.75f, -1.024f, 2.75f, -1.024f)
                curveToRelative(0.55f, 1.375f, 0.2f, 2.4f, 0.1f, 2.65f)
                curveToRelative(0.637f, 0.7f, 1.025f, 1.587f, 1.025f, 2.687f)
                curveToRelative(0.0f, 3.838f, -2.337f, 4.688f, -4.562f, 4.938f)
                curveToRelative(0.362f, 0.312f, 0.675f, 0.912f, 0.675f, 1.85f)
                curveToRelative(0.0f, 1.337f, -0.013f, 2.412f, -0.013f, 2.75f)
                curveToRelative(0.0f, 0.262f, 0.188f, 0.574f, 0.688f, 0.474f)
                arcTo(10.016f, 10.016f, 0.0f, false, false, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.525f, -4.475f, -10.0f, -10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _githubFill!!
    }

private var _githubFill: ImageVector? = null
