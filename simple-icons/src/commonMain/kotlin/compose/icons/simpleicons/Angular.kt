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

public val SimpleIcons.Angular: ImageVector
    get() {
        if (_angular != null) {
            return _angular!!
        }
        _angular = Builder(name = "Angular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.712f, 17.711f)
                lineTo(7.288f, 17.711f)
                lineToRelative(-1.204f, 2.916f)
                lineTo(12.0f, 24.0f)
                lineToRelative(5.916f, -3.373f)
                lineToRelative(-1.204f, -2.916f)
                close()
                moveTo(14.692f, 0.0f)
                lineToRelative(7.832f, 16.855f)
                lineToRelative(0.814f, -12.856f)
                lineTo(14.692f, 0.0f)
                close()
                moveTo(9.308f, 0.0f)
                lineTo(0.662f, 3.999f)
                lineToRelative(0.814f, 12.856f)
                lineTo(9.308f, 0.0f)
                close()
                moveTo(8.903f, 13.93f)
                horizontalLineToRelative(6.198f)
                lineTo(12.0f, 6.396f)
                lineTo(8.903f, 13.93f)
                close()
            }
        }
        .build()
        return _angular!!
    }

private var _angular: ImageVector? = null
