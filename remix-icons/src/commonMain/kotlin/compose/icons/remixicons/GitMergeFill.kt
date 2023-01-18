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

public val RemixIcons.GitMergeFill: ImageVector
    get() {
        if (_gitMergeFill != null) {
            return _gitMergeFill!!
        }
        _gitMergeFill = Builder(name = "GitMergeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.105f, 8.79f)
                arcTo(3.001f, 3.001f, 0.0f, false, false, 10.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, true, 4.927f, 4.146f)
                arcTo(3.001f, 3.001f, 0.0f, false, true, 18.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.105f, -5.79f)
                arcTo(3.001f, 3.001f, 0.0f, false, false, 14.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(4.978f, 4.978f, 0.0f, false, true, -3.0f, -1.0f)
                verticalLineToRelative(3.17f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(8.83f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, 2.105f, -0.04f)
                close()
            }
        }
        .build()
        return _gitMergeFill!!
    }

private var _gitMergeFill: ImageVector? = null
