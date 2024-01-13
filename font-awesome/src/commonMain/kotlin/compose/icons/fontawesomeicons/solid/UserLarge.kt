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

public val SolidGroup.UserLarge: ImageVector
    get() {
        if (_userLarge != null) {
            return _userLarge!!
        }
        _userLarge = Builder(name = "UserLarge", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 288.0f)
                arcTo(144.0f, 144.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
                close()
                moveTo(161.3f, 320.0f)
                curveTo(72.2f, 320.0f, 0.0f, 392.2f, 0.0f, 481.3f)
                curveToRelative(0.0f, 17.0f, 13.8f, 30.7f, 30.7f, 30.7f)
                lineTo(481.3f, 512.0f)
                curveToRelative(17.0f, 0.0f, 30.7f, -13.8f, 30.7f, -30.7f)
                curveTo(512.0f, 392.2f, 439.8f, 320.0f, 350.7f, 320.0f)
                lineTo(161.3f, 320.0f)
                close()
            }
        }
        .build()
        return _userLarge!!
    }

private var _userLarge: ImageVector? = null
