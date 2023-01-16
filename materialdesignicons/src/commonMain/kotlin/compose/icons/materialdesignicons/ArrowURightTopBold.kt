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

public val MaterialDesignIcons.ArrowURightTopBold: ImageVector
    get() {
        if (_arrowURightTopBold != null) {
            return _arrowURightTopBold!!
        }
        _arrowURightTopBold = Builder(name = "ArrowURightTopBold", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.5f)
                curveTo(3.0f, 9.36f, 6.36f, 6.0f, 10.5f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                lineTo(20.0f, 8.0f)
                lineTo(13.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.5f)
                curveTo(8.57f, 10.0f, 7.0f, 11.57f, 7.0f, 13.5f)
                reflectiveCurveTo(8.57f, 17.0f, 10.5f, 17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.5f)
                curveTo(6.36f, 21.0f, 3.0f, 17.64f, 3.0f, 13.5f)
                close()
            }
        }
        .build()
        return _arrowURightTopBold!!
    }

private var _arrowURightTopBold: ImageVector? = null
