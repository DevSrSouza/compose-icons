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

public val SimpleIcons.Bakalari: ImageVector
    get() {
        if (_bakalari != null) {
            return _bakalari!!
        }
        _bakalari = Builder(name = "Bakalari", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.385f, 0.0f, -0.77f, 0.102f, -1.11f, 0.307f)
                lineTo(2.762f, 5.193f)
                arcToRelative(2.147f, 2.147f, 0.0f, false, false, -1.043f, 1.84f)
                verticalLineToRelative(9.93f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, 1.043f, 1.843f)
                lineToRelative(8.126f, 4.886f)
                curveToRelative(0.683f, 0.41f, 1.537f, 0.41f, 2.22f, 0.0f)
                lineToRelative(8.128f, -4.886f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, false, 1.043f, -1.842f)
                verticalLineToRelative(-9.93f)
                curveToRelative(0.0f, -0.754f, -0.396f, -1.452f, -1.043f, -1.84f)
                lineTo(13.11f, 0.306f)
                arcTo(2.152f, 2.152f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(11.906f, 3.462f)
                curveToRelative(0.224f, -0.001f, 0.449f, 0.056f, 0.65f, 0.17f)
                lineToRelative(6.192f, 3.548f)
                curveToRelative(0.402f, 0.23f, 0.65f, 0.658f, 0.65f, 1.12f)
                verticalLineToRelative(1.85f)
                curveToRelative(0.0f, 0.468f, -0.253f, 0.898f, -0.66f, 1.127f)
                lineToRelative(-1.296f, 0.722f)
                lineToRelative(1.295f, 0.724f)
                curveToRelative(0.408f, 0.228f, 0.661f, 0.659f, 0.661f, 1.126f)
                verticalLineToRelative(1.849f)
                curveToRelative(0.0f, 0.462f, -0.248f, 0.89f, -0.65f, 1.12f)
                lineToRelative(-6.192f, 3.549f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, true, -1.297f, -0.008f)
                lineToRelative(-6.022f, -3.55f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, true, -0.635f, -1.111f)
                lineTo(4.602f, 8.3f)
                curveToRelative(0.0f, -0.457f, 0.242f, -0.88f, 0.635f, -1.112f)
                lineToRelative(6.022f, -3.547f)
                curveToRelative(0.2f, -0.118f, 0.423f, -0.177f, 0.647f, -0.179f)
                close()
                moveTo(11.924f, 6.244f)
                lineTo(7.182f, 9.037f)
                verticalLineToRelative(5.924f)
                lineToRelative(4.742f, 2.793f)
                lineToRelative(4.894f, -2.803f)
                verticalLineToRelative(-0.344f)
                lineToRelative(-1.413f, -0.788f)
                curveToRelative(-0.34f, -0.19f, -0.55f, -0.55f, -0.55f, -0.94f)
                lineTo(14.855f, 11.12f)
                curveToRelative(0.0f, -0.39f, 0.21f, -0.75f, 0.55f, -0.94f)
                lineToRelative(1.413f, -0.787f)
                verticalLineToRelative(-0.345f)
                close()
            }
        }
        .build()
        return _bakalari!!
    }

private var _bakalari: ImageVector? = null
