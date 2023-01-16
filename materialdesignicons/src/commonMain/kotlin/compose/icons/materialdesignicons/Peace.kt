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

public val MaterialDesignIcons.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(11.0f, 14.41f)
                verticalLineTo(19.93f)
                curveTo(9.58f, 19.75f, 8.23f, 19.19f, 7.1f, 18.31f)
                lineTo(11.0f, 14.41f)
                moveTo(13.0f, 14.41f)
                lineTo(16.9f, 18.31f)
                curveTo(15.77f, 19.19f, 14.42f, 19.75f, 13.0f, 19.93f)
                verticalLineTo(14.41f)
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 7.97f, 7.0f, 4.57f, 11.0f, 4.07f)
                verticalLineTo(11.59f)
                lineTo(5.69f, 16.9f)
                curveTo(4.59f, 15.5f, 4.0f, 13.78f, 4.0f, 12.0f)
                moveTo(18.31f, 16.9f)
                lineTo(13.0f, 11.59f)
                verticalLineTo(4.07f)
                curveTo(17.0f, 4.57f, 20.0f, 7.97f, 20.0f, 12.0f)
                curveTo(20.0f, 13.78f, 19.41f, 15.5f, 18.31f, 16.9f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
