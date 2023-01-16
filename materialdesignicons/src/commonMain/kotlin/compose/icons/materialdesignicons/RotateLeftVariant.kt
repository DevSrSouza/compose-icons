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

public val MaterialDesignIcons.RotateLeftVariant: ImageVector
    get() {
        if (_rotateLeftVariant != null) {
            return _rotateLeftVariant!!
        }
        _rotateLeftVariant = Builder(name = "RotateLeftVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
                moveTo(20.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 17.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                moveTo(14.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 22.0f, 12.0f)
                lineTo(21.94f, 13.0f)
                horizontalLineTo(19.92f)
                lineTo(20.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 14.0f, 6.0f)
                verticalLineTo(9.0f)
                lineTo(10.0f, 5.0f)
                lineTo(14.0f, 1.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _rotateLeftVariant!!
    }

private var _rotateLeftVariant: ImageVector? = null