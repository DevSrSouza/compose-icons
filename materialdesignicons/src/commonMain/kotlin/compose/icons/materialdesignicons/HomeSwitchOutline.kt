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

public val MaterialDesignIcons.HomeSwitchOutline: ImageVector
    get() {
        if (_homeSwitchOutline != null) {
            return _homeSwitchOutline!!
        }
        _homeSwitchOutline = Builder(name = "HomeSwitchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                lineTo(1.0f, 9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                lineTo(8.0f, 3.0f)
                moveTo(11.5f, 9.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(8.0f)
                lineTo(8.0f, 5.0f)
                lineTo(11.5f, 8.0f)
                verticalLineTo(9.0f)
                moveTo(9.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                lineTo(18.0f, 19.0f)
                lineTo(15.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 19.0f)
                lineTo(9.0f, 16.0f)
                moveTo(23.0f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                lineTo(13.54f, 5.11f)
                lineTo(16.0f, 3.0f)
                lineTo(23.0f, 9.0f)
                close()
            }
        }
        .build()
        return _homeSwitchOutline!!
    }

private var _homeSwitchOutline: ImageVector? = null
