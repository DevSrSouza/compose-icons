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

public val MaterialDesignIcons.CradleOutline: ImageVector
    get() {
        if (_cradleOutline != null) {
            return _cradleOutline!!
        }
        _cradleOutline = Builder(name = "CradleOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                curveTo(5.8f, 4.0f, 4.0f, 5.8f, 4.0f, 8.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 15.1f, 4.9f, 16.0f, 6.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.9f)
                curveTo(7.4f, 18.5f, 6.8f, 18.1f, 6.3f, 17.6f)
                lineTo(4.9f, 19.0f)
                curveTo(6.7f, 20.9f, 9.2f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(17.3f, 20.9f, 19.1f, 19.1f)
                lineTo(17.7f, 17.7f)
                curveTo(17.2f, 18.2f, 16.7f, 18.6f, 16.1f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.1f)
                curveTo(19.2f, 16.0f, 20.1f, 15.1f, 20.1f, 14.0f)
                verticalLineTo(11.0f)
                curveTo(20.0f, 9.9f, 19.1f, 9.0f, 18.0f, 9.0f)
                moveTo(14.0f, 19.8f)
                curveTo(13.4f, 20.0f, 12.7f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(10.6f, 19.9f, 10.0f, 19.8f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.8f)
                moveTo(18.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 6.9f, 6.9f, 6.0f, 8.0f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _cradleOutline!!
    }

private var _cradleOutline: ImageVector? = null
