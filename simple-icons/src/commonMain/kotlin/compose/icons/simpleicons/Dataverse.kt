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

public val SimpleIcons.Dataverse: ImageVector
    get() {
        if (_dataverse != null) {
            return _dataverse!!
        }
        _dataverse = Builder(name = "Dataverse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.327f, 4.568f)
                arcToRelative(3.895f, 3.895f, 0.0f, false, true, 6.671f, 0.82f)
                horizontalLineToRelative(0.001f)
                curveToRelative(1.996f, 4.686f, 0.925f, 10.086f, -2.487f, 13.154f)
                curveToRelative(-3.772f, 3.39f, -8.875f, 3.408f, -12.178f, 0.796f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.05f, -0.072f)
                lineToRelative(1.697f, -2.939f)
                curveToRelative(1.596f, 0.819f, 3.11f, 1.04f, 4.439f, 0.739f)
                curveToRelative(1.472f, -0.333f, 2.734f, -1.304f, 3.64f, -2.872f)
                curveToRelative(1.708f, -2.96f, 1.161f, -6.961f, -1.777f, -9.583f)
                arcToRelative(0.396f, 0.396f, 0.0f, false, false, -0.056f, -0.043f)
                close()
                moveTo(7.673f, 19.432f)
                arcToRelative(3.895f, 3.895f, 0.0f, false, true, -6.661f, -0.798f)
                lineTo(1.01f, 18.634f)
                curveTo(-0.999f, 13.944f, 0.071f, 8.53f, 3.488f, 5.458f)
                curveToRelative(3.772f, -3.391f, 8.876f, -3.408f, 12.18f, -0.795f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, -0.051f, 0.071f)
                lineToRelative(-1.697f, 2.94f)
                curveToRelative(-1.595f, -0.82f, -3.109f, -1.04f, -4.439f, -0.739f)
                curveToRelative(-1.472f, 0.333f, -2.734f, 1.304f, -3.639f, 2.872f)
                curveToRelative(-1.709f, 2.959f, -1.162f, 6.961f, 1.776f, 9.582f)
                curveToRelative(0.018f, 0.016f, 0.036f, 0.03f, 0.055f, 0.043f)
                close()
                moveTo(9.642f, 16.087f)
                arcToRelative(4.72f, 4.72f, 0.0f, false, true, 1.612f, -8.746f)
                curveToRelative(-2.064f, -0.234f, -3.829f, 0.723f, -4.979f, 2.716f)
                curveToRelative(-1.598f, 2.767f, -1.072f, 6.507f, 1.676f, 8.959f)
                lineToRelative(1.691f, -2.929f)
                close()
                moveTo(14.36f, 7.913f)
                horizontalLineToRelative(0.001f)
                arcToRelative(4.72f, 4.72f, 0.0f, false, true, 1.727f, 6.447f)
                arcToRelative(4.712f, 4.712f, 0.0f, false, true, -3.34f, 2.3f)
                curveToRelative(2.064f, 0.233f, 3.828f, -0.724f, 4.979f, -2.716f)
                curveToRelative(1.598f, -2.768f, 1.071f, -6.508f, -1.676f, -8.96f)
                lineTo(14.36f, 7.913f)
                close()
                moveTo(9.892f, 15.654f)
                arcToRelative(4.219f, 4.219f, 0.0f, false, true, 4.217f, -7.308f)
                horizontalLineToRelative(0.002f)
                arcToRelative(4.22f, 4.22f, 0.0f, false, true, -4.188f, 7.326f)
                lineToRelative(-0.031f, -0.018f)
                close()
            }
        }
        .build()
        return _dataverse!!
    }

private var _dataverse: ImageVector? = null
