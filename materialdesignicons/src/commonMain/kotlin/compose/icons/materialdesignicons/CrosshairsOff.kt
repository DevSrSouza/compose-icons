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

public val MaterialDesignIcons.CrosshairsOff: ImageVector
    get() {
        if (_crosshairsOff != null) {
            return _crosshairsOff!!
        }
        _crosshairsOff = Builder(name = "CrosshairsOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.94f, 11.0f)
                curveTo(20.5f, 6.83f, 17.17f, 3.5f, 13.0f, 3.06f)
                verticalLineTo(1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.06f)
                curveTo(9.87f, 3.18f, 8.81f, 3.5f, 7.84f, 4.03f)
                lineTo(9.34f, 5.53f)
                curveTo(10.16f, 5.19f, 11.06f, 5.0f, 12.0f, 5.0f)
                curveTo(15.87f, 5.0f, 19.0f, 8.13f, 19.0f, 12.0f)
                curveTo(19.0f, 12.94f, 18.81f, 13.84f, 18.5f, 14.65f)
                lineTo(20.0f, 16.15f)
                curveTo(20.5f, 15.19f, 20.82f, 14.13f, 20.95f, 13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.94f)
                moveTo(3.0f, 4.27f)
                lineTo(5.04f, 6.31f)
                curveTo(3.97f, 7.62f, 3.25f, 9.23f, 3.06f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.06f)
                curveTo(3.5f, 17.17f, 6.83f, 20.5f, 11.0f, 20.94f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.94f)
                curveTo(14.77f, 20.74f, 16.38f, 20.03f, 17.69f, 18.96f)
                lineTo(19.73f, 21.0f)
                lineTo(21.0f, 19.73f)
                lineTo(4.27f, 3.0f)
                lineTo(3.0f, 4.27f)
                moveTo(16.27f, 17.54f)
                curveTo(15.09f, 18.45f, 13.61f, 19.0f, 12.0f, 19.0f)
                curveTo(8.13f, 19.0f, 5.0f, 15.87f, 5.0f, 12.0f)
                curveTo(5.0f, 10.39f, 5.55f, 8.91f, 6.46f, 7.73f)
                lineTo(16.27f, 17.54f)
                close()
            }
        }
        .build()
        return _crosshairsOff!!
    }

private var _crosshairsOff: ImageVector? = null
