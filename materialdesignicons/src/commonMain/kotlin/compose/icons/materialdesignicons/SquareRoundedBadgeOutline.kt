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

public val MaterialDesignIcons.SquareRoundedBadgeOutline: ImageVector
    get() {
        if (_squareRoundedBadgeOutline != null) {
            return _squareRoundedBadgeOutline!!
        }
        _squareRoundedBadgeOutline = Builder(name = "SquareRoundedBadgeOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 8.0f)
                curveTo(21.43f, 8.0f, 23.0f, 6.43f, 23.0f, 4.5f)
                curveTo(23.0f, 2.57f, 21.43f, 1.0f, 19.5f, 1.0f)
                curveTo(17.57f, 1.0f, 16.0f, 2.57f, 16.0f, 4.5f)
                curveTo(16.0f, 6.43f, 17.57f, 8.0f, 19.5f, 8.0f)
                moveTo(21.0f, 16.0f)
                verticalLineTo(9.79f)
                curveTo(20.5f, 9.93f, 20.0f, 10.0f, 19.5f, 10.0f)
                curveTo(19.33f, 10.0f, 19.17f, 10.0f, 19.0f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 17.66f, 17.66f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(6.34f, 19.0f, 5.0f, 17.66f, 5.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 6.34f, 6.34f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 4.84f, 14.0f, 4.67f, 14.0f, 4.5f)
                curveTo(14.0f, 4.0f, 14.07f, 3.5f, 14.21f, 3.0f)
                horizontalLineTo(8.0f)
                curveTo(5.24f, 3.0f, 3.0f, 5.24f, 3.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(3.0f, 18.76f, 5.24f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(16.0f)
                curveTo(18.76f, 21.0f, 21.0f, 18.76f, 21.0f, 16.0f)
                close()
            }
        }
        .build()
        return _squareRoundedBadgeOutline!!
    }

private var _squareRoundedBadgeOutline: ImageVector? = null
