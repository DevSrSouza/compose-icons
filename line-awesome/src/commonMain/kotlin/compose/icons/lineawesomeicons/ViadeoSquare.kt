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

public val LineAwesomeIcons.ViadeoSquare: ImageVector
    get() {
        if (_viadeoSquare != null) {
            return _viadeoSquare!!
        }
        _viadeoSquare = Builder(name = "ViadeoSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4f, 5.0f)
                curveTo(6.1f, 5.0f, 5.0f, 6.1f, 5.0f, 7.4f)
                lineTo(5.0f, 24.699f)
                curveTo(5.0f, 25.899f, 6.1f, 27.0f, 7.4f, 27.0f)
                lineTo(24.699f, 27.0f)
                curveTo(25.999f, 27.0f, 27.1f, 25.9f, 27.1f, 24.6f)
                lineTo(27.1f, 7.4f)
                curveTo(27.0f, 6.1f, 25.9f, 5.0f, 24.6f, 5.0f)
                lineTo(7.4f, 5.0f)
                close()
                moveTo(15.301f, 7.699f)
                curveTo(16.701f, 8.599f, 17.4f, 10.9f, 17.6f, 12.5f)
                curveTo(18.0f, 13.6f, 18.199f, 14.9f, 18.199f, 16.1f)
                curveTo(18.199f, 18.899f, 17.1f, 21.098f, 14.701f, 22.598f)
                curveTo(17.15f, 22.637f, 19.0f, 20.566f, 19.0f, 18.199f)
                curveTo(19.0f, 17.599f, 18.9f, 17.0f, 18.6f, 16.4f)
                curveTo(19.1f, 16.3f, 19.5f, 16.1f, 19.9f, 15.9f)
                curveTo(20.8f, 17.7f, 20.7f, 20.299f, 18.9f, 22.199f)
                curveTo(16.7f, 24.599f, 12.8f, 24.599f, 10.6f, 22.199f)
                curveTo(7.1f, 18.399f, 9.599f, 12.199f, 14.699f, 12.199f)
                curveTo(15.399f, 12.199f, 16.099f, 12.3f, 16.699f, 12.5f)
                curveTo(16.499f, 12.9f, 16.301f, 13.4f, 16.301f, 13.9f)
                curveTo(15.801f, 13.7f, 15.299f, 13.6f, 14.699f, 13.6f)
                curveTo(12.199f, 13.6f, 10.4f, 15.7f, 10.4f, 18.1f)
                curveTo(10.4f, 20.3f, 11.9f, 22.1f, 13.9f, 22.5f)
                curveTo(17.0f, 21.3f, 17.6f, 16.5f, 17.6f, 13.6f)
                lineTo(17.6f, 12.5f)
                curveTo(17.0f, 10.8f, 16.201f, 9.199f, 15.301f, 7.699f)
                close()
                moveTo(14.701f, 22.598f)
                curveTo(14.667f, 22.597f, 14.634f, 22.601f, 14.6f, 22.6f)
                lineTo(14.699f, 22.6f)
                curveTo(14.7f, 22.599f, 14.7f, 22.598f, 14.701f, 22.598f)
                close()
                moveTo(22.1f, 8.199f)
                curveTo(23.8f, 10.399f, 22.901f, 14.699f, 20.301f, 14.699f)
                curveTo(19.601f, 14.699f, 19.0f, 14.3f, 18.5f, 13.9f)
                curveTo(19.6f, 13.3f, 20.999f, 12.299f, 21.699f, 11.199f)
                curveTo(21.799f, 10.999f, 21.9f, 10.8f, 21.9f, 10.6f)
                curveTo(21.3f, 12.0f, 19.6f, 13.1f, 18.1f, 13.5f)
                curveTo(17.9f, 13.1f, 17.699f, 12.701f, 17.699f, 12.301f)
                curveTo(17.699f, 11.801f, 18.0f, 11.099f, 18.4f, 10.699f)
                curveTo(19.5f, 9.699f, 21.1f, 10.299f, 22.1f, 8.199f)
                close()
            }
        }
        .build()
        return _viadeoSquare!!
    }

private var _viadeoSquare: ImageVector? = null
