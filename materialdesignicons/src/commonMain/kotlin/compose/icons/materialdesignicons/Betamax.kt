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

public val MaterialDesignIcons.Betamax: ImageVector
    get() {
        if (_betamax != null) {
            return _betamax!!
        }
        _betamax = Builder(name = "Betamax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 19.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 5.0f)
                horizontalLineTo(4.0f)
                moveTo(8.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 9.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(8.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 11.0f)
                close()
            }
        }
        .build()
        return _betamax!!
    }

private var _betamax: ImageVector? = null
