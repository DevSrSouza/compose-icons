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

public val MaterialDesignIcons.AccountSupervisor: ImageVector
    get() {
        if (_accountSupervisor != null) {
            return _accountSupervisor!!
        }
        _accountSupervisor = Builder(name = "AccountSupervisor", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 19.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 12.0f)
                moveTo(9.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 11.0f)
                moveTo(16.5f, 14.0f)
                curveTo(14.67f, 14.0f, 11.0f, 14.92f, 11.0f, 16.75f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 14.92f, 18.33f, 14.0f, 16.5f, 14.0f)
                moveTo(9.0f, 13.0f)
                curveTo(6.67f, 13.0f, 2.0f, 14.17f, 2.0f, 16.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.75f)
                curveTo(9.0f, 15.9f, 9.33f, 14.41f, 11.37f, 13.28f)
                curveTo(10.5f, 13.1f, 9.66f, 13.0f, 9.0f, 13.0f)
                close()
            }
        }
        .build()
        return _accountSupervisor!!
    }

private var _accountSupervisor: ImageVector? = null
