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

public val MaterialDesignIcons.EmailCheck: ImageVector
    get() {
        if (_emailCheck != null) {
            return _emailCheck!!
        }
        _emailCheck = Builder(name = "EmailCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 15.69f, 15.69f, 13.0f, 19.0f, 13.0f)
                curveTo(20.1f, 13.0f, 21.12f, 13.3f, 22.0f, 13.81f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13.0f, 19.34f, 13.0f, 19.0f)
                moveTo(4.0f, 8.0f)
                verticalLineTo(6.0f)
                lineTo(12.0f, 11.0f)
                lineTo(20.0f, 6.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 13.0f)
                lineTo(4.0f, 8.0f)
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
        return _emailCheck!!
    }

private var _emailCheck: ImageVector? = null
