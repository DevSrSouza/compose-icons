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

public val SimpleIcons.Bitwig: ImageVector
    get() {
        if (_bitwig != null) {
            return _bitwig!!
        }
        _bitwig = Builder(name = "Bitwig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.15f, 7.782f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, true, 3.181f, 0.0f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, true, -3.181f, 0.0f)
                close()
                moveTo(9.891f, 9.373f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, -3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, 3.181f)
                close()
                moveTo(14.109f, 9.373f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, -3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, 3.181f)
                close()
                moveTo(18.259f, 9.373f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, -3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, 3.181f)
                close()
                moveTo(5.741f, 10.409f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, 3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, -3.181f)
                close()
                moveTo(14.109f, 10.409f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, 3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, -3.181f)
                close()
                moveTo(18.259f, 10.409f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, 3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, -3.181f)
                close()
                moveTo(22.409f, 13.591f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, -3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, 3.181f)
                close()
                moveTo(1.591f, 10.409f)
                arcToRelative(1.591f, 1.591f, 0.0f, true, false, 0.0f, 3.182f)
                arcToRelative(1.591f, 1.591f, 0.0f, false, false, 0.0f, -3.182f)
                close()
                moveTo(5.741f, 14.627f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, 3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, -3.181f)
                close()
                moveTo(18.259f, 14.627f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, 3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, -3.181f)
                close()
                moveTo(22.409f, 14.627f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, 3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, -3.181f)
                close()
                moveTo(1.591f, 14.627f)
                arcToRelative(1.59f, 1.59f, 0.0f, true, false, 0.0f, 3.181f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, 0.0f, -3.181f)
                moveToRelative(8.3f, -4.218f)
                arcToRelative(1.591f, 1.591f, 0.0f, true, false, 0.0f, 3.182f)
                arcToRelative(1.591f, 1.591f, 0.0f, false, false, 0.0f, -3.182f)
                close()
            }
        }
        .build()
        return _bitwig!!
    }

private var _bitwig: ImageVector? = null
