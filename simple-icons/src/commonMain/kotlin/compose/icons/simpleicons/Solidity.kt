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

public val SimpleIcons.Solidity: ImageVector
    get() {
        if (_solidity != null) {
            return _solidity!!
        }
        _solidity = Builder(name = "Solidity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.409f, 6.608f)
                lineTo(7.981f, 0.255f)
                lineToRelative(3.572f, 6.353f)
                lineTo(4.409f, 6.608f)
                close()
                moveTo(8.411f, 0.0f)
                lineToRelative(3.569f, 6.348f)
                lineTo(15.552f, 0.0f)
                lineTo(8.411f, 0.0f)
                close()
                moveTo(12.447f, 17.392f)
                lineToRelative(3.572f, 6.354f)
                lineToRelative(3.575f, -6.354f)
                horizontalLineToRelative(-7.147f)
                close()
                moveTo(11.839f, 7.108f)
                horizontalLineToRelative(-7.43f)
                lineToRelative(3.715f, 6.605f)
                lineToRelative(3.715f, -6.605f)
                close()
                moveTo(12.267f, 6.858f)
                horizontalLineToRelative(7.428f)
                lineTo(15.982f, 0.255f)
                lineToRelative(-3.715f, 6.603f)
                close()
                moveTo(15.589f, 24.0f)
                lineToRelative(-3.569f, -6.349f)
                lineTo(8.448f, 24.0f)
                horizontalLineToRelative(7.141f)
                close()
                moveTo(11.733f, 17.142f)
                lineTo(4.306f, 17.142f)
                lineToRelative(3.712f, 6.603f)
                lineToRelative(3.715f, -6.603f)
                close()
                moveTo(12.161f, 16.892f)
                horizontalLineToRelative(7.433f)
                lineToRelative(-3.718f, -6.605f)
                lineToRelative(-3.715f, 6.605f)
                close()
            }
        }
        .build()
        return _solidity!!
    }

private var _solidity: ImageVector? = null
