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

public val SimpleIcons.Gitlfs: ImageVector
    get() {
        if (_gitlfs != null) {
            return _gitlfs!!
        }
        _gitlfs = Builder(name = "Gitlfs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.967f, 0.304f)
                lineTo(0.0f, 7.215f)
                verticalLineToRelative(9.68f)
                lineToRelative(11.79f, 6.802f)
                verticalLineTo(14.02f)
                lineToRelative(11.96f, -6.91f)
                lineToRelative(-4.383f, -2.53f)
                lineToRelative(-11.959f, 6.905f)
                verticalLineToRelative(3.887f)
                lineToRelative(-2.775f, -1.601f)
                verticalLineTo(9.886f)
                lineToRelative(11.965f, -6.91f)
                close()
                moveTo(24.0f, 7.545f)
                lineTo(12.29f, 14.31f)
                verticalLineToRelative(9.387f)
                lineTo(24.0f, 16.929f)
                verticalLineTo(7.547f)
                close()
            }
        }
        .build()
        return _gitlfs!!
    }

private var _gitlfs: ImageVector? = null
