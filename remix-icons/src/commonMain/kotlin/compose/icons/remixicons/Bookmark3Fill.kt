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

public val RemixIcons.Bookmark3Fill: ImageVector
    get() {
        if (_bookmark3Fill != null) {
            return _bookmark3Fill!!
        }
        _bookmark3Fill = Builder(name = "Bookmark3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(19.276f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.704f, 0.457f)
                lineTo(12.0f, 19.03f)
                lineToRelative(-8.296f, 3.702f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 22.276f)
                lineTo(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(12.0f, 13.5f)
                lineToRelative(2.939f, 1.545f)
                lineToRelative(-0.561f, -3.272f)
                lineToRelative(2.377f, -2.318f)
                lineToRelative(-3.286f, -0.478f)
                lineTo(12.0f, 6.0f)
                lineToRelative(-1.47f, 2.977f)
                lineToRelative(-3.285f, 0.478f)
                lineToRelative(2.377f, 2.318f)
                lineToRelative(-0.56f, 3.272f)
                lineTo(12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _bookmark3Fill!!
    }

private var _bookmark3Fill: ImageVector? = null
