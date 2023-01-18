package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) {
            return _gitPullRequest!!
        }
        _gitPullRequest = Builder(name = "GitPullRequest", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -96.0f, 55.39f)
                lineTo(96.0f, 360.61f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 0.0f)
                lineTo(160.0f, 151.39f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 192.0f, 96.0f)
                close()
                moveTo(128.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 96.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 64.0f)
                close()
                moveTo(128.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 360.61f)
                verticalLineTo(156.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, -92.0f)
                horizontalLineTo(304.0f)
                verticalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.31f, -11.31f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f)
                lineToRelative(64.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 304.0f, 160.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineTo(360.61f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(384.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 384.0f, 448.0f)
                close()
            }
        }
        .build()
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
