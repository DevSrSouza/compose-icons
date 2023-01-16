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

public val MaterialDesignIcons.SquareCircle: ImageVector
    get() {
        if (_squareCircle != null) {
            return _squareCircle!!
        }
        _squareCircle = Builder(name = "SquareCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                moveTo(22.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                moveTo(12.0f, 6.0f)
                curveTo(8.69f, 6.0f, 6.0f, 8.69f, 6.0f, 12.0f)
                reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(18.0f, 15.31f, 18.0f, 12.0f)
                reflectiveCurveTo(15.31f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _squareCircle!!
    }

private var _squareCircle: ImageVector? = null
