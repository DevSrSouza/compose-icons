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

public val MaterialDesignIcons.ArrowDownRightBold: ImageVector
    get() {
        if (_arrowDownRightBold != null) {
            return _arrowDownRightBold!!
        }
        _arrowDownRightBold = Builder(name = "ArrowDownRightBold", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 3.0f)
                curveTo(14.64f, 3.0f, 18.0f, 6.36f, 18.0f, 10.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                lineTo(16.0f, 20.0f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.5f)
                curveTo(14.0f, 8.57f, 12.43f, 7.0f, 10.5f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _arrowDownRightBold!!
    }

private var _arrowDownRightBold: ImageVector? = null
