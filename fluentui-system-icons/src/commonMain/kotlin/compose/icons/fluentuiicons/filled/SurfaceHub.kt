package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.SurfaceHub: ImageVector
    get() {
        if (_surfaceHub != null) {
            return _surfaceHub!!
        }
        _surfaceHub = Builder(name = "SurfaceHub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2498f, 2.0f)
                curveTo(19.6608f, 2.0f, 19.9883f, 2.3286f, 19.9996f, 2.7275f)
                lineTo(19.9957f, 2.8285f)
                lineTo(18.9957f, 12.3285f)
                curveTo(18.9591f, 12.6755f, 18.6898f, 12.9466f, 18.3528f, 12.993f)
                lineTo(18.2498f, 13.0f)
                horizontalLineTo(17.521f)
                lineTo(18.9878f, 21.1182f)
                lineTo(18.9992f, 21.2196f)
                curveTo(19.0154f, 21.5887f, 18.7567f, 21.9221f, 18.3831f, 21.9896f)
                curveTo(18.0094f, 22.0571f, 17.6505f, 21.8352f, 17.5366f, 21.4838f)
                lineTo(17.5117f, 21.3848f)
                lineTo(16.9f, 18.0f)
                horizontalLineTo(14.103f)
                lineTo(13.4956f, 21.3842f)
                curveTo(13.4223f, 21.7919f, 13.0324f, 22.063f, 12.6247f, 21.9897f)
                curveTo(12.251f, 21.9225f, 11.9921f, 21.5893f, 12.008f, 21.2202f)
                lineTo(12.0193f, 21.1188f)
                lineTo(12.579f, 18.0f)
                horizontalLineTo(8.103f)
                lineTo(7.4956f, 21.3842f)
                curveTo(7.4223f, 21.7919f, 7.0324f, 22.063f, 6.6247f, 21.9897f)
                curveTo(6.251f, 21.9225f, 5.9921f, 21.5893f, 6.008f, 21.2202f)
                lineTo(6.0193f, 21.1188f)
                lineTo(7.478f, 13.0f)
                horizontalLineTo(4.7498f)
                curveTo(4.3388f, 13.0f, 4.0113f, 12.6714f, 4.0f, 12.2725f)
                lineTo(4.0039f, 12.1715f)
                lineTo(5.0039f, 2.6715f)
                curveTo(5.0404f, 2.3245f, 5.3098f, 2.0535f, 5.6468f, 2.007f)
                lineTo(5.7498f, 2.0f)
                horizontalLineTo(19.2498f)
                close()
                moveTo(13.478f, 13.0f)
                horizontalLineTo(9.002f)
                lineTo(8.373f, 16.5f)
                horizontalLineTo(12.849f)
                lineTo(13.478f, 13.0f)
                close()
                moveTo(15.996f, 13.0f)
                horizontalLineTo(15.002f)
                lineTo(14.373f, 16.5f)
                horizontalLineTo(16.628f)
                lineTo(15.996f, 13.0f)
                close()
            }
        }
        .build()
        return _surfaceHub!!
    }

private var _surfaceHub: ImageVector? = null
