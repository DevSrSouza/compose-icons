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

public val MaterialDesignIcons.LotionOutline: ImageVector
    get() {
        if (_lotionOutline != null) {
            return _lotionOutline!!
        }
        _lotionOutline = Builder(name = "LotionOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 6.5f)
                curveTo(15.5f, 5.66f, 17.0f, 4.0f, 17.0f, 4.0f)
                reflectiveCurveTo(18.5f, 5.66f, 18.5f, 6.5f)
                curveTo(18.5f, 7.33f, 17.83f, 8.0f, 17.0f, 8.0f)
                reflectiveCurveTo(15.5f, 7.33f, 15.5f, 6.5f)
                moveTo(19.5f, 15.0f)
                curveTo(20.88f, 15.0f, 22.0f, 13.88f, 22.0f, 12.5f)
                curveTo(22.0f, 10.83f, 19.5f, 8.0f, 19.5f, 8.0f)
                reflectiveCurveTo(17.0f, 10.83f, 17.0f, 12.5f)
                curveTo(17.0f, 13.88f, 18.12f, 15.0f, 19.5f, 15.0f)
                moveTo(16.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(16.0f, 21.1f, 15.1f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 9.03f, 6.16f, 6.57f, 9.0f, 6.09f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                curveTo(14.13f, 2.0f, 15.15f, 2.39f, 16.0f, 3.0f)
                lineTo(14.56f, 4.44f)
                curveTo(14.1f, 4.17f, 13.57f, 4.0f, 13.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.09f)
                curveTo(13.84f, 6.57f, 16.0f, 9.03f, 16.0f, 12.0f)
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 9.79f, 12.21f, 8.0f, 10.0f, 8.0f)
                reflectiveCurveTo(6.0f, 9.79f, 6.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _lotionOutline!!
    }

private var _lotionOutline: ImageVector? = null
