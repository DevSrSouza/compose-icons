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

public val MaterialDesignIcons.SawBlade: ImageVector
    get() {
        if (_sawBlade != null) {
            return _sawBlade!!
        }
        _sawBlade = Builder(name = "SawBlade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                curveTo(20.0f, 15.0f, 18.6f, 16.3f, 21.1f, 17.0f)
                lineTo(18.3f, 19.8f)
                horizontalLineTo(15.5f)
                curveTo(15.5f, 19.8f, 13.6f, 19.7f, 15.0f, 22.0f)
                horizontalLineTo(11.0f)
                lineTo(9.0f, 20.0f)
                curveTo(9.0f, 20.0f, 7.7f, 18.6f, 7.0f, 21.1f)
                lineTo(4.2f, 18.3f)
                verticalLineTo(15.5f)
                curveTo(4.2f, 15.5f, 4.3f, 13.6f, 2.0f, 15.0f)
                verticalLineTo(11.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 9.0f, 5.4f, 7.7f, 2.8f, 7.1f)
                lineTo(5.6f, 4.2f)
                horizontalLineTo(8.5f)
                curveTo(8.5f, 4.2f, 10.4f, 4.3f, 9.0f, 2.0f)
                horizontalLineTo(13.0f)
                lineTo(15.0f, 4.0f)
                curveTo(15.0f, 4.0f, 16.3f, 5.4f, 17.0f, 2.8f)
                lineTo(19.8f, 5.6f)
                verticalLineTo(8.5f)
                curveTo(19.8f, 8.5f, 19.7f, 10.4f, 22.0f, 9.0f)
                verticalLineTo(13.0f)
                lineTo(20.0f, 15.0f)
                moveTo(14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sawBlade!!
    }

private var _sawBlade: ImageVector? = null
