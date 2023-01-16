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

public val MaterialDesignIcons.HandSaw: ImageVector
    get() {
        if (_handSaw != null) {
            return _handSaw!!
        }
        _handSaw = Builder(name = "HandSaw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8f, 17.0f)
                lineTo(5.9f, 11.6f)
                lineTo(20.0f, 2.0f)
                lineTo(22.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                moveTo(9.7f, 18.7f)
                lineTo(9.2f, 21.5f)
                lineTo(7.6f, 22.7f)
                curveTo(6.7f, 23.3f, 5.5f, 23.1f, 4.8f, 22.2f)
                lineTo(1.3f, 17.3f)
                curveTo(0.7f, 16.4f, 0.9f, 15.2f, 1.8f, 14.5f)
                lineTo(5.1f, 12.2f)
                lineTo(9.7f, 18.7f)
                moveTo(4.6f, 15.0f)
                lineTo(3.0f, 16.1f)
                lineTo(6.5f, 21.0f)
                lineTo(8.1f, 19.8f)
                lineTo(4.6f, 15.0f)
                close()
            }
        }
        .build()
        return _handSaw!!
    }

private var _handSaw: ImageVector? = null
