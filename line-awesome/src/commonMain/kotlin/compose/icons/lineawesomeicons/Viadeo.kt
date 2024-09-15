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

public val LineAwesomeIcons.Viadeo: ImageVector
    get() {
        if (_viadeo != null) {
            return _viadeo!!
        }
        _viadeo = Builder(name = "Viadeo", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveTo(16.4f, 5.4f, 17.7f, 7.999f, 18.6f, 10.699f)
                curveTo(18.4f, 8.099f, 17.2f, 4.5f, 15.0f, 3.0f)
                close()
                moveTo(25.699f, 4.0f)
                curveTo(24.199f, 7.2f, 21.8f, 6.3f, 20.1f, 7.9f)
                curveTo(19.5f, 8.4f, 19.1f, 9.501f, 19.1f, 10.301f)
                curveTo(19.1f, 11.001f, 19.299f, 11.599f, 19.699f, 12.199f)
                curveTo(21.999f, 11.699f, 24.4f, 10.001f, 25.4f, 7.801f)
                curveTo(25.4f, 8.001f, 25.2f, 8.499f, 25.1f, 8.699f)
                curveTo(24.1f, 10.399f, 22.001f, 11.901f, 20.301f, 12.801f)
                curveTo(21.101f, 13.501f, 22.0f, 14.0f, 23.0f, 14.0f)
                curveTo(26.8f, 14.0f, 28.299f, 7.5f, 25.699f, 4.0f)
                close()
                moveTo(18.5f, 10.699f)
                lineTo(18.5f, 12.5f)
                curveTo(18.5f, 17.139f, 17.554f, 24.567f, 12.615f, 26.865f)
                curveTo(9.392f, 26.232f, 7.0f, 23.425f, 7.0f, 20.0f)
                curveTo(7.0f, 16.1f, 10.1f, 13.0f, 14.0f, 13.0f)
                curveTo(14.8f, 13.0f, 15.499f, 13.1f, 16.199f, 13.4f)
                curveTo(16.299f, 12.8f, 16.501f, 12.2f, 16.801f, 11.6f)
                lineTo(16.9f, 11.5f)
                curveTo(16.0f, 11.2f, 15.0f, 11.0f, 14.0f, 11.0f)
                curveTo(9.0f, 11.0f, 5.0f, 15.0f, 5.0f, 20.0f)
                curveTo(5.0f, 25.0f, 9.0f, 29.0f, 14.0f, 29.0f)
                curveTo(19.0f, 29.0f, 23.0f, 25.0f, 23.0f, 20.0f)
                curveTo(23.0f, 18.7f, 22.699f, 17.401f, 22.199f, 16.301f)
                curveTo(22.099f, 16.301f, 22.001f, 16.4f, 21.801f, 16.5f)
                curveTo(21.401f, 16.8f, 20.9f, 17.0f, 20.4f, 17.1f)
                curveTo(20.8f, 18.0f, 21.0f, 19.0f, 21.0f, 20.0f)
                curveTo(21.0f, 23.9f, 17.9f, 27.0f, 14.0f, 27.0f)
                curveTo(13.972f, 27.0f, 13.946f, 26.996f, 13.918f, 26.996f)
                curveTo(17.697f, 24.588f, 19.5f, 20.877f, 19.5f, 16.5f)
                curveTo(19.5f, 14.5f, 19.2f, 12.499f, 18.5f, 10.699f)
                close()
            }
        }
        .build()
        return _viadeo!!
    }

private var _viadeo: ImageVector? = null
