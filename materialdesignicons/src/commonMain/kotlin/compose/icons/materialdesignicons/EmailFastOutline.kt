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

public val MaterialDesignIcons.EmailFastOutline: ImageVector
    get() {
        if (_emailFastOutline != null) {
            return _emailFastOutline!!
        }
        _emailFastOutline = Builder(name = "EmailFastOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.5f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 5.5f, 7.0f, 6.4f, 7.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(7.0f, 17.61f, 7.9f, 18.5f, 9.0f, 18.5f)
                horizontalLineTo(22.0f)
                curveTo(23.11f, 18.5f, 24.0f, 17.61f, 24.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(24.0f, 6.4f, 23.11f, 5.5f, 22.0f, 5.5f)
                moveTo(22.0f, 16.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.17f)
                lineTo(15.5f, 12.5f)
                lineTo(22.0f, 9.17f)
                verticalLineTo(16.5f)
                moveTo(15.5f, 10.81f)
                lineTo(9.0f, 7.5f)
                horizontalLineTo(22.0f)
                lineTo(15.5f, 10.81f)
                moveTo(5.0f, 16.5f)
                curveTo(5.0f, 16.67f, 5.03f, 16.83f, 5.05f, 17.0f)
                horizontalLineTo(1.0f)
                curveTo(0.448f, 17.0f, 0.0f, 16.55f, 0.0f, 16.0f)
                reflectiveCurveTo(0.448f, 15.0f, 1.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.5f)
                moveTo(3.0f, 7.0f)
                horizontalLineTo(5.05f)
                curveTo(5.03f, 7.17f, 5.0f, 7.33f, 5.0f, 7.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 9.0f, 2.0f, 8.55f, 2.0f, 8.0f)
                reflectiveCurveTo(2.45f, 7.0f, 3.0f, 7.0f)
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 11.45f, 1.45f, 11.0f, 2.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 13.0f, 1.0f, 12.55f, 1.0f, 12.0f)
                close()
            }
        }
        .build()
        return _emailFastOutline!!
    }

private var _emailFastOutline: ImageVector? = null
