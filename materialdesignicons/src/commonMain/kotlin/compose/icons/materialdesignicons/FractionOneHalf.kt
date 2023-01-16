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

public val MaterialDesignIcons.FractionOneHalf: ImageVector
    get() {
        if (_fractionOneHalf != null) {
            return _fractionOneHalf!!
        }
        _fractionOneHalf = Builder(name = "FractionOneHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.79f, 21.61f)
                lineTo(4.21f, 20.39f)
                lineTo(18.21f, 2.39f)
                lineTo(19.79f, 3.61f)
                lineTo(5.79f, 21.61f)
                moveTo(4.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                moveTo(15.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                curveTo(15.9f, 16.0f, 15.0f, 16.9f, 15.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 18.0f, 21.0f, 17.11f, 21.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 12.9f, 20.11f, 12.0f, 19.0f, 12.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _fractionOneHalf!!
    }

private var _fractionOneHalf: ImageVector? = null
