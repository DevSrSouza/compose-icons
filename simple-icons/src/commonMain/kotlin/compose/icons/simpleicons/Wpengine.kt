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

public val SimpleIcons.Wpengine: ImageVector
    get() {
        if (_wpengine != null) {
            return _wpengine!!
        }
        _wpengine = Builder(name = "Wpengine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.145f, 0.0f)
                verticalLineToRelative(5.867f)
                lineTo(9.99f, 7.71f)
                horizontalLineToRelative(4.022f)
                lineToRelative(1.845f, -1.844f)
                lineTo(15.857f, 0.0f)
                close()
                moveTo(16.29f, 0.0f)
                verticalLineToRelative(5.867f)
                lineToRelative(1.845f, 1.844f)
                horizontalLineToRelative(5.864f)
                lineTo(23.999f, 0.001f)
                close()
                moveTo(1.845f, 0.0f)
                lineTo(0.0f, 1.845f)
                verticalLineToRelative(5.866f)
                horizontalLineToRelative(7.712f)
                lineTo(7.712f, 0.0f)
                close()
                moveTo(0.0f, 8.146f)
                verticalLineToRelative(7.71f)
                horizontalLineToRelative(5.866f)
                lineToRelative(1.845f, -1.844f)
                lineTo(7.711f, 8.145f)
                close()
                moveTo(18.133f, 8.146f)
                lineTo(16.29f, 9.989f)
                verticalLineToRelative(4.022f)
                lineToRelative(1.845f, 1.845f)
                lineTo(24.0f, 15.856f)
                lineTo(24.0f, 8.145f)
                close()
                moveTo(11.986f, 10.896f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, false, 0.014f, 2.21f)
                arcTo(1.105f, 1.105f, 0.0f, false, false, 13.105f, 12.0f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, false, -1.118f, -1.104f)
                close()
                moveTo(0.0f, 16.29f)
                verticalLineToRelative(7.71f)
                horizontalLineToRelative(5.866f)
                lineToRelative(1.845f, -1.842f)
                verticalLineToRelative(-4.023f)
                lineToRelative(-1.845f, -1.845f)
                close()
                moveTo(9.988f, 16.29f)
                lineToRelative(-1.843f, 1.845f)
                lineTo(8.145f, 24.0f)
                horizontalLineToRelative(7.71f)
                verticalLineToRelative(-5.866f)
                lineTo(14.01f, 16.29f)
                close()
                moveTo(16.288f, 16.29f)
                lineTo(16.288f, 24.0f)
                lineTo(24.0f, 24.0f)
                verticalLineToRelative(-5.865f)
                lineToRelative(-1.842f, -1.845f)
                close()
            }
        }
        .build()
        return _wpengine!!
    }

private var _wpengine: ImageVector? = null
