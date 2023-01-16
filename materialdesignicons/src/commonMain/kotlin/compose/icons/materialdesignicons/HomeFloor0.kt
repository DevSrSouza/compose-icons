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

public val MaterialDesignIcons.HomeFloor0: ImageVector
    get() {
        if (_homeFloor0 != null) {
            return _homeFloor0!!
        }
        _homeFloor0 = Builder(name = "HomeFloor0", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                moveTo(22.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                lineTo(12.0f, 3.0f)
                lineTo(22.0f, 12.0f)
                moveTo(15.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 8.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 10.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 18.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 16.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _homeFloor0!!
    }

private var _homeFloor0: ImageVector? = null
