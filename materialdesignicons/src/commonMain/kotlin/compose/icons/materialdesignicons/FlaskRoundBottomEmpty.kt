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

public val MaterialDesignIcons.FlaskRoundBottomEmpty: ImageVector
    get() {
        if (_flaskRoundBottomEmpty != null) {
            return _flaskRoundBottomEmpty!!
        }
        _flaskRoundBottomEmpty = Builder(name = "FlaskRoundBottomEmpty", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                close()
            }
        }
        .build()
        return _flaskRoundBottomEmpty!!
    }

private var _flaskRoundBottomEmpty: ImageVector? = null
