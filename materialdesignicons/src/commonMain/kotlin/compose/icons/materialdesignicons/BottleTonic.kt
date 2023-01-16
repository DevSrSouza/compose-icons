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

public val MaterialDesignIcons.BottleTonic: ImageVector
    get() {
        if (_bottleTonic != null) {
            return _bottleTonic!!
        }
        _bottleTonic = Builder(name = "BottleTonic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(11.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                lineTo(13.0f, 4.0f)
                moveTo(19.0f, 13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                curveTo(5.0f, 10.24f, 7.24f, 8.0f, 10.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                curveTo(16.76f, 8.0f, 19.0f, 10.24f, 19.0f, 13.0f)
                close()
            }
        }
        .build()
        return _bottleTonic!!
    }

private var _bottleTonic: ImageVector? = null
