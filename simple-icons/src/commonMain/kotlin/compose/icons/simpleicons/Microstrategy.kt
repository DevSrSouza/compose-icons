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

public val SimpleIcons.Microstrategy: ImageVector
    get() {
        if (_microstrategy != null) {
            return _microstrategy!!
        }
        _microstrategy = Builder(name = "Microstrategy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.095f, 2.572f)
                horizontalLineToRelative(5.827f)
                verticalLineToRelative(18.856f)
                lineTo(9.096f, 21.428f)
                close()
                moveTo(0.0f, 2.572f)
                horizontalLineToRelative(5.825f)
                verticalLineToRelative(18.856f)
                lineTo(0.001f, 21.428f)
                close()
                moveTo(18.174f, 2.572f)
                verticalLineToRelative(18.854f)
                lineTo(24.0f, 21.426f)
                lineTo(24.0f, 8.33f)
                close()
            }
        }
        .build()
        return _microstrategy!!
    }

private var _microstrategy: ImageVector? = null
