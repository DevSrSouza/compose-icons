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

public val SimpleIcons.Rtm: ImageVector
    get() {
        if (_rtm != null) {
            return _rtm!!
        }
        _rtm = Builder(name = "Rtm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.584f, 9.054f)
                lineTo(1.98f, 9.054f)
                lineToRelative(-0.487f, 1.413f)
                horizontalLineToRelative(3.408f)
                curveToRelative(0.54f, 0.0f, 0.594f, 0.25f, 0.51f, 0.494f)
                curveToRelative(-0.084f, 0.244f, -0.18f, 0.323f, -0.719f, 0.323f)
                horizontalLineToRelative(-3.43f)
                lineTo(0.0f, 14.946f)
                horizontalLineToRelative(1.917f)
                lineToRelative(0.892f, -2.454f)
                curveToRelative(0.263f, 0.0f, 0.33f, 0.024f, 0.436f, 0.257f)
                lineToRelative(1.043f, 2.197f)
                horizontalLineToRelative(2.084f)
                lineToRelative(-1.148f, -2.46f)
                curveToRelative(1.368f, -0.15f, 1.985f, -0.822f, 2.206f, -1.698f)
                curveToRelative(0.211f, -0.837f, -0.173f, -1.734f, -1.846f, -1.734f)
                moveToRelative(2.817f, 0.0f)
                lineToRelative(-0.487f, 1.413f)
                lineTo(10.0f, 10.467f)
                lineToRelative(-1.541f, 4.48f)
                lineToRelative(2.036f, -0.001f)
                lineToRelative(1.54f, -4.479f)
                horizontalLineToRelative(1.94f)
                lineToRelative(0.486f, -1.413f)
                lineTo(8.4f, 9.054f)
                close()
                moveTo(16.291f, 9.054f)
                horizontalLineToRelative(-1.306f)
                lineToRelative(-0.485f, 1.414f)
                horizontalLineToRelative(0.624f)
                curveToRelative(0.272f, 0.0f, 0.416f, 0.22f, 0.322f, 0.493f)
                lineToRelative(-1.368f, 3.985f)
                horizontalLineToRelative(2.036f)
                lineToRelative(1.37f, -3.988f)
                curveToRelative(0.37f, -1.08f, 0.053f, -1.905f, -1.194f, -1.904f)
                moveToRelative(3.186f, 0.0f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-0.486f, 1.414f)
                horizontalLineToRelative(0.48f)
                curveToRelative(0.271f, 0.0f, 0.415f, 0.22f, 0.322f, 0.493f)
                lineToRelative(-1.368f, 3.985f)
                lineTo(19.3f, 14.946f)
                lineToRelative(1.37f, -3.988f)
                curveToRelative(0.37f, -1.08f, 0.053f, -1.904f, -1.194f, -1.904f)
                moveToRelative(3.185f, 0.0f)
                horizontalLineToRelative(-1.16f)
                lineToRelative(-0.485f, 1.414f)
                horizontalLineToRelative(0.479f)
                curveToRelative(0.272f, 0.0f, 0.416f, 0.22f, 0.323f, 0.493f)
                lineToRelative(-1.369f, 3.985f)
                horizontalLineToRelative(2.036f)
                lineToRelative(1.37f, -3.988f)
                curveToRelative(0.37f, -1.08f, 0.054f, -1.904f, -1.194f, -1.904f)
            }
        }
        .build()
        return _rtm!!
    }

private var _rtm: ImageVector? = null
