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

public val MaterialDesignIcons.AsteriskCircleOutline: ImageVector
    get() {
        if (_asteriskCircleOutline != null) {
            return _asteriskCircleOutline!!
        }
        _asteriskCircleOutline = Builder(name = "AsteriskCircleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5f, 22.0f, 22.0f, 17.5f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                curveTo(7.61f, 20.0f, 4.0f, 16.39f, 4.0f, 12.0f)
                curveTo(4.0f, 7.61f, 7.61f, 4.0f, 12.0f, 4.0f)
                curveTo(16.39f, 4.0f, 20.0f, 7.61f, 20.0f, 12.0f)
                curveTo(20.0f, 16.39f, 16.39f, 20.0f, 12.0f, 20.0f)
                moveTo(13.0f, 10.27f)
                lineTo(15.83f, 8.63f)
                lineTo(16.83f, 10.37f)
                lineTo(14.0f, 12.0f)
                lineTo(16.83f, 13.63f)
                lineTo(15.83f, 15.37f)
                lineTo(13.0f, 13.73f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.73f)
                lineTo(8.17f, 15.37f)
                lineTo(7.17f, 13.63f)
                lineTo(10.0f, 12.0f)
                lineTo(7.17f, 10.37f)
                lineTo(8.17f, 8.63f)
                lineTo(11.0f, 10.27f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.27f)
                close()
            }
        }
        .build()
        return _asteriskCircleOutline!!
    }

private var _asteriskCircleOutline: ImageVector? = null
