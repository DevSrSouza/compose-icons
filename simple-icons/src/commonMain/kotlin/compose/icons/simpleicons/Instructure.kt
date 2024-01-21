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

public val SimpleIcons.Instructure: ImageVector
    get() {
        if (_instructure != null) {
            return _instructure!!
        }
        _instructure = Builder(name = "Instructure", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.996f, 0.0f)
                lineToRelative(-5.11f, 2.878f)
                lineTo(12.0f, 5.76f)
                lineToRelative(5.115f, -2.878f)
                close()
                moveTo(6.032f, 3.36f)
                lineTo(0.918f, 6.237f)
                lineTo(6.036f, 9.12f)
                lineToRelative(5.115f, -2.879f)
                close()
                moveTo(17.961f, 3.36f)
                lineTo(12.849f, 6.238f)
                lineTo(17.964f, 9.12f)
                lineTo(23.082f, 6.241f)
                close()
                moveTo(12.0f, 11.52f)
                lineTo(0.918f, 17.76f)
                lineTo(12.0f, 24.0f)
                lineToRelative(11.082f, -6.241f)
                close()
            }
        }
        .build()
        return _instructure!!
    }

private var _instructure: ImageVector? = null
