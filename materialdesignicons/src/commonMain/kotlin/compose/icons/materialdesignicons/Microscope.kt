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

public val MaterialDesignIcons.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = Builder(name = "Microscope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.46f, 6.28f)
                lineTo(11.05f, 9.0f)
                curveTo(8.47f, 9.26f, 6.5f, 11.41f, 6.5f, 14.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 11.5f, 19.0f)
                curveTo(13.55f, 19.0f, 15.31f, 17.77f, 16.08f, 16.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.25f)
                curveTo(18.84f, 17.57f, 17.97f, 18.96f, 16.79f, 20.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.21f)
                curveTo(4.55f, 18.53f, 3.5f, 16.39f, 3.5f, 14.0f)
                curveTo(3.5f, 10.37f, 5.96f, 7.2f, 9.46f, 6.28f)
                moveTo(12.74f, 2.07f)
                lineTo(13.5f, 3.37f)
                lineTo(14.36f, 2.87f)
                lineTo(17.86f, 8.93f)
                lineTo(14.39f, 10.93f)
                lineTo(10.89f, 4.87f)
                lineTo(11.76f, 4.37f)
                lineTo(11.0f, 3.07f)
                lineTo(12.74f, 2.07f)
                close()
            }
        }
        .build()
        return _microscope!!
    }

private var _microscope: ImageVector? = null
