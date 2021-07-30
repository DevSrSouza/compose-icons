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

public val SimpleIcons.Windowsterminal: ImageVector
    get() {
        if (_windowsterminal != null) {
            return _windowsterminal!!
        }
        _windowsterminal = Builder(name = "Windowsterminal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.165f, 6.0f)
                lineTo(8.165f, 3.0f)
                horizontalLineToRelative(7.665f)
                verticalLineToRelative(3.0f)
                lineTo(8.165f, 6.0f)
                close()
                moveTo(7.665f, 3.0f)
                lineTo(1.0f, 3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.665f)
                lineTo(7.665f, 3.0f)
                close()
                moveTo(23.0f, 3.0f)
                horizontalLineToRelative(-6.67f)
                verticalLineToRelative(3.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(0.0f, 6.5f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 21.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(0.0f, 6.5f)
                close()
                moveTo(11.5f, 18.0f)
                curveToRelative(0.0f, 0.3f, 0.2f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.3f, 0.0f, 0.5f, -0.2f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.3f, -0.2f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.3f, 0.0f, -0.5f, 0.2f, -0.5f, 0.5f)
                lineTo(11.5f, 18.0f)
                close()
                moveTo(6.3f, 13.45f)
                lineToRelative(-3.1f, 3.1f)
                curveToRelative(-0.25f, 0.25f, -0.25f, 0.6f, 0.0f, 0.8f)
                lineToRelative(0.9f, 0.9f)
                curveToRelative(0.25f, 0.25f, 0.6f, 0.25f, 0.8f, 0.0f)
                lineToRelative(4.4f, -4.4f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.0f, -0.8f)
                lineToRelative(-4.4f, -4.4f)
                curveToRelative(-0.2f, -0.2f, -0.6f, -0.2f, -0.8f, 0.0f)
                lineToRelative(-0.9f, 0.9f)
                curveToRelative(-0.25f, 0.2f, -0.25f, 0.55f, 0.0f, 0.8f)
                lineToRelative(3.1f, 3.1f)
                close()
            }
        }
        .build()
        return _windowsterminal!!
    }

private var _windowsterminal: ImageVector? = null
