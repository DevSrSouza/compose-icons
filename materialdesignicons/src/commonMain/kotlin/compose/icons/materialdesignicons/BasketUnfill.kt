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

public val MaterialDesignIcons.BasketUnfill: ImageVector
    get() {
        if (_basketUnfill != null) {
            return _basketUnfill!!
        }
        _basketUnfill = Builder(name = "BasketUnfill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                moveTo(8.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                moveTo(17.0f, 1.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                lineTo(17.0f, 1.0f)
                moveTo(7.5f, 22.0f)
                curveTo(6.72f, 22.0f, 6.04f, 21.55f, 5.71f, 20.9f)
                verticalLineTo(20.9f)
                lineTo(3.1f, 13.44f)
                lineTo(3.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 12.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 13.0f)
                lineTo(20.96f, 13.29f)
                lineTo(18.29f, 20.9f)
                curveTo(17.96f, 21.55f, 17.28f, 22.0f, 16.5f, 22.0f)
                horizontalLineTo(7.5f)
                moveTo(7.61f, 20.0f)
                horizontalLineTo(16.39f)
                lineTo(18.57f, 14.0f)
                horizontalLineTo(5.42f)
                lineTo(7.61f, 20.0f)
                close()
            }
        }
        .build()
        return _basketUnfill!!
    }

private var _basketUnfill: ImageVector? = null
