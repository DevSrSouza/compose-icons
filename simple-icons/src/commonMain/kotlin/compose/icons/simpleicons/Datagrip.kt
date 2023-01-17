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

public val SimpleIcons.Datagrip: ImageVector
    get() {
        if (_datagrip != null) {
            return _datagrip!!
        }
        _datagrip = Builder(name = "Datagrip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(17.1797f, 2.9477f)
                arcToRelative(5.452f, 5.452f, 0.0f, false, true, 3.9047f, 1.364f)
                lineTo(19.7078f, 5.972f)
                arcToRelative(3.672f, 3.672f, 0.0f, false, false, -2.596f, -1.0086f)
                curveToRelative(-1.6f, 0.0f, -2.8555f, 1.408f, -2.8555f, 3.096f)
                verticalLineToRelative(0.0282f)
                curveToRelative(0.0f, 1.816f, 1.2517f, 3.1523f, 3.0117f, 3.1523f)
                arcToRelative(3.492f, 3.492f, 0.0f, false, false, 2.064f, -0.5921f)
                lineTo(19.332f, 9.2234f)
                horizontalLineToRelative(-2.2f)
                lineTo(17.132f, 7.336f)
                horizontalLineToRelative(4.3157f)
                verticalLineToRelative(4.3157f)
                arcToRelative(6.436f, 6.436f, 0.0f, false, true, -4.2438f, 1.5757f)
                curveToRelative(-3.096f, 0.0f, -5.2242f, -2.1797f, -5.2242f, -5.1117f)
                verticalLineToRelative(-0.0281f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 5.2f, -5.1398f)
                close()
                moveTo(2.4359f, 3.1195f)
                horizontalLineToRelative(3.8758f)
                curveToRelative(3.12f, 0.0f, 5.2805f, 2.1439f, 5.2805f, 4.9399f)
                verticalLineToRelative(0.028f)
                curveToRelative(0.0f, 2.8f, -2.1605f, 4.968f, -5.2805f, 4.968f)
                lineTo(2.436f, 13.0554f)
                close()
                moveTo(6.5109f, 5.0883f)
                arcToRelative(2.852f, 2.852f, 0.0f, false, false, -0.1992f, 0.003f)
                lineTo(4.6203f, 5.0913f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.6914f)
                arcTo(2.832f, 2.832f, 0.0f, false, false, 9.304f, 8.1235f)
                verticalLineToRelative(-0.036f)
                arcToRelative(2.852f, 2.852f, 0.0f, false, false, -2.793f, -2.9991f)
                close()
                moveTo(2.2079f, 19.4953f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _datagrip!!
    }

private var _datagrip: ImageVector? = null
