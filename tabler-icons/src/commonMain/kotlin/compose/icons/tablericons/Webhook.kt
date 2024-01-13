package compose.icons.tablericons

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
import compose.icons.TablerIcons

public val TablerIcons.Webhook: ImageVector
    get() {
        if (_webhook != null) {
            return _webhook!!
        }
        _webhook = Builder(name = "Webhook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.876f, 13.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.124f, 3.39f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.066f, 20.502f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 1.934f, -7.502f)
                curveToRelative(-0.706f, 0.0f, -1.424f, 0.179f, -2.0f, 0.5f)
                lineToRelative(-3.0f, -5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                curveToRelative(0.0f, 1.506f, 0.77f, 2.818f, 2.0f, 3.5f)
                lineToRelative(-3.0f, 5.5f)
            }
        }
        .build()
        return _webhook!!
    }

private var _webhook: ImageVector? = null
