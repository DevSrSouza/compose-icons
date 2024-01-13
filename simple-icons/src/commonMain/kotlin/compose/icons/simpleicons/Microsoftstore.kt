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

public val SimpleIcons.Microsoftstore: ImageVector
    get() {
        if (_microsoftstore != null) {
            return _microsoftstore!!
        }
        _microsoftstore = Builder(name = "Microsoftstore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4f, 9.6f)
                verticalLineToRelative(4.2f)
                lineTo(7.2f, 13.8f)
                lineTo(7.2f, 9.6f)
                horizontalLineToRelative(4.2f)
                close()
                moveTo(11.4f, 19.2f)
                lineTo(11.4f, 15.0f)
                lineTo(7.2f, 15.0f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(4.2f)
                close()
                moveTo(16.8f, 9.6f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(-4.2f)
                lineTo(12.6f, 9.6f)
                horizontalLineToRelative(4.2f)
                close()
                moveTo(16.8f, 19.2f)
                lineTo(16.8f, 15.0f)
                horizontalLineToRelative(-4.2f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(4.2f)
                close()
                moveTo(7.2f, 5.4f)
                lineTo(7.2f, 2.7f)
                curveToRelative(0.0f, -1.16f, 0.94f, -2.1f, 2.1f, -2.1f)
                horizontalLineToRelative(5.4f)
                curveToRelative(1.16f, 0.0f, 2.1f, 0.94f, 2.1f, 2.1f)
                verticalLineToRelative(2.7f)
                horizontalLineToRelative(6.3f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.9f, 0.9f)
                verticalLineToRelative(13.8f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, -3.3f, 3.3f)
                lineTo(3.3f, 23.4f)
                arcTo(3.3f, 3.3f, 0.0f, false, true, 0.0f, 20.1f)
                lineTo(0.0f, 6.3f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.9f, -0.9f)
                horizontalLineToRelative(6.3f)
                close()
                moveTo(9.0f, 2.7f)
                verticalLineToRelative(2.7f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 2.7f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.3f, -0.3f)
                lineTo(9.3f, 2.4f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.3f, 0.3f)
                close()
                moveTo(1.8f, 20.1f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(17.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(22.2f, 7.2f)
                lineTo(1.8f, 7.2f)
                verticalLineToRelative(12.9f)
                close()
            }
        }
        .build()
        return _microsoftstore!!
    }

private var _microsoftstore: ImageVector? = null
