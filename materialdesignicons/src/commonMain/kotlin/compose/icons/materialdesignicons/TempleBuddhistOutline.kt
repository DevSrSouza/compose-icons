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

public val MaterialDesignIcons.TempleBuddhistOutline: ImageVector
    get() {
        if (_templeBuddhistOutline != null) {
            return _templeBuddhistOutline!!
        }
        _templeBuddhistOutline = Builder(name = "TempleBuddhistOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                curveTo(21.0f, 10.1f, 20.1f, 11.0f, 19.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.9f)
                curveTo(19.7f, 8.5f, 21.0f, 6.9f, 21.0f, 5.1f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 6.2f, 18.1f, 7.1f, 17.0f, 7.1f)
                horizontalLineTo(16.5f)
                lineTo(12.0f, 1.0f)
                lineTo(7.5f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 7.0f, 5.0f, 6.1f, 5.0f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 6.9f, 4.3f, 8.4f, 6.0f, 8.8f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 11.0f, 3.0f, 10.1f, 3.0f, 9.0f)
                horizontalLineTo(1.0f)
                curveTo(1.0f, 10.9f, 2.3f, 12.4f, 4.0f, 12.8f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 17.5f, 11.4f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(13.0f, 17.5f, 13.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.9f)
                curveTo(21.7f, 12.5f, 23.0f, 10.9f, 23.0f, 9.1f)
                lineTo(21.0f, 9.0f)
                moveTo(12.0f, 4.3f)
                lineTo(14.0f, 7.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 4.3f)
                moveTo(8.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                curveTo(15.0f, 16.4f, 13.6f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(9.0f, 16.4f, 9.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _templeBuddhistOutline!!
    }

private var _templeBuddhistOutline: ImageVector? = null
