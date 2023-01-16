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

public val MaterialDesignIcons.Stadium: ImageVector
    get() {
        if (_stadium != null) {
            return _stadium!!
        }
        _stadium = Builder(name = "Stadium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(3.0f, 7.0f)
                verticalLineTo(3.0f)
                lineTo(7.0f, 5.0f)
                moveTo(18.0f, 3.0f)
                verticalLineTo(7.0f)
                lineTo(22.0f, 5.0f)
                lineTo(18.0f, 3.0f)
                moveTo(11.0f, 2.0f)
                verticalLineTo(6.0f)
                lineTo(15.0f, 4.0f)
                lineTo(11.0f, 2.0f)
                moveTo(5.0f, 10.0f)
                curveTo(6.4f, 10.5f, 8.8f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(17.6f, 10.5f, 19.0f, 10.0f)
                curveTo(19.0f, 9.8f, 16.2f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(5.0f, 9.9f, 5.0f, 10.0f)
                moveTo(15.0f, 17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.9f)
                curveTo(4.9f, 21.5f, 2.0f, 20.4f, 2.0f, 19.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 8.3f, 6.5f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(22.0f, 8.3f, 22.0f, 10.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 20.3f, 19.1f, 21.5f, 15.0f, 21.9f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _stadium!!
    }

private var _stadium: ImageVector? = null
