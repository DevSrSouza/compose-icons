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

public val MaterialDesignIcons.StackOverflow: ImageVector
    get() {
        if (_stackOverflow != null) {
            return _stackOverflow!!
        }
        _stackOverflow = Builder(name = "StackOverflow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.36f, 20.2f)
                verticalLineTo(14.82f)
                horizontalLineTo(19.15f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.82f)
                horizontalLineTo(4.8f)
                verticalLineTo(20.2f)
                horizontalLineTo(17.36f)
                moveTo(6.77f, 14.32f)
                lineTo(7.14f, 12.56f)
                lineTo(15.93f, 14.41f)
                lineTo(15.56f, 16.17f)
                lineTo(6.77f, 14.32f)
                moveTo(7.93f, 10.11f)
                lineTo(8.69f, 8.5f)
                lineTo(16.83f, 12.28f)
                lineTo(16.07f, 13.9f)
                lineTo(7.93f, 10.11f)
                moveTo(10.19f, 6.12f)
                lineTo(11.34f, 4.74f)
                lineTo(18.24f, 10.5f)
                lineTo(17.09f, 11.87f)
                lineTo(10.19f, 6.12f)
                moveTo(14.64f, 1.87f)
                lineTo(20.0f, 9.08f)
                lineTo(18.56f, 10.15f)
                lineTo(13.2f, 2.94f)
                lineTo(14.64f, 1.87f)
                moveTo(6.59f, 18.41f)
                verticalLineTo(16.61f)
                horizontalLineTo(15.57f)
                verticalLineTo(18.41f)
                horizontalLineTo(6.59f)
                close()
            }
        }
        .build()
        return _stackOverflow!!
    }

private var _stackOverflow: ImageVector? = null
