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

public val TablerIcons.SquareArrowLeft: ImageVector
    get() {
        if (_squareArrowLeft != null) {
            return _squareArrowLeft!!
        }
        _squareArrowLeft = Builder(name = "SquareArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(4.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 6.667f)
                verticalLineToRelative(10.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, 2.667f)
                horizontalLineToRelative(-10.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, -2.667f)
                verticalLineToRelative(-10.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, -2.667f)
                horizontalLineToRelative(10.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, 2.667f)
                close()
            }
        }
        .build()
        return _squareArrowLeft!!
    }

private var _squareArrowLeft: ImageVector? = null
