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

public val MaterialDesignIcons.Sigma: ImageVector
    get() {
        if (_sigma != null) {
            return _sigma!!
        }
        _sigma = Builder(name = "Sigma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                horizontalLineTo(8.83f)
                lineTo(14.83f, 12.0f)
                lineTo(8.83f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                lineTo(12.0f, 12.0f)
                lineTo(6.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _sigma!!
    }

private var _sigma: ImageVector? = null
