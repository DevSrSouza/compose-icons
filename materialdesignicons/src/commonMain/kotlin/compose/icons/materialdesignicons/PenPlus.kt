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

public val MaterialDesignIcons.PenPlus: ImageVector
    get() {
        if (_penPlus != null) {
            return _penPlus!!
        }
        _penPlus = Builder(name = "PenPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 7.0f)
                curveTo(20.4f, 7.4f, 20.0f, 7.7f, 20.0f, 8.0f)
                curveTo(20.0f, 8.3f, 20.3f, 8.6f, 20.6f, 9.0f)
                curveTo(21.1f, 9.5f, 21.6f, 9.9f, 21.5f, 10.4f)
                curveTo(21.5f, 10.9f, 21.0f, 11.4f, 20.5f, 11.9f)
                lineTo(16.4f, 16.0f)
                lineTo(15.0f, 14.7f)
                lineTo(19.2f, 10.5f)
                lineTo(18.2f, 9.5f)
                lineTo(16.8f, 10.9f)
                lineTo(13.0f, 7.1f)
                lineTo(17.0f, 3.3f)
                curveTo(17.4f, 2.9f, 18.0f, 2.9f, 18.4f, 3.3f)
                lineTo(20.7f, 5.6f)
                curveTo(21.1f, 6.0f, 21.1f, 6.7f, 20.7f, 7.0f)
                moveTo(3.0f, 17.2f)
                lineTo(12.6f, 7.6f)
                lineTo(16.3f, 11.4f)
                lineTo(6.8f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.2f)
                moveTo(7.0f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _penPlus!!
    }

private var _penPlus: ImageVector? = null
