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

public val SimpleIcons.Spring: ImageVector
    get() {
        if (_spring != null) {
            return _spring!!
        }
        _spring = Builder(name = "Spring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8537f, 1.4158f)
                arcToRelative(10.4504f, 10.4504f, 0.0f, false, true, -1.284f, 2.2471f)
                arcTo(11.9666f, 11.9666f, 0.0f, true, false, 3.8518f, 20.7757f)
                lineToRelative(0.4445f, 0.3951f)
                arcToRelative(11.9543f, 11.9543f, 0.0f, false, false, 19.6316f, -8.2971f)
                curveToRelative(0.3457f, -3.0126f, -0.568f, -6.8649f, -2.0743f, -11.458f)
                close()
                moveTo(5.5805f, 20.8745f)
                arcToRelative(1.0174f, 1.0174f, 0.0f, true, true, -0.1482f, -1.4323f)
                arcToRelative(1.0396f, 1.0396f, 0.0f, false, true, 0.1482f, 1.4323f)
                close()
                moveTo(21.7796f, 17.2939f)
                curveToRelative(-2.9385f, 3.9263f, -9.2601f, 2.5928f, -13.2852f, 2.7904f)
                curveToRelative(0.0f, 0.0f, -0.7161f, 0.0494f, -1.4323f, 0.1481f)
                curveToRelative(0.0f, 0.0f, 0.2717f, -0.1234f, 0.6174f, -0.2469f)
                curveToRelative(2.8398f, -0.9877f, 4.1732f, -1.1853f, 5.9018f, -2.0743f)
                curveToRelative(3.2349f, -1.6545f, 6.4698f, -5.2844f, 7.1118f, -9.0379f)
                curveToRelative(-1.2347f, 3.6053f, -4.9881f, 6.7167f, -8.3959f, 7.9761f)
                curveToRelative(-2.3459f, 0.8643f, -6.5685f, 1.7039f, -6.5685f, 1.7039f)
                lineToRelative(-0.1729f, -0.0988f)
                curveToRelative(-2.8645f, -1.4076f, -2.9632f, -7.6304f, 2.2718f, -9.6306f)
                curveToRelative(2.2966f, -0.889f, 4.4696f, -0.395f, 6.9637f, -0.9877f)
                curveToRelative(2.6422f, -0.6174f, 5.7043f, -2.5929f, 6.939f, -5.1857f)
                curveToRelative(1.3828f, 4.1732f, 3.062f, 10.643f, 0.0493f, 14.6434f)
                close()
            }
        }
        .build()
        return _spring!!
    }

private var _spring: ImageVector? = null
