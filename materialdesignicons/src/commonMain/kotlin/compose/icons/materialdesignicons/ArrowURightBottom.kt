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

public val MaterialDesignIcons.ArrowURightBottom: ImageVector
    get() {
        if (_arrowURightBottom != null) {
            return _arrowURightBottom!!
        }
        _arrowURightBottom = Builder(name = "ArrowURightBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                lineTo(14.5f, 21.5f)
                lineTo(13.08f, 20.09f)
                lineTo(16.17f, 17.0f)
                horizontalLineTo(10.5f)
                curveTo(6.91f, 17.0f, 4.0f, 14.09f, 4.0f, 10.5f)
                reflectiveCurveTo(6.91f, 4.0f, 10.5f, 4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.5f)
                curveTo(8.0f, 6.0f, 6.0f, 8.0f, 6.0f, 10.5f)
                reflectiveCurveTo(8.0f, 15.0f, 10.5f, 15.0f)
                horizontalLineTo(16.17f)
                lineTo(13.09f, 11.91f)
                lineTo(14.5f, 10.5f)
                lineTo(20.0f, 16.0f)
                close()
            }
        }
        .build()
        return _arrowURightBottom!!
    }

private var _arrowURightBottom: ImageVector? = null
