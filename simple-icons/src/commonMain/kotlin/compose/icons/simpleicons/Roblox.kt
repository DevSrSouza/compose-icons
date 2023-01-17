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

public val SimpleIcons.Roblox: ImageVector
    get() {
        if (_roblox != null) {
            return _roblox!!
        }
        _roblox = Builder(name = "Roblox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.383f, 14.341f)
                lineToRelative(-3.726f, -0.958f)
                lineToRelative(0.959f, -3.726f)
                lineToRelative(3.726f, 0.959f)
                lineToRelative(-0.96f, 3.726f)
                close()
                moveTo(4.913f, 0.0f)
                lineTo(0.0f, 19.088f)
                lineTo(19.088f, 24.0f)
                lineTo(24.0f, 4.912f)
                lineTo(4.912f, 0.0f)
                close()
            }
        }
        .build()
        return _roblox!!
    }

private var _roblox: ImageVector? = null
