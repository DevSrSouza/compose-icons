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

public val MaterialDesignIcons.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.46f, 15.06f)
                lineTo(7.05f, 16.47f)
                lineTo(5.68f, 15.1f)
                curveTo(4.82f, 16.21f, 4.24f, 17.54f, 4.06f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 15.16f, 5.44f, 11.13f, 10.0f, 10.2f)
                verticalLineTo(8.2f)
                lineTo(2.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                lineTo(14.0f, 8.2f)
                verticalLineTo(10.2f)
                curveTo(18.56f, 11.13f, 22.0f, 15.16f, 22.0f, 20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.94f)
                curveTo(19.76f, 17.54f, 19.18f, 16.21f, 18.32f, 15.1f)
                lineTo(16.95f, 16.47f)
                lineTo(15.54f, 15.06f)
                lineTo(16.91f, 13.68f)
                curveTo(15.8f, 12.82f, 14.46f, 12.24f, 13.0f, 12.06f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.06f)
                curveTo(9.54f, 12.24f, 8.2f, 12.82f, 7.09f, 13.68f)
                lineTo(8.46f, 15.06f)
                moveTo(12.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(11.68f, 22.0f, 11.38f, 21.93f, 11.12f, 21.79f)
                lineTo(7.27f, 20.0f)
                lineTo(11.12f, 18.21f)
                curveTo(11.38f, 18.07f, 11.68f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
