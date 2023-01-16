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

public val MaterialDesignIcons.HomeGroupPlus: ImageVector
    get() {
        if (_homeGroupPlus != null) {
            return _homeGroupPlus!!
        }
        _homeGroupPlus = Builder(name = "HomeGroupPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                horizontalLineTo(1.0f)
                lineTo(5.0f, 2.0f)
                lineTo(9.0f, 6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                moveTo(13.0f, 10.9f)
                lineTo(14.3f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                lineTo(17.0f, 3.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.9f)
                moveTo(13.8f, 22.0f)
                curveTo(13.3f, 21.1f, 13.0f, 20.1f, 13.0f, 19.0f)
                curveTo(13.0f, 17.4f, 13.6f, 15.9f, 14.7f, 14.9f)
                lineTo(9.0f, 10.0f)
                lineTo(2.0f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.8f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _homeGroupPlus!!
    }

private var _homeGroupPlus: ImageVector? = null
