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

public val MaterialDesignIcons.EarthBoxOff: ImageVector
    get() {
        if (_earthBoxOff != null) {
            return _earthBoxOff!!
        }
        _earthBoxOff = Builder(name = "EarthBoxOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 4.27f)
                lineTo(21.0f, 6.27f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(6.27f)
                lineTo(4.27f, 23.0f)
                lineTo(3.0f, 21.72f)
                lineTo(21.72f, 3.0f)
                lineTo(23.0f, 4.27f)
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.18f)
                lineTo(17.18f, 5.0f)
                horizontalLineTo(15.78f)
                curveTo(15.67f, 6.0f, 14.83f, 6.79f, 13.8f, 6.79f)
                horizontalLineTo(11.8f)
                verticalLineTo(8.79f)
                curveTo(11.8f, 9.35f, 11.35f, 9.79f, 10.8f, 9.79f)
                horizontalLineTo(8.8f)
                verticalLineTo(11.79f)
                horizontalLineTo(10.38f)
                lineTo(8.55f, 13.62f)
                lineTo(5.0f, 10.29f)
                verticalLineTo(17.18f)
                lineTo(3.0f, 19.18f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                moveTo(11.8f, 19.0f)
                verticalLineTo(17.79f)
                curveTo(11.17f, 17.79f, 10.6f, 17.5f, 10.23f, 17.04f)
                lineTo(8.27f, 19.0f)
                horizontalLineTo(11.8f)
                moveTo(15.8f, 12.79f)
                verticalLineTo(15.79f)
                horizontalLineTo(16.8f)
                curveTo(17.69f, 15.79f, 18.74f, 16.38f, 19.0f, 17.18f)
                verticalLineTo(8.27f)
                lineTo(15.33f, 11.94f)
                curveTo(15.61f, 12.12f, 15.8f, 12.43f, 15.8f, 12.79f)
                close()
            }
        }
        .build()
        return _earthBoxOff!!
    }

private var _earthBoxOff: ImageVector? = null
