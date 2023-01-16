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

public val MaterialDesignIcons.LightFloodDown: ImageVector
    get() {
        if (_lightFloodDown != null) {
            return _lightFloodDown!!
        }
        _lightFloodDown = Builder(name = "LightFloodDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                curveTo(8.55f, 9.0f, 9.0f, 9.45f, 9.0f, 10.0f)
                curveTo(9.0f, 10.55f, 8.55f, 11.0f, 8.0f, 11.0f)
                moveTo(14.87f, 4.35f)
                lineTo(14.5f, 5.27f)
                lineTo(8.18f, 4.86f)
                lineTo(6.9f, 8.0f)
                horizontalLineTo(8.0f)
                curveTo(9.1f, 8.0f, 10.0f, 8.9f, 10.0f, 10.0f)
                reflectiveCurveTo(9.1f, 12.0f, 8.0f, 12.0f)
                horizontalLineTo(5.27f)
                lineTo(4.41f, 14.12f)
                lineTo(9.21f, 18.24f)
                lineTo(8.83f, 19.16f)
                lineTo(10.69f, 19.92f)
                lineTo(16.72f, 5.1f)
                lineTo(14.87f, 4.35f)
                moveTo(20.81f, 6.29f)
                lineTo(21.57f, 8.14f)
                lineTo(19.26f, 9.1f)
                lineTo(18.5f, 7.25f)
                lineTo(20.81f, 6.29f)
                moveTo(18.78f, 13.57f)
                lineTo(21.55f, 14.72f)
                lineTo(20.79f, 16.57f)
                lineTo(18.0f, 15.42f)
                lineTo(18.78f, 13.57f)
                moveTo(16.15f, 21.23f)
                lineTo(14.3f, 22.0f)
                lineTo(13.34f, 19.69f)
                lineTo(15.19f, 18.93f)
                lineTo(16.15f, 21.23f)
                close()
            }
        }
        .build()
        return _lightFloodDown!!
    }

private var _lightFloodDown: ImageVector? = null
