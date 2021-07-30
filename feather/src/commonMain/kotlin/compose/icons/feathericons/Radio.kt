package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.24f, 7.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f)
                moveToRelative(-8.48f, -0.01f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.49f)
                moveToRelative(11.31f, -2.82f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 14.14f)
                moveToRelative(-14.14f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.14f)
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
