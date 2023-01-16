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

public val MaterialDesignIcons.HomeCity: ImageVector
    get() {
        if (_homeCity != null) {
            return _homeCity!!
        }
        _homeCity = Builder(name = "HomeCity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 21.0f)
                verticalLineTo(10.0f)
                lineTo(7.5f, 5.0f)
                lineTo(15.0f, 10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(0.0f)
                moveTo(24.0f, 2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.93f)
                lineTo(16.0f, 8.27f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.93f)
                lineTo(10.0f, 4.27f)
                verticalLineTo(2.0f)
                horizontalLineTo(24.0f)
                moveTo(21.0f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                moveTo(21.0f, 10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                moveTo(21.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _homeCity!!
    }

private var _homeCity: ImageVector? = null
