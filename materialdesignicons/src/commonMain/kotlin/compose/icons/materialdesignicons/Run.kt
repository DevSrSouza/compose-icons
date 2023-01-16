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

public val MaterialDesignIcons.Run: ImageVector
    get() {
        if (_run != null) {
            return _run!!
        }
        _run = Builder(name = "Run", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 5.5f)
                curveTo(14.59f, 5.5f, 15.5f, 4.58f, 15.5f, 3.5f)
                curveTo(15.5f, 2.38f, 14.59f, 1.5f, 13.5f, 1.5f)
                curveTo(12.39f, 1.5f, 11.5f, 2.38f, 11.5f, 3.5f)
                curveTo(11.5f, 4.58f, 12.39f, 5.5f, 13.5f, 5.5f)
                moveTo(9.89f, 19.38f)
                lineTo(10.89f, 15.0f)
                lineTo(13.0f, 17.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.5f)
                lineTo(12.89f, 13.5f)
                lineTo(13.5f, 10.5f)
                curveTo(14.79f, 12.0f, 16.79f, 13.0f, 19.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(17.09f, 11.0f, 15.5f, 10.0f, 14.69f, 8.58f)
                lineTo(13.69f, 7.0f)
                curveTo(13.29f, 6.38f, 12.69f, 6.0f, 12.0f, 6.0f)
                curveTo(11.69f, 6.0f, 11.5f, 6.08f, 11.19f, 6.08f)
                lineTo(6.0f, 8.28f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.58f)
                lineTo(9.79f, 8.88f)
                lineTo(8.19f, 17.0f)
                lineTo(3.29f, 16.0f)
                lineTo(2.89f, 18.0f)
                lineTo(9.89f, 19.38f)
                close()
            }
        }
        .build()
        return _run!!
    }

private var _run: ImageVector? = null
