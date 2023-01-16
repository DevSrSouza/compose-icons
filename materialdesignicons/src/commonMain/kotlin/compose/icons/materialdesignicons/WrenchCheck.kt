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

public val MaterialDesignIcons.WrenchCheck: ImageVector
    get() {
        if (_wrenchCheck != null) {
            return _wrenchCheck!!
        }
        _wrenchCheck = Builder(name = "WrenchCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(10.8f, 2.6f, 12.0f, 4.3f, 12.0f, 6.2f)
                curveTo(12.0f, 8.2f, 10.8f, 9.9f, 9.0f, 10.5f)
                verticalLineTo(21.5f)
                curveTo(9.0f, 21.8f, 8.8f, 22.0f, 8.5f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(6.2f, 22.0f, 6.0f, 21.8f, 6.0f, 21.4f)
                verticalLineTo(10.4f)
                curveTo(4.2f, 9.8f, 3.0f, 8.1f, 3.0f, 6.2f)
                reflectiveCurveTo(4.2f, 2.6f, 6.0f, 2.0f)
                verticalLineTo(5.7f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                moveTo(20.6f, 13.0f)
                lineTo(22.0f, 14.41f)
                lineTo(15.47f, 21.0f)
                lineTo(12.0f, 17.5f)
                lineTo(13.4f, 16.09f)
                lineTo(15.47f, 18.17f)
                lineTo(20.6f, 13.0f)
            }
        }
        .build()
        return _wrenchCheck!!
    }

private var _wrenchCheck: ImageVector? = null
