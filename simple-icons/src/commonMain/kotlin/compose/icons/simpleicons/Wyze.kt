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

public val SimpleIcons.Wyze: ImageVector
    get() {
        if (_wyze != null) {
            return _wyze!!
        }
        _wyze = Builder(name = "Wyze", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.475f, 13.171f)
                lineTo(7.3f, 9.469f)
                horizontalLineToRelative(0.974f)
                lineTo(5.779f, 14.53f)
                horizontalLineToRelative(-0.608f)
                lineToRelative(-1.034f, -2.082f)
                lineToRelative(-1.034f, 2.082f)
                horizontalLineToRelative(-0.609f)
                lineTo(0.0f, 9.469f)
                horizontalLineToRelative(0.973f)
                lineToRelative(1.826f, 3.673f)
                lineToRelative(0.851f, -1.706f)
                lineToRelative(-0.973f, -1.967f)
                horizontalLineToRelative(0.973f)
                lineToRelative(1.825f, 3.702f)
                close()
                moveTo(13.932f, 9.469f)
                lineTo(11.681f, 12.911f)
                verticalLineToRelative(1.591f)
                horizontalLineToRelative(-0.882f)
                verticalLineToRelative(-1.591f)
                lineTo(8.517f, 9.469f)
                horizontalLineToRelative(1.034f)
                lineToRelative(1.673f, 2.545f)
                lineToRelative(1.673f, -2.545f)
                horizontalLineToRelative(1.035f)
                close()
                moveTo(19.376f, 13.663f)
                lineTo(24.0f, 13.663f)
                verticalLineToRelative(0.867f)
                horizontalLineToRelative(-4.624f)
                verticalLineToRelative(-0.867f)
                close()
                moveTo(19.376f, 9.469f)
                lineTo(24.0f, 9.469f)
                verticalLineToRelative(0.868f)
                horizontalLineToRelative(-4.624f)
                verticalLineToRelative(-0.868f)
                close()
                moveTo(19.376f, 11.552f)
                lineTo(24.0f, 11.552f)
                verticalLineToRelative(0.867f)
                horizontalLineToRelative(-4.624f)
                verticalLineToRelative(-0.867f)
                close()
                moveTo(19.103f, 9.469f)
                lineTo(15.665f, 13.692f)
                horizontalLineToRelative(3.133f)
                verticalLineToRelative(0.838f)
                lineTo(13.84f, 14.53f)
                lineToRelative(3.407f, -4.222f)
                horizontalLineToRelative(-3.042f)
                verticalLineToRelative(-0.839f)
                horizontalLineToRelative(4.898f)
                close()
            }
        }
        .build()
        return _wyze!!
    }

private var _wyze: ImageVector? = null
