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

public val RemixIcons.SkipForwardMiniFill: ImageVector
    get() {
        if (_skipForwardMiniFill != null) {
            return _skipForwardMiniFill!!
        }
        _skipForwardMiniFill = Builder(name = "SkipForwardMiniFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.788f, 17.444f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 17.035f)
                verticalLineTo(6.965f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.788f, -0.409f)
                lineToRelative(7.133f, 5.036f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.816f)
                lineToRelative(-7.133f, 5.036f)
                close()
                moveTo(16.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _skipForwardMiniFill!!
    }

private var _skipForwardMiniFill: ImageVector? = null
