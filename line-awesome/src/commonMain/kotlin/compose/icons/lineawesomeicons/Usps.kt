package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Usps: ImageVector
    get() {
        if (_usps != null) {
            return _usps!!
        }
        _usps = Builder(name = "Usps", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6f, 7.0f)
                curveTo(19.2f, 9.9f, 23.3f, 10.5f, 23.4f, 11.5f)
                curveTo(25.4f, 11.5f, 25.899f, 11.5f, 26.199f, 11.9f)
                curveTo(27.299f, 12.9f, 25.4f, 15.5f, 25.4f, 15.5f)
                curveTo(25.2f, 15.6f, 3.699f, 24.0f, 3.699f, 24.0f)
                lineTo(26.4f, 24.0f)
                lineTo(30.0f, 7.0f)
                lineTo(5.6f, 7.0f)
                close()
                moveTo(4.801f, 11.0f)
                lineTo(2.0f, 24.0f)
                curveTo(12.5f, 18.8f, 15.899f, 17.1f, 19.199f, 15.9f)
                curveTo(22.699f, 14.8f, 24.399f, 14.7f, 24.699f, 14.6f)
                curveTo(24.899f, 14.4f, 24.501f, 14.201f, 23.301f, 14.301f)
                curveTo(20.501f, 14.401f, 15.9f, 16.299f, 14.0f, 17.199f)
                lineTo(12.4f, 12.199f)
                lineTo(22.9f, 12.199f)
                curveTo(22.8f, 11.199f, 17.499f, 11.1f, 10.199f, 11.0f)
                lineTo(4.801f, 11.0f)
                close()
                moveTo(23.199f, 12.1f)
                curveTo(23.199f, 12.1f, 23.1f, 12.0f, 22.6f, 12.5f)
                curveTo(22.0f, 12.8f, 20.6f, 12.8f, 20.6f, 13.0f)
                curveTo(20.6f, 13.2f, 24.401f, 12.8f, 25.301f, 13.0f)
                curveTo(25.801f, 13.1f, 25.2f, 14.099f, 25.1f, 14.699f)
                curveTo(25.0f, 14.999f, 25.199f, 14.899f, 25.199f, 14.699f)
                curveTo(26.599f, 12.499f, 26.0f, 12.1f, 24.6f, 12.1f)
                lineTo(23.199f, 12.1f)
                close()
            }
        }
        .build()
        return _usps!!
    }

private var _usps: ImageVector? = null
