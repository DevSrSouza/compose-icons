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

public val MaterialDesignIcons.HomeVariantOutline: ImageVector
    get() {
        if (_homeVariantOutline != null) {
            return _homeVariantOutline!!
        }
        _homeVariantOutline = Builder(name = "HomeVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                lineTo(12.0f, 5.5f)
                lineTo(6.0f, 10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                moveTo(4.0f, 21.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 3.0f)
                lineTo(20.0f, 9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _homeVariantOutline!!
    }

private var _homeVariantOutline: ImageVector? = null
