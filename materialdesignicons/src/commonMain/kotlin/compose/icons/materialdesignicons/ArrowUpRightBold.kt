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

public val MaterialDesignIcons.ArrowUpRightBold: ImageVector
    get() {
        if (_arrowUpRightBold != null) {
            return _arrowUpRightBold!!
        }
        _arrowUpRightBold = Builder(name = "ArrowUpRightBold", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.5f)
                curveTo(12.43f, 17.0f, 14.0f, 15.43f, 14.0f, 13.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                lineTo(16.0f, 4.0f)
                lineTo(22.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.5f)
                curveTo(18.0f, 17.64f, 14.64f, 21.0f, 10.5f, 21.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _arrowUpRightBold!!
    }

private var _arrowUpRightBold: ImageVector? = null
