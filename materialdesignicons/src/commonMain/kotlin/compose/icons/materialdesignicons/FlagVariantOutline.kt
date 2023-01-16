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

public val MaterialDesignIcons.FlagVariantOutline: ImageVector
    get() {
        if (_flagVariantOutline != null) {
            return _flagVariantOutline!!
        }
        _flagVariantOutline = Builder(name = "FlagVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 4.0f)
                verticalLineTo(4.88f)
                curveTo(8.06f, 4.44f, 9.5f, 4.0f, 11.0f, 4.0f)
                curveTo(14.0f, 4.0f, 14.0f, 6.0f, 16.0f, 6.0f)
                curveTo(19.0f, 6.0f, 20.0f, 4.0f, 20.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 12.0f, 19.0f, 14.0f, 16.0f, 14.0f)
                curveTo(13.0f, 14.0f, 13.0f, 12.0f, 11.0f, 12.0f)
                curveTo(8.0f, 12.0f, 7.0f, 14.0f, 7.0f, 14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 3.0f)
                moveTo(7.0f, 7.25f)
                verticalLineTo(11.5f)
                curveTo(7.0f, 11.5f, 9.0f, 10.0f, 11.0f, 10.0f)
                curveTo(13.0f, 10.0f, 14.0f, 12.0f, 16.0f, 12.0f)
                curveTo(18.0f, 12.0f, 18.0f, 11.0f, 18.0f, 11.0f)
                verticalLineTo(7.5f)
                curveTo(18.0f, 7.5f, 17.0f, 8.0f, 16.0f, 8.0f)
                curveTo(14.0f, 8.0f, 13.0f, 6.0f, 11.0f, 6.0f)
                curveTo(9.0f, 6.0f, 7.0f, 7.25f, 7.0f, 7.25f)
                close()
            }
        }
        .build()
        return _flagVariantOutline!!
    }

private var _flagVariantOutline: ImageVector? = null
