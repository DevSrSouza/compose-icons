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

public val SimpleIcons.Googledocs: ImageVector
    get() {
        if (_googledocs != null) {
            return _googledocs!!
        }
        _googledocs = Builder(name = "Googledocs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.727f, 6.727f)
                lineTo(14.0f, 6.727f)
                lineTo(14.0f, 0.0f)
                lineTo(4.91f, 0.0f)
                curveToRelative(-0.905f, 0.0f, -1.637f, 0.732f, -1.637f, 1.636f)
                verticalLineToRelative(20.728f)
                curveToRelative(0.0f, 0.904f, 0.732f, 1.636f, 1.636f, 1.636f)
                horizontalLineToRelative(14.182f)
                curveToRelative(0.904f, 0.0f, 1.636f, -0.732f, 1.636f, -1.636f)
                lineTo(20.727f, 6.727f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(14.182f, 17.182f)
                lineTo(7.09f, 17.182f)
                verticalLineToRelative(-1.364f)
                horizontalLineToRelative(7.09f)
                verticalLineToRelative(1.364f)
                close()
                moveTo(16.909f, 13.909f)
                lineTo(7.091f, 13.909f)
                verticalLineToRelative(-1.364f)
                horizontalLineToRelative(9.818f)
                verticalLineToRelative(1.364f)
                close()
                moveTo(16.909f, 10.636f)
                lineTo(7.091f, 10.636f)
                lineTo(7.091f, 9.273f)
                horizontalLineToRelative(9.818f)
                verticalLineToRelative(1.363f)
                close()
                moveTo(14.727f, 6.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-6.0f, -6.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _googledocs!!
    }

private var _googledocs: ImageVector? = null
