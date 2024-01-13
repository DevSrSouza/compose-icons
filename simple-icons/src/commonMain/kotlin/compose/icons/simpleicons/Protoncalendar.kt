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

public val SimpleIcons.Protoncalendar: ImageVector
    get() {
        if (_protoncalendar != null) {
            return _protoncalendar!!
        }
        _protoncalendar = Builder(name = "Protoncalendar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.172f, 14.818f)
                lineTo(15.172f, 21.85f)
                horizontalLineToRelative(-4.276f)
                verticalLineToRelative(-1.147f)
                curveToRelative(0.0f, -0.584f, 0.21f, -1.151f, 0.592f, -1.596f)
                lineToRelative(3.684f, -4.288f)
                close()
                moveTo(10.242f, 20.702f)
                curveToRelative(0.0f, -0.741f, 0.266f, -1.46f, 0.75f, -2.022f)
                lineToRelative(4.673f, -5.32f)
                curveToRelative(0.522f, -0.591f, 1.524f, -0.92f, 2.262f, -0.92f)
                horizontalLineToRelative(0.967f)
                lineTo(18.894f, 7.007f)
                arcToRelative(1.919f, 1.919f, 0.0f, false, false, -1.928f, -1.914f)
                lineTo(0.0f, 5.093f)
                verticalLineToRelative(14.295f)
                curveToRelative(0.0f, 1.36f, 1.11f, 2.462f, 2.482f, 2.462f)
                horizontalLineToRelative(7.76f)
                verticalLineToRelative(-1.147f)
                close()
                moveTo(18.8f, 5.197f)
                curveToRelative(0.483f, 0.485f, 0.749f, 1.128f, 0.747f, 1.81f)
                verticalLineToRelative(5.434f)
                lineTo(24.0f, 12.441f)
                lineTo(24.0f, 4.613f)
                curveToRelative(0.0f, -1.36f, -1.11f, -2.462f, -2.482f, -2.462f)
                lineTo(2.482f, 2.151f)
                arcTo(2.473f, 2.473f, 0.0f, false, false, 0.006f, 4.438f)
                horizontalLineToRelative(16.96f)
                curveToRelative(0.694f, 0.0f, 1.345f, 0.27f, 1.834f, 0.76f)
                close()
                moveTo(19.14f, 19.939f)
                curveToRelative(0.817f, 0.0f, 1.45f, -0.451f, 1.45f, -1.136f)
                arcToRelative(0.953f, 0.953f, 0.0f, false, false, -0.79f, -0.971f)
                verticalLineToRelative(-0.013f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, false, 0.485f, -0.346f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, false, 0.185f, -0.565f)
                curveToRelative(0.0f, -0.632f, -0.549f, -1.081f, -1.343f, -1.081f)
                curveToRelative(-0.99f, 0.0f, -1.384f, 0.712f, -1.415f, 1.21f)
                horizontalLineToRelative(0.843f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.577f, -0.495f)
                curveToRelative(0.318f, 0.0f, 0.549f, 0.196f, 0.549f, 0.48f)
                curveToRelative(0.0f, 0.283f, -0.213f, 0.473f, -0.732f, 0.473f)
                horizontalLineToRelative(-0.3f)
                verticalLineToRelative(0.713f)
                horizontalLineToRelative(0.346f)
                curveToRelative(0.536f, 0.0f, 0.807f, 0.176f, 0.807f, 0.492f)
                reflectiveCurveToRelative(-0.26f, 0.532f, -0.655f, 0.532f)
                arcToRelative(0.673f, 0.673f, 0.0f, false, true, -0.686f, -0.51f)
                horizontalLineToRelative(-0.873f)
                curveToRelative(0.063f, 0.733f, 0.683f, 1.222f, 1.551f, 1.217f)
                close()
                moveTo(21.14f, 16.549f)
                verticalLineToRelative(0.806f)
                lineToRelative(0.79f, -0.532f)
                verticalLineToRelative(3.06f)
                horizontalLineToRelative(0.82f)
                verticalLineToRelative(-3.988f)
                horizontalLineToRelative(-0.635f)
                lineToRelative(-0.974f, 0.655f)
                close()
            }
        }
        .build()
        return _protoncalendar!!
    }

private var _protoncalendar: ImageVector? = null
