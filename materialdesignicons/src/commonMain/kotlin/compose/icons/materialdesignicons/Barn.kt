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

public val MaterialDesignIcons.Barn: ImageVector
    get() {
        if (_barn != null) {
            return _barn!!
        }
        _barn = Builder(name = "Barn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(3.0f, 8.2f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                lineTo(11.9f, 18.0f)
                lineTo(15.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.2f)
                lineTo(12.0f, 3.0f)
                moveTo(7.9f, 20.0f)
                verticalLineTo(14.0f)
                lineTo(10.9f, 17.0f)
                lineTo(7.9f, 20.0f)
                moveTo(8.9f, 13.0f)
                horizontalLineTo(14.9f)
                lineTo(11.9f, 16.0f)
                lineTo(8.9f, 13.0f)
                moveTo(15.9f, 20.0f)
                lineTo(12.9f, 17.0f)
                lineTo(15.9f, 14.0f)
                verticalLineTo(20.0f)
                moveTo(15.0f, 11.0f)
                horizontalLineTo(8.8f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _barn!!
    }

private var _barn: ImageVector? = null
