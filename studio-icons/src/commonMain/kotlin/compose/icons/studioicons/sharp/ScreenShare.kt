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

public val SharpGroup.ScreenShare: ImageVector
    get() {
        if (_screenShare != null) {
            return _screenShare!!
        }
        _screenShare = Builder(name = "ScreenShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                lineToRelative(2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(13.0f, 14.47f)
                verticalLineToRelative(-2.19f)
                curveToRelative(-2.78f, 0.0f, -4.61f, 0.85f, -6.0f, 2.72f)
                curveToRelative(0.56f, -2.67f, 2.11f, -5.33f, 6.0f, -5.87f)
                lineTo(13.0f, 7.0f)
                lineToRelative(4.0f, 3.73f)
                lineToRelative(-4.0f, 3.74f)
                close()
            }
        }
        .build()
        return _screenShare!!
    }

private var _screenShare: ImageVector? = null