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

public val MaterialDesignIcons.AlphaK: ImageVector
    get() {
        if (_alphaK != null) {
            return _alphaK!!
        }
        _alphaK = Builder(name = "AlphaK", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.67f)
                lineTo(13.0f, 17.0f)
                horizontalLineTo(15.0f)
                lineTo(12.0f, 12.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineTo(13.0f)
                lineTo(11.0f, 10.33f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _alphaK!!
    }

private var _alphaK: ImageVector? = null
