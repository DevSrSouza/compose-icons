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

public val MaterialDesignIcons.CupOutline: ImageVector
    get() {
        if (_cupOutline != null) {
            return _cupOutline!!
        }
        _cupOutline = Builder(name = "CupOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                lineTo(5.0f, 20.23f)
                curveTo(5.13f, 21.23f, 5.97f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(18.0f, 22.0f, 18.87f, 21.23f, 19.0f, 20.23f)
                lineTo(21.0f, 2.0f)
                horizontalLineTo(3.0f)
                moveTo(5.22f, 4.0f)
                horizontalLineTo(18.78f)
                lineTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                lineTo(5.22f, 4.0f)
                close()
            }
        }
        .build()
        return _cupOutline!!
    }

private var _cupOutline: ImageVector? = null
