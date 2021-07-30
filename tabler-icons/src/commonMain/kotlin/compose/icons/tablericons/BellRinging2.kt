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

public val TablerIcons.BellRinging2: ImageVector
    get() {
        if (_bellRinging2 != null) {
            return _bellRinging2!!
        }
        _bellRinging2 = Builder(name = "BellRinging2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.364f, 4.636f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.828f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.414f, 7.072f)
                lineToRelative(-2.122f, 2.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.707f, 3.536f)
                lineToRelative(-11.313f, -11.312f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.535f, -0.707f)
                lineToRelative(2.121f, -2.123f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.072f, -1.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.343f, 12.414f)
                lineToRelative(-0.707f, 0.707f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.243f, 4.243f)
                lineToRelative(0.707f, -0.707f)
            }
        }
        .build()
        return _bellRinging2!!
    }

private var _bellRinging2: ImageVector? = null
