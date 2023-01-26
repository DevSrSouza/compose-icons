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

public val TwotoneGroup.DoneOutline: ImageVector
    get() {
        if (_doneOutline != null) {
            return _doneOutline!!
        }
        _doneOutline = Builder(name = "DoneOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.77f, 4.93f)
                lineToRelative(1.4f, 1.4f)
                lineTo(8.43f, 19.07f)
                lineToRelative(-5.6f, -5.6f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(4.2f, 4.2f)
                lineTo(19.77f, 4.93f)
                moveToRelative(0.0f, -2.83f)
                lineTo(8.43f, 13.44f)
                lineToRelative(-4.2f, -4.2f)
                lineTo(0.0f, 13.47f)
                lineToRelative(8.43f, 8.43f)
                lineTo(24.0f, 6.33f)
                lineTo(19.77f, 2.1f)
                close()
            }
        }
        .build()
        return _doneOutline!!
    }

private var _doneOutline: ImageVector? = null
