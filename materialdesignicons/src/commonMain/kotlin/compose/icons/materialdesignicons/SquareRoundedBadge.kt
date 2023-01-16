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

public val MaterialDesignIcons.SquareRoundedBadge: ImageVector
    get() {
        if (_squareRoundedBadge != null) {
            return _squareRoundedBadge!!
        }
        _squareRoundedBadge = Builder(name = "SquareRoundedBadge", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 8.0f)
                curveTo(21.43f, 8.0f, 23.0f, 6.43f, 23.0f, 4.5f)
                curveTo(23.0f, 2.57f, 21.43f, 1.0f, 19.5f, 1.0f)
                curveTo(17.57f, 1.0f, 16.0f, 2.57f, 16.0f, 4.5f)
                curveTo(16.0f, 6.43f, 17.57f, 8.0f, 19.5f, 8.0f)
                moveTo(19.5f, 10.0f)
                curveTo(20.0f, 10.0f, 20.5f, 9.93f, 21.0f, 9.79f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 18.76f, 18.76f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(5.24f, 21.0f, 3.0f, 18.76f, 3.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 5.24f, 5.24f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(14.21f)
                curveTo(14.07f, 3.5f, 14.0f, 4.0f, 14.0f, 4.5f)
                curveTo(14.0f, 7.54f, 16.46f, 10.0f, 19.5f, 10.0f)
                close()
            }
        }
        .build()
        return _squareRoundedBadge!!
    }

private var _squareRoundedBadge: ImageVector? = null
