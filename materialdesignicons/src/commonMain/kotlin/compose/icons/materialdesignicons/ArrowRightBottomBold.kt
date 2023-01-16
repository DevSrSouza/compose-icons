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

public val MaterialDesignIcons.ArrowRightBottomBold: ImageVector
    get() {
        if (_arrowRightBottomBold != null) {
            return _arrowRightBottomBold!!
        }
        _arrowRightBottomBold = Builder(name = "ArrowRightBottomBold", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.5f)
                curveTo(7.0f, 12.43f, 8.57f, 14.0f, 10.5f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                lineTo(20.0f, 16.0f)
                lineTo(13.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.5f)
                curveTo(6.36f, 18.0f, 3.0f, 14.64f, 3.0f, 10.5f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _arrowRightBottomBold!!
    }

private var _arrowRightBottomBold: ImageVector? = null
