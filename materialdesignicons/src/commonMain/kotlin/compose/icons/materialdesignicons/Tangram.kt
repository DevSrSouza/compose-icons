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

public val MaterialDesignIcons.Tangram: ImageVector
    get() {
        if (_tangram != null) {
            return _tangram!!
        }
        _tangram = Builder(name = "Tangram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 22.0f, 22.0f, 21.1f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(18.59f, 4.0f)
                lineTo(12.0f, 10.59f)
                lineTo(5.41f, 4.0f)
                horizontalLineTo(18.59f)
                moveTo(13.41f, 12.0f)
                lineTo(16.5f, 8.91f)
                lineTo(19.59f, 12.0f)
                lineTo(16.5f, 15.09f)
                lineTo(13.41f, 12.0f)
                moveTo(14.59f, 16.0f)
                horizontalLineTo(9.41f)
                lineTo(12.0f, 13.41f)
                lineTo(14.59f, 16.0f)
                moveTo(4.0f, 5.41f)
                lineTo(10.59f, 12.0f)
                lineTo(4.0f, 18.59f)
                verticalLineTo(5.41f)
                moveTo(11.59f, 20.0f)
                horizontalLineTo(5.41f)
                lineTo(7.41f, 18.0f)
                horizontalLineTo(13.59f)
                lineTo(11.59f, 20.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(14.41f)
                lineTo(20.0f, 14.41f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 9.59f)
                lineTo(17.91f, 7.5f)
                lineTo(20.0f, 5.41f)
                verticalLineTo(9.59f)
                close()
            }
        }
        .build()
        return _tangram!!
    }

private var _tangram: ImageVector? = null
