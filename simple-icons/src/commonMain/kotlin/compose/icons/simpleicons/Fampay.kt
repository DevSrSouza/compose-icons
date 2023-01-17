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

public val SimpleIcons.Fampay: ImageVector
    get() {
        if (_fampay != null) {
            return _fampay!!
        }
        _fampay = Builder(name = "Fampay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 23.971f)
                arcToRelative(0.206f, 0.206f, 0.0f, false, true, -0.233f, -0.016f)
                curveToRelative(-0.646f, -0.407f, -3.892f, -2.571f, -6.089f, -5.288f)
                curveToRelative(-1.34f, -1.677f, 3.783f, -4.173f, 3.783f, -3.844f)
                curveToRelative(0.005f, 1.782f, 0.5f, 6.467f, 2.603f, 8.747f)
                arcToRelative(0.268f, 0.268f, 0.0f, false, true, -0.013f, 0.356f)
                lineToRelative(-0.051f, 0.035f)
                moveTo(13.48f, 13.082f)
                lineToRelative(4.659f, -2.119f)
                arcToRelative(4.386f, 4.386f, 0.0f, false, false, 2.542f, -2.636f)
                lineToRelative(0.581f, -1.634f)
                arcToRelative(0.174f, 0.174f, 0.0f, false, false, -0.11f, -0.222f)
                arcToRelative(0.171f, 0.171f, 0.0f, false, false, -0.125f, 0.0f)
                lineToRelative(-8.897f, 3.771f)
                lineToRelative(0.033f, -0.142f)
                arcToRelative(0.902f, 0.902f, 0.0f, false, true, 0.439f, -0.626f)
                curveToRelative(1.505f, -0.927f, 6.903f, -3.686f, 6.903f, -3.686f)
                arcToRelative(6.592f, 6.592f, 0.0f, false, false, 3.53f, -4.112f)
                lineTo(23.444f, 0.28f)
                arcToRelative(0.225f, 0.225f, 0.0f, false, false, -0.153f, -0.268f)
                arcToRelative(0.222f, 0.222f, 0.0f, false, false, -0.144f, 0.0f)
                reflectiveCurveToRelative(-8.123f, 3.156f, -10.734f, 4.425f)
                curveTo(9.8f, 5.707f, 7.126f, 7.34f, 6.2f, 12.142f)
                curveToRelative(-0.376f, 1.945f, 0.313f, 3.592f, 1.607f, 5.46f)
                curveToRelative(-0.006f, -1.836f, 4.637f, -4.02f, 5.673f, -4.52f)
                close()
                moveTo(2.026f, 4.86f)
                curveTo(1.289f, 4.299f, 0.662f, 4.25f, 0.553f, 4.299f)
                curveToRelative(-0.049f, -0.174f, 0.846f, -0.597f, 0.956f, -0.707f)
                curveToRelative(0.362f, -0.346f, 0.565f, -0.804f, 0.988f, -1.098f)
                curveToRelative(0.863f, -0.611f, 1.93f, -0.424f, 2.824f, 0.064f)
                curveToRelative(0.455f, 0.25f, 1.709f, 1.071f, 1.728f, 1.112f)
                arcTo(14.02f, 14.02f, 0.0f, false, true, 8.945f, 5.38f)
                arcToRelative(0.241f, 0.241f, 0.0f, false, true, 0.0f, 0.314f)
                curveToRelative(-0.211f, 0.203f, -0.418f, 0.348f, -0.675f, 0.565f)
                curveToRelative(-1.703f, 1.43f, -2.73f, 5.24f, -2.746f, 5.711f)
                verticalLineTo(12.0f)
                reflectiveCurveToRelative(-0.999f, -5.38f, -3.498f, -7.14f)
                close()
            }
        }
        .build()
        return _fampay!!
    }

private var _fampay: ImageVector? = null
