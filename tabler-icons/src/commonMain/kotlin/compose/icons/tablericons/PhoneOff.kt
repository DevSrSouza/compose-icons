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

public val TablerIcons.PhoneOff: ImageVector
    get() {
        if (_phoneOff != null) {
            return _phoneOff!!
        }
        _phoneOff = Builder(name = "PhoneOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                lineToRelative(18.0f, -18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.831f, 14.161f)
                arcToRelative(15.946f, 15.946f, 0.0f, false, true, -2.831f, -8.161f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(2.0f, 5.0f)
                lineToRelative(-2.5f, 1.5f)
                curveToRelative(0.108f, 0.22f, 0.223f, 0.435f, 0.345f, 0.645f)
                moveToRelative(1.751f, 2.277f)
                curveToRelative(0.843f, 0.84f, 1.822f, 1.544f, 2.904f, 2.078f)
                lineToRelative(1.5f, -2.5f)
                lineToRelative(5.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(15.963f, 15.963f, 0.0f, false, true, -10.344f, -4.657f)
            }
        }
        .build()
        return _phoneOff!!
    }

private var _phoneOff: ImageVector? = null
