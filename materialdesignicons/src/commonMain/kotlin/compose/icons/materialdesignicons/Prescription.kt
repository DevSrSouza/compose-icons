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

public val MaterialDesignIcons.Prescription: ImageVector
    get() {
        if (_prescription != null) {
            return _prescription!!
        }
        _prescription = Builder(name = "Prescription", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                verticalLineTo(10.0f)
                lineTo(4.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                lineTo(13.41f, 15.41f)
                lineTo(9.83f, 19.0f)
                lineTo(11.24f, 20.41f)
                lineTo(14.83f, 16.83f)
                lineTo(18.41f, 20.41f)
                lineTo(19.82f, 19.0f)
                lineTo(16.24f, 15.41f)
                lineTo(19.82f, 11.83f)
                lineTo(18.41f, 10.41f)
                lineTo(14.83f, 14.0f)
                lineTo(10.83f, 10.0f)
                horizontalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 4.0f)
                horizontalLineTo(4.0f)
                moveTo(6.0f, 6.0f)
                horizontalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _prescription!!
    }

private var _prescription: ImageVector? = null
