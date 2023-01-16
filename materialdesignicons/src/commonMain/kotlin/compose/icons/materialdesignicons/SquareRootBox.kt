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

public val MaterialDesignIcons.SquareRootBox: ImageVector
    get() {
        if (_squareRootBox != null) {
            return _squareRootBox!!
        }
        _squareRootBox = Builder(name = "SquareRootBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(11.24f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.76f)
                lineTo(10.0f, 18.0f)
                horizontalLineTo(8.0f)
                lineTo(6.25f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.75f)
                lineTo(9.0f, 14.28f)
                lineTo(11.24f, 6.0f)
                verticalLineTo(6.0f)
                moveTo(14.0f, 10.59f)
                lineTo(15.79f, 12.38f)
                lineTo(17.59f, 10.59f)
                lineTo(19.0f, 12.0f)
                lineTo(17.21f, 13.79f)
                lineTo(19.0f, 15.59f)
                lineTo(17.59f, 17.0f)
                lineTo(15.79f, 15.21f)
                lineTo(14.0f, 17.0f)
                lineTo(12.59f, 15.59f)
                lineTo(14.38f, 13.79f)
                lineTo(12.59f, 12.0f)
                lineTo(14.0f, 10.59f)
                close()
            }
        }
        .build()
        return _squareRootBox!!
    }

private var _squareRootBox: ImageVector? = null
