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

public val SimpleIcons.Intercom: ImageVector
    get() {
        if (_intercom != null) {
            return _intercom!!
        }
        _intercom = Builder(name = "Intercom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.658f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.658f, 0.0f, 3.0f, -1.342f, 3.0f, -3.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, -1.342f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(15.199f, 4.399f)
                curveToRelative(0.0f, -0.44f, 0.36f, -0.8f, 0.802f, -0.8f)
                curveToRelative(0.44f, 0.0f, 0.8f, 0.36f, 0.8f, 0.8f)
                verticalLineToRelative(10.688f)
                curveToRelative(0.0f, 0.442f, -0.36f, 0.801f, -0.8f, 0.801f)
                curveToRelative(-0.443f, 0.0f, -0.802f, -0.359f, -0.802f, -0.801f)
                lineTo(15.199f, 4.399f)
                close()
                moveTo(11.2f, 3.994f)
                curveToRelative(0.0f, -0.44f, 0.357f, -0.799f, 0.8f, -0.799f)
                reflectiveCurveToRelative(0.8f, 0.359f, 0.8f, 0.799f)
                verticalLineToRelative(11.602f)
                curveToRelative(0.0f, 0.44f, -0.357f, 0.8f, -0.8f, 0.8f)
                reflectiveCurveToRelative(-0.8f, -0.36f, -0.8f, -0.8f)
                lineTo(11.2f, 3.994f)
                close()
                moveTo(7.2f, 4.399f)
                curveToRelative(0.0f, -0.44f, 0.359f, -0.8f, 0.799f, -0.8f)
                curveToRelative(0.443f, 0.0f, 0.802f, 0.36f, 0.802f, 0.8f)
                verticalLineToRelative(10.688f)
                curveToRelative(0.0f, 0.442f, -0.36f, 0.801f, -0.802f, 0.801f)
                curveToRelative(-0.44f, 0.0f, -0.799f, -0.359f, -0.799f, -0.801f)
                lineTo(7.2f, 4.399f)
                close()
                moveTo(3.199f, 6.0f)
                curveToRelative(0.0f, -0.442f, 0.36f, -0.8f, 0.802f, -0.8f)
                curveToRelative(0.44f, 0.0f, 0.799f, 0.358f, 0.799f, 0.8f)
                verticalLineToRelative(7.195f)
                curveToRelative(0.0f, 0.441f, -0.359f, 0.8f, -0.799f, 0.8f)
                curveToRelative(-0.443f, 0.0f, -0.802f, -0.36f, -0.802f, -0.8f)
                lineTo(3.199f, 6.0f)
                close()
                moveTo(20.52f, 18.202f)
                curveToRelative(-0.123f, 0.105f, -3.086f, 2.593f, -8.52f, 2.593f)
                curveToRelative(-5.433f, 0.0f, -8.397f, -2.486f, -8.521f, -2.593f)
                curveToRelative(-0.335f, -0.288f, -0.375f, -0.792f, -0.086f, -1.128f)
                curveToRelative(0.285f, -0.334f, 0.79f, -0.375f, 1.125f, -0.09f)
                curveToRelative(0.047f, 0.041f, 2.693f, 2.211f, 7.481f, 2.211f)
                curveToRelative(4.848f, 0.0f, 7.456f, -2.186f, 7.479f, -2.207f)
                curveToRelative(0.334f, -0.289f, 0.839f, -0.25f, 1.128f, 0.086f)
                curveToRelative(0.289f, 0.336f, 0.25f, 0.84f, -0.086f, 1.128f)
                close()
                moveTo(20.801f, 13.195f)
                curveToRelative(0.0f, 0.441f, -0.36f, 0.8f, -0.801f, 0.8f)
                curveToRelative(-0.441f, 0.0f, -0.801f, -0.36f, -0.801f, -0.8f)
                lineTo(19.199f, 6.0f)
                curveToRelative(0.0f, -0.442f, 0.361f, -0.8f, 0.801f, -0.8f)
                curveToRelative(0.441f, 0.0f, 0.801f, 0.357f, 0.801f, 0.8f)
                verticalLineToRelative(7.195f)
                close()
            }
        }
        .build()
        return _intercom!!
    }

private var _intercom: ImageVector? = null
