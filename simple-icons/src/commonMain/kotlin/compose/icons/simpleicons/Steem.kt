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

public val SimpleIcons.Steem: VectorAsset
    get() {
        if (_steem != null) {
            return _steem!!
        }
        _steem = VectorAssetBuilder(name = "Steem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.927f, 2.596f)
                curveToRelative(0.264f, 0.045f, -0.397f, 1.778f, -0.028f, 3.76f)
                curveToRelative(0.318f, 1.697f, 4.313f, 8.275f, 4.148f, 10.529f)
                curveToRelative(-0.128f, 1.418f, -3.408f, 4.74f, -3.753f, 4.52f)
                curveToRelative(-0.377f, -0.105f, 0.996f, -2.361f, 0.486f, -4.244f)
                curveTo(4.19f, 14.97f, 0.673f, 9.301f, 0.677f, 6.798f)
                curveToRelative(0.0f, -1.832f, 3.011f, -4.32f, 3.25f, -4.202f)
                close()
                moveTo(11.44f, 0.005f)
                curveToRelative(0.336f, 0.058f, -0.506f, 2.271f, -0.034f, 4.791f)
                curveToRelative(0.405f, 2.17f, 5.501f, 10.555f, 5.292f, 13.432f)
                curveToRelative(-0.166f, 1.809f, -4.348f, 6.043f, -4.789f, 5.76f)
                curveToRelative(-0.479f, -0.131f, 1.271f, -3.008f, 0.622f, -5.406f)
                curveToRelative(-0.755f, -2.796f, -5.238f, -10.026f, -5.235f, -13.218f)
                curveToRelative(0.0f, -2.338f, 3.842f, -5.509f, 4.144f, -5.359f)
                close()
                moveTo(19.194f, 2.596f)
                curveToRelative(0.27f, 0.045f, -0.393f, 1.778f, -0.023f, 3.761f)
                curveToRelative(0.318f, 1.697f, 4.313f, 8.275f, 4.148f, 10.529f)
                curveToRelative(-0.125f, 1.418f, -3.408f, 4.74f, -3.754f, 4.52f)
                curveToRelative(-0.377f, -0.105f, 0.996f, -2.361f, 0.488f, -4.244f)
                curveToRelative(-0.594f, -2.192f, -4.11f, -7.861f, -4.105f, -10.363f)
                curveToRelative(0.0f, -1.832f, 3.014f, -4.32f, 3.248f, -4.202f)
                horizontalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _steem!!
    }

private var _steem: VectorAsset? = null
