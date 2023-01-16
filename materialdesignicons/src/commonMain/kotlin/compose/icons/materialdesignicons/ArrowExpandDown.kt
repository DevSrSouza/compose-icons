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

public val MaterialDesignIcons.ArrowExpandDown: ImageVector
    get() {
        if (_arrowExpandDown != null) {
            return _arrowExpandDown!!
        }
        _arrowExpandDown = Builder(name = "ArrowExpandDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.17f)
                lineTo(5.5f, 12.67f)
                lineTo(4.08f, 14.08f)
                lineTo(12.0f, 22.0f)
                lineTo(19.92f, 14.08f)
                lineTo(18.5f, 12.67f)
                lineTo(13.0f, 18.17f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _arrowExpandDown!!
    }

private var _arrowExpandDown: ImageVector? = null
