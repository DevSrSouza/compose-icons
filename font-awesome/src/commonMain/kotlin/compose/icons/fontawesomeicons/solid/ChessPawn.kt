package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChessPawn: ImageVector
    get() {
        if (_chessPawn != null) {
            return _chessPawn!!
        }
        _chessPawn = Builder(name = "ChessPawn", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.1f, 224.0f)
                horizontalLineTo(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(5.49f)
                curveToRelative(0.0f, 44.0f, -4.14f, 86.6f, -24.0f, 122.51f)
                horizontalLineToRelative(176.0f)
                curveToRelative(-19.89f, -35.91f, -24.0f, -78.51f, -24.0f, -122.51f)
                verticalLineTo(288.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-25.1f)
                curveToRelative(29.39f, -18.38f, 49.1f, -50.78f, 49.1f, -88.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -208.0f, 0.0f)
                curveToRelative(0.0f, 37.22f, 19.71f, 69.62f, 49.1f, 88.0f)
                close()
                moveTo(304.0f, 448.0f)
                horizontalLineTo(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(288.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _chessPawn!!
    }

private var _chessPawn: ImageVector? = null
