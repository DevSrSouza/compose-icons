package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Mute16: ImageVector
    get() {
        if (_mute16 != null) {
            return _mute16!!
        }
        _mute16 = Builder(name = "Mute16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.238f, 0.57f)
                lineTo(3.473f, 11.0f)
                lineTo(1.75f, 11.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 9.25f)
                verticalLineToRelative(-2.5f)
                curveTo(0.0f, 5.784f, 0.784f, 5.0f, 1.75f, 5.0f)
                horizontalLineToRelative(1.722f)
                lineToRelative(3.29f, -2.82f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 2.75f)
                close()
                moveTo(11.28f, 5.22f)
                lineTo(13.0f, 6.94f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, 1.042f)
                lineTo(14.06f, 8.0f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.326f, 1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.734f, -0.215f)
                lineTo(13.0f, 9.06f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.275f, -0.326f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.215f, -0.734f)
                lineTo(11.94f, 8.0f)
                lineToRelative(-1.72f, -1.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.326f, -1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.734f, 0.215f)
                close()
                moveTo(4.238f, 6.32f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -0.488f, 0.18f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.179f, 0.0f, 0.352f, 0.064f, 0.488f, 0.18f)
                lineTo(6.5f, 11.62f)
                lineTo(6.5f, 4.38f)
                close()
            }
        }
        .build()
        return _mute16!!
    }

private var _mute16: ImageVector? = null
