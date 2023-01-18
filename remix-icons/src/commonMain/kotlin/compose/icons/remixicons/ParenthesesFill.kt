package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ParenthesesFill: ImageVector
    get() {
        if (_parenthesesFill != null) {
            return _parenthesesFill!!
        }
        _parenthesesFill = Builder(name = "ParenthesesFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.923f, 21.0f)
                curveTo(5.113f, 18.664f, 4.0f, 15.493f, 4.0f, 12.0f)
                curveToRelative(0.0f, -3.493f, 1.113f, -6.664f, 2.923f, -9.0f)
                horizontalLineToRelative(2.014f)
                curveTo(7.235f, 5.388f, 6.2f, 8.542f, 6.2f, 12.0f)
                reflectiveCurveToRelative(1.035f, 6.612f, 2.737f, 9.0f)
                lineTo(6.923f, 21.0f)
                close()
                moveTo(17.074f, 21.0f)
                lineTo(15.06f, 21.0f)
                curveToRelative(1.702f, -2.388f, 2.737f, -5.542f, 2.737f, -9.0f)
                reflectiveCurveToRelative(-1.035f, -6.612f, -2.737f, -9.0f)
                horizontalLineToRelative(2.014f)
                curveToRelative(1.81f, 2.336f, 2.923f, 5.507f, 2.923f, 9.0f)
                curveToRelative(0.0f, 3.493f, -1.112f, 6.664f, -2.923f, 9.0f)
                close()
            }
        }
        .build()
        return _parenthesesFill!!
    }

private var _parenthesesFill: ImageVector? = null
