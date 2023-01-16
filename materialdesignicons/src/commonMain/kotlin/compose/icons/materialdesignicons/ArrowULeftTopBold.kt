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

public val MaterialDesignIcons.ArrowULeftTopBold: ImageVector
    get() {
        if (_arrowULeftTopBold != null) {
            return _arrowULeftTopBold!!
        }
        _arrowULeftTopBold = Builder(name = "ArrowULeftTopBold", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.5f)
                curveTo(15.43f, 17.0f, 17.0f, 15.43f, 17.0f, 13.5f)
                reflectiveCurveTo(15.43f, 10.0f, 13.5f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                lineTo(4.0f, 8.0f)
                lineTo(11.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.5f)
                curveTo(17.64f, 6.0f, 21.0f, 9.36f, 21.0f, 13.5f)
                reflectiveCurveTo(17.64f, 21.0f, 13.5f, 21.0f)
                close()
            }
        }
        .build()
        return _arrowULeftTopBold!!
    }

private var _arrowULeftTopBold: ImageVector? = null
