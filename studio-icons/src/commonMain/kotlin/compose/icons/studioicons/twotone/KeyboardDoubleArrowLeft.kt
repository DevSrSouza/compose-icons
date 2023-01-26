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

public val TwotoneGroup.KeyboardDoubleArrowLeft: ImageVector
    get() {
        if (_keyboardDoubleArrowLeft != null) {
            return _keyboardDoubleArrowLeft!!
        }
        _keyboardDoubleArrowLeft = Builder(name = "KeyboardDoubleArrowLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.59f, 18.0f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.58f, -4.59f)
                lineToRelative(4.58f, -4.59f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-6.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 18.0f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.58f, -4.59f)
                lineToRelative(4.58f, -4.59f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _keyboardDoubleArrowLeft!!
    }

private var _keyboardDoubleArrowLeft: ImageVector? = null