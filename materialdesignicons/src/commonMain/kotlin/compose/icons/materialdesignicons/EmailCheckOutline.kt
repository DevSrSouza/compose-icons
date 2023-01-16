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

public val MaterialDesignIcons.EmailCheckOutline: ImageVector
    get() {
        if (_emailCheckOutline != null) {
            return _emailCheckOutline!!
        }
        _emailCheckOutline = Builder(name = "EmailCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 18.66f, 13.04f, 18.33f, 13.09f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 13.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(13.09f)
                curveTo(20.72f, 13.21f, 21.39f, 13.46f, 22.0f, 13.81f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13.0f, 19.34f, 13.0f, 19.0f)
                moveTo(20.0f, 6.0f)
                lineTo(12.0f, 11.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(20.0f)
                moveTo(17.75f, 22.16f)
                lineTo(15.0f, 19.16f)
                lineTo(16.16f, 18.0f)
                lineTo(17.75f, 19.59f)
                lineTo(21.34f, 16.0f)
                lineTo(22.5f, 17.41f)
                lineTo(17.75f, 22.16f)
            }
        }
        .build()
        return _emailCheckOutline!!
    }

private var _emailCheckOutline: ImageVector? = null
