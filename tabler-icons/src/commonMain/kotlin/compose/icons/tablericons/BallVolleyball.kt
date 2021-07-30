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

public val TablerIcons.BallVolleyball: ImageVector
    get() {
        if (_ballVolleyball != null) {
            return _ballVolleyball!!
        }
        _ballVolleyball = Builder(name = "BallVolleyball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-9.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 18.0f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -18.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 4.0f)
                moveToRelative(-12.5f, -2.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, 6.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 81.6504f, false, false, -7.4641f, 4.9282f)
                moveToRelative(8.4151f, -9.5753f)
                arcToRelative(12.0f, 12.0f, 91.0056f, false, false, -9.8792f, 4.1112f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 118.155f, false, false, -0.5359f, -8.9282f)
                moveToRelative(4.0849f, 12.0753f)
                arcToRelative(12.0f, 12.0f, 99.6748f, false, false, 1.3792f, -10.6112f)
            }
        }
        .build()
        return _ballVolleyball!!
    }

private var _ballVolleyball: ImageVector? = null
