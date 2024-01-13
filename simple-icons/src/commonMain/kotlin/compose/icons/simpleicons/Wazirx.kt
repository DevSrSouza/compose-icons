package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Wazirx: ImageVector
    get() {
        if (_wazirx != null) {
            return _wazirx!!
        }
        _wazirx = Builder(name = "Wazirx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.965f, 21.964f)
                horizontalLineToRelative(21.924f)
                verticalLineToRelative(-2.485f)
                lineTo(0.965f, 19.479f)
                verticalLineToRelative(2.485f)
                close()
                moveTo(7.717f, 18.154f)
                horizontalLineToRelative(15.195f)
                lineTo(24.0f, 6.343f)
                lineTo(7.717f, 18.155f)
                close()
                moveTo(17.101f, 9.45f)
                lineTo(5.205f, 18.072f)
                lineTo(1.93f, 18.072f)
                lineToRelative(6.045f, -9.814f)
                lineToRelative(3.858f, -6.22f)
                lineToRelative(5.269f, 7.412f)
                close()
                moveTo(5.408f, 9.673f)
                lineTo(0.0f, 6.067f)
                lineToRelative(0.994f, 10.762f)
                lineToRelative(4.414f, -7.156f)
                close()
            }
        }
        .build()
        return _wazirx!!
    }

private var _wazirx: ImageVector? = null
