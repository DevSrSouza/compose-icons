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

public val FeatherIcons.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.84f, 4.61f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -7.78f, 0.0f)
                lineTo(12.0f, 5.67f)
                lineToRelative(-1.06f, -1.06f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -7.78f, 7.78f)
                lineToRelative(1.06f, 1.06f)
                lineTo(12.0f, 21.23f)
                lineToRelative(7.78f, -7.78f)
                lineToRelative(1.06f, -1.06f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -7.78f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
