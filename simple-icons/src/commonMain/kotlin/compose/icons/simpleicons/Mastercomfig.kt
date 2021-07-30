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

public val SimpleIcons.Mastercomfig: ImageVector
    get() {
        if (_mastercomfig != null) {
            return _mastercomfig!!
        }
        _mastercomfig = Builder(name = "Mastercomfig", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.479f, 0.0f, 0.174f, 5.304f, 0.174f, 11.826f)
                lineTo(0.174f, 24.0f)
                horizontalLineToRelative(1.337f)
                verticalLineToRelative(-6.716f)
                curveTo(3.486f, 21.064f, 7.446f, 23.65f, 12.0f, 23.65f)
                curveToRelative(4.554f, 0.0f, 8.514f, -2.586f, 10.49f, -6.367f)
                lineTo(22.49f, 24.0f)
                horizontalLineToRelative(1.336f)
                lineTo(23.826f, 11.826f)
                horizontalLineToRelative(-1.337f)
                curveToRelative(0.0f, 5.798f, -4.69f, 10.489f, -10.489f, 10.489f)
                curveToRelative(-5.798f, 0.0f, -10.49f, -4.691f, -10.49f, -10.49f)
                curveTo(1.51f, 6.028f, 6.203f, 1.338f, 12.0f, 1.338f)
                close()
                moveTo(12.0f, 3.72f)
                arcToRelative(8.107f, 8.107f, 0.0f, true, false, 0.0f, 16.214f)
                arcToRelative(8.107f, 8.107f, 0.0f, false, false, 0.0f, -16.215f)
                close()
                moveTo(12.0f, 5.056f)
                arcToRelative(6.77f, 6.77f, 0.0f, true, true, 0.0f, 13.538f)
                arcToRelative(6.77f, 6.77f, 0.0f, false, true, 0.0f, -13.538f)
                close()
            }
        }
        .build()
        return _mastercomfig!!
    }

private var _mastercomfig: ImageVector? = null
