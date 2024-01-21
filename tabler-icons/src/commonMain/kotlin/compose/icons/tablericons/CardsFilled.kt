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

public val TablerIcons.CardsFilled: ImageVector
    get() {
        if (_cardsFilled != null) {
            return _cardsFilled!!
        }
        _cardsFilled = Builder(name = "CardsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.348f, 3.169f)
                lineToRelative(-7.15f, 3.113f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.03f, 2.608f)
                lineToRelative(4.92f, 11.895f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, false, 2.59f, 1.063f)
                lineToRelative(7.142f, -3.11f)
                arcToRelative(2.002f, 2.002f, 0.0f, false, false, 1.036f, -2.611f)
                lineToRelative(-4.92f, -11.894f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, false, -2.588f, -1.064f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.08f, 5.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.31f, -0.53f)
                curveToRelative(0.257f, 0.108f, 0.505f, 0.21f, 0.769f, 0.314f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.114f, 2.479f)
                lineToRelative(-0.056f, 0.146f)
                lineToRelative(-2.298f, 5.374f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.878f, -0.676f)
                lineToRelative(0.04f, -0.11f)
                lineToRelative(2.296f, -5.371f)
                lineToRelative(-0.366f, -0.148f)
                lineToRelative(-0.402f, -0.167f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.53f, -1.312f)
                close()
            }
        }
        .build()
        return _cardsFilled!!
    }

private var _cardsFilled: ImageVector? = null
