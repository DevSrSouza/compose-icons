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

public val MaterialDesignIcons.LeafMapleOff: ImageVector
    get() {
        if (_leafMapleOff != null) {
            return _leafMapleOff!!
        }
        _leafMapleOff = Builder(name = "LeafMapleOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.11f, 14.91f)
                lineTo(8.2f, 5.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 2.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineTo(16.0f)
                lineTo(14.37f, 9.9f)
                lineTo(17.79f, 6.0f)
                lineTo(18.79f, 7.73f)
                lineTo(22.39f, 7.96f)
                lineTo(20.79f, 11.19f)
                lineTo(21.79f, 13.0f)
                lineTo(18.11f, 14.91f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.45f, 7.34f)
                lineTo(5.21f, 7.77f)
                lineTo(1.61f, 8.0f)
                lineTo(3.21f, 11.27f)
                lineTo(2.21f, 13.0f)
                lineTo(8.0f, 16.0f)
                lineTo(7.0f, 18.0f)
                lineTo(11.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.25f)
                lineTo(15.91f, 17.8f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }
        .build()
        return _leafMapleOff!!
    }

private var _leafMapleOff: ImageVector? = null
