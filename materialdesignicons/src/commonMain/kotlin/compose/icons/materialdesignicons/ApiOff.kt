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

public val MaterialDesignIcons.ApiOff: ImageVector
    get() {
        if (_apiOff != null) {
            return _apiOff!!
        }
        _apiOff = Builder(name = "ApiOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                moveTo(14.0f, 7.0f)
                horizontalLineTo(11.38f)
                lineTo(13.29f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.75f)
                lineTo(15.87f, 11.71f)
                curveTo(15.95f, 11.5f, 16.0f, 11.25f, 16.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(16.0f, 7.9f, 15.11f, 7.0f, 14.0f, 7.0f)
                moveTo(4.45f, 2.62f)
                lineTo(3.0f, 4.0f)
                lineTo(5.86f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 7.0f, 3.0f, 7.9f, 3.0f, 9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.3f)
                lineTo(10.0f, 11.34f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.45f)
                lineTo(19.55f, 21.38f)
                lineTo(21.0f, 20.0f)
                moveTo(20.9f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.95f)
                close()
            }
        }
        .build()
        return _apiOff!!
    }

private var _apiOff: ImageVector? = null
