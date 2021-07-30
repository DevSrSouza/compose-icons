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

public val TablerIcons.PhoneCheck: ImageVector
    get() {
        if (_phoneCheck != null) {
            return _phoneCheck!!
        }
        _phoneCheck = Builder(name = "PhoneCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(2.0f, 5.0f)
                lineToRelative(-2.5f, 1.5f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 5.0f, 5.0f)
                lineToRelative(1.5f, -2.5f)
                lineToRelative(5.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.0f, -15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(4.0f, -4.0f)
            }
        }
        .build()
        return _phoneCheck!!
    }

private var _phoneCheck: ImageVector? = null
