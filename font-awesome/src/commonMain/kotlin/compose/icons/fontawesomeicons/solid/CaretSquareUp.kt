package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CaretSquareUp: ImageVector
    get() {
        if (_caretSquareUp != null) {
            return _caretSquareUp!!
        }
        _caretSquareUp = Builder(name = "CaretSquareUp", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 432.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                close()
                moveTo(355.515f, 291.515f)
                lineToRelative(-123.03f, -123.03f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0.0f)
                lineTo(92.485f, 291.515f)
                curveToRelative(-7.56f, 7.56f, -2.206f, 20.485f, 8.485f, 20.485f)
                horizontalLineToRelative(246.059f)
                curveToRelative(10.691f, 0.0f, 16.045f, -12.926f, 8.486f, -20.485f)
                close()
            }
        }
        .build()
        return _caretSquareUp!!
    }

private var _caretSquareUp: ImageVector? = null
