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

public val MaterialDesignIcons.FlagVariantPlus: ImageVector
    get() {
        if (_flagVariantPlus != null) {
            return _flagVariantPlus!!
        }
        _flagVariantPlus = Builder(name = "FlagVariantPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(6.6f, 3.0f, 7.0f, 3.4f, 7.0f, 4.0f)
                verticalLineTo(4.9f)
                curveTo(8.1f, 4.4f, 9.5f, 4.0f, 11.0f, 4.0f)
                curveTo(14.0f, 4.0f, 14.0f, 6.0f, 16.0f, 6.0f)
                curveTo(19.0f, 6.0f, 20.0f, 4.0f, 20.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 12.0f, 19.0f, 14.0f, 16.0f, 14.0f)
                reflectiveCurveTo(13.0f, 12.0f, 11.0f, 12.0f)
                curveTo(8.0f, 12.0f, 7.0f, 14.0f, 7.0f, 14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.4f, 5.4f, 3.0f, 6.0f, 3.0f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _flagVariantPlus!!
    }

private var _flagVariantPlus: ImageVector? = null
