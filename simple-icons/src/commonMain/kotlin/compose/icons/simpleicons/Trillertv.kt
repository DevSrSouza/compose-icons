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

public val SimpleIcons.Trillertv: ImageVector
    get() {
        if (_trillertv != null) {
            return _trillertv!!
        }
        _trillertv = Builder(name = "Trillertv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.496f, 0.07f)
                lineToRelative(-1.8f, 3.107f)
                lineToRelative(-0.868f, -0.498f)
                curveToRelative(-1.269f, -0.729f, -2.852f, 0.184f, -2.852f, 1.64f)
                verticalLineToRelative(6.28f)
                lineToRelative(3.9f, -6.734f)
                lineTo(9.933f, 0.319f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, -0.053f, -0.19f)
                lineToRelative(-0.19f, -0.11f)
                arcToRelative(0.143f, 0.143f, 0.0f, false, false, -0.193f, 0.05f)
                close()
                moveTo(8.783f, 3.804f)
                lineTo(3.976f, 12.105f)
                verticalLineToRelative(7.163f)
                curveToRelative(0.0f, 0.674f, 0.338f, 1.23f, 0.826f, 1.562f)
                lineToRelative(-1.65f, 2.85f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, 0.05f, 0.192f)
                lineToRelative(0.192f, 0.109f)
                arcToRelative(0.142f, 0.142f, 0.0f, false, false, 0.193f, -0.05f)
                lineToRelative(1.665f, -2.874f)
                lineTo(13.629f, 6.59f)
                close()
                moveTo(20.413f, 6.351f)
                lineTo(18.613f, 9.459f)
                lineTo(14.283f, 6.969f)
                lineTo(6.066f, 21.155f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, false, 0.764f, -0.248f)
                lineToRelative(8.598f, -4.948f)
                lineToRelative(5.42f, -9.356f)
                arcToRelative(0.141f, 0.141f, 0.0f, false, false, -0.05f, -0.193f)
                curveToRelative(-0.065f, -0.035f, -0.128f, -0.073f, -0.192f, -0.11f)
                curveToRelative(-0.027f, -0.02f, -0.14f, -0.041f, -0.193f, 0.051f)
                close()
                moveTo(19.702f, 10.086f)
                lineTo(16.735f, 15.209f)
                lineTo(19.815f, 13.435f)
                curveToRelative(1.268f, -0.731f, 1.268f, -2.556f, 0.0f, -3.285f)
                close()
            }
        }
        .build()
        return _trillertv!!
    }

private var _trillertv: ImageVector? = null
