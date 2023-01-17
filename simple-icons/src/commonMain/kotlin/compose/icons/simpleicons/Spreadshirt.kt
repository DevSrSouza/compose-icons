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

public val SimpleIcons.Spreadshirt: ImageVector
    get() {
        if (_spreadshirt != null) {
            return _spreadshirt!!
        }
        _spreadshirt = Builder(name = "Spreadshirt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.306f)
                lineTo(7.796f, 2.102f)
                lineTo(0.0f, 9.898f)
                lineToRelative(12.0f, 12.0f)
                lineToRelative(12.0f, -12.0f)
                lineToRelative(-7.796f, -7.796f)
                close()
                moveTo(12.0f, 18.306f)
                lineTo(3.592f, 9.898f)
                lineToRelative(4.204f, -4.204f)
                lineTo(12.0f, 9.898f)
                lineToRelative(4.184f, -4.184f)
                lineToRelative(4.204f, 4.204f)
            }
        }
        .build()
        return _spreadshirt!!
    }

private var _spreadshirt: ImageVector? = null
