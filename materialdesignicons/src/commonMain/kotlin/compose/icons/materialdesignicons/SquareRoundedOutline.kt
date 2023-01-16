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

public val MaterialDesignIcons.SquareRoundedOutline: ImageVector
    get() {
        if (_squareRoundedOutline != null) {
            return _squareRoundedOutline!!
        }
        _squareRoundedOutline = Builder(name = "SquareRoundedOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(18.76f, 3.0f, 21.0f, 5.24f, 21.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 18.76f, 18.76f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(5.24f, 21.0f, 3.0f, 18.76f, 3.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 5.24f, 5.24f, 3.0f, 8.0f, 3.0f)
                moveTo(8.0f, 5.0f)
                curveTo(6.34f, 5.0f, 5.0f, 6.34f, 5.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(5.0f, 17.66f, 6.34f, 19.0f, 8.0f, 19.0f)
                horizontalLineTo(16.0f)
                curveTo(17.66f, 19.0f, 19.0f, 17.66f, 19.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 6.34f, 17.66f, 5.0f, 16.0f, 5.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _squareRoundedOutline!!
    }

private var _squareRoundedOutline: ImageVector? = null
