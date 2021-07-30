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

public val SimpleIcons.Googlesheets: ImageVector
    get() {
        if (_googlesheets != null) {
            return _googlesheets!!
        }
        _googlesheets = Builder(name = "Googlesheets", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.318f, 12.545f)
                lineTo(7.91f, 12.545f)
                verticalLineToRelative(-1.909f)
                horizontalLineToRelative(3.41f)
                verticalLineToRelative(1.91f)
                close()
                moveTo(14.728f, 0.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(16.091f, 10.636f)
                horizontalLineToRelative(-3.41f)
                verticalLineToRelative(1.91f)
                horizontalLineToRelative(3.41f)
                verticalLineToRelative(-1.91f)
                close()
                moveTo(16.091f, 13.909f)
                horizontalLineToRelative(-3.41f)
                verticalLineToRelative(1.91f)
                horizontalLineToRelative(3.41f)
                verticalLineToRelative(-1.91f)
                close()
                moveTo(20.727f, 6.5f)
                verticalLineToRelative(15.864f)
                curveToRelative(0.0f, 0.904f, -0.732f, 1.636f, -1.636f, 1.636f)
                lineTo(4.909f, 24.0f)
                arcToRelative(1.636f, 1.636f, 0.0f, false, true, -1.636f, -1.636f)
                lineTo(3.273f, 1.636f)
                curveTo(3.273f, 0.732f, 4.005f, 0.0f, 4.909f, 0.0f)
                horizontalLineToRelative(9.318f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(17.454f, 9.273f)
                lineTo(6.545f, 9.273f)
                verticalLineToRelative(7.909f)
                horizontalLineToRelative(10.91f)
                verticalLineToRelative(-7.91f)
                close()
                moveTo(11.318f, 13.909f)
                lineTo(7.91f, 13.909f)
                verticalLineToRelative(1.91f)
                horizontalLineToRelative(3.41f)
                verticalLineToRelative(-1.91f)
                close()
            }
        }
        .build()
        return _googlesheets!!
    }

private var _googlesheets: ImageVector? = null
