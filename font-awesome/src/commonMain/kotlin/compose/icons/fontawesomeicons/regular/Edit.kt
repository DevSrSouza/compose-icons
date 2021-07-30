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

public val RegularGroup.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(402.3f, 344.9f)
                lineToRelative(32.0f, -32.0f)
                curveToRelative(5.0f, -5.0f, 13.7f, -1.5f, 13.7f, 5.7f)
                lineTo(448.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(273.5f)
                curveToRelative(7.1f, 0.0f, 10.7f, 8.6f, 5.7f, 13.7f)
                lineToRelative(-32.0f, 32.0f)
                curveToRelative(-1.5f, 1.5f, -3.5f, 2.3f, -5.7f, 2.3f)
                lineTo(48.0f, 112.0f)
                verticalLineToRelative(352.0f)
                horizontalLineToRelative(352.0f)
                lineTo(400.0f, 350.5f)
                curveToRelative(0.0f, -2.1f, 0.8f, -4.1f, 2.3f, -5.6f)
                close()
                moveTo(558.9f, 143.1f)
                lineTo(296.3f, 405.7f)
                lineToRelative(-90.4f, 10.0f)
                curveToRelative(-26.2f, 2.9f, -48.5f, -19.2f, -45.6f, -45.6f)
                lineToRelative(10.0f, -90.4f)
                lineTo(432.9f, 17.1f)
                curveToRelative(22.9f, -22.9f, 59.9f, -22.9f, 82.7f, 0.0f)
                lineToRelative(43.2f, 43.2f)
                curveToRelative(22.9f, 22.9f, 22.9f, 60.0f, 0.1f, 82.8f)
                close()
                moveTo(460.1f, 174.0f)
                lineTo(402.0f, 115.9f)
                lineTo(216.2f, 301.8f)
                lineToRelative(-7.3f, 65.3f)
                lineToRelative(65.3f, -7.3f)
                lineTo(460.1f, 174.0f)
                close()
                moveTo(524.9f, 94.3f)
                lineToRelative(-43.2f, -43.2f)
                curveToRelative(-4.1f, -4.1f, -10.8f, -4.1f, -14.8f, 0.0f)
                lineTo(436.0f, 82.0f)
                lineToRelative(58.1f, 58.1f)
                lineToRelative(30.9f, -30.9f)
                curveToRelative(4.0f, -4.2f, 4.0f, -10.8f, -0.1f, -14.9f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
