package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Gmail: ImageVector
    get() {
        if (_gmail != null) {
            return _gmail!!
        }
        _gmail = Builder(name = "Gmail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.457f)
                verticalLineToRelative(13.909f)
                curveToRelative(0.0f, 0.904f, -0.732f, 1.636f, -1.636f, 1.636f)
                horizontalLineToRelative(-3.819f)
                verticalLineTo(11.73f)
                lineTo(12.0f, 16.64f)
                lineToRelative(-6.545f, -4.91f)
                verticalLineToRelative(9.273f)
                horizontalLineTo(1.636f)
                arcTo(1.636f, 1.636f, 0.0f, false, true, 0.0f, 19.366f)
                verticalLineTo(5.457f)
                curveToRelative(0.0f, -2.023f, 2.309f, -3.178f, 3.927f, -1.964f)
                lineTo(5.455f, 4.64f)
                lineTo(12.0f, 9.548f)
                lineToRelative(6.545f, -4.91f)
                lineToRelative(1.528f, -1.145f)
                curveTo(21.69f, 2.28f, 24.0f, 3.434f, 24.0f, 5.457f)
                close()
            }
        }
        .build()
        return _gmail!!
    }

private var _gmail: ImageVector? = null
