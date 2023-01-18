package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.25f, 7.0f)
                curveTo(9.6642f, 7.0f, 10.0f, 7.3358f, 10.0f, 7.75f)
                curveTo(10.0f, 8.1266f, 9.7225f, 8.4383f, 9.3608f, 8.4919f)
                lineTo(9.25f, 8.5f)
                horizontalLineTo(7.0f)
                curveTo(5.067f, 8.5f, 3.5f, 10.067f, 3.5f, 12.0f)
                curveTo(3.5f, 13.864f, 4.9571f, 15.3876f, 6.7944f, 15.4941f)
                lineTo(7.0f, 15.5f)
                horizontalLineTo(9.25f)
                curveTo(9.6642f, 15.5f, 10.0f, 15.8358f, 10.0f, 16.25f)
                curveTo(10.0f, 16.6266f, 9.7225f, 16.9383f, 9.3608f, 16.9919f)
                lineTo(9.25f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(4.2386f, 17.0f, 2.0f, 14.7614f, 2.0f, 12.0f)
                curveTo(2.0f, 9.3223f, 4.105f, 7.1361f, 6.7505f, 7.0061f)
                lineTo(7.0f, 7.0f)
                horizontalLineTo(9.25f)
                close()
                moveTo(17.0f, 7.0f)
                curveTo(19.7614f, 7.0f, 22.0f, 9.2386f, 22.0f, 12.0f)
                curveTo(22.0f, 14.6777f, 19.895f, 16.8638f, 17.2495f, 16.9939f)
                lineTo(17.0f, 17.0f)
                horizontalLineTo(14.75f)
                curveTo(14.3358f, 17.0f, 14.0f, 16.6642f, 14.0f, 16.25f)
                curveTo(14.0f, 15.8734f, 14.2775f, 15.5617f, 14.6392f, 15.5081f)
                lineTo(14.75f, 15.5f)
                horizontalLineTo(17.0f)
                curveTo(18.933f, 15.5f, 20.5f, 13.933f, 20.5f, 12.0f)
                curveTo(20.5f, 10.136f, 19.0429f, 8.6124f, 17.2057f, 8.5059f)
                lineTo(17.0f, 8.5f)
                horizontalLineTo(14.75f)
                curveTo(14.3358f, 8.5f, 14.0f, 8.1642f, 14.0f, 7.75f)
                curveTo(14.0f, 7.3734f, 14.2775f, 7.0617f, 14.6392f, 7.0081f)
                lineTo(14.75f, 7.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.0f, 11.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 11.25f, 17.75f, 11.5858f, 17.75f, 12.0f)
                curveTo(17.75f, 12.3797f, 17.4678f, 12.6935f, 17.1018f, 12.7432f)
                lineTo(17.0f, 12.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 12.75f, 6.25f, 12.4142f, 6.25f, 12.0f)
                curveTo(6.25f, 11.6203f, 6.5321f, 11.3065f, 6.8982f, 11.2568f)
                lineTo(7.0f, 11.25f)
                horizontalLineTo(17.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
