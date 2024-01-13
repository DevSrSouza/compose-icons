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

public val SimpleIcons.Retool: ImageVector
    get() {
        if (_retool != null) {
            return _retool!!
        }
        _retool = Builder(name = "Retool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.2f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 2.2f, 0.0f)
                horizontalLineToRelative(8.6f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 13.0f, 2.2f)
                verticalLineToRelative(1.7f)
                arcTo(1.1f, 1.1f, 0.0f, false, true, 11.9f, 5.0f)
                lineTo(1.1f, 5.0f)
                arcTo(1.1f, 1.1f, 0.0f, false, true, 0.0f, 3.9f)
                lineTo(0.0f, 2.2f)
                close()
                moveTo(0.0f, 9.1f)
                arcTo(1.1f, 1.1f, 0.0f, false, true, 1.1f, 8.0f)
                horizontalLineToRelative(20.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 2.2f, 2.2f)
                verticalLineToRelative(5.7f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -1.1f, 1.1f)
                lineTo(2.2f, 17.0f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 0.0f, 14.8f)
                lineTo(0.0f, 9.1f)
                close()
                moveTo(11.0f, 21.1f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 1.1f, -1.1f)
                horizontalLineToRelative(10.8f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 1.1f, 1.1f)
                verticalLineToRelative(0.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.2f, 2.2f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.2f, -2.2f)
                verticalLineToRelative(-0.7f)
                close()
            }
        }
        .build()
        return _retool!!
    }

private var _retool: ImageVector? = null
