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

public val MaterialDesignIcons.EmailEditOutline: ImageVector
    get() {
        if (_emailEditOutline != null) {
            return _emailEditOutline!!
        }
        _emailEditOutline = Builder(name = "EmailEditOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.07f, 13.88f)
                lineTo(13.0f, 19.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 15.93f)
                moveTo(22.7f, 13.58f)
                lineTo(21.42f, 12.3f)
                curveTo(21.32f, 12.19f, 21.18f, 12.13f, 21.04f, 12.13f)
                curveTo(20.89f, 12.14f, 20.75f, 12.19f, 20.65f, 12.3f)
                lineTo(19.65f, 13.3f)
                lineTo(21.7f, 15.3f)
                lineTo(22.7f, 14.3f)
                curveTo(22.89f, 14.1f, 22.89f, 13.78f, 22.7f, 13.58f)
                moveTo(11.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 13.0f)
                lineTo(20.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                moveTo(20.0f, 6.0f)
                lineTo(12.0f, 11.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _emailEditOutline!!
    }

private var _emailEditOutline: ImageVector? = null
