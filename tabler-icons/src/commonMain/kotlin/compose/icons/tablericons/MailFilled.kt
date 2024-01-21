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

public val TablerIcons.MailFilled: ImageVector
    get() {
        if (_mailFilled != null) {
            return _mailFilled!!
        }
        _mailFilled = Builder(name = "MailFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.535f)
                verticalLineToRelative(9.465f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-9.465f)
                lineToRelative(9.445f, 6.297f)
                lineToRelative(0.116f, 0.066f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.878f, 0.0f)
                lineToRelative(0.116f, -0.066f)
                lineToRelative(9.445f, -6.297f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                curveToRelative(1.08f, 0.0f, 2.027f, 0.57f, 2.555f, 1.427f)
                lineToRelative(-9.555f, 6.37f)
                lineToRelative(-9.555f, -6.37f)
                arcToRelative(2.999f, 2.999f, 0.0f, false, true, 2.354f, -1.42f)
                lineToRelative(0.201f, -0.007f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _mailFilled!!
    }

private var _mailFilled: ImageVector? = null
