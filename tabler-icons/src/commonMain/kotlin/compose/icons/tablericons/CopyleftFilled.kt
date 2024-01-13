package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.CopyleftFilled: ImageVector
    get() {
        if (_copyleftFilled != null) {
            return _copyleftFilled!!
        }
        _copyleftFilled = Builder(name = "CopyleftFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(14.883f, 9.229f)
                arcToRelative(4.016f, 4.016f, 0.0f, false, false, -5.543f, -0.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, 1.502f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, true, 2.783f, 0.116f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, 0.0f, 2.766f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, true, -2.783f, 0.116f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.501f)
                arcToRelative(4.016f, 4.016f, 0.0f, false, false, 5.543f, -0.23f)
                arcToRelative(3.993f, 3.993f, 0.0f, false, false, 0.0f, -5.542f)
                close()
            }
        }
        .build()
        return _copyleftFilled!!
    }

private var _copyleftFilled: ImageVector? = null
