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

public val FeatherIcons.Link2: ImageVector
    get() {
        if (_link2 != null) {
            return _link2!!
        }
        _link2 = Builder(name = "Link2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                moveToRelative(-6.0f, 0.0f)
                horizontalLineTo(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                lineTo(16.0f, 12.0f)
            }
        }
        .build()
        return _link2!!
    }

private var _link2: ImageVector? = null
