package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.HandMiddleFinger: ImageVector
    get() {
        if (_handMiddleFinger != null) {
            return _handMiddleFinger!!
        }
        _handMiddleFinger = Builder(name = "HandMiddleFinger", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(2.5f)
                moveToRelative(0.0f, -2.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(8.5f)
                moveToRelative(0.0f, -2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(2.5f)
                moveToRelative(0.0f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(5.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(7.0f, 6.0f, 0.0f, false, true, -5.0f, -3.0f)
                lineToRelative(-2.7f, -5.25f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 2.75f, -2.0f)
                lineToRelative(0.9f, 1.75f)
            }
        }
        .build()
        return _handMiddleFinger!!
    }

private var _handMiddleFinger: ImageVector? = null
