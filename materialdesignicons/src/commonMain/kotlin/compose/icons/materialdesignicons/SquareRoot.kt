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

public val MaterialDesignIcons.SquareRoot: ImageVector
    get() {
        if (_squareRoot != null) {
            return _squareRoot!!
        }
        _squareRoot = Builder(name = "SquareRoot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.76f, 16.83f)
                lineTo(14.59f, 14.0f)
                lineTo(11.76f, 11.17f)
                lineTo(13.17f, 9.76f)
                lineTo(16.0f, 12.59f)
                lineTo(18.83f, 9.76f)
                lineTo(20.24f, 11.17f)
                lineTo(17.41f, 14.0f)
                lineTo(20.24f, 16.83f)
                lineTo(18.83f, 18.24f)
                lineTo(16.0f, 15.41f)
                lineTo(13.17f, 18.24f)
                lineTo(11.76f, 16.83f)
                moveTo(2.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                lineTo(7.29f, 16.4f)
                lineTo(10.0f, 6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.55f)
                lineTo(8.68f, 19.0f)
                horizontalLineTo(6.22f)
                lineTo(3.68f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _squareRoot!!
    }

private var _squareRoot: ImageVector? = null
