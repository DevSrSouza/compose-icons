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

public val SimpleIcons.Springsecurity: ImageVector
    get() {
        if (_springsecurity != null) {
            return _springsecurity!!
        }
        _springsecurity = Builder(name = "Springsecurity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.59f, 2.066f)
                lineTo(11.993f, 0.0f)
                lineTo(3.41f, 2.066f)
                verticalLineToRelative(6.612f)
                horizontalLineToRelative(4.557f)
                arcToRelative(3.804f, 3.804f, 0.0f, false, false, 0.0f, 0.954f)
                lineTo(3.41f, 9.632f)
                verticalLineToRelative(3.106f)
                curveTo(3.41f, 19.867f, 11.994f, 24.0f, 11.994f, 24.0f)
                reflectiveCurveToRelative(8.582f, -4.133f, 8.582f, -11.258f)
                lineTo(20.576f, 9.635f)
                horizontalLineToRelative(-4.545f)
                arcToRelative(3.616f, 3.616f, 0.0f, false, false, 0.0f, -0.954f)
                horizontalLineToRelative(4.558f)
                close()
                moveTo(12.0f, 12.262f)
                horizontalLineToRelative(-0.006f)
                arcToRelative(3.109f, 3.109f, 0.0f, true, true, 0.006f, 0.0f)
                close()
                moveTo(11.994f, 7.683f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, false, -0.37f, 1.52f)
                verticalLineToRelative(0.208f)
                lineToRelative(0.238f, 0.237f)
                verticalLineToRelative(0.159f)
                lineToRelative(0.159f, 0.159f)
                verticalLineToRelative(0.159f)
                lineToRelative(-0.14f, 0.14f)
                lineToRelative(0.15f, 0.246f)
                verticalLineToRelative(0.159f)
                lineToRelative(-0.16f, 0.189f)
                lineToRelative(0.223f, 0.222f)
                lineToRelative(0.246f, -0.246f)
                lineTo(12.34f, 9.218f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, false, -0.346f, -1.535f)
                close()
                moveTo(11.994f, 8.519f)
                arcToRelative(0.299f, 0.299f, 0.0f, true, true, 0.298f, -0.299f)
                arcToRelative(0.299f, 0.299f, 0.0f, false, true, -0.298f, 0.3f)
                close()
            }
        }
        .build()
        return _springsecurity!!
    }

private var _springsecurity: ImageVector? = null
