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

public val MaterialDesignIcons.ShieldBug: ImageVector
    get() {
        if (_shieldBug != null) {
            return _shieldBug!!
        }
        _shieldBug = Builder(name = "ShieldBug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                moveTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 16.5f, 17.2f, 21.7f, 12.0f, 23.0f)
                curveTo(6.8f, 21.7f, 3.0f, 16.5f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                moveTo(17.0f, 10.0f)
                horizontalLineTo(14.8f)
                curveTo(14.6f, 9.4f, 14.2f, 8.9f, 13.7f, 8.5f)
                lineTo(14.9f, 7.3f)
                lineTo(14.2f, 6.6f)
                lineTo(12.8f, 8.0f)
                horizontalLineTo(12.0f)
                curveTo(11.8f, 8.0f, 11.5f, 8.0f, 11.3f, 8.1f)
                lineTo(9.9f, 6.6f)
                lineTo(9.1f, 7.4f)
                lineTo(10.3f, 8.6f)
                curveTo(9.8f, 8.9f, 9.4f, 9.4f, 9.2f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.2f)
                curveTo(9.6f, 16.2f, 10.7f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(14.4f, 16.2f, 14.8f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                moveTo(11.0f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _shieldBug!!
    }

private var _shieldBug: ImageVector? = null
