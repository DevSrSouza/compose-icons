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

public val FeatherIcons.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.59f, 4.59f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 11.0f, 8.0f)
                horizontalLineTo(2.0f)
                moveToRelative(10.59f, 11.41f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 14.0f, 16.0f)
                horizontalLineTo(2.0f)
                moveToRelative(15.73f, -8.27f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 19.5f, 12.0f)
                horizontalLineTo(2.0f)
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null
