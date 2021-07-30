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

public val SimpleIcons.Teamviewer: ImageVector
    get() {
        if (_teamviewer != null) {
            return _teamviewer!!
        }
        _teamviewer = Builder(name = "Teamviewer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.597f, 24.0f)
                horizontalLineTo(1.406f)
                arcTo(1.41f, 1.41f, 0.0f, false, true, 0.0f, 22.594f)
                verticalLineTo(1.406f)
                arcTo(1.41f, 1.41f, 0.0f, false, true, 1.406f, 0.0f)
                horizontalLineToRelative(21.191f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, true, 1.406f, 1.406f)
                verticalLineToRelative(21.188f)
                arcTo(1.41f, 1.41f, 0.0f, false, true, 22.597f, 24.0f)
                close()
                moveTo(11.911f, 2.109f)
                curveToRelative(-5.405f, 0.047f, -9.763f, 4.482f, -9.802f, 9.89f)
                curveToRelative(-0.04f, 5.507f, 4.381f, 9.885f, 9.89f, 9.89f)
                curveToRelative(5.415f, 0.003f, 9.796f, -4.5f, 9.89f, -9.89f)
                curveToRelative(0.097f, -5.572f, -4.406f, -9.939f, -9.978f, -9.89f)
                close()
                moveTo(9.65f, 8.633f)
                lineToRelative(-0.889f, 2.159f)
                horizontalLineTo(15.3f)
                lineToRelative(-0.889f, -2.159f)
                lineToRelative(6.642f, 3.365f)
                lineToRelative(-6.642f, 3.365f)
                lineToRelative(0.889f, -2.159f)
                horizontalLineTo(8.761f)
                lineToRelative(0.882f, 2.159f)
                lineToRelative(-6.659f, -3.365f)
                close()
            }
        }
        .build()
        return _teamviewer!!
    }

private var _teamviewer: ImageVector? = null
