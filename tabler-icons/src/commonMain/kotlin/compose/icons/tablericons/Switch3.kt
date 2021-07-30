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

public val TablerIcons.Switch3: ImageVector
    get() {
        if (_switch3 != null) {
            return _switch3!!
        }
        _switch3 = Builder(name = "Switch3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(2.397f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.096f, -2.133f)
                lineToRelative(0.177f, -0.253f)
                moveToRelative(3.66f, -5.227f)
                lineToRelative(0.177f, -0.254f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.096f, -2.133f)
                horizontalLineToRelative(3.397f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                horizontalLineToRelative(2.397f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.096f, 2.133f)
                lineToRelative(4.014f, 5.734f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 4.096f, 2.133f)
                horizontalLineToRelative(3.397f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-3.0f, -3.0f)
            }
        }
        .build()
        return _switch3!!
    }

private var _switch3: ImageVector? = null
