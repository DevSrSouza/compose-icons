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

public val SimpleIcons.Internetexplorer: ImageVector
    get() {
        if (_internetexplorer != null) {
            return _internetexplorer!!
        }
        _internetexplorer = Builder(name = "Internetexplorer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8f, 7.381f)
                curveToRelative(1.125f, -2.7f, 1.2f, -4.95f, -0.15f, -6.3f)
                curveToRelative(-1.5f, -1.499f, -5.1f, -1.05f, -8.924f, 0.75f)
                horizontalLineToRelative(-0.45f)
                curveToRelative(-2.7f, 0.0f, -5.324f, 0.976f, -7.274f, 2.7f)
                curveToRelative(-1.65f, 1.5f, -2.85f, 3.45f, -3.375f, 5.625f)
                curveToRelative(0.375f, -0.45f, 2.475f, -2.925f, 4.875f, -4.275f)
                curveToRelative(0.075f, 0.0f, 0.675f, -0.375f, 0.675f, -0.375f)
                curveToRelative(-0.075f, 0.0f, -1.2f, 1.125f, -1.425f, 1.35f)
                curveToRelative(-5.25f, 5.4f, -8.324f, 13.574f, -5.924f, 15.973f)
                curveToRelative(1.574f, 1.575f, 4.424f, 1.2f, 7.724f, -0.6f)
                curveToRelative(1.425f, 0.675f, 3.0f, 0.975f, 4.724f, 0.975f)
                curveToRelative(2.25f, 0.0f, 4.35f, -0.6f, 6.15f, -1.8f)
                curveToRelative(1.874f, -1.2f, 3.224f, -3.074f, 4.05f, -5.249f)
                horizontalLineToRelative(-5.85f)
                curveToRelative(-0.75f, 1.425f, -2.475f, 2.4f, -4.275f, 2.4f)
                curveToRelative(-2.55f, 0.0f, -4.65f, -2.1f, -4.724f, -4.5f)
                lineTo(8.627f, 13.83f)
                horizontalLineToRelative(15.298f)
                verticalLineToRelative(-0.225f)
                curveToRelative(0.0f, -0.375f, 0.075f, -0.825f, 0.075f, -1.124f)
                curveToRelative(0.0f, -1.8f, -0.45f, -3.525f, -1.2f, -5.1f)
                close()
                moveTo(2.477f, 22.38f)
                curveToRelative(-1.2f, -1.2f, -0.824f, -3.524f, 0.6f, -6.299f)
                curveToRelative(0.675f, 1.875f, 1.8f, 3.525f, 3.225f, 4.725f)
                curveToRelative(0.45f, 0.375f, 0.975f, 0.75f, 1.5f, 1.05f)
                curveToRelative(-2.4f, 1.274f, -4.35f, 1.5f, -5.325f, 0.524f)
                close()
                moveTo(17.851f, 10.982f)
                lineTo(8.702f, 10.982f)
                verticalLineToRelative(-0.075f)
                curveToRelative(0.15f, -2.325f, 2.324f, -4.35f, 4.874f, -4.35f)
                curveToRelative(2.4f, 0.0f, 4.35f, 1.875f, 4.5f, 4.35f)
                verticalLineToRelative(0.075f)
                close()
                moveTo(22.425f, 6.782f)
                curveToRelative(-0.45f, -0.75f, -1.05f, -1.5f, -1.725f, -2.1f)
                arcToRelative(11.213f, 11.213f, 0.0f, false, false, -3.6f, -2.25f)
                curveToRelative(2.4f, -1.124f, 4.425f, -1.274f, 5.475f, -0.224f)
                curveToRelative(0.825f, 0.975f, 0.75f, 2.624f, -0.15f, 4.574f)
                curveToRelative(0.0f, 0.075f, 0.0f, 0.075f, 0.0f, 0.0f)
                curveToRelative(0.0f, 0.075f, 0.0f, 0.075f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _internetexplorer!!
    }

private var _internetexplorer: ImageVector? = null
