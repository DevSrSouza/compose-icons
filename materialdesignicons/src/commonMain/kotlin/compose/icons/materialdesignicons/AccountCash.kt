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

public val MaterialDesignIcons.AccountCash: ImageVector
    get() {
        if (_accountCash != null) {
            return _accountCash!!
        }
        _accountCash = Builder(name = "AccountCash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 8.0f)
                curveTo(11.0f, 10.21f, 9.21f, 12.0f, 7.0f, 12.0f)
                curveTo(4.79f, 12.0f, 3.0f, 10.21f, 3.0f, 8.0f)
                curveTo(3.0f, 5.79f, 4.79f, 4.0f, 7.0f, 4.0f)
                curveTo(9.21f, 4.0f, 11.0f, 5.79f, 11.0f, 8.0f)
                moveTo(11.0f, 14.72f)
                verticalLineTo(20.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(18.0f)
                curveTo(0.0f, 15.79f, 3.13f, 14.0f, 7.0f, 14.0f)
                curveTo(8.5f, 14.0f, 9.87f, 14.27f, 11.0f, 14.72f)
                moveTo(24.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(20.0f)
                moveTo(16.0f, 11.5f)
                curveTo(16.0f, 10.12f, 17.12f, 9.0f, 18.5f, 9.0f)
                curveTo(19.88f, 9.0f, 21.0f, 10.12f, 21.0f, 11.5f)
                curveTo(21.0f, 12.88f, 19.88f, 14.0f, 18.5f, 14.0f)
                curveTo(17.12f, 14.0f, 16.0f, 12.88f, 16.0f, 11.5f)
                moveTo(22.0f, 7.0f)
                curveTo(20.9f, 7.0f, 20.0f, 6.11f, 20.0f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 6.11f, 16.11f, 7.0f, 15.0f, 7.0f)
                verticalLineTo(16.0f)
                curveTo(16.11f, 16.0f, 17.0f, 16.9f, 17.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 16.9f, 20.9f, 16.0f, 22.0f, 16.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _accountCash!!
    }

private var _accountCash: ImageVector? = null
