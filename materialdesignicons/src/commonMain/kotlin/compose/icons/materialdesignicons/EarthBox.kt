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

public val MaterialDesignIcons.EarthBox: ImageVector
    get() {
        if (_earthBox != null) {
            return _earthBox!!
        }
        _earthBox = Builder(name = "EarthBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(15.78f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.18f)
                curveTo(18.74f, 16.38f, 17.69f, 15.79f, 16.8f, 15.79f)
                horizontalLineTo(15.8f)
                verticalLineTo(12.79f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.8f, 11.79f)
                horizontalLineTo(8.8f)
                verticalLineTo(9.79f)
                horizontalLineTo(10.8f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.8f, 8.79f)
                verticalLineTo(6.79f)
                horizontalLineTo(13.8f)
                curveTo(14.83f, 6.79f, 15.67f, 6.0f, 15.78f, 5.0f)
                moveTo(5.0f, 10.29f)
                lineTo(9.8f, 14.79f)
                verticalLineTo(15.79f)
                curveTo(9.8f, 16.9f, 10.7f, 17.79f, 11.8f, 17.79f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.29f)
                close()
            }
        }
        .build()
        return _earthBox!!
    }

private var _earthBox: ImageVector? = null
