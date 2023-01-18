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

public val RemixIcons.GitlabFill: ImageVector
    get() {
        if (_gitlabFill != null) {
            return _gitlabFill!!
        }
        _gitlabFill = Builder(name = "GitlabFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.868f, 2.75f)
                lineTo(8.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(2.132f, -7.25f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.765f, -0.01f)
                lineToRelative(3.495f, 10.924f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.173f, 0.55f)
                lineTo(12.0f, 22.0f)
                lineTo(1.78f, 14.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.172f, -0.55f)
                lineTo(5.103f, 2.74f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.765f, 0.009f)
                close()
            }
        }
        .build()
        return _gitlabFill!!
    }

private var _gitlabFill: ImageVector? = null
