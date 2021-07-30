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

public val SimpleIcons.Speakerdeck: ImageVector
    get() {
        if (_speakerdeck != null) {
            return _speakerdeck!!
        }
        _speakerdeck = Builder(name = "Speakerdeck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.025f, 13.875f)
                horizontalLineTo(4.687f)
                arcToRelative(4.688f, 4.688f, 0.0f, false, true, 0.0f, -9.375f)
                horizontalLineToRelative(6.227f)
                arcToRelative(1.875f, 1.875f, 0.0f, false, true, 0.0f, 3.75f)
                horizontalLineTo(4.592f)
                arcToRelative(0.937f, 0.937f, 0.0f, true, false, 0.0f, 1.875f)
                horizontalLineToRelative(5.337f)
                arcToRelative(4.687f, 4.687f, 0.0f, true, true, 0.0f, 9.375f)
                horizontalLineTo(1.875f)
                arcToRelative(1.875f, 1.875f, 0.0f, false, true, 0.0f, -3.75f)
                horizontalLineToRelative(8.15f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, false, 0.0f, -1.875f)
                close()
                moveTo(13.97f, 19.5f)
                arcToRelative(5.635f, 5.635f, 0.0f, false, false, 2.396f, -3.75f)
                horizontalLineToRelative(3.026f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, 0.921f, -0.938f)
                verticalLineTo(9.189f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, -0.921f, -0.938f)
                horizontalLineToRelative(-5.497f)
                curveToRelative(0.438f, -0.498f, 0.704f, -1.155f, 0.704f, -1.875f)
                reflectiveCurveToRelative(-0.266f, -1.377f, -0.704f, -1.875f)
                horizontalLineToRelative(6.418f)
                curveTo(22.35f, 4.5f, 24.0f, 6.179f, 24.0f, 8.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 2.071f, -1.65f, 3.75f, -3.687f, 3.75f)
                horizontalLineTo(13.97f)
                close()
            }
        }
        .build()
        return _speakerdeck!!
    }

private var _speakerdeck: ImageVector? = null
