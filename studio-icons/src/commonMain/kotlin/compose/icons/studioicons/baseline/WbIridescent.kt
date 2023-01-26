package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.WbIridescent: ImageVector
    get() {
        if (_wbIridescent != null) {
            return _wbIridescent!!
        }
        _wbIridescent = Builder(name = "WbIridescent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 14.5f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-6.0f)
                lineTo(5.0f, 8.5f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 0.55f)
                lineTo(11.0f, 3.5f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 0.55f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(19.04f, 3.05f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.8f, -1.79f)
                lineToRelative(-1.42f, -1.41f)
                close()
                moveTo(13.0f, 22.45f)
                lineTo(13.0f, 19.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.95f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.45f, 18.54f)
                lineToRelative(-1.8f, -1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(1.42f, -1.42f)
                close()
                moveTo(3.55f, 4.46f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(4.96f, 19.95f)
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
