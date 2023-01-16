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

public val MaterialDesignIcons.AccountDetailsOutline: ImageVector
    get() {
        if (_accountDetailsOutline != null) {
            return _accountDetailsOutline!!
        }
        _accountDetailsOutline = Builder(name = "AccountDetailsOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                curveTo(11.0f, 10.66f, 9.66f, 12.0f, 8.0f, 12.0f)
                curveTo(6.34f, 12.0f, 5.0f, 10.66f, 5.0f, 9.0f)
                curveTo(5.0f, 7.34f, 6.34f, 6.0f, 8.0f, 6.0f)
                curveTo(9.66f, 6.0f, 11.0f, 7.34f, 11.0f, 9.0f)
                moveTo(14.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 15.79f, 4.69f, 14.0f, 8.0f, 14.0f)
                curveTo(11.31f, 14.0f, 14.0f, 15.79f, 14.0f, 18.0f)
                moveTo(7.0f, 9.0f)
                curveTo(7.0f, 9.55f, 7.45f, 10.0f, 8.0f, 10.0f)
                curveTo(8.55f, 10.0f, 9.0f, 9.55f, 9.0f, 9.0f)
                curveTo(9.0f, 8.45f, 8.55f, 8.0f, 8.0f, 8.0f)
                curveTo(7.45f, 8.0f, 7.0f, 8.45f, 7.0f, 9.0f)
                moveTo(4.0f, 18.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 16.9f, 10.21f, 16.0f, 8.0f, 16.0f)
                curveTo(5.79f, 16.0f, 4.0f, 16.9f, 4.0f, 18.0f)
                moveTo(22.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                moveTo(22.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                moveTo(22.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _accountDetailsOutline!!
    }

private var _accountDetailsOutline: ImageVector? = null