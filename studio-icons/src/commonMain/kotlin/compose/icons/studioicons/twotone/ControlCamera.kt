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

public val TwotoneGroup.ControlCamera: ImageVector
    get() {
        if (_controlCamera != null) {
            return _controlCamera!!
        }
        _controlCamera = Builder(name = "ControlCamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3f, 13.77f)
                lineTo(5.54f, 12.0f)
                lineToRelative(1.76f, -1.77f)
                lineToRelative(-1.76f, -1.77f)
                lineTo(2.0f, 12.0f)
                lineToRelative(3.54f, 3.54f)
                close()
                moveTo(15.54f, 18.46f)
                lineToRelative(-1.77f, -1.76f)
                lineTo(12.0f, 18.46f)
                lineToRelative(-1.77f, -1.76f)
                lineToRelative(-1.77f, 1.76f)
                lineTo(12.0f, 22.0f)
                close()
                moveTo(18.46f, 15.54f)
                lineTo(22.0f, 12.0f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-1.76f, 1.77f)
                lineTo(18.46f, 12.0f)
                lineToRelative(-1.76f, 1.77f)
                close()
                moveTo(12.0f, 5.54f)
                lineToRelative(1.77f, 1.76f)
                lineToRelative(1.77f, -1.76f)
                lineTo(12.0f, 2.0f)
                lineTo(8.46f, 5.54f)
                lineToRelative(1.77f, 1.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _controlCamera!!
    }

private var _controlCamera: ImageVector? = null
