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

public val SimpleIcons.Jsonwebtokens: ImageVector
    get() {
        if (_jsonwebtokens != null) {
            return _jsonwebtokens!!
        }
        _jsonwebtokens = Builder(name = "Jsonwebtokens", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2f, 0.0f)
                verticalLineToRelative(6.456f)
                lineTo(12.0f, 8.928f)
                lineToRelative(1.8f, -2.472f)
                lineTo(13.8f, 0.0f)
                close()
                moveTo(13.8f, 6.456f)
                verticalLineToRelative(3.072f)
                lineToRelative(2.904f, -0.96f)
                lineTo(20.52f, 3.36f)
                lineToRelative(-2.928f, -2.136f)
                close()
                moveTo(16.704f, 8.568f)
                lineToRelative(-1.8f, 2.496f)
                lineToRelative(2.928f, 0.936f)
                lineToRelative(6.144f, -1.992f)
                lineToRelative(-1.128f, -3.432f)
                close()
                moveTo(17.832f, 12.0f)
                lineToRelative(-2.928f, 0.936f)
                lineToRelative(1.8f, 2.496f)
                lineToRelative(6.144f, 1.992f)
                lineToRelative(1.128f, -3.432f)
                close()
                moveTo(16.704f, 15.432f)
                lineToRelative(-2.904f, -0.96f)
                verticalLineToRelative(3.072f)
                lineToRelative(3.792f, 5.232f)
                lineToRelative(2.928f, -2.136f)
                close()
                moveTo(13.8f, 17.544f)
                lineTo(12.0f, 15.072f)
                lineToRelative(-1.8f, 2.472f)
                lineTo(10.2f, 24.0f)
                horizontalLineToRelative(3.6f)
                close()
                moveTo(10.2f, 17.544f)
                verticalLineToRelative(-3.072f)
                lineToRelative(-2.904f, 0.96f)
                lineTo(3.48f, 20.64f)
                lineToRelative(2.928f, 2.136f)
                close()
                moveTo(7.296f, 15.432f)
                lineToRelative(1.8f, -2.496f)
                lineTo(6.168f, 12.0f)
                lineTo(0.024f, 13.992f)
                lineToRelative(1.128f, 3.432f)
                close()
                moveTo(6.168f, 12.0f)
                lineToRelative(2.928f, -0.936f)
                lineToRelative(-1.8f, -2.496f)
                lineToRelative(-6.144f, -1.992f)
                lineToRelative(-1.128f, 3.432f)
                close()
                moveTo(7.296f, 8.568f)
                lineToRelative(2.904f, 0.96f)
                lineTo(10.2f, 6.456f)
                lineTo(6.408f, 1.224f)
                lineTo(3.48f, 3.36f)
                close()
            }
        }
        .build()
        return _jsonwebtokens!!
    }

private var _jsonwebtokens: ImageVector? = null
