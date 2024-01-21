package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Pix: ImageVector
    get() {
        if (_pix != null) {
            return _pix!!
        }
        _pix = Builder(name = "Pix", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.4f, 292.5f)
                curveTo(247.8f, 287.1f, 257.1f, 287.1f, 262.5f, 292.5f)
                lineTo(339.5f, 369.5f)
                curveTo(353.7f, 383.7f, 372.6f, 391.5f, 392.6f, 391.5f)
                horizontalLineTo(407.7f)
                lineTo(310.6f, 488.6f)
                curveTo(280.3f, 518.1f, 231.1f, 518.1f, 200.8f, 488.6f)
                lineTo(103.3f, 391.2f)
                horizontalLineTo(112.6f)
                curveTo(132.6f, 391.2f, 151.5f, 383.4f, 165.7f, 369.2f)
                lineTo(242.4f, 292.5f)
                close()
                moveTo(262.5f, 218.9f)
                curveTo(256.1f, 224.4f, 247.9f, 224.5f, 242.4f, 218.9f)
                lineTo(165.7f, 142.2f)
                curveTo(151.5f, 127.1f, 132.6f, 120.2f, 112.6f, 120.2f)
                horizontalLineTo(103.3f)
                lineTo(200.7f, 22.76f)
                curveTo(231.1f, -7.586f, 280.3f, -7.586f, 310.6f, 22.76f)
                lineTo(407.8f, 119.9f)
                horizontalLineTo(392.6f)
                curveTo(372.6f, 119.9f, 353.7f, 127.7f, 339.5f, 141.9f)
                lineTo(262.5f, 218.9f)
                close()
                moveTo(112.6f, 142.7f)
                curveTo(126.4f, 142.7f, 139.1f, 148.3f, 149.7f, 158.1f)
                lineTo(226.4f, 234.8f)
                curveTo(233.6f, 241.1f, 243.0f, 245.6f, 252.5f, 245.6f)
                curveTo(261.9f, 245.6f, 271.3f, 241.1f, 278.5f, 234.8f)
                lineTo(355.5f, 157.8f)
                curveTo(365.3f, 148.1f, 378.8f, 142.5f, 392.6f, 142.5f)
                horizontalLineTo(430.3f)
                lineTo(488.6f, 200.8f)
                curveTo(518.9f, 231.1f, 518.9f, 280.3f, 488.6f, 310.6f)
                lineTo(430.3f, 368.9f)
                horizontalLineTo(392.6f)
                curveTo(378.8f, 368.9f, 365.3f, 363.3f, 355.5f, 353.5f)
                lineTo(278.5f, 276.5f)
                curveTo(264.6f, 262.6f, 240.3f, 262.6f, 226.4f, 276.6f)
                lineTo(149.7f, 353.2f)
                curveTo(139.1f, 363.0f, 126.4f, 368.6f, 112.6f, 368.6f)
                horizontalLineTo(80.78f)
                lineTo(22.76f, 310.6f)
                curveTo(-7.586f, 280.3f, -7.586f, 231.1f, 22.76f, 200.8f)
                lineTo(80.78f, 142.7f)
                horizontalLineTo(112.6f)
                close()
            }
        }
        .build()
        return _pix!!
    }

private var _pix: ImageVector? = null
