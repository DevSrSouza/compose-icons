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

public val TablerIcons.BoltOff: ImageVector
    get() {
        if (_boltOff != null) {
            return _boltOff!!
        }
        _boltOff = Builder(name = "BoltOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.212f, 15.21f)
                lineToRelative(-4.212f, 5.79f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(3.79f, -5.21f)
                moveToRelative(1.685f, -2.32f)
                lineToRelative(2.525f, -3.47f)
                verticalLineToRelative(6.0f)
                moveToRelative(1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-2.104f, 2.893f)
            }
        }
        .build()
        return _boltOff!!
    }

private var _boltOff: ImageVector? = null
