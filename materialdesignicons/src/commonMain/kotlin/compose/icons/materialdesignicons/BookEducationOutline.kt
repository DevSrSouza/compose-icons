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

public val MaterialDesignIcons.BookEducationOutline: ImageVector
    get() {
        if (_bookEducationOutline != null) {
            return _bookEducationOutline!!
        }
        _bookEducationOutline = Builder(name = "BookEducationOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.11f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.89f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 2.0f, 20.0f, 2.9f, 20.0f, 4.0f)
                verticalLineTo(12.54f)
                lineTo(18.5f, 11.72f)
                lineTo(18.0f, 12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                lineTo(10.5f, 9.75f)
                lineTo(8.0f, 12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                moveTo(24.0f, 17.0f)
                lineTo(18.5f, 14.0f)
                lineTo(13.0f, 17.0f)
                lineTo(18.5f, 20.0f)
                lineTo(24.0f, 17.0f)
                moveTo(15.0f, 19.09f)
                verticalLineTo(21.09f)
                lineTo(18.5f, 23.0f)
                lineTo(22.0f, 21.09f)
                verticalLineTo(19.09f)
                lineTo(18.5f, 21.0f)
                lineTo(15.0f, 19.09f)
                close()
            }
        }
        .build()
        return _bookEducationOutline!!
    }

private var _bookEducationOutline: ImageVector? = null
