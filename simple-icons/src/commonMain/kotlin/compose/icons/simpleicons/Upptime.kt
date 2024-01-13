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

public val SimpleIcons.Upptime: ImageVector
    get() {
        if (_upptime != null) {
            return _upptime!!
        }
        _upptime = Builder(name = "Upptime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.86f, 15.68f)
                curveToRelative(1.926f, 0.0f, 3.489f, 1.526f, 3.489f, 3.406f)
                curveToRelative(0.0f, 1.88f, -1.563f, 3.407f, -3.488f, 3.407f)
                curveToRelative(-1.926f, 0.0f, -3.489f, -1.526f, -3.489f, -3.407f)
                curveToRelative(0.0f, -1.88f, 1.563f, -3.407f, 3.489f, -3.407f)
                close()
                moveTo(24.0f, 14.884f)
                lineTo(12.0f, 1.507f)
                lineTo(0.0f, 14.885f)
                lineToRelative(3.158f, 3.52f)
                lineTo(12.0f, 8.548f)
                lineToRelative(8.842f, 9.857f)
                lineTo(24.0f, 14.885f)
                close()
            }
        }
        .build()
        return _upptime!!
    }

private var _upptime: ImageVector? = null
