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

public val MaterialDesignIcons.AccountSupervisorOutline: ImageVector
    get() {
        if (_accountSupervisorOutline != null) {
            return _accountSupervisorOutline!!
        }
        _accountSupervisorOutline = Builder(name = "AccountSupervisorOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 15.5f)
                curveTo(18.22f, 15.5f, 20.25f, 16.3f, 20.5f, 16.78f)
                verticalLineTo(17.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(16.78f)
                curveTo(12.75f, 16.3f, 14.78f, 15.5f, 16.5f, 15.5f)
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
                verticalLineTo(17.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(16.5f)
                curveTo(3.5f, 15.87f, 6.29f, 14.34f, 9.82f, 14.5f)
                arcTo(5.12f, 5.12f, 0.0f, false, true, 11.37f, 13.25f)
                arcTo(12.28f, 12.28f, 0.0f, false, false, 9.0f, 13.0f)
                moveTo(9.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 6.5f)
                moveTo(9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 12.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 5.0f)
                moveTo(16.5f, 8.5f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 15.5f, 9.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.5f, 8.5f)
                moveTo(16.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 19.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 7.0f)
                close()
            }
        }
        .build()
        return _accountSupervisorOutline!!
    }

private var _accountSupervisorOutline: ImageVector? = null
