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

public val MaterialDesignIcons.EarthRemove: ImageVector
    get() {
        if (_earthRemove != null) {
            return _earthRemove!!
        }
        _earthRemove = Builder(name = "EarthRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18.0f, 16.59f)
                lineTo(20.12f, 14.47f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18.0f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18.0f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18.0f)
                lineTo(14.47f, 15.88f)
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 8.64f, 17.93f, 5.77f, 15.0f, 4.59f)
                verticalLineTo(5.0f)
                curveTo(15.0f, 6.1f, 14.1f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                curveTo(11.0f, 9.55f, 10.55f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5f, 12.0f, 14.9f, 12.35f, 15.0f, 12.81f)
                curveTo(13.2f, 13.85f, 12.0f, 15.79f, 12.0f, 18.0f)
                curveTo(12.0f, 19.5f, 12.54f, 20.85f, 13.44f, 21.9f)
                lineTo(12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                lineTo(21.9f, 13.44f)
                curveTo(21.34f, 12.96f, 20.7f, 12.59f, 20.0f, 12.34f)
                lineTo(20.0f, 12.0f)
                moveTo(11.0f, 19.93f)
                verticalLineTo(18.0f)
                curveTo(9.9f, 18.0f, 9.0f, 17.1f, 9.0f, 16.0f)
                verticalLineTo(15.0f)
                lineTo(4.21f, 10.21f)
                curveTo(4.08f, 10.78f, 4.0f, 11.38f, 4.0f, 12.0f)
                curveTo(4.0f, 16.08f, 7.06f, 19.44f, 11.0f, 19.93f)
                close()
            }
        }
        .build()
        return _earthRemove!!
    }

private var _earthRemove: ImageVector? = null
