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

public val TablerIcons.PyramidOff: ImageVector
    get() {
        if (_pyramidOff != null) {
            return _pyramidOff!!
        }
        _pyramidOff = Builder(name = "PyramidOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.384f, 17.373f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, false, -0.013f, -1.091f)
                lineToRelative(-8.54f, -13.836f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.664f, 0.0f)
                lineToRelative(-1.8f, 2.917f)
                moveToRelative(-1.531f, 2.48f)
                lineToRelative(-5.209f, 8.439f)
                arcToRelative(1.005f, 1.005f, 0.0f, false, false, 0.386f, 1.452f)
                lineToRelative(8.092f, 4.054f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, false, 1.789f, 0.0f)
                lineToRelative(5.903f, -2.958f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(6.0f)
                moveToRelative(0.0f, 4.0f)
                verticalLineToRelative(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _pyramidOff!!
    }

private var _pyramidOff: ImageVector? = null
