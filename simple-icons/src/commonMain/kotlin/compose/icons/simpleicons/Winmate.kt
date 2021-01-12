package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Winmate: VectorAsset
    get() {
        if (_winmate != null) {
            return _winmate!!
        }
        _winmate = VectorAssetBuilder(name = "Winmate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.785f, 4.058f)
                lineToRelative(-4.473f, 0.004f)
                lineTo(1.311f, 0.01f)
                lineTo(19.469f, 0.0f)
                curveToRelative(3.514f, 0.42f, 3.199f, 4.047f, 3.199f, 4.047f)
                lineToRelative(-2.156f, -0.002f)
                lineToRelative(-2.769f, 15.888f)
                lineTo(14.79f, 4.049f)
                lineToRelative(-4.731f, 0.005f)
                lineToRelative(0.856f, 7.376f)
                lineToRelative(-2.137f, 8.507f)
                lineTo(5.785f, 4.058f)
                close()
                moveTo(4.491f, 21.373f)
                lineTo(1.317f, 8.52f)
                lineToRelative(0.009f, 12.338f)
                curveTo(1.756f, 23.983f, 4.629f, 24.0f, 4.629f, 24.0f)
                lineToRelative(1.687f, -0.001f)
                curveToRelative(-1.393f, -0.69f, -1.825f, -2.626f, -1.825f, -2.626f)
                close()
                moveTo(13.728f, 22.032f)
                lineToRelative(-1.724f, -6.724f)
                lineToRelative(-1.673f, 6.678f)
                curveToRelative(-0.517f, 1.652f, -1.702f, 2.009f, -1.702f, 2.009f)
                lineToRelative(6.602f, -0.002f)
                curveToRelative(-1.206f, -0.499f, -1.503f, -1.961f, -1.503f, -1.961f)
                close()
                moveTo(22.677f, 4.389f)
                lineToRelative(-2.844f, 15.865f)
                curveToRelative(-0.711f, 3.767f, -2.285f, 3.738f, -2.285f, 3.738f)
                lineToRelative(5.141f, -0.008f)
                lineToRelative(-0.012f, -19.595f)
                close()
            }
        }
        .build()
        return _winmate!!
    }

private var _winmate: VectorAsset? = null
