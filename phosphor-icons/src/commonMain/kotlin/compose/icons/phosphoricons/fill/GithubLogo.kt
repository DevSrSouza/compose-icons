package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) {
            return _githubLogo!!
        }
        _githubLogo = Builder(name = "GithubLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(156.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(116.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 14.8f, -27.0f)
                arcTo(55.8f, 55.8f, 0.0f, false, true, 48.0f, 120.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 7.7f, -28.3f)
                arcTo(59.9f, 59.9f, 0.0f, false, true, 61.1f, 36.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 68.0f, 32.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, true, 48.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, true, 48.0f, -24.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 6.9f, 4.0f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, 5.4f, 47.7f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 208.0f, 112.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(55.8f, 55.8f, 0.0f, false, true, -22.8f, 45.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 200.0f, 192.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 224.0f)
                close()
            }
        }
        .build()
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
