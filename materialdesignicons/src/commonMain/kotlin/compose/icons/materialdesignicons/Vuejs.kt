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

public val MaterialDesignIcons.Vuejs: ImageVector
    get() {
        if (_vuejs != null) {
            return _vuejs!!
        }
        _vuejs = Builder(name = "Vuejs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineTo(5.5f)
                lineTo(12.0f, 15.0f)
                lineTo(18.5f, 3.0f)
                horizontalLineTo(22.0f)
                lineTo(12.0f, 21.0f)
                lineTo(2.0f, 3.0f)
                moveTo(6.5f, 3.0f)
                horizontalLineTo(9.5f)
                lineTo(12.0f, 7.58f)
                lineTo(14.5f, 3.0f)
                horizontalLineTo(17.5f)
                lineTo(12.0f, 13.08f)
                lineTo(6.5f, 3.0f)
                close()
            }
        }
        .build()
        return _vuejs!!
    }

private var _vuejs: ImageVector? = null
