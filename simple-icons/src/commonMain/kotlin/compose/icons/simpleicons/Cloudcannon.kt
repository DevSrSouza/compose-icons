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

public val SimpleIcons.Cloudcannon: ImageVector
    get() {
        if (_cloudcannon != null) {
            return _cloudcannon!!
        }
        _cloudcannon = Builder(name = "Cloudcannon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.686f, 7.602f)
                curveToRelative(0.321f, -1.964f, -1.203f, -3.778f, -3.21f, -3.778f)
                curveToRelative(-0.91f, 0.0f, -1.733f, 0.376f, -2.325f, 0.977f)
                arcToRelative(1.132f, 1.132f, 0.0f, false, false, -1.061f, -0.744f)
                curveToRelative(-0.63f, 0.0f, -1.141f, 0.51f, -1.141f, 1.14f)
                reflectiveCurveToRelative(0.429f, 0.909f, 1.34f, 1.335f)
                arcToRelative(5.884f, 5.884f, 0.0f, false, true, 0.813f, 0.46f)
                curveToRelative(0.275f, 0.184f, 0.534f, 0.388f, 0.776f, 0.612f)
                arcTo(6.02f, 6.02f, 0.0f, false, true, 17.796f, 12.0f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, -2.694f, 5.008f)
                arcToRelative(6.16f, 6.16f, 0.0f, false, true, -0.813f, 0.46f)
                curveToRelative(-0.911f, 0.427f, -1.34f, 0.704f, -1.34f, 1.335f)
                curveToRelative(0.0f, 0.63f, 0.51f, 1.141f, 1.14f, 1.141f)
                curveToRelative(0.492f, 0.0f, 0.9f, -0.312f, 1.062f, -0.744f)
                curveToRelative(0.592f, 0.6f, 1.414f, 0.976f, 2.325f, 0.976f)
                curveToRelative(2.025f, 0.0f, 3.527f, -1.81f, 3.21f, -3.778f)
                curveTo(22.61f, 15.842f, 24.0f, 14.026f, 24.0f, 12.001f)
                curveToRelative(0.0f, -2.038f, -1.382f, -3.837f, -3.314f, -4.399f)
                close()
                moveTo(9.711f, 17.468f)
                arcToRelative(6.193f, 6.193f, 0.0f, false, true, -1.589f, -1.073f)
                arcTo(6.02f, 6.02f, 0.0f, false, true, 6.204f, 12.0f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, 1.918f, -4.395f)
                arcToRelative(6.22f, 6.22f, 0.0f, false, true, 1.589f, -1.072f)
                curveToRelative(0.91f, -0.427f, 1.34f, -0.704f, 1.34f, -1.335f)
                reflectiveCurveToRelative(-0.51f, -1.141f, -1.14f, -1.141f)
                curveToRelative(-0.492f, 0.0f, -0.9f, 0.312f, -1.062f, 0.744f)
                arcToRelative(3.257f, 3.257f, 0.0f, false, false, -2.325f, -0.976f)
                curveToRelative(-2.003f, 0.0f, -3.536f, 1.807f, -3.21f, 3.778f)
                curveTo(1.381f, 8.164f, 0.0f, 9.962f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.028f, 1.38f, 3.836f, 3.314f, 4.397f)
                curveToRelative(-0.323f, 1.954f, 1.198f, 3.778f, 3.21f, 3.778f)
                curveToRelative(0.91f, 0.0f, 1.733f, -0.375f, 2.325f, -0.976f)
                curveToRelative(0.162f, 0.432f, 0.57f, 0.744f, 1.061f, 0.744f)
                curveToRelative(0.63f, 0.0f, 1.141f, -0.51f, 1.141f, -1.14f)
                curveToRelative(0.0f, -0.631f, -0.429f, -0.909f, -1.34f, -1.335f)
                close()
                moveTo(12.0f, 8.443f)
                arcToRelative(3.557f, 3.557f, 0.0f, true, true, 0.0f, 7.114f)
                arcToRelative(3.557f, 3.557f, 0.0f, false, true, 0.0f, -7.114f)
                close()
            }
        }
        .build()
        return _cloudcannon!!
    }

private var _cloudcannon: ImageVector? = null
