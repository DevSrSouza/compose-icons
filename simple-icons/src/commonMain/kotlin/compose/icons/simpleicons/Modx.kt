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

public val SimpleIcons.Modx: ImageVector
    get() {
        if (_modx != null) {
            return _modx!!
        }
        _modx = Builder(name = "Modx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.145f, 9.49f)
                lineToRelative(4.47f, -7.19f)
                lineTo(12.118f, 2.3f)
                lineToRelative(-1.24f, 2.023f)
                close()
                moveTo(2.92f, 0.0f)
                verticalLineToRelative(11.497f)
                lineToRelative(2.48f, 1.55f)
                lineToRelative(13.435f, -3.1f)
                close()
                moveTo(21.08f, 24.0f)
                lineTo(21.08f, 12.503f)
                lineToRelative(-1.984f, -1.263f)
                lineToRelative(-5.168f, 8.267f)
                close()
                moveTo(5.165f, 14.053f)
                lineToRelative(-4.78f, 7.648f)
                horizontalLineToRelative(11.497f)
                lineTo(18.6f, 10.953f)
                close()
            }
        }
        .build()
        return _modx!!
    }

private var _modx: ImageVector? = null
