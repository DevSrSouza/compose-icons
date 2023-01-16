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

public val MaterialDesignIcons.AccountTieWoman: ImageVector
    get() {
        if (_accountTieWoman != null) {
            return _accountTieWoman!!
        }
        _accountTieWoman = Builder(name = "AccountTieWoman", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.94f, 3.0f)
                curveTo(9.75f, 3.03f, 8.0f, 4.81f, 8.0f, 7.0f)
                curveTo(7.94f, 8.64f, 7.81f, 10.47f, 7.03f, 11.59f)
                curveTo(9.71f, 13.22f, 12.0f, 13.0f, 12.0f, 13.0f)
                curveTo(12.0f, 13.0f, 14.29f, 13.22f, 16.97f, 11.59f)
                curveTo(16.12f, 10.22f, 15.94f, 8.54f, 16.0f, 7.0f)
                curveTo(16.0f, 4.79f, 14.21f, 3.0f, 12.0f, 3.0f)
                horizontalLineTo(11.94f)
                moveTo(8.86f, 13.32f)
                curveTo(6.0f, 13.93f, 4.0f, 15.35f, 4.0f, 17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                lineTo(9.0f, 17.0f)
                horizontalLineTo(6.5f)
                moveTo(12.0f, 21.0f)
                lineTo(13.78f, 13.81f)
                curveTo(13.78f, 13.81f, 13.0f, 14.0f, 12.0f, 14.0f)
                curveTo(11.0f, 14.0f, 10.22f, 13.81f, 10.22f, 13.81f)
                moveTo(12.0f, 21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 15.35f, 18.0f, 13.93f, 15.14f, 13.32f)
                lineTo(17.5f, 17.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _accountTieWoman!!
    }

private var _accountTieWoman: ImageVector? = null
