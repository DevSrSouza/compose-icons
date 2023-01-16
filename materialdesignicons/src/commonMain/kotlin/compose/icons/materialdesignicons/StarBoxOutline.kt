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

public val MaterialDesignIcons.StarBoxOutline: ImageVector
    get() {
        if (_starBoxOutline != null) {
            return _starBoxOutline!!
        }
        _starBoxOutline = Builder(name = "StarBoxOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.58f, 17.0f)
                lineTo(12.0f, 14.84f)
                lineTo(8.42f, 17.0f)
                lineTo(9.37f, 12.93f)
                lineTo(6.21f, 10.2f)
                lineTo(10.38f, 9.84f)
                lineTo(12.0f, 6.0f)
                lineTo(13.62f, 9.83f)
                lineTo(17.79f, 10.19f)
                lineTo(14.63f, 12.92f)
                lineTo(15.58f, 17.0f)
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.11f, 20.1f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(5.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _starBoxOutline!!
    }

private var _starBoxOutline: ImageVector? = null
