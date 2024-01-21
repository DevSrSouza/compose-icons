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

public val TablerIcons.MessageCircleDollar: ImageVector
    get() {
        if (_messageCircleDollar != null) {
            return _messageCircleDollar!!
        }
        _messageCircleDollar = Builder(name = "MessageCircleDollar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.16f, 19.914f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, true, -5.46f, -0.914f)
                lineToRelative(-4.7f, 1.0f)
                lineToRelative(1.3f, -3.9f)
                curveToRelative(-2.324f, -3.437f, -1.426f, -7.872f, 2.1f, -10.374f)
                curveToRelative(3.526f, -2.501f, 8.59f, -2.296f, 11.845f, 0.48f)
                curveToRelative(1.384f, 1.181f, 2.26f, 2.672f, 2.603f, 4.243f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 21.0f)
                verticalLineToRelative(1.0f)
                moveToRelative(0.0f, -8.0f)
                verticalLineToRelative(1.0f)
            }
        }
        .build()
        return _messageCircleDollar!!
    }

private var _messageCircleDollar: ImageVector? = null
