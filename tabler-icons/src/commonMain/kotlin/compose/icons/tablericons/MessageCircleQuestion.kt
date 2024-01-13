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

public val TablerIcons.MessageCircleQuestion: ImageVector
    get() {
        if (_messageCircleQuestion != null) {
            return _messageCircleQuestion!!
        }
        _messageCircleQuestion = Builder(name = "MessageCircleQuestion", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.02f, 19.52f)
                curveToRelative(-2.341f, 0.736f, -5.0f, 0.606f, -7.32f, -0.52f)
                lineToRelative(-4.7f, 1.0f)
                lineToRelative(1.3f, -3.9f)
                curveToRelative(-2.324f, -3.437f, -1.426f, -7.872f, 2.1f, -10.374f)
                curveToRelative(3.526f, -2.501f, 8.59f, -2.296f, 11.845f, 0.48f)
                curveToRelative(1.649f, 1.407f, 2.575f, 3.253f, 2.742f, 5.152f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, false, 0.914f, -3.782f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, -2.414f, 0.483f)
            }
        }
        .build()
        return _messageCircleQuestion!!
    }

private var _messageCircleQuestion: ImageVector? = null
