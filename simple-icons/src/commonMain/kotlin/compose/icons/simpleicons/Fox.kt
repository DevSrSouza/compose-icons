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

public val SimpleIcons.Fox: ImageVector
    get() {
        if (_fox != null) {
            return _fox!!
        }
        _fox = Builder(name = "Fox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.069f, 9.7f)
                horizontalLineToRelative(3.42f)
                lineTo(6.3f, 6.932f)
                lineTo(0.0f, 6.932f)
                verticalLineToRelative(10.136f)
                horizontalLineToRelative(3.069f)
                lineTo(3.069f, 13.8f)
                horizontalLineToRelative(2.789f)
                verticalLineToRelative(-2.778f)
                lineTo(3.069f, 11.022f)
                close()
                moveTo(24.0f, 6.932f)
                horizontalLineToRelative(-3.291f)
                lineTo(19.48f, 9.1f)
                lineToRelative(-1.231f, -2.168f)
                horizontalLineToRelative(-3.292f)
                lineToRelative(2.871f, 5.076f)
                lineToRelative(-2.871f, 5.06f)
                horizontalLineToRelative(3.308f)
                lineToRelative(1.215f, -2.142f)
                lineToRelative(1.213f, 2.142f)
                lineTo(24.0f, 17.068f)
                lineToRelative(-2.871f, -5.06f)
                close()
                moveTo(11.408f, 6.932f)
                arcTo(5.067f, 5.067f, 0.0f, true, false, 16.475f, 12.0f)
                arcToRelative(5.067f, 5.067f, 0.0f, false, false, -5.067f, -5.065f)
                close()
                moveTo(12.296f, 14.078f)
                arcToRelative(0.867f, 0.867f, 0.0f, false, true, -0.873f, 0.847f)
                arcToRelative(0.847f, 0.847f, 0.0f, false, true, -0.837f, -0.858f)
                lineTo(10.586f, 9.919f)
                arcToRelative(0.882f, 0.882f, 0.0f, false, true, 0.837f, -0.9f)
                arcToRelative(0.913f, 0.913f, 0.0f, false, true, 0.873f, 0.9f)
                close()
            }
        }
        .build()
        return _fox!!
    }

private var _fox: ImageVector? = null
