package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.HouseLine: ImageVector
    get() {
        if (_houseLine != null) {
            return _houseLine!!
        }
        _houseLine = Builder(name = "HouseLine", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 204.0f)
                horizontalLineTo(228.0f)
                verticalLineTo(115.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.6f, -14.8f)
                lineTo(141.4f, 28.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -26.9f, 0.0f)
                lineToRelative(-80.0f, 72.7f)
                arcTo(20.3f, 20.3f, 0.0f, false, false, 28.0f, 115.5f)
                verticalLineTo(204.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(52.0f, 117.3f)
                lineToRelative(76.0f, -69.1f)
                lineToRelative(76.0f, 69.1f)
                verticalLineTo(204.0f)
                horizontalLineTo(164.0f)
                verticalLineTo(160.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(112.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(52.0f)
                close()
                moveTo(140.0f, 204.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(164.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null
