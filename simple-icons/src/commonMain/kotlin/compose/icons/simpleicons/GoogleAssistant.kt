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

public val SimpleIcons.GoogleAssistant: VectorAsset
    get() {
        if (_googleAssistant != null) {
            return _googleAssistant!!
        }
        _googleAssistant = VectorAssetBuilder(name = "GoogleAssistant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.545f, 1.03f)
                curveTo(2.93f, 1.03f, 0.0f, 3.975f, 0.0f, 7.61f)
                curveToRelative(0.0f, 3.635f, 2.93f, 6.582f, 6.545f, 6.582f)
                curveToRelative(3.615f, 0.0f, 6.545f, -2.947f, 6.545f, -6.582f)
                reflectiveCurveTo(10.16f, 1.03f, 6.545f, 1.03f)
                close()
                moveTo(22.363f, 5.418f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, false, -1.636f, 1.644f)
                curveToRelative(0.0f, 0.909f, 0.733f, 1.647f, 1.636f, 1.647f)
                curveToRelative(0.904f, 0.0f, 1.637f, -0.738f, 1.637f, -1.646f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, false, -1.637f, -1.645f)
                close()
                moveTo(17.453f, 7.611f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, -3.271f, 3.291f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, 3.271f, 3.291f)
                arcToRelative(3.282f, 3.282f, 0.0f, false, false, 3.274f, -3.29f)
                arcToRelative(3.282f, 3.282f, 0.0f, false, false, -3.274f, -3.292f)
                close()
                moveTo(17.453f, 15.291f)
                curveToRelative(-2.109f, 0.0f, -3.818f, 1.72f, -3.818f, 3.84f)
                reflectiveCurveToRelative(1.71f, 3.84f, 3.818f, 3.84f)
                curveToRelative(2.109f, 0.0f, 3.818f, -1.72f, 3.818f, -3.84f)
                reflectiveCurveToRelative(-1.71f, -3.84f, -3.818f, -3.84f)
                close()
            }
        }
        .build()
        return _googleAssistant!!
    }

private var _googleAssistant: VectorAsset? = null
