package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 8.25f)
                lineToRelative(7.51f, 1.0f)
                lineToRelative(-7.5f, -3.22f)
                close()
                moveTo(4.01f, 17.97f)
                lineToRelative(7.5f, -3.22f)
                lineToRelative(-7.51f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.01f, 3.0f)
                lineTo(2.0f, 10.0f)
                lineToRelative(15.0f, 2.0f)
                lineToRelative(-15.0f, 2.0f)
                lineToRelative(0.01f, 7.0f)
                lineTo(23.0f, 12.0f)
                lineTo(2.01f, 3.0f)
                close()
                moveTo(4.0f, 8.25f)
                lineTo(4.0f, 6.03f)
                lineToRelative(7.51f, 3.22f)
                lineToRelative(-7.51f, -1.0f)
                close()
                moveTo(4.01f, 17.97f)
                verticalLineToRelative(-2.22f)
                lineToRelative(7.51f, -1.0f)
                lineToRelative(-7.51f, 3.22f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
