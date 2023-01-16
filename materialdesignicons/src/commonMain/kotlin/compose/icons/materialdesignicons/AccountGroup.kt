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

public val MaterialDesignIcons.AccountGroup: ImageVector
    get() {
        if (_accountGroup != null) {
            return _accountGroup!!
        }
        _accountGroup = Builder(name = "AccountGroup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.5f, 9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.5f, 9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 12.0f, 5.5f)
                moveTo(5.0f, 8.0f)
                curveTo(5.56f, 8.0f, 6.08f, 8.15f, 6.53f, 8.42f)
                curveTo(6.38f, 9.85f, 6.8f, 11.27f, 7.66f, 12.38f)
                curveTo(7.16f, 13.34f, 6.16f, 14.0f, 5.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 8.0f)
                moveTo(19.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 14.0f)
                curveTo(17.84f, 14.0f, 16.84f, 13.34f, 16.34f, 12.38f)
                curveTo(17.2f, 11.27f, 17.62f, 9.85f, 17.47f, 8.42f)
                curveTo(17.92f, 8.15f, 18.44f, 8.0f, 19.0f, 8.0f)
                moveTo(5.5f, 18.25f)
                curveTo(5.5f, 16.18f, 8.41f, 14.5f, 12.0f, 14.5f)
                curveTo(15.59f, 14.5f, 18.5f, 16.18f, 18.5f, 18.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(18.25f)
                moveTo(0.0f, 20.0f)
                verticalLineTo(18.5f)
                curveTo(0.0f, 17.11f, 1.89f, 15.94f, 4.45f, 15.6f)
                curveTo(3.86f, 16.28f, 3.5f, 17.22f, 3.5f, 18.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(0.0f)
                moveTo(24.0f, 20.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(18.25f)
                curveTo(20.5f, 17.22f, 20.14f, 16.28f, 19.55f, 15.6f)
                curveTo(22.11f, 15.94f, 24.0f, 17.11f, 24.0f, 18.5f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _accountGroup!!
    }

private var _accountGroup: ImageVector? = null
