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

public val MaterialDesignIcons.PlusMinusVariant: ImageVector
    get() {
        if (_plusMinusVariant != null) {
            return _plusMinusVariant!!
        }
        _plusMinusVariant = Builder(name = "PlusMinusVariant", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                moveTo(13.0f, 15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                moveTo(16.04f, 3.0f)
                horizontalLineTo(18.35f)
                lineTo(7.96f, 21.0f)
                horizontalLineTo(5.65f)
                lineTo(16.04f, 3.0f)
                close()
            }
        }
        .build()
        return _plusMinusVariant!!
    }

private var _plusMinusVariant: ImageVector? = null
