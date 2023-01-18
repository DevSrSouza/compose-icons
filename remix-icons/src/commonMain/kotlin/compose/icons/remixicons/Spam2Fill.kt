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

public val RemixIcons.Spam2Fill: ImageVector
    get() {
        if (_spam2Fill != null) {
            return _spam2Fill!!
        }
        _spam2Fill = Builder(name = "Spam2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.218f, 2.5f)
                lineToRelative(5.683f, 5.682f)
                verticalLineToRelative(8.036f)
                lineToRelative(-5.683f, 5.683f)
                lineTo(8.182f, 21.901f)
                lineToRelative(-5.683f, -5.683f)
                lineTo(2.499f, 8.182f)
                lineToRelative(5.683f, -5.683f)
                horizontalLineToRelative(8.036f)
                close()
                moveTo(11.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _spam2Fill!!
    }

private var _spam2Fill: ImageVector? = null
