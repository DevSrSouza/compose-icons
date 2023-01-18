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

public val RemixIcons.GitBranchFill: ImageVector
    get() {
        if (_gitBranchFill != null) {
            return _gitBranchFill!!
        }
        _gitBranchFill = Builder(name = "GitBranchFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.105f, 15.21f)
                arcTo(3.001f, 3.001f, 0.0f, true, true, 5.0f, 15.17f)
                verticalLineTo(8.83f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineTo(12.0f)
                curveToRelative(0.836f, -0.628f, 1.874f, -1.0f, 3.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, false, 2.895f, -2.21f)
                arcToRelative(3.001f, 3.001f, 0.0f, true, true, 2.032f, 0.064f)
                arcTo(5.001f, 5.001f, 0.0f, false, true, 14.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, false, -2.895f, 2.21f)
                close()
            }
        }
        .build()
        return _gitBranchFill!!
    }

private var _gitBranchFill: ImageVector? = null
