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

public val MaterialDesignIcons.AccountNetwork: ImageVector
    get() {
        if (_accountNetwork != null) {
            return _accountNetwork!!
        }
        _accountNetwork = Builder(name = "AccountNetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.5f)
                curveTo(5.0f, 13.57f, 8.13f, 12.0f, 12.0f, 12.0f)
                curveTo(15.87f, 12.0f, 19.0f, 13.57f, 19.0f, 15.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                moveTo(12.0f, 3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.5f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 10.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.5f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _accountNetwork!!
    }

private var _accountNetwork: ImageVector? = null
