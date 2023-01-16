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

public val MaterialDesignIcons.ArrowHorizontalLock: ImageVector
    get() {
        if (_arrowHorizontalLock != null) {
            return _arrowHorizontalLock!!
        }
        _arrowHorizontalLock = Builder(name = "ArrowHorizontalLock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8f, 7.0f)
                verticalLineTo(5.5f)
                curveTo(14.8f, 4.1f, 13.4f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(9.2f, 4.1f, 9.2f, 5.5f)
                verticalLineTo(7.0f)
                curveTo(8.6f, 7.0f, 8.0f, 7.6f, 8.0f, 8.2f)
                verticalLineTo(11.7f)
                curveTo(8.0f, 12.4f, 8.6f, 13.0f, 9.2f, 13.0f)
                horizontalLineTo(14.7f)
                curveTo(15.4f, 13.0f, 16.0f, 12.4f, 16.0f, 11.8f)
                verticalLineTo(8.3f)
                curveTo(16.0f, 7.6f, 15.4f, 7.0f, 14.8f, 7.0f)
                moveTo(13.5f, 7.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(5.5f)
                curveTo(10.5f, 4.7f, 11.2f, 4.2f, 12.0f, 4.2f)
                reflectiveCurveTo(13.5f, 4.7f, 13.5f, 5.5f)
                verticalLineTo(7.0f)
                moveTo(6.0f, 17.0f)
                verticalLineTo(20.0f)
                lineTo(2.0f, 16.0f)
                lineTo(6.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                lineTo(22.0f, 16.0f)
                lineTo(18.0f, 20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _arrowHorizontalLock!!
    }

private var _arrowHorizontalLock: ImageVector? = null
