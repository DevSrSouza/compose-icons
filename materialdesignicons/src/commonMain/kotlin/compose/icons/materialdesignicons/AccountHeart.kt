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

public val MaterialDesignIcons.AccountHeart: ImageVector
    get() {
        if (_accountHeart != null) {
            return _accountHeart!!
        }
        _accountHeart = Builder(name = "AccountHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                curveTo(12.3f, 14.0f, 7.0f, 15.3f, 7.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 15.3f, 17.7f, 14.0f, 15.0f, 14.0f)
                moveTo(15.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 19.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 12.0f)
                moveTo(5.0f, 15.0f)
                lineTo(4.4f, 14.5f)
                curveTo(2.4f, 12.6f, 1.0f, 11.4f, 1.0f, 9.9f)
                curveTo(1.0f, 8.7f, 2.0f, 7.7f, 3.2f, 7.7f)
                curveTo(3.9f, 7.7f, 4.6f, 8.0f, 5.0f, 8.5f)
                curveTo(5.4f, 8.0f, 6.1f, 7.7f, 6.8f, 7.7f)
                curveTo(8.0f, 7.7f, 9.0f, 8.6f, 9.0f, 9.9f)
                curveTo(9.0f, 11.4f, 7.6f, 12.6f, 5.6f, 14.5f)
                lineTo(5.0f, 15.0f)
                close()
            }
        }
        .build()
        return _accountHeart!!
    }

private var _accountHeart: ImageVector? = null
