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

public val MaterialDesignIcons.GlassMugOff: ImageVector
    get() {
        if (_glassMugOff != null) {
            return _glassMugOff!!
        }
        _glassMugOff = Builder(name = "GlassMugOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.35f)
                verticalLineTo(19.34f)
                lineTo(6.66f, 6.0f)
                lineTo(6.07f, 5.41f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.26f, 6.15f)
                curveTo(3.5f, 6.44f, 3.0f, 7.16f, 3.0f, 8.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 15.82f, 3.5f, 16.5f, 4.2f, 16.83f)
                lineTo(8.0f, 18.6f)
                verticalLineTo(20.0f)
                lineTo(7.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.0f, 19.35f)
                moveTo(8.0f, 16.39f)
                lineTo(5.0f, 15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.11f)
                lineTo(8.0f, 9.89f)
                verticalLineTo(16.39f)
                moveTo(8.0f, 4.0f)
                lineTo(7.0f, 3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                lineTo(20.0f, 4.0f)
                verticalLineTo(16.8f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.8f)
                lineTo(8.0f, 4.8f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _glassMugOff!!
    }

private var _glassMugOff: ImageVector? = null
