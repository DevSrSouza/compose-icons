package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.29f, 3.86f)
                lineTo(1.82f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.71f, 3.0f)
                horizontalLineToRelative(16.94f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.71f, -3.0f)
                lineTo(13.71f, 3.86f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.42f, 0.0f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
