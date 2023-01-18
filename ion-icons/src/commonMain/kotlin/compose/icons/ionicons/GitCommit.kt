package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) {
            return _gitCommit!!
        }
        _gitCommit = Builder(name = "GitCommit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 224.0f)
                horizontalLineTo(380.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, false, -247.9f, 0.0f)
                horizontalLineTo(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 64.0f)
                horizontalLineToRelative(68.05f)
                arcTo(128.0f, 128.0f, 0.0f, false, false, 380.0f, 288.0f)
                horizontalLineTo(448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f)
                close()
                moveTo(256.0f, 320.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, -64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 256.0f, 320.0f)
                close()
            }
        }
        .build()
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
