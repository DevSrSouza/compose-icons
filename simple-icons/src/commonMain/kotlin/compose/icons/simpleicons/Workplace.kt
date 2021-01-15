package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Workplace: ImageVector
    get() {
        if (_workplace != null) {
            return _workplace!!
        }
        _workplace = Builder(name = "Workplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.725f, 0.0f)
                curveTo(11.114f, 0.0f, 9.55f, 0.317f, 8.078f, 0.943f)
                arcToRelative(11.892f, 11.892f, 0.0f, false, false, -3.793f, 2.573f)
                arcTo(11.986f, 11.986f, 0.0f, false, false, 0.79f, 12.0f)
                arcToRelative(11.986f, 11.986f, 0.0f, false, false, 3.496f, 8.484f)
                arcToRelative(11.892f, 11.892f, 0.0f, false, false, 3.793f, 2.573f)
                curveToRelative(1.472f, 0.626f, 3.042f, 0.943f, 4.652f, 0.943f)
                curveToRelative(0.867f, 0.0f, 1.718f, -0.094f, 2.565f, -0.28f)
                verticalLineToRelative(-2.534f)
                arcToRelative(9.524f, 9.524f, 0.0f, false, true, -2.565f, 0.353f)
                arcToRelative(9.406f, 9.406f, 0.0f, false, true, -6.71f, -2.795f)
                arcTo(9.502f, 9.502f, 0.0f, false, true, 3.24f, 12.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 2.778f, -6.744f)
                arcToRelative(9.398f, 9.398f, 0.0f, false, true, 6.707f, -2.795f)
                curveToRelative(4.439f, 0.0f, 8.037f, 3.618f, 8.037f, 8.082f)
                curveToRelative(0.0f, 1.647f, -0.49f, 3.181f, -1.332f, 4.459f)
                lineToRelative(-2.09f, -5.166f)
                curveToRelative(-0.306f, -0.755f, -0.67f, -1.895f, -2.059f, -1.895f)
                curveToRelative(-1.387f, 0.0f, -1.75f, 1.14f, -2.054f, 1.895f)
                lineToRelative(-1.922f, 4.771f)
                lineToRelative(-2.578f, -6.544f)
                horizontalLineToRelative(-2.71f)
                lineToRelative(3.213f, 7.95f)
                curveToRelative(0.326f, 0.807f, 0.68f, 1.897f, 2.077f, 1.897f)
                curveToRelative(1.395f, 0.0f, 1.747f, -1.09f, 2.072f, -1.896f)
                lineToRelative(1.904f, -4.727f)
                lineToRelative(1.914f, 4.727f)
                curveToRelative(0.387f, 0.973f, 0.797f, 1.894f, 2.07f, 1.894f)
                curveToRelative(0.903f, 0.0f, 1.475f, -0.583f, 1.788f, -0.959f)
                arcToRelative(10.54f, 10.54f, 0.0f, false, false, 2.156f, -6.406f)
                curveTo(23.21f, 4.72f, 18.516f, 0.0f, 12.725f, 0.0f)
                close()
            }
        }
        .build()
        return _workplace!!
    }

private var _workplace: ImageVector? = null
