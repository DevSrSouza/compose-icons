package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.MissedVideoCall: ImageVector
    get() {
        if (_missedVideoCall != null) {
            return _missedVideoCall!!
        }
        _missedVideoCall = Builder(name = "MissedVideoCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-4.5f)
                lineToRelative(4.0f, 4.0f)
                verticalLineToRelative(-11.0f)
                lineToRelative(-4.0f, 4.0f)
                close()
                moveTo(10.0f, 15.0f)
                lineToRelative(-3.89f, -3.89f)
                verticalLineToRelative(2.55f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.22f)
                horizontalLineToRelative(4.44f)
                verticalLineToRelative(1.11f)
                horizontalLineTo(6.89f)
                lineToRelative(3.11f, 3.1f)
                lineToRelative(4.22f, -4.22f)
                lineToRelative(0.78f, 0.79f)
                lineToRelative(-5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _missedVideoCall!!
    }

private var _missedVideoCall: ImageVector? = null
