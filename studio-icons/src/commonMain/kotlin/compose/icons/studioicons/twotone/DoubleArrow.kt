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

public val TwotoneGroup.DoubleArrow: ImageVector
    get() {
        if (_doubleArrow != null) {
            return _doubleArrow!!
        }
        _doubleArrow = Builder(name = "DoubleArrow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 5.0f)
                lineToRelative(-4.5f, 0.0f)
                lineToRelative(5.0f, 7.0f)
                lineToRelative(-5.0f, 7.0f)
                lineToRelative(4.5f, 0.0f)
                lineToRelative(5.0f, -7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.0f)
                lineToRelative(-4.5f, 0.0f)
                lineToRelative(5.0f, 7.0f)
                lineToRelative(-5.0f, 7.0f)
                lineToRelative(4.5f, 0.0f)
                lineToRelative(5.0f, -7.0f)
                close()
            }
        }
        .build()
        return _doubleArrow!!
    }

private var _doubleArrow: ImageVector? = null
