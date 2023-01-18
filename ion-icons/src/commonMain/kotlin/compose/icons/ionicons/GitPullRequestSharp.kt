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

public val IonIcons.GitPullRequestSharp: ImageVector
    get() {
        if (_gitPullRequestSharp != null) {
            return _gitPullRequestSharp!!
        }
        _gitPullRequestSharp = Builder(name = "GitPullRequestSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -97.0f, 54.81f)
                verticalLineToRelative(209.8f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 0.0f)
                lineTo(159.0f, 152.0f)
                arcTo(64.06f, 64.06f, 0.0f, false, false, 192.0f, 96.0f)
                close()
                moveTo(128.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 96.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 64.0f)
                close()
                moveTo(127.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 127.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 360.61f)
                verticalLineTo(156.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, -92.0f)
                horizontalLineTo(289.0f)
                verticalLineTo(9.93f)
                lineTo(201.14f, 96.0f)
                lineTo(289.0f, 182.07f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(35.0f)
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
        return _gitPullRequestSharp!!
    }

private var _gitPullRequestSharp: ImageVector? = null
