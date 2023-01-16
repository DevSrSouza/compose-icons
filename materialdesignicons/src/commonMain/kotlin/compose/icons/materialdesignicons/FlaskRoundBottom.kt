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

public val MaterialDesignIcons.FlaskRoundBottom: ImageVector
    get() {
        if (_flaskRoundBottom != null) {
            return _flaskRoundBottom!!
        }
        _flaskRoundBottom = Builder(name = "FlaskRoundBottom", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                curveTo(19.0f, 18.87f, 15.87f, 22.0f, 12.0f, 22.0f)
                curveTo(8.13f, 22.0f, 5.0f, 18.87f, 5.0f, 15.0f)
                curveTo(5.0f, 12.21f, 6.64f, 9.8f, 9.0f, 8.67f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 4.45f, 9.45f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(10.5f)
                lineTo(9.5f, 2.0f)
                horizontalLineTo(14.5f)
                lineTo(13.5f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(14.55f, 4.0f, 15.0f, 4.45f, 15.0f, 5.0f)
                verticalLineTo(8.67f)
                curveTo(17.36f, 9.8f, 19.0f, 12.21f, 19.0f, 15.0f)
                moveTo(11.0f, 6.0f)
                verticalLineTo(10.1f)
                curveTo(8.72f, 10.56f, 7.0f, 12.58f, 7.0f, 15.0f)
                lineTo(7.08f, 15.91f)
                lineTo(9.0f, 13.93f)
                lineTo(13.07f, 18.0f)
                lineTo(16.93f, 14.14f)
                curveTo(16.58f, 12.12f, 15.0f, 10.5f, 13.0f, 10.1f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                moveTo(13.07f, 12.0f)
                curveTo(13.62f, 12.0f, 14.07f, 12.45f, 14.07f, 13.0f)
                curveTo(14.07f, 13.55f, 13.62f, 14.0f, 13.07f, 14.0f)
                curveTo(12.5f, 14.0f, 12.07f, 13.55f, 12.07f, 13.0f)
                curveTo(12.07f, 12.45f, 12.5f, 12.0f, 13.07f, 12.0f)
                close()
            }
        }
        .build()
        return _flaskRoundBottom!!
    }

private var _flaskRoundBottom: ImageVector? = null
