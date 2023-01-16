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

public val MaterialDesignIcons.AccountOutline: ImageVector
    get() {
        if (_accountOutline != null) {
            return _accountOutline!!
        }
        _accountOutline = Builder(name = "AccountOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 4.0f)
                moveTo(12.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 6.0f)
                moveTo(12.0f, 13.0f)
                curveTo(14.67f, 13.0f, 20.0f, 14.33f, 20.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 14.33f, 9.33f, 13.0f, 12.0f, 13.0f)
                moveTo(12.0f, 14.9f)
                curveTo(9.03f, 14.9f, 5.9f, 16.36f, 5.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(18.1f)
                verticalLineTo(17.0f)
                curveTo(18.1f, 16.36f, 14.97f, 14.9f, 12.0f, 14.9f)
                close()
            }
        }
        .build()
        return _accountOutline!!
    }

private var _accountOutline: ImageVector? = null
