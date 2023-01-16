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

public val MaterialDesignIcons.Diversify: ImageVector
    get() {
        if (_diversify != null) {
            return _diversify!!
        }
        _diversify = Builder(name = "Diversify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                curveTo(10.9f, 4.0f, 10.0f, 4.89f, 10.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                lineTo(22.0f, 5.0f)
                lineTo(19.0f, 2.0f)
                moveTo(19.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                lineTo(22.0f, 12.0f)
                lineTo(19.0f, 9.0f)
                moveTo(11.05f, 10.0f)
                curveTo(9.94f, 10.0f, 9.04f, 10.87f, 9.03f, 12.0f)
                reflectiveCurveTo(9.9f, 14.0f, 11.0f, 14.0f)
                curveTo(12.11f, 14.0f, 13.0f, 13.11f, 13.0f, 12.0f)
                curveTo(13.0f, 10.91f, 12.13f, 10.03f, 11.05f, 10.0f)
                moveTo(2.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                moveTo(10.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 19.11f, 10.9f, 20.0f, 12.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                lineTo(22.0f, 19.0f)
                lineTo(19.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _diversify!!
    }

private var _diversify: ImageVector? = null
