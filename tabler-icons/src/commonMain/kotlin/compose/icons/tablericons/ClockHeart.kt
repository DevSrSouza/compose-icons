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

public val TablerIcons.ClockHeart: ImageVector
    get() {
        if (_clockHeart != null) {
            return _clockHeart!!
        }
        _clockHeart = Builder(name = "ClockHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.956f, 11.107f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -9.579f, 9.871f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                lineToRelative(3.35f, -3.284f)
                arcToRelative(2.143f, 2.143f, 0.0f, false, false, 0.005f, -3.071f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, -3.129f, -0.006f)
                lineToRelative(-0.224f, 0.22f)
                lineToRelative(-0.223f, -0.22f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, -3.128f, -0.006f)
                arcToRelative(2.143f, 2.143f, 0.0f, false, false, -0.006f, 3.071f)
                lineToRelative(3.355f, 3.296f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(0.5f, 0.5f)
            }
        }
        .build()
        return _clockHeart!!
    }

private var _clockHeart: ImageVector? = null
