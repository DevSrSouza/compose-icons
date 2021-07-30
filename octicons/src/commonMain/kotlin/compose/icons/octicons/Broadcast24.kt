package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Broadcast24: ImageVector
    get() {
        if (_broadcast24 != null) {
            return _broadcast24!!
        }
        _broadcast24 = Builder(name = "Broadcast24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.485f, 2.515f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                arcTo(10.465f, 10.465f, 0.0f, false, true, 22.5f, 11.0f)
                curveToRelative(0.0f, 2.9f, -1.174f, 5.523f, -3.075f, 7.424f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.061f)
                arcTo(11.965f, 11.965f, 0.0f, false, false, 24.0f, 11.0f)
                curveToRelative(0.0f, -3.314f, -1.344f, -6.315f, -3.515f, -8.485f)
                close()
                moveTo(4.575f, 3.575f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                arcTo(11.965f, 11.965f, 0.0f, false, false, 0.0f, 11.0f)
                curveToRelative(0.0f, 3.313f, 1.344f, 6.314f, 3.515f, 8.485f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                arcTo(10.465f, 10.465f, 0.0f, false, true, 1.5f, 11.0f)
                curveToRelative(0.0f, -2.9f, 1.174f, -5.524f, 3.075f, -7.425f)
                close()
                moveTo(8.11f, 7.11f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                arcTo(6.98f, 6.98f, 0.0f, false, false, 5.0f, 11.0f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, false, 2.05f, 4.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.061f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, -1.61f, -3.89f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, 1.61f, -3.888f)
                close()
                moveTo(16.95f, 6.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                arcTo(5.48f, 5.48f, 0.0f, false, true, 17.5f, 11.0f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, -1.61f, 3.889f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                arcTo(6.98f, 6.98f, 0.0f, false, false, 19.0f, 11.0f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, false, -2.05f, -4.949f)
                close()
                moveTo(14.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.25f, 1.855f)
                verticalLineToRelative(8.395f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-8.395f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 14.0f, 11.0f)
                close()
            }
        }
        .build()
        return _broadcast24!!
    }

private var _broadcast24: ImageVector? = null
