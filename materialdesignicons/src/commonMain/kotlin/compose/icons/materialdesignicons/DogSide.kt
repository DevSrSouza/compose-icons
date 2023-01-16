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

public val MaterialDesignIcons.DogSide: ImageVector
    get() {
        if (_dogSide != null) {
            return _dogSide!!
        }
        _dogSide = Builder(name = "DogSide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(15.0f, 7.0f)
                lineTo(18.0f, 10.0f)
                lineTo(19.0f, 9.0f)
                lineTo(20.0f, 10.0f)
                lineTo(22.0f, 8.0f)
                lineTo(19.0f, 5.0f)
                verticalLineTo(3.0f)
                moveTo(3.0f, 7.0f)
                lineTo(2.0f, 8.0f)
                lineTo(5.0f, 11.0f)
                verticalLineTo(14.0f)
                lineTo(4.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                lineTo(8.0f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                lineTo(14.0f, 8.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineTo(5.0f)
                lineTo(3.0f, 7.0f)
                close()
            }
        }
        .build()
        return _dogSide!!
    }

private var _dogSide: ImageVector? = null
