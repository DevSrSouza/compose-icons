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

public val SimpleIcons.Vapor: ImageVector
    get() {
        if (_vapor != null) {
            return _vapor!!
        }
        _vapor = Builder(name = "Vapor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.75f, 13.908f)
                verticalLineToRelative(1.56f)
                lineTo(12.0f, 24.0f)
                lineTo(1.25f, 15.468f)
                verticalLineToRelative(-1.56f)
                lineTo(12.0f, 22.44f)
                lineToRelative(10.75f, -8.532f)
                close()
                moveTo(12.0f, 17.267f)
                lineTo(1.25f, 8.824f)
                lineTo(12.0f, 0.0f)
                lineToRelative(10.75f, 8.824f)
                lineTo(12.0f, 17.267f)
                close()
                moveTo(12.356f, 12.632f)
                arcToRelative(3.193f, 3.193f, 0.0f, false, false, 3.193f, -3.193f)
                arcToRelative(3.185f, 3.185f, 0.0f, false, false, -3.029f, -3.176f)
                lineToRelative(0.001f, -0.016f)
                lineToRelative(-4.514f, -0.427f)
                lineToRelative(1.205f, 4.102f)
                arcToRelative(3.184f, 3.184f, 0.0f, false, false, 3.144f, 2.71f)
                close()
                moveTo(12.0f, 20.269f)
                lineTo(1.25f, 11.737f)
                verticalLineToRelative(1.533f)
                lineTo(12.0f, 21.802f)
                lineToRelative(10.75f, -8.532f)
                verticalLineToRelative(-1.533f)
                lineTo(12.0f, 20.269f)
                close()
                moveTo(12.0f, 17.903f)
                lineTo(1.25f, 9.46f)
                verticalLineToRelative(1.64f)
                lineTo(12.0f, 19.63f)
                lineToRelative(10.75f, -8.532f)
                lineTo(22.75f, 9.46f)
                lineTo(12.0f, 17.903f)
                close()
            }
        }
        .build()
        return _vapor!!
    }

private var _vapor: ImageVector? = null
