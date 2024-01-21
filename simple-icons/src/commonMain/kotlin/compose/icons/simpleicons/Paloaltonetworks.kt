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

public val SimpleIcons.Paloaltonetworks: ImageVector
    get() {
        if (_paloaltonetworks != null) {
            return _paloaltonetworks!!
        }
        _paloaltonetworks = Builder(name = "Paloaltonetworks", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.278f, 15.443f)
                lineToRelative(1.705f, 1.705f)
                lineToRelative(-3.426f, 3.426f)
                lineToRelative(-3.427f, -3.426f)
                lineToRelative(8.592f, -8.591f)
                lineToRelative(-1.705f, -1.705f)
                lineToRelative(3.426f, -3.426f)
                lineToRelative(3.427f, 3.426f)
                lineToRelative(-8.592f, 8.591f)
                close()
                moveTo(0.0f, 12.017f)
                lineToRelative(3.426f, 3.426f)
                lineToRelative(8.591f, -8.59f)
                lineToRelative(-3.426f, -3.427f)
                lineTo(0.0f, 12.017f)
                close()
                moveTo(11.983f, 17.147f)
                lineTo(15.409f, 20.574f)
                lineTo(24.0f, 11.983f)
                lineToRelative(-3.426f, -3.426f)
                lineToRelative(-8.591f, 8.59f)
                close()
            }
        }
        .build()
        return _paloaltonetworks!!
    }

private var _paloaltonetworks: ImageVector? = null
