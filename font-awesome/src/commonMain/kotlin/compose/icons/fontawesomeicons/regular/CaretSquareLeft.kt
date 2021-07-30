package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.CaretSquareLeft: ImageVector
    get() {
        if (_caretSquareLeft != null) {
            return _caretSquareLeft!!
        }
        _caretSquareLeft = Builder(name = "CaretSquareLeft", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 157.1f)
                verticalLineToRelative(197.8f)
                curveToRelative(0.0f, 10.7f, -13.0f, 16.1f, -20.5f, 8.5f)
                lineToRelative(-98.3f, -98.9f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.2f, 0.0f, -16.9f)
                lineToRelative(98.3f, -98.9f)
                curveToRelative(7.5f, -7.7f, 20.5f, -2.3f, 20.5f, 8.4f)
                close()
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(400.0f, 426.0f)
                lineTo(400.0f, 86.0f)
                curveToRelative(0.0f, -3.3f, -2.7f, -6.0f, -6.0f, -6.0f)
                lineTo(54.0f, 80.0f)
                curveToRelative(-3.3f, 0.0f, -6.0f, 2.7f, -6.0f, 6.0f)
                verticalLineToRelative(340.0f)
                curveToRelative(0.0f, 3.3f, 2.7f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(340.0f)
                curveToRelative(3.3f, 0.0f, 6.0f, -2.7f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _caretSquareLeft!!
    }

private var _caretSquareLeft: ImageVector? = null
