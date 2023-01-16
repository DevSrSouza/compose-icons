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

public val MaterialDesignIcons.AccountMinus: ImageVector
    get() {
        if (_accountMinus != null) {
            return _accountMinus!!
        }
        _accountMinus = Builder(name = "AccountMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                curveTo(12.33f, 14.0f, 7.0f, 15.33f, 7.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 15.33f, 17.67f, 14.0f, 15.0f, 14.0f)
                moveTo(1.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                moveTo(15.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 19.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _accountMinus!!
    }

private var _accountMinus: ImageVector? = null
