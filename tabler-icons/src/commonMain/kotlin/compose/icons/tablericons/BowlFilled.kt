package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BowlFilled: ImageVector
    get() {
        if (_bowlFilled != null) {
            return _bowlFilled!!
        }
        _bowlFilled = Builder(name = "BowlFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(0.5f)
                lineToRelative(0.007f, 0.18f)
                curveToRelative(0.134f, 1.806f, 2.169f, 5.275f, 3.928f, 6.771f)
                lineToRelative(0.065f, 0.053f)
                verticalLineToRelative(0.496f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(0.15f, -0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, -1.995f)
                verticalLineToRelative(-0.504f)
                lineToRelative(0.017f, -0.013f)
                curveToRelative(1.736f, -1.494f, 3.983f, -5.289f, 3.983f, -6.983f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bowlFilled!!
    }

private var _bowlFilled: ImageVector? = null
