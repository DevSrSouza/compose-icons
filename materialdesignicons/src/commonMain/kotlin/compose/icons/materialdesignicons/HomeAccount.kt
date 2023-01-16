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

public val MaterialDesignIcons.HomeAccount: ImageVector
    get() {
        if (_homeAccount != null) {
            return _homeAccount!!
        }
        _homeAccount = Builder(name = "HomeAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(2.0f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                lineTo(12.0f, 3.0f)
                moveTo(12.0f, 8.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 14.25f, 11.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 12.0f, 13.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 9.75f, 11.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 12.0f, 8.75f)
                moveTo(12.0f, 15.0f)
                curveTo(13.5f, 15.0f, 16.5f, 15.75f, 16.5f, 17.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(17.25f)
                curveTo(7.5f, 15.75f, 10.5f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _homeAccount!!
    }

private var _homeAccount: ImageVector? = null
