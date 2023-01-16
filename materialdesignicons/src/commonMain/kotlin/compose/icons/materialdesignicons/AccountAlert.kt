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

public val MaterialDesignIcons.AccountAlert: ImageVector
    get() {
        if (_accountAlert != null) {
            return _accountAlert!!
        }
        _accountAlert = Builder(name = "AccountAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 14.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 4.0f)
                moveTo(10.0f, 14.0f)
                curveTo(14.42f, 14.0f, 18.0f, 15.79f, 18.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 15.79f, 5.58f, 14.0f, 10.0f, 14.0f)
                moveTo(20.0f, 12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _accountAlert!!
    }

private var _accountAlert: ImageVector? = null
