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

public val MaterialDesignIcons.FlagRemove: ImageVector
    get() {
        if (_flagRemove != null) {
            return _flagRemove!!
        }
        _flagRemove = Builder(name = "FlagRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18.0f, 16.59f)
                lineTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18.0f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18.0f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18.0f)
                lineTo(14.46f, 15.88f)
                moveTo(12.4f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                curveTo(15.78f, 12.0f, 13.84f, 13.21f, 12.8f, 15.0f)
                horizontalLineTo(11.0f)
                lineTo(10.6f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                lineTo(12.4f, 5.0f)
                close()
            }
        }
        .build()
        return _flagRemove!!
    }

private var _flagRemove: ImageVector? = null
