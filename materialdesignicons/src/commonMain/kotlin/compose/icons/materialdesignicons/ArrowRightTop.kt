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

public val MaterialDesignIcons.ArrowRightTop: ImageVector
    get() {
        if (_arrowRightTop != null) {
            return _arrowRightTop!!
        }
        _arrowRightTop = Builder(name = "ArrowRightTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                lineTo(14.5f, 13.5f)
                lineTo(13.09f, 12.09f)
                lineTo(16.17f, 9.0f)
                horizontalLineTo(10.5f)
                curveTo(8.0f, 9.0f, 6.0f, 11.0f, 6.0f, 13.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.5f)
                curveTo(4.0f, 9.91f, 6.91f, 7.0f, 10.5f, 7.0f)
                horizontalLineTo(16.17f)
                lineTo(13.08f, 3.91f)
                lineTo(14.5f, 2.5f)
                lineTo(20.0f, 8.0f)
                close()
            }
        }
        .build()
        return _arrowRightTop!!
    }

private var _arrowRightTop: ImageVector? = null
