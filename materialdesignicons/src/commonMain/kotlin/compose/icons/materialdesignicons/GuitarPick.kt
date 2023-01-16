package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.GuitarPick: ImageVector
    get() {
        if (_guitarPick != null) {
            return _guitarPick!!
        }
        _guitarPick = Builder(name = "GuitarPick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.1f)
                curveTo(18.1f, 3.3f, 17.0f, 2.8f, 15.8f, 2.5f)
                curveTo(15.5f, 2.4f, 13.6f, 2.0f, 12.2f, 2.0f)
                curveTo(12.2f, 2.0f, 12.1f, 2.0f, 12.0f, 2.0f)
                curveTo(12.0f, 2.0f, 11.9f, 2.0f, 11.8f, 2.0f)
                curveTo(10.4f, 2.0f, 8.4f, 2.4f, 8.1f, 2.5f)
                curveTo(7.0f, 2.8f, 5.9f, 3.3f, 5.0f, 4.1f)
                curveTo(3.0f, 5.9f, 3.0f, 8.7f, 4.0f, 11.0f)
                curveTo(5.0f, 13.5f, 6.1f, 15.7f, 7.6f, 17.9f)
                curveTo(8.8f, 19.6f, 10.1f, 22.0f, 12.0f, 22.0f)
                curveTo(13.9f, 22.0f, 15.2f, 19.6f, 16.5f, 17.9f)
                curveTo(18.0f, 15.8f, 19.1f, 13.5f, 20.1f, 11.0f)
                curveTo(21.0f, 8.7f, 21.0f, 5.9f, 19.0f, 4.1f)
                close()
            }
        }
        .build()
        return _guitarPick!!
    }

private var _guitarPick: ImageVector? = null
