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

public val SimpleIcons.Midi: ImageVector
    get() {
        if (_midi != null) {
            return _midi!!
        }
        _midi = Builder(name = "Midi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.775f, 7.517f)
                lineTo(24.0f, 7.517f)
                verticalLineToRelative(8.966f)
                horizontalLineToRelative(-2.225f)
                close()
                moveTo(13.213f, 7.517f)
                horizontalLineToRelative(6.506f)
                curveToRelative(0.66f, 0.0f, 1.045f, 0.57f, 1.045f, 1.247f)
                verticalLineToRelative(6.607f)
                curveToRelative(0.0f, 0.84f, -0.35f, 1.112f, -1.112f, 1.112f)
                horizontalLineToRelative(-6.439f)
                verticalLineToRelative(-5.696f)
                horizontalLineToRelative(2.225f)
                verticalLineToRelative(3.505f)
                horizontalLineToRelative(3.135f)
                lineTo(18.573f, 9.54f)
                horizontalLineToRelative(-5.36f)
                close()
                moveTo(9.978f, 7.517f)
                horizontalLineToRelative(2.19f)
                verticalLineToRelative(8.966f)
                horizontalLineToRelative(-2.19f)
                close()
                moveTo(0.0f, 7.517f)
                horizontalLineToRelative(7.854f)
                curveToRelative(0.66f, 0.0f, 1.045f, 0.57f, 1.045f, 1.247f)
                verticalLineToRelative(7.72f)
                lineTo(6.708f, 16.484f)
                lineTo(6.708f, 9.774f)
                lineTo(5.427f, 9.774f)
                verticalLineToRelative(6.708f)
                lineTo(3.438f, 16.482f)
                lineTo(3.438f, 9.775f)
                lineTo(2.191f, 9.775f)
                verticalLineToRelative(6.708f)
                lineTo(0.0f, 16.483f)
                close()
            }
        }
        .build()
        return _midi!!
    }

private var _midi: ImageVector? = null
