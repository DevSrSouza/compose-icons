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

public val MaterialDesignIcons.Diving: ImageVector
    get() {
        if (_diving != null) {
            return _diving!!
        }
        _diving = Builder(name = "Diving", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.26f, 5.2f)
                lineTo(13.3f, 5.18f)
                curveTo(13.72f, 4.82f, 14.35f, 4.88f, 14.71f, 5.3f)
                lineTo(16.97f, 8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 8.0f, 21.0f, 8.45f, 21.0f, 9.0f)
                reflectiveCurveTo(20.55f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(16.5f)
                curveTo(16.15f, 10.0f, 15.85f, 9.82f, 15.67f, 9.56f)
                lineTo(14.17f, 7.77f)
                lineTo(11.64f, 10.13f)
                lineTo(14.57f, 12.18f)
                curveTo(14.83f, 12.36f, 15.0f, 12.66f, 15.0f, 13.0f)
                verticalLineTo(17.0f)
                curveTo(15.0f, 17.55f, 14.55f, 18.0f, 14.0f, 18.0f)
                reflectiveCurveTo(13.0f, 17.55f, 13.0f, 17.0f)
                verticalLineTo(13.5f)
                lineTo(9.77f, 11.26f)
                curveTo(8.82f, 10.6f, 8.74f, 9.23f, 9.6f, 8.46f)
                lineTo(13.26f, 5.2f)
                moveTo(16.5f, 5.0f)
                curveTo(17.34f, 5.0f, 18.0f, 4.33f, 18.0f, 3.5f)
                reflectiveCurveTo(17.34f, 2.0f, 16.5f, 2.0f)
                reflectiveCurveTo(15.0f, 2.67f, 15.0f, 3.5f)
                reflectiveCurveTo(15.68f, 5.0f, 16.5f, 5.0f)
                moveTo(6.0f, 19.0f)
                horizontalLineTo(5.0f)
                curveTo(3.34f, 19.0f, 2.0f, 20.34f, 2.0f, 22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _diving!!
    }

private var _diving: ImageVector? = null
