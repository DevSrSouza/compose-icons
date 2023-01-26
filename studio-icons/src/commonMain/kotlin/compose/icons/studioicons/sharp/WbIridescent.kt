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

public val SharpGroup.WbIridescent: ImageVector
    get() {
        if (_wbIridescent != null) {
            return _wbIridescent!!
        }
        _wbIridescent = Builder(name = "WbIridescent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 9.05f)
                lineTo(5.0f, 9.05f)
                lineTo(5.0f, 15.0f)
                close()
                moveTo(11.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(19.04f, 3.6f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.8f, -1.79f)
                lineToRelative(-1.42f, -1.41f)
                close()
                moveTo(13.0f, 23.0f)
                verticalLineToRelative(-2.95f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.45f, 19.09f)
                lineToRelative(-1.8f, -1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(1.42f, -1.42f)
                close()
                moveTo(3.55f, 5.01f)
                lineTo(5.34f, 6.8f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.96f, 3.6f)
                lineTo(3.55f, 5.01f)
                close()
                moveTo(4.96f, 20.5f)
                lineToRelative(1.79f, -1.8f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.42f)
                close()
            }
        }
        .build()
        return _wbIridescent!!
    }

private var _wbIridescent: ImageVector? = null
