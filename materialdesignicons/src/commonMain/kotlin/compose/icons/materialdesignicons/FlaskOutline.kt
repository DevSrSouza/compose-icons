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

public val MaterialDesignIcons.FlaskOutline: ImageVector
    get() {
        if (_flaskOutline != null) {
            return _flaskOutline!!
        }
        _flaskOutline = Builder(name = "FlaskOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 20.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 19.0f)
                curveTo(19.0f, 18.79f, 18.93f, 18.59f, 18.82f, 18.43f)
                lineTo(13.0f, 8.35f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.35f)
                lineTo(5.18f, 18.43f)
                curveTo(5.07f, 18.59f, 5.0f, 18.79f, 5.0f, 19.0f)
                moveTo(6.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 19.0f)
                curveTo(3.0f, 18.4f, 3.18f, 17.84f, 3.5f, 17.37f)
                lineTo(9.0f, 7.81f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 5.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 4.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 6.0f)
                verticalLineTo(7.81f)
                lineTo(20.5f, 17.37f)
                curveTo(20.82f, 17.84f, 21.0f, 18.4f, 21.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 16.0f)
                lineTo(14.34f, 14.66f)
                lineTo(16.27f, 18.0f)
                horizontalLineTo(7.73f)
                lineTo(10.39f, 13.39f)
                lineTo(13.0f, 16.0f)
                moveTo(12.5f, 12.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 13.0f, 12.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 13.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 12.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 12.0f)
                close()
            }
        }
        .build()
        return _flaskOutline!!
    }

private var _flaskOutline: ImageVector? = null
