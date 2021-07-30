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

public val SimpleIcons.Jira: ImageVector
    get() {
        if (_jira != null) {
            return _jira!!
        }
        _jira = Builder(name = "Jira", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.571f, 11.513f)
                lineTo(0.0f, 11.513f)
                arcToRelative(5.218f, 5.218f, 0.0f, false, false, 5.232f, 5.215f)
                horizontalLineToRelative(2.13f)
                verticalLineToRelative(2.057f)
                arcTo(5.215f, 5.215f, 0.0f, false, false, 12.575f, 24.0f)
                lineTo(12.575f, 12.518f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, false, -1.005f, -1.005f)
                close()
                moveTo(17.294f, 5.757f)
                lineTo(5.736f, 5.757f)
                arcToRelative(5.215f, 5.215f, 0.0f, false, false, 5.215f, 5.214f)
                horizontalLineToRelative(2.129f)
                verticalLineToRelative(2.058f)
                arcToRelative(5.218f, 5.218f, 0.0f, false, false, 5.215f, 5.214f)
                lineTo(18.295f, 6.758f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -1.001f, -1.001f)
                close()
                moveTo(23.013f, 0.0f)
                lineTo(11.455f, 0.0f)
                arcToRelative(5.215f, 5.215f, 0.0f, false, false, 5.215f, 5.215f)
                horizontalLineToRelative(2.129f)
                verticalLineToRelative(2.057f)
                arcTo(5.215f, 5.215f, 0.0f, false, false, 24.0f, 12.483f)
                lineTo(24.0f, 1.005f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 23.013f, 0.0f)
                close()
            }
        }
        .build()
        return _jira!!
    }

private var _jira: ImageVector? = null
