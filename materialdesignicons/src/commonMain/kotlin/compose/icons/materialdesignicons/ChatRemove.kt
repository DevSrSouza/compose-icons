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

public val MaterialDesignIcons.ChatRemove: ImageVector
    get() {
        if (_chatRemove != null) {
            return _chatRemove!!
        }
        _chatRemove = Builder(name = "ChatRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.46f, 15.88f)
                lineTo(16.88f, 14.46f)
                lineTo(19.0f, 16.59f)
                lineTo(21.12f, 14.47f)
                lineTo(22.54f, 15.88f)
                lineTo(20.41f, 18.0f)
                lineTo(22.54f, 20.12f)
                lineTo(21.12f, 21.54f)
                lineTo(19.0f, 19.41f)
                lineTo(16.88f, 21.54f)
                lineTo(15.46f, 20.12f)
                lineTo(17.59f, 18.0f)
                lineTo(15.47f, 15.88f)
                moveTo(12.0f, 3.0f)
                curveTo(17.5f, 3.0f, 22.0f, 6.58f, 22.0f, 11.0f)
                curveTo(22.0f, 11.58f, 21.92f, 12.14f, 21.78f, 12.68f)
                curveTo(20.95f, 12.25f, 20.0f, 12.0f, 19.0f, 12.0f)
                curveTo(15.69f, 12.0f, 13.0f, 14.69f, 13.0f, 18.0f)
                lineTo(13.08f, 18.95f)
                lineTo(12.0f, 19.0f)
                curveTo(10.76f, 19.0f, 9.57f, 18.82f, 8.47f, 18.5f)
                curveTo(5.55f, 21.0f, 2.0f, 21.0f, 2.0f, 21.0f)
                curveTo(4.33f, 18.67f, 4.7f, 17.1f, 4.75f, 16.5f)
                curveTo(3.05f, 15.07f, 2.0f, 13.14f, 2.0f, 11.0f)
                curveTo(2.0f, 6.58f, 6.5f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _chatRemove!!
    }

private var _chatRemove: ImageVector? = null
