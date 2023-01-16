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

public val MaterialDesignIcons.ArrowUDownLeft: ImageVector
    get() {
        if (_arrowUDownLeft != null) {
            return _arrowUDownLeft!!
        }
        _arrowUDownLeft = Builder(name = "ArrowUDownLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.5f)
                curveTo(18.0f, 8.0f, 16.0f, 6.0f, 13.5f, 6.0f)
                reflectiveCurveTo(9.0f, 8.0f, 9.0f, 10.5f)
                verticalLineTo(16.17f)
                lineTo(12.09f, 13.09f)
                lineTo(13.5f, 14.5f)
                lineTo(8.0f, 20.0f)
                lineTo(2.5f, 14.5f)
                lineTo(3.91f, 13.08f)
                lineTo(7.0f, 16.17f)
                verticalLineTo(10.5f)
                curveTo(7.0f, 6.91f, 9.91f, 4.0f, 13.5f, 4.0f)
                reflectiveCurveTo(20.0f, 6.91f, 20.0f, 10.5f)
                close()
            }
        }
        .build()
        return _arrowUDownLeft!!
    }

private var _arrowUDownLeft: ImageVector? = null
