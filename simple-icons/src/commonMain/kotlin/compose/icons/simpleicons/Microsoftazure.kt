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

public val SimpleIcons.Microsoftazure: ImageVector
    get() {
        if (_microsoftazure != null) {
            return _microsoftazure!!
        }
        _microsoftazure = Builder(name = "Microsoftazure", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.379f, 23.343f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, false, 1.536f, -2.14f)
                verticalLineToRelative(0.002f)
                lineTo(17.35f, 1.76f)
                arcTo(1.62f, 1.62f, 0.0f, false, false, 15.816f, 0.657f)
                horizontalLineTo(8.184f)
                arcTo(1.62f, 1.62f, 0.0f, false, false, 6.65f, 1.76f)
                lineTo(0.086f, 21.204f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, false, 1.536f, 2.139f)
                horizontalLineToRelative(4.741f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, false, 1.535f, -1.103f)
                lineToRelative(0.977f, -2.892f)
                lineToRelative(4.947f, 3.675f)
                curveToRelative(0.28f, 0.208f, 0.618f, 0.32f, 0.966f, 0.32f)
                moveToRelative(-3.084f, -12.531f)
                lineToRelative(3.624f, 10.739f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.51f, 0.713f)
                verticalLineToRelative(-0.001f)
                horizontalLineToRelative(-0.03f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.322f, -0.106f)
                lineToRelative(-9.287f, -6.9f)
                horizontalLineToRelative(4.853f)
                moveToRelative(6.313f, 7.006f)
                curveToRelative(0.116f, -0.326f, 0.13f, -0.694f, 0.007f, -1.058f)
                lineTo(9.79f, 1.76f)
                arcToRelative(1.722f, 1.722f, 0.0f, false, false, -0.007f, -0.02f)
                horizontalLineToRelative(6.034f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.512f, 0.366f)
                lineToRelative(6.562f, 19.445f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.338f, 0.684f)
            }
        }
        .build()
        return _microsoftazure!!
    }

private var _microsoftazure: ImageVector? = null
