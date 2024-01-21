package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Greatlearning: ImageVector
    get() {
        if (_greatlearning != null) {
            return _greatlearning!!
        }
        _greatlearning = Builder(name = "Greatlearning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.373f, 0.0f)
                curveToRelative(-6.617f, 0.0f, -12.0f, 5.383f, -12.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(0.856f)
                curveToRelative(0.958f, -1.175f, 1.911f, -2.354f, 2.867f, -3.531f)
                horizontalLineToRelative(-3.723f)
                curveToRelative(-4.669f, 0.0f, -8.469f, -3.8f, -8.469f, -8.469f)
                curveToRelative(0.0f, -4.67f, 3.8f, -8.469f, 8.469f, -8.469f)
                horizontalLineToRelative(4.375f)
                lineTo(21.615f, 0.0f)
                close()
                moveTo(18.096f, 20.469f)
                lineTo(21.627f, 16.115f)
                verticalLineToRelative(-6.013f)
                horizontalLineToRelative(-7.502f)
                lineToRelative(-2.861f, 3.533f)
                horizontalLineToRelative(6.832f)
                close()
            }
        }
        .build()
        return _greatlearning!!
    }

private var _greatlearning: ImageVector? = null
