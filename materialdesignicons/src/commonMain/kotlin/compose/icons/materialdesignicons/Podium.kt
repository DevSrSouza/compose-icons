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

public val MaterialDesignIcons.Podium: ImageVector
    get() {
        if (_podium != null) {
            return _podium!!
        }
        _podium = Builder(name = "Podium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.09f)
                lineTo(14.45f, 8.58f)
                lineTo(13.8f, 5.77f)
                lineTo(16.0f, 3.89f)
                lineTo(13.11f, 3.64f)
                lineTo(12.0f, 1.0f)
                lineTo(10.87f, 3.64f)
                lineTo(8.0f, 3.89f)
                lineTo(10.18f, 5.77f)
                lineTo(9.5f, 8.58f)
                lineTo(12.0f, 7.09f)
                moveTo(4.0f, 13.09f)
                lineTo(6.45f, 14.58f)
                lineTo(5.8f, 11.77f)
                lineTo(8.0f, 9.89f)
                lineTo(5.11f, 9.64f)
                lineTo(4.0f, 7.0f)
                lineTo(2.87f, 9.64f)
                lineTo(0.0f, 9.89f)
                lineTo(2.18f, 11.77f)
                lineTo(1.5f, 14.58f)
                lineTo(4.0f, 13.09f)
                moveTo(20.0f, 10.09f)
                lineTo(22.45f, 11.58f)
                lineTo(21.8f, 8.77f)
                lineTo(24.0f, 6.89f)
                lineTo(21.11f, 6.64f)
                lineTo(20.0f, 4.0f)
                lineTo(18.87f, 6.64f)
                lineTo(16.0f, 6.89f)
                lineTo(18.18f, 8.77f)
                lineTo(17.5f, 11.58f)
                lineTo(20.0f, 10.09f)
                moveTo(15.0f, 23.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(23.0f)
                moveTo(7.0f, 23.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(23.0f)
                moveTo(23.0f, 23.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _podium!!
    }

private var _podium: ImageVector? = null
