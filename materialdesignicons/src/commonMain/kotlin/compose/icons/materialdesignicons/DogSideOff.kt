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

public val MaterialDesignIcons.DogSideOff: ImageVector
    get() {
        if (_dogSideOff != null) {
            return _dogSideOff!!
        }
        _dogSideOff = Builder(name = "DogSideOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                lineTo(15.0f, 7.0f)
                lineTo(19.0f, 3.0f)
                verticalLineTo(5.0f)
                lineTo(22.0f, 8.0f)
                lineTo(20.0f, 10.0f)
                lineTo(19.0f, 9.0f)
                lineTo(18.0f, 10.0f)
                moveTo(17.0f, 11.0f)
                lineTo(14.0f, 8.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineTo(12.2f)
                lineTo(17.0f, 13.8f)
                verticalLineTo(11.0f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(7.11f, 9.0f)
                horizontalLineTo(5.0f)
                lineTo(3.0f, 7.0f)
                lineTo(2.0f, 8.0f)
                lineTo(5.0f, 11.0f)
                verticalLineTo(14.0f)
                lineTo(4.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                lineTo(8.0f, 15.0f)
                horizontalLineTo(13.11f)
                lineTo(15.0f, 16.89f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }
        .build()
        return _dogSideOff!!
    }

private var _dogSideOff: ImageVector? = null
