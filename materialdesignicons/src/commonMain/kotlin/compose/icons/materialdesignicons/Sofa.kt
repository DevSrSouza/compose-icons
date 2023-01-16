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

public val MaterialDesignIcons.Sofa: ImageVector
    get() {
        if (_sofa != null) {
            return _sofa!!
        }
        _sofa = Builder(name = "Sofa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 7.0f)
                curveTo(12.5f, 5.89f, 13.39f, 5.0f, 14.5f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 5.0f, 20.0f, 5.9f, 20.0f, 7.0f)
                verticalLineTo(9.16f)
                curveTo(18.84f, 9.57f, 18.0f, 10.67f, 18.0f, 11.97f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(7.0f)
                moveTo(6.0f, 11.96f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(7.0f)
                curveTo(11.5f, 5.89f, 10.61f, 5.0f, 9.5f, 5.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 5.0f, 4.0f, 5.9f, 4.0f, 7.0f)
                verticalLineTo(9.15f)
                curveTo(5.16f, 9.56f, 6.0f, 10.67f, 6.0f, 11.96f)
                moveTo(20.66f, 10.03f)
                curveTo(19.68f, 10.19f, 19.0f, 11.12f, 19.0f, 12.12f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 10.9f, 4.11f, 10.0f, 3.0f, 10.0f)
                reflectiveCurveTo(1.0f, 10.9f, 1.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(1.0f, 18.1f, 1.9f, 19.0f, 3.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                curveTo(22.1f, 19.0f, 23.0f, 18.1f, 23.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(23.0f, 10.79f, 21.91f, 9.82f, 20.66f, 10.03f)
                close()
            }
        }
        .build()
        return _sofa!!
    }

private var _sofa: ImageVector? = null
