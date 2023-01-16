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

public val MaterialDesignIcons.ChatOutline: ImageVector
    get() {
        if (_chatOutline != null) {
            return _chatOutline!!
        }
        _chatOutline = Builder(name = "ChatOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(6.5f, 3.0f, 2.0f, 6.58f, 2.0f, 11.0f)
                curveTo(2.05f, 13.15f, 3.06f, 15.17f, 4.75f, 16.5f)
                curveTo(4.75f, 17.1f, 4.33f, 18.67f, 2.0f, 21.0f)
                curveTo(4.37f, 20.89f, 6.64f, 20.0f, 8.47f, 18.5f)
                curveTo(9.61f, 18.83f, 10.81f, 19.0f, 12.0f, 19.0f)
                curveTo(17.5f, 19.0f, 22.0f, 15.42f, 22.0f, 11.0f)
                curveTo(22.0f, 6.58f, 17.5f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 17.0f)
                curveTo(7.58f, 17.0f, 4.0f, 14.31f, 4.0f, 11.0f)
                curveTo(4.0f, 7.69f, 7.58f, 5.0f, 12.0f, 5.0f)
                curveTo(16.42f, 5.0f, 20.0f, 7.69f, 20.0f, 11.0f)
                curveTo(20.0f, 14.31f, 16.42f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _chatOutline!!
    }

private var _chatOutline: ImageVector? = null