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

public val MaterialDesignIcons.AccountSettings: ImageVector
    get() {
        if (_accountSettings != null) {
            return _accountSettings!!
        }
        _accountSettings = Builder(name = "AccountSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 4.0f)
                moveTo(12.0f, 14.0f)
                curveTo(16.42f, 14.0f, 20.0f, 15.79f, 20.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 15.79f, 7.58f, 14.0f, 12.0f, 14.0f)
                moveTo(7.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                moveTo(11.0f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                moveTo(15.0f, 22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _accountSettings!!
    }

private var _accountSettings: ImageVector? = null
