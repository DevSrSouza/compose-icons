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

public val MaterialDesignIcons.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 13.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 13.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(12.0f, 4.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(12.5f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                lineTo(15.75f, 16.85f)
                lineTo(16.5f, 15.62f)
                lineTo(12.5f, 13.25f)
                verticalLineTo(8.0f)
                moveTo(7.88f, 3.39f)
                lineTo(6.6f, 1.86f)
                lineTo(2.0f, 5.71f)
                lineTo(3.29f, 7.24f)
                lineTo(7.88f, 3.39f)
                moveTo(22.0f, 5.72f)
                lineTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                lineTo(22.0f, 5.72f)
                close()
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
