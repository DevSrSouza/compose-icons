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

public val MaterialDesignIcons.FlashTriangle: ImageVector
    get() {
        if (_flashTriangle != null) {
            return _flashTriangle!!
        }
        _flashTriangle = Builder(name = "FlashTriangle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(1.0f, 21.0f)
                horizontalLineTo(23.0f)
                lineTo(12.0f, 2.0f)
                moveTo(10.0f, 15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                lineTo(12.5f, 13.5f)
                horizontalLineTo(14.5f)
                lineTo(11.5f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _flashTriangle!!
    }

private var _flashTriangle: ImageVector? = null
