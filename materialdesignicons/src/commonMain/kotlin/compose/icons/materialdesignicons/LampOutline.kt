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

public val MaterialDesignIcons.LampOutline: ImageVector
    get() {
        if (_lampOutline != null) {
            return _lampOutline!!
        }
        _lampOutline = Builder(name = "LampOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.56f, 4.0f)
                lineTo(17.23f, 12.0f)
                horizontalLineTo(6.78f)
                lineTo(9.44f, 4.0f)
                horizontalLineTo(14.56f)
                moveTo(16.0f, 2.0f)
                horizontalLineTo(8.0f)
                lineTo(4.0f, 14.0f)
                horizontalLineTo(20.0f)
                lineTo(16.0f, 2.0f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _lampOutline!!
    }

private var _lampOutline: ImageVector? = null
