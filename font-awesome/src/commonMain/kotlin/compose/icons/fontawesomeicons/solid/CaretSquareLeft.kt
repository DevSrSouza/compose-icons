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

public val SolidGroup.CaretSquareLeft: ImageVector
    get() {
        if (_caretSquareLeft != null) {
            return _caretSquareLeft!!
        }
        _caretSquareLeft = Builder(name = "CaretSquareLeft", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 480.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(259.52f, 124.49f)
                lineToRelative(-123.03f, 123.03f)
                curveToRelative(-4.69f, 4.69f, -4.69f, 12.28f, 0.0f, 16.97f)
                lineToRelative(123.03f, 123.03f)
                curveToRelative(7.56f, 7.56f, 20.49f, 2.21f, 20.49f, -8.48f)
                verticalLineTo(132.97f)
                curveToRelative(0.0f, -10.69f, -12.93f, -16.05f, -20.48f, -8.49f)
                close()
            }
        }
        .build()
        return _caretSquareLeft!!
    }

private var _caretSquareLeft: ImageVector? = null
