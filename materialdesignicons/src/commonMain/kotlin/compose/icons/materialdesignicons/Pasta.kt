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

public val MaterialDesignIcons.Pasta: ImageVector
    get() {
        if (_pasta != null) {
            return _pasta!!
        }
        _pasta = Builder(name = "Pasta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5f, 3.03f, 9.95f, 3.24f, 10.34f, 3.63f)
                reflectiveCurveTo(10.95f, 4.5f, 11.0f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                curveTo(10.95f, 6.53f, 10.73f, 7.0f, 10.34f, 7.43f)
                reflectiveCurveTo(9.5f, 8.05f, 9.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.05f)
                curveTo(7.05f, 15.05f, 7.13f, 15.04f, 7.24f, 15.0f)
                reflectiveCurveTo(7.44f, 15.0f, 7.5f, 15.0f)
                curveTo(8.06f, 15.0f, 8.7f, 15.14f, 9.42f, 15.42f)
                curveTo(9.83f, 14.5f, 10.53f, 13.68f, 11.53f, 13.0f)
                reflectiveCurveTo(13.53f, 12.0f, 14.53f, 12.0f)
                curveTo(16.06f, 12.0f, 17.36f, 12.53f, 18.42f, 13.59f)
                reflectiveCurveTo(20.0f, 15.95f, 20.0f, 17.5f)
                curveTo(20.0f, 17.55f, 20.0f, 17.64f, 20.0f, 17.77f)
                reflectiveCurveTo(19.97f, 17.97f, 19.97f, 18.0f)
                horizontalLineTo(3.14f)
                curveTo(3.27f, 17.5f, 3.55f, 17.0f, 4.0f, 16.5f)
                moveTo(6.0f, 15.23f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.7f)
                curveTo(5.5f, 15.45f, 5.81f, 15.3f, 6.0f, 15.23f)
                moveTo(9.0f, 7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                moveTo(5.0f, 4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                moveTo(2.0f, 19.0f)
                horizontalLineTo(22.0f)
                lineTo(20.0f, 21.0f)
                horizontalLineTo(4.0f)
                lineTo(2.0f, 19.0f)
                close()
            }
        }
        .build()
        return _pasta!!
    }

private var _pasta: ImageVector? = null
