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
                moveTo(18.926f, 23.998f)
                lineTo(0.0f, 18.892f)
                lineTo(5.075f, 0.002f)
                lineTo(24.0f, 5.108f)
                close()
                moveTo(15.348f, 10.09f)
                lineToRelative(-5.282f, -1.453f)
                lineToRelative(-1.414f, 5.273f)
                lineToRelative(5.282f, 1.453f)
                close()
            }
        }
        .build()
        return _roblox!!
    }

private var _roblox: ImageVector? = null
