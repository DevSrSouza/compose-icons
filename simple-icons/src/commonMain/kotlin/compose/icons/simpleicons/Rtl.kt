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

public val SimpleIcons.Rtl: ImageVector
    get() {
        if (_rtl != null) {
            return _rtl!!
        }
        _rtl = Builder(name = "Rtl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 9.889f)
                verticalLineToRelative(4.222f)
                horizontalLineToRelative(7.498f)
                lineTo(7.498f, 9.89f)
                lineTo(0.0f, 9.89f)
                close()
                moveTo(8.25f, 9.889f)
                verticalLineToRelative(4.222f)
                horizontalLineToRelative(7.5f)
                lineTo(15.75f, 9.89f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(16.502f, 9.889f)
                verticalLineToRelative(4.222f)
                lineTo(24.0f, 14.111f)
                lineTo(24.0f, 9.89f)
                horizontalLineToRelative(-7.498f)
                close()
                moveTo(2.137f, 10.855f)
                lineTo(4.12f, 10.855f)
                curveToRelative(0.61f, 0.0f, 0.945f, 0.275f, 0.945f, 0.733f)
                curveToRelative(0.0f, 0.397f, -0.254f, 0.662f, -0.691f, 0.723f)
                lineToRelative(0.977f, 0.824f)
                horizontalLineToRelative(-0.754f)
                lineToRelative(-0.926f, -0.795f)
                lineTo(2.656f, 12.34f)
                verticalLineToRelative(0.795f)
                horizontalLineToRelative(-0.52f)
                verticalLineToRelative(-2.28f)
                close()
                moveTo(10.418f, 10.855f)
                horizontalLineToRelative(3.164f)
                verticalLineToRelative(0.448f)
                lineTo(12.26f, 11.303f)
                verticalLineToRelative(1.832f)
                horizontalLineToRelative(-0.52f)
                verticalLineToRelative(-1.832f)
                horizontalLineToRelative(-1.322f)
                verticalLineToRelative(-0.448f)
                close()
                moveTo(18.832f, 10.855f)
                horizontalLineToRelative(0.518f)
                verticalLineToRelative(1.832f)
                horizontalLineToRelative(2.32f)
                verticalLineToRelative(0.448f)
                horizontalLineToRelative(-2.838f)
                verticalLineToRelative(-2.28f)
                close()
                moveTo(2.656f, 11.283f)
                verticalLineToRelative(0.631f)
                lineTo(4.06f, 11.914f)
                curveToRelative(0.325f, 0.0f, 0.478f, -0.103f, 0.478f, -0.316f)
                curveToRelative(0.0f, -0.214f, -0.153f, -0.315f, -0.478f, -0.315f)
                lineTo(2.656f, 11.283f)
                close()
            }
        }
        .build()
        return _rtl!!
    }

private var _rtl: ImageVector? = null
