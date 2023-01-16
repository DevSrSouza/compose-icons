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

public val MaterialDesignIcons.LightFloodUp: ImageVector
    get() {
        if (_lightFloodUp != null) {
            return _lightFloodUp!!
        }
        _lightFloodUp = Builder(name = "LightFloodUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                curveTo(8.55f, 13.0f, 9.0f, 13.45f, 9.0f, 14.0f)
                curveTo(9.0f, 14.55f, 8.55f, 15.0f, 8.0f, 15.0f)
                moveTo(16.72f, 18.9f)
                lineTo(10.69f, 4.08f)
                lineTo(8.83f, 4.84f)
                lineTo(9.21f, 5.76f)
                lineTo(4.41f, 9.88f)
                lineTo(5.27f, 12.0f)
                horizontalLineTo(8.0f)
                curveTo(9.1f, 12.0f, 10.0f, 12.9f, 10.0f, 14.0f)
                reflectiveCurveTo(9.1f, 16.0f, 8.0f, 16.0f)
                horizontalLineTo(6.9f)
                lineTo(8.18f, 19.14f)
                lineTo(14.5f, 18.73f)
                lineTo(14.87f, 19.65f)
                lineTo(16.72f, 18.9f)
                moveTo(20.81f, 17.71f)
                lineTo(18.5f, 16.75f)
                lineTo(19.26f, 14.9f)
                lineTo(21.57f, 15.86f)
                lineTo(20.81f, 17.71f)
                moveTo(18.78f, 10.43f)
                lineTo(18.0f, 8.58f)
                lineTo(20.79f, 7.43f)
                lineTo(21.55f, 9.28f)
                lineTo(18.78f, 10.43f)
                moveTo(15.19f, 5.07f)
                lineTo(13.34f, 4.31f)
                lineTo(14.3f, 2.0f)
                lineTo(16.15f, 2.77f)
                lineTo(15.19f, 5.07f)
                close()
            }
        }
        .build()
        return _lightFloodUp!!
    }

private var _lightFloodUp: ImageVector? = null
