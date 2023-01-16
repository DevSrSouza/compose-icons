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

public val MaterialDesignIcons.AccountHardHat: ImageVector
    get() {
        if (_accountHardHat != null) {
            return _accountHardHat!!
        }
        _accountHardHat = Builder(name = "AccountHardHat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(7.58f, 15.0f, 4.0f, 16.79f, 4.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 16.79f, 16.42f, 15.0f, 12.0f, 15.0f)
                moveTo(8.0f, 9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 9.0f)
                moveTo(11.5f, 2.0f)
                curveTo(11.2f, 2.0f, 11.0f, 2.21f, 11.0f, 2.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                curveTo(10.0f, 3.0f, 7.75f, 3.86f, 7.75f, 6.75f)
                curveTo(7.75f, 6.75f, 7.0f, 6.89f, 7.0f, 8.0f)
                horizontalLineTo(17.0f)
                curveTo(16.95f, 6.89f, 16.25f, 6.75f, 16.25f, 6.75f)
                curveTo(16.25f, 3.86f, 14.0f, 3.0f, 14.0f, 3.0f)
                verticalLineTo(5.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.5f)
                curveTo(13.0f, 2.21f, 12.81f, 2.0f, 12.5f, 2.0f)
                horizontalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _accountHardHat!!
    }

private var _accountHardHat: ImageVector? = null
