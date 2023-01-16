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

public val MaterialDesignIcons.PyramidOff: ImageVector
    get() {
        if (_pyramidOff != null) {
            return _pyramidOff!!
        }
        _pyramidOff = Builder(name = "PyramidOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.3f)
                lineTo(9.05f, 5.85f)
                lineTo(11.15f, 2.47f)
                curveTo(11.35f, 2.16f, 11.67f, 2.0f, 12.0f, 2.0f)
                curveTo(12.33f, 2.0f, 12.65f, 2.16f, 12.85f, 2.47f)
                lineTo(21.85f, 16.96f)
                horizontalLineTo(21.85f)
                curveTo(22.13f, 17.4f, 22.0f, 18.0f, 21.5f, 18.32f)
                lineTo(18.41f, 15.21f)
                lineTo(13.0f, 6.5f)
                verticalLineTo(9.8f)
                lineTo(11.0f, 7.8f)
                verticalLineTo(6.5f)
                lineTo(10.5f, 7.3f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.89f, 19.78f)
                lineTo(12.36f, 21.93f)
                curveTo(12.25f, 22.0f, 12.12f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(11.75f, 22.0f, 11.64f, 21.93f)
                lineTo(2.64f, 18.43f)
                curveTo(2.0f, 18.18f, 1.84f, 17.45f, 2.15f, 16.96f)
                horizontalLineTo(2.15f)
                lineTo(7.1f, 9.0f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(5.42f, 15.5f)
                lineTo(11.0f, 13.32f)
                verticalLineTo(12.89f)
                lineTo(8.55f, 10.44f)
                lineTo(5.42f, 15.5f)
                moveTo(16.35f, 18.24f)
                lineTo(13.94f, 15.83f)
                lineTo(12.0f, 15.07f)
                lineTo(5.76f, 17.5f)
                lineTo(12.0f, 19.93f)
                lineTo(16.35f, 18.24f)
                close()
            }
        }
        .build()
        return _pyramidOff!!
    }

private var _pyramidOff: ImageVector? = null
