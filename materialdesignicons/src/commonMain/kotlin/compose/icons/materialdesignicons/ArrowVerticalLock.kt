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

public val MaterialDesignIcons.ArrowVerticalLock: ImageVector
    get() {
        if (_arrowVerticalLock != null) {
            return _arrowVerticalLock!!
        }
        _arrowVerticalLock = Builder(name = "ArrowVerticalLock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.8f, 11.0f)
                verticalLineTo(9.5f)
                curveTo(18.8f, 8.1f, 17.4f, 7.0f, 16.0f, 7.0f)
                reflectiveCurveTo(13.2f, 8.1f, 13.2f, 9.5f)
                verticalLineTo(11.0f)
                curveTo(12.6f, 11.0f, 12.0f, 11.6f, 12.0f, 12.2f)
                verticalLineTo(15.7f)
                curveTo(12.0f, 16.4f, 12.6f, 17.0f, 13.2f, 17.0f)
                horizontalLineTo(18.7f)
                curveTo(19.4f, 17.0f, 20.0f, 16.4f, 20.0f, 15.8f)
                verticalLineTo(12.3f)
                curveTo(20.0f, 11.6f, 19.4f, 11.0f, 18.8f, 11.0f)
                moveTo(17.5f, 11.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(9.5f)
                curveTo(14.5f, 8.7f, 15.2f, 8.2f, 16.0f, 8.2f)
                curveTo(16.8f, 8.2f, 17.5f, 8.7f, 17.5f, 9.5f)
                verticalLineTo(11.0f)
                moveTo(9.0f, 6.0f)
                horizontalLineTo(12.0f)
                lineTo(8.0f, 2.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                lineTo(8.0f, 22.0f)
                lineTo(12.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _arrowVerticalLock!!
    }

private var _arrowVerticalLock: ImageVector? = null
