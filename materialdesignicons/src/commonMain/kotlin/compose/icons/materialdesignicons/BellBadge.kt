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

public val MaterialDesignIcons.BellBadge: ImageVector
    get() {
        if (_bellBadge != null) {
            return _bellBadge!!
        }
        _bellBadge = Builder(name = "BellBadge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.5f)
                curveTo(21.0f, 8.43f, 19.43f, 10.0f, 17.5f, 10.0f)
                reflectiveCurveTo(14.0f, 8.43f, 14.0f, 6.5f)
                reflectiveCurveTo(15.57f, 3.0f, 17.5f, 3.0f)
                reflectiveCurveTo(21.0f, 4.57f, 21.0f, 6.5f)
                moveTo(19.0f, 11.79f)
                curveTo(18.5f, 11.92f, 18.0f, 12.0f, 17.5f, 12.0f)
                curveTo(14.47f, 12.0f, 12.0f, 9.53f, 12.0f, 6.5f)
                curveTo(12.0f, 5.03f, 12.58f, 3.7f, 13.5f, 2.71f)
                curveTo(13.15f, 2.28f, 12.61f, 2.0f, 12.0f, 2.0f)
                curveTo(10.9f, 2.0f, 10.0f, 2.9f, 10.0f, 4.0f)
                verticalLineTo(4.29f)
                curveTo(7.03f, 5.17f, 5.0f, 7.9f, 5.0f, 11.0f)
                verticalLineTo(17.0f)
                lineTo(3.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                lineTo(19.0f, 17.0f)
                verticalLineTo(11.79f)
                moveTo(12.0f, 23.0f)
                curveTo(13.11f, 23.0f, 14.0f, 22.11f, 14.0f, 21.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 22.11f, 10.9f, 23.0f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _bellBadge!!
    }

private var _bellBadge: ImageVector? = null
