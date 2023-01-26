package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.RemoveDone: ImageVector
    get() {
        if (_removeDone != null) {
            return _removeDone!!
        }
        _removeDone = Builder(name = "RemoveDone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.84f, 1.98f)
                lineTo(3.43f, 3.39f)
                lineToRelative(10.38f, 10.38f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(5.66f, 5.66f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(6.6f, 6.6f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.84f, 1.98f)
                close()
                moveTo(18.05f, 12.36f)
                lineTo(23.0f, 7.4f)
                lineTo(21.57f, 6.0f)
                lineToRelative(-4.94f, 4.94f)
                lineTo(18.05f, 12.36f)
                close()
                moveTo(17.34f, 7.4f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.34f, 7.4f)
                close()
                moveTo(1.08f, 12.35f)
                lineToRelative(5.66f, 5.66f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.66f, -5.66f)
                lineTo(1.08f, 12.35f)
                close()
            }
        }
        .build()
        return _removeDone!!
    }

private var _removeDone: ImageVector? = null
