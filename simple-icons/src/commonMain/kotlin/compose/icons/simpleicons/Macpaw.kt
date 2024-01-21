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

public val SimpleIcons.Macpaw: ImageVector
    get() {
        if (_macpaw != null) {
            return _macpaw!!
        }
        _macpaw = Builder(name = "Macpaw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.622f, 0.21f)
                curveToRelative(0.235f, -0.126f, 1.12f, -0.432f, 1.38f, 0.06f)
                curveToRelative(0.26f, 0.492f, -0.483f, 1.061f, -0.736f, 1.196f)
                curveToRelative(-0.252f, 0.136f, -0.664f, 0.122f, -0.898f, -0.321f)
                arcTo(0.675f, 0.675f, 0.0f, false, true, 9.622f, 0.21f)
                close()
                moveTo(12.256f, 5.032f)
                curveToRelative(0.236f, -0.126f, 1.12f, -0.431f, 1.38f, 0.06f)
                curveToRelative(0.26f, 0.492f, -0.482f, 1.061f, -0.735f, 1.196f)
                curveToRelative(-0.253f, 0.136f, -0.664f, 0.123f, -0.899f, -0.32f)
                arcToRelative(0.675f, 0.675f, 0.0f, false, true, 0.254f, -0.936f)
                close()
                moveTo(12.0f, 24.0f)
                arcToRelative(11.403f, 11.403f, 0.0f, false, true, -8.08f, -3.345f)
                arcToRelative(11.38f, 11.38f, 0.0f, false, true, -3.35f, -8.077f)
                arcToRelative(11.378f, 11.378f, 0.0f, false, true, 3.35f, -8.077f)
                arcToRelative(11.392f, 11.392f, 0.0f, false, true, 3.632f, -2.446f)
                arcToRelative(2.835f, 2.835f, 0.0f, false, true, 3.719f, 1.508f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, true, -1.508f, 3.716f)
                curveToRelative(-0.684f, 0.289f, -1.3f, 0.704f, -1.83f, 1.233f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, false, -1.684f, 4.067f)
                arcToRelative(5.705f, 5.705f, 0.0f, false, false, 1.684f, 4.065f)
                arcTo(5.727f, 5.727f, 0.0f, false, false, 12.0f, 18.327f)
                arcToRelative(5.727f, 5.727f, 0.0f, false, false, 4.068f, -1.683f)
                arcToRelative(5.712f, 5.712f, 0.0f, false, false, 1.685f, -4.065f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, true, 2.838f, -2.837f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, true, 2.838f, 2.836f)
                arcToRelative(11.34f, 11.34f, 0.0f, false, true, -0.9f, 4.447f)
                arcToRelative(11.367f, 11.367f, 0.0f, false, true, -2.447f, 3.63f)
                arcTo(11.422f, 11.422f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.426f, 2.889f)
                curveToRelative(0.263f, -0.14f, 1.346f, -0.533f, 1.635f, 0.016f)
                curveToRelative(0.29f, 0.549f, -0.633f, 1.235f, -0.915f, 1.386f)
                curveToRelative(-0.282f, 0.15f, -0.742f, 0.136f, -1.003f, -0.359f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, 0.283f, -1.043f)
                close()
                moveTo(11.422f, 1.083f)
                curveToRelative(0.263f, -0.14f, 1.32f, -0.518f, 1.61f, 0.03f)
                curveToRelative(0.29f, 0.55f, -0.608f, 1.221f, -0.89f, 1.372f)
                curveToRelative(-0.282f, 0.151f, -0.741f, 0.136f, -1.003f, -0.358f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, 0.283f, -1.044f)
                close()
            }
        }
        .build()
        return _macpaw!!
    }

private var _macpaw: ImageVector? = null
