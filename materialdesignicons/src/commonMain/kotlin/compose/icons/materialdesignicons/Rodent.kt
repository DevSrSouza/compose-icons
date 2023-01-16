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

public val MaterialDesignIcons.Rodent: ImageVector
    get() {
        if (_rodent != null) {
            return _rodent!!
        }
        _rodent = Builder(name = "Rodent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.33f, 17.39f)
                curveTo(22.73f, 18.66f, 21.8f, 21.0f, 19.92f, 21.0f)
                horizontalLineTo(11.06f)
                curveTo(8.25f, 21.0f, 6.0f, 18.75f, 6.0f, 15.94f)
                verticalLineTo(15.89f)
                curveTo(3.7f, 15.42f, 2.0f, 13.41f, 2.0f, 11.0f)
                curveTo(2.0f, 8.25f, 4.22f, 6.0f, 7.0f, 6.0f)
                horizontalLineTo(9.5f)
                curveTo(9.8f, 6.0f, 10.0f, 5.77f, 10.0f, 5.5f)
                reflectiveCurveTo(9.8f, 5.0f, 9.5f, 5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.5f)
                curveTo(10.88f, 3.0f, 12.0f, 4.13f, 12.0f, 5.5f)
                curveTo(12.0f, 6.89f, 10.88f, 8.0f, 9.5f, 8.0f)
                horizontalLineTo(7.0f)
                curveTo(5.34f, 8.0f, 4.0f, 9.33f, 4.0f, 11.0f)
                curveTo(4.0f, 12.37f, 4.92f, 13.5f, 6.14f, 13.87f)
                curveTo(6.7f, 11.67f, 8.67f, 10.0f, 11.06f, 10.0f)
                curveTo(11.86f, 10.0f, 12.66f, 10.22f, 13.36f, 10.55f)
                curveTo(11.95f, 11.34f, 11.0f, 12.8f, 11.0f, 14.5f)
                curveTo(11.0f, 15.75f, 11.5f, 16.87f, 12.33f, 17.67f)
                lineTo(13.03f, 16.97f)
                curveTo(12.38f, 16.36f, 12.0f, 15.47f, 12.0f, 14.5f)
                curveTo(12.0f, 11.91f, 14.34f, 11.0f, 15.5f, 11.0f)
                curveTo(17.58f, 11.0f, 19.45f, 12.89f, 18.94f, 15.23f)
                lineTo(21.33f, 17.39f)
                moveTo(18.0f, 19.0f)
                curveTo(18.56f, 19.0f, 19.0f, 18.56f, 19.0f, 18.0f)
                reflectiveCurveTo(18.56f, 17.0f, 18.0f, 17.0f)
                reflectiveCurveTo(17.0f, 17.44f, 17.0f, 18.0f)
                reflectiveCurveTo(17.44f, 19.0f, 18.0f, 19.0f)
                close()
            }
        }
        .build()
        return _rodent!!
    }

private var _rodent: ImageVector? = null
