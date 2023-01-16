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

public val MaterialDesignIcons.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) {
            return _arrowDownRight!!
        }
        _arrowDownRight = Builder(name = "ArrowDownRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 14.5f)
                lineTo(16.0f, 20.0f)
                lineTo(10.5f, 14.5f)
                lineTo(11.91f, 13.09f)
                lineTo(15.0f, 16.17f)
                verticalLineTo(10.5f)
                curveTo(15.0f, 8.0f, 13.0f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.5f)
                curveTo(14.09f, 4.0f, 17.0f, 6.91f, 17.0f, 10.5f)
                verticalLineTo(16.17f)
                lineTo(20.09f, 13.08f)
                lineTo(21.5f, 14.5f)
                close()
            }
        }
        .build()
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
