package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CaretSquareDown: ImageVector
    get() {
        if (_caretSquareDown != null) {
            return _caretSquareDown!!
        }
        _caretSquareDown = Builder(name = "CaretSquareDown", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(92.5f, 220.5f)
                lineToRelative(123.0f, 123.0f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17.0f, 0.0f)
                lineToRelative(123.0f, -123.0f)
                curveToRelative(7.6f, -7.6f, 2.2f, -20.5f, -8.5f, -20.5f)
                horizontalLineTo(101.0f)
                curveToRelative(-10.7f, 0.0f, -16.1f, 12.9f, -8.5f, 20.5f)
                close()
            }
        }
        .build()
        return _caretSquareDown!!
    }

private var _caretSquareDown: ImageVector? = null
