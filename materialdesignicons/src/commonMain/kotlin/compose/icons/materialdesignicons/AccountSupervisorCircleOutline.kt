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

public val MaterialDesignIcons.AccountSupervisorCircleOutline: ImageVector
    get() {
        if (_accountSupervisorCircleOutline != null) {
            return _accountSupervisorCircleOutline!!
        }
        _accountSupervisorCircleOutline = Builder(name = "AccountSupervisorCircleOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 10.0f)
                curveTo(12.5f, 8.34f, 11.16f, 7.0f, 9.5f, 7.0f)
                curveTo(7.86f, 7.0f, 6.5f, 8.34f, 6.5f, 10.0f)
                curveTo(6.5f, 11.64f, 7.86f, 13.0f, 9.5f, 13.0f)
                curveTo(11.16f, 13.0f, 12.5f, 11.64f, 12.5f, 10.0f)
                moveTo(9.5f, 11.0f)
                curveTo(8.96f, 11.0f, 8.5f, 10.54f, 8.5f, 10.0f)
                curveTo(8.5f, 9.44f, 8.96f, 9.0f, 9.5f, 9.0f)
                curveTo(10.06f, 9.0f, 10.5f, 9.44f, 10.5f, 10.0f)
                curveTo(10.5f, 10.54f, 10.06f, 11.0f, 9.5f, 11.0f)
                moveTo(16.0f, 13.0f)
                curveTo(17.12f, 13.0f, 18.0f, 12.1f, 18.0f, 11.0f)
                curveTo(18.0f, 9.88f, 17.12f, 9.0f, 16.0f, 9.0f)
                curveTo(14.9f, 9.0f, 14.0f, 9.88f, 14.0f, 11.0f)
                curveTo(14.0f, 12.1f, 14.9f, 13.0f, 16.0f, 13.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5f, 22.0f, 22.0f, 17.5f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(5.85f, 17.11f)
                curveTo(6.53f, 16.57f, 8.12f, 16.0f, 9.5f, 16.0f)
                curveTo(9.58f, 16.0f, 9.66f, 16.0f, 9.74f, 16.0f)
                curveTo(10.0f, 15.37f, 10.41f, 14.72f, 11.04f, 14.15f)
                curveTo(10.5f, 14.05f, 9.95f, 14.0f, 9.5f, 14.0f)
                curveTo(8.21f, 14.0f, 6.12f, 14.44f, 4.78f, 15.42f)
                curveTo(4.28f, 14.38f, 4.0f, 13.22f, 4.0f, 12.0f)
                curveTo(4.0f, 7.58f, 7.59f, 4.0f, 12.0f, 4.0f)
                curveTo(16.41f, 4.0f, 20.0f, 7.58f, 20.0f, 12.0f)
                curveTo(20.0f, 13.19f, 19.73f, 14.33f, 19.25f, 15.36f)
                curveTo(18.25f, 14.77f, 16.89f, 14.5f, 16.0f, 14.5f)
                curveTo(14.5f, 14.5f, 11.5f, 15.3f, 11.5f, 17.19f)
                verticalLineTo(19.97f)
                curveTo(9.24f, 19.84f, 7.22f, 18.76f, 5.85f, 17.11f)
                close()
            }
        }
        .build()
        return _accountSupervisorCircleOutline!!
    }

private var _accountSupervisorCircleOutline: ImageVector? = null
