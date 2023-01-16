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

public val MaterialDesignIcons.EmailSearchOutline: ImageVector
    get() {
        if (_emailSearchOutline != null) {
            return _emailSearchOutline!!
        }
        _emailSearchOutline = Builder(name = "EmailSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 11.0f)
                curveTo(19.0f, 11.0f, 21.0f, 13.0f, 21.0f, 15.5f)
                curveTo(21.0f, 16.38f, 20.75f, 17.21f, 20.31f, 17.9f)
                lineTo(23.39f, 21.0f)
                lineTo(22.0f, 22.39f)
                lineTo(18.88f, 19.32f)
                curveTo(18.19f, 19.75f, 17.37f, 20.0f, 16.5f, 20.0f)
                curveTo(14.0f, 20.0f, 12.0f, 18.0f, 12.0f, 15.5f)
                reflectiveCurveTo(14.0f, 11.0f, 16.5f, 11.0f)
                moveTo(16.5f, 13.0f)
                curveTo(15.12f, 13.0f, 14.0f, 14.12f, 14.0f, 15.5f)
                reflectiveCurveTo(15.12f, 18.0f, 16.5f, 18.0f)
                reflectiveCurveTo(19.0f, 16.88f, 19.0f, 15.5f)
                reflectiveCurveTo(17.88f, 13.0f, 16.5f, 13.0f)
                moveTo(10.5f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                lineTo(10.62f, 12.76f)
                curveTo(11.65f, 10.54f, 13.9f, 9.0f, 16.5f, 9.0f)
                curveTo(16.77f, 9.0f, 17.04f, 9.0f, 17.31f, 9.06f)
                lineTo(19.0f, 8.0f)
                verticalLineTo(9.5f)
                curveTo(19.75f, 9.81f, 20.42f, 10.27f, 21.0f, 10.82f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.9f, 20.1f, 4.0f, 19.0f, 4.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.1f, 1.9f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(11.82f)
                curveTo(11.27f, 19.42f, 10.82f, 18.75f, 10.5f, 18.0f)
                moveTo(19.0f, 6.0f)
                lineTo(11.0f, 11.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _emailSearchOutline!!
    }

private var _emailSearchOutline: ImageVector? = null
