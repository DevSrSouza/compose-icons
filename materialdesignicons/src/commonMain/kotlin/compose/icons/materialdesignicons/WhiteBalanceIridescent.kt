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

public val MaterialDesignIcons.WhiteBalanceIridescent: ImageVector
    get() {
        if (_whiteBalanceIridescent != null) {
            return _whiteBalanceIridescent!!
        }
        _whiteBalanceIridescent = Builder(name = "WhiteBalanceIridescent", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.96f, 19.95f)
                lineTo(6.76f, 18.15f)
                lineTo(5.34f, 16.74f)
                lineTo(3.55f, 18.53f)
                moveTo(3.55f, 4.46f)
                lineTo(5.34f, 6.26f)
                lineTo(6.76f, 4.84f)
                lineTo(4.96f, 3.05f)
                moveTo(20.45f, 18.53f)
                lineTo(18.66f, 16.74f)
                lineTo(17.24f, 18.15f)
                lineTo(19.04f, 19.95f)
                moveTo(13.0f, 22.45f)
                verticalLineTo(19.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.45f)
                curveTo(11.32f, 22.45f, 13.0f, 22.45f, 13.0f, 22.45f)
                moveTo(19.04f, 3.05f)
                lineTo(17.24f, 4.84f)
                lineTo(18.66f, 6.26f)
                lineTo(20.45f, 4.46f)
                moveTo(11.0f, 3.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(0.55f)
                horizontalLineTo(11.0f)
                moveTo(5.0f, 14.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _whiteBalanceIridescent!!
    }

private var _whiteBalanceIridescent: ImageVector? = null
