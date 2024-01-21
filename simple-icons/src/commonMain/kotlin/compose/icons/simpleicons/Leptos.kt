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

public val SimpleIcons.Leptos: ImageVector
    get() {
        if (_leptos != null) {
            return _leptos!!
        }
        _leptos = Builder(name = "Leptos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.097f, 17.876f)
                arcTo(6.207f, 6.207f, 0.0f, false, true, 5.834f, 12.0f)
                curveToRelative(0.0f, -3.393f, 2.773f, -6.166f, 6.166f, -6.166f)
                curveToRelative(0.248f, 0.0f, 0.517f, 0.021f, 0.766f, 0.042f)
                arcToRelative(9.896f, 9.896f, 0.0f, false, true, 1.49f, -2.504f)
                arcToRelative(3.575f, 3.575f, 0.0f, false, true, -0.85f, -2.296f)
                curveToRelative(0.0f, -0.331f, 0.042f, -0.662f, 0.146f, -0.993f)
                arcTo(19.487f, 19.487f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(5.38f, 0.0f, 0.0f, 5.38f, 0.0f, 12.0f)
                curveToRelative(0.0f, 4.366f, 2.338f, 8.172f, 5.814f, 10.283f)
                lineToRelative(0.124f, -0.062f)
                arcToRelative(8.434f, 8.434f, 0.0f, false, false, 4.159f, -4.345f)
                close()
                moveTo(16.945f, 2.897f)
                curveToRelative(0.662f, 0.0f, 1.262f, -0.352f, 1.593f, -0.952f)
                verticalLineToRelative(-0.02f)
                arcToRelative(12.32f, 12.32f, 0.0f, false, false, -3.269f, -1.49f)
                verticalLineToRelative(0.02f)
                arcToRelative(1.851f, 1.851f, 0.0f, false, false, -0.124f, 0.642f)
                curveToRelative(0.0f, 0.993f, 0.807f, 1.8f, 1.8f, 1.8f)
                close()
                moveTo(19.924f, 3.0f)
                curveToRelative(-0.662f, 1.014f, -1.758f, 1.634f, -2.98f, 1.634f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, true, -0.806f, -0.103f)
                arcToRelative(3.153f, 3.153f, 0.0f, false, true, -0.476f, -0.145f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -1.22f, 1.945f)
                curveToRelative(2.275f, 0.993f, 3.724f, 3.186f, 3.724f, 5.669f)
                curveToRelative(0.0f, 3.393f, -2.773f, 6.166f, -6.166f, 6.166f)
                horizontalLineToRelative(-0.145f)
                arcToRelative(10.374f, 10.374f, 0.0f, false, true, -4.117f, 5.048f)
                curveTo(9.062f, 23.71f, 10.51f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.62f, 0.0f, 12.0f, -5.38f, 12.0f, -12.0f)
                curveToRelative(0.0f, -3.58f, -1.572f, -6.807f, -4.076f, -9.0f)
                close()
                moveTo(11.076f, 7.67f)
                arcToRelative(4.428f, 4.428f, 0.0f, true, false, 1.849f, 8.661f)
                arcToRelative(4.428f, 4.428f, 0.0f, true, false, -1.85f, -8.66f)
                close()
            }
        }
        .build()
        return _leptos!!
    }

private var _leptos: ImageVector? = null
