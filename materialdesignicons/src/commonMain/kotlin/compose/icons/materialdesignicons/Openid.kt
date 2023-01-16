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

public val MaterialDesignIcons.Openid: ImageVector
    get() {
        if (_openid != null) {
            return _openid!!
        }
        _openid = Builder(name = "Openid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineTo(11.0f, 3.5f)
                verticalLineTo(19.94f)
                curveTo(7.0f, 19.5f, 4.0f, 17.46f, 4.0f, 15.0f)
                curveTo(4.0f, 12.75f, 6.5f, 10.85f, 10.0f, 10.22f)
                verticalLineTo(8.19f)
                curveTo(4.86f, 8.88f, 1.0f, 11.66f, 1.0f, 15.0f)
                curveTo(1.0f, 18.56f, 5.36f, 21.5f, 11.0f, 21.94f)
                curveTo(11.03f, 21.94f, 11.06f, 21.94f, 11.09f, 21.94f)
                lineTo(14.0f, 20.5f)
                verticalLineTo(2.0f)
                moveTo(15.0f, 8.19f)
                verticalLineTo(10.22f)
                curveTo(16.15f, 10.43f, 17.18f, 10.77f, 18.06f, 11.22f)
                lineTo(16.5f, 12.0f)
                lineTo(23.0f, 13.5f)
                lineTo(22.5f, 9.0f)
                lineTo(20.5f, 10.0f)
                curveTo(19.0f, 9.12f, 17.12f, 8.47f, 15.0f, 8.19f)
                close()
            }
        }
        .build()
        return _openid!!
    }

private var _openid: ImageVector? = null
