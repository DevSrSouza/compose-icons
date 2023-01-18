package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.HouseLine: ImageVector
    get() {
        if (_houseLine != null) {
            return _houseLine!!
        }
        _houseLine = Builder(name = "HouseLine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 210.0f)
                horizontalLineTo(222.0f)
                verticalLineTo(115.5f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -4.6f, -10.3f)
                lineToRelative(-80.0f, -72.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -18.8f, 0.0f)
                lineToRelative(-80.0f, 72.8f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 34.0f, 115.5f)
                verticalLineTo(210.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(46.0f, 115.5f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.6f, -1.4f)
                lineToRelative(80.0f, -72.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.7f, 0.0f)
                lineToRelative(80.0f, 72.8f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 0.7f, 1.4f)
                verticalLineTo(210.0f)
                horizontalLineTo(158.0f)
                verticalLineTo(160.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(112.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(50.0f)
                horizontalLineTo(46.0f)
                close()
                moveTo(146.0f, 210.0f)
                horizontalLineTo(110.0f)
                verticalLineTo(160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
