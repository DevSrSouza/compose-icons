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

public val MaterialDesignIcons.FlaskEmptyPlusOutline: ImageVector
    get() {
        if (_flaskEmptyPlusOutline != null) {
            return _flaskEmptyPlusOutline!!
        }
        _flaskEmptyPlusOutline = Builder(name = "FlaskEmptyPlusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                moveTo(5.0f, 19.0f)
                curveTo(5.0f, 19.55f, 5.45f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(13.34f)
                curveTo(13.61f, 20.75f, 14.0f, 21.42f, 14.53f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 22.0f, 3.0f, 20.66f, 3.0f, 19.0f)
                curveTo(3.0f, 18.4f, 3.18f, 17.84f, 3.5f, 17.36f)
                lineTo(9.0f, 7.81f)
                verticalLineTo(6.0f)
                curveTo(8.45f, 6.0f, 8.0f, 5.55f, 8.0f, 5.0f)
                verticalLineTo(4.0f)
                curveTo(8.0f, 2.9f, 8.9f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 2.0f, 16.0f, 2.9f, 16.0f, 4.0f)
                verticalLineTo(5.0f)
                curveTo(16.0f, 5.55f, 15.55f, 6.0f, 15.0f, 6.0f)
                verticalLineTo(7.81f)
                lineTo(17.5f, 12.18f)
                curveTo(16.86f, 12.35f, 16.24f, 12.63f, 15.69f, 13.0f)
                lineTo(13.0f, 8.35f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.35f)
                lineTo(5.18f, 18.43f)
                curveTo(5.07f, 18.59f, 5.0f, 18.79f, 5.0f, 19.0f)
                close()
            }
        }
        .build()
        return _flaskEmptyPlusOutline!!
    }

private var _flaskEmptyPlusOutline: ImageVector? = null
