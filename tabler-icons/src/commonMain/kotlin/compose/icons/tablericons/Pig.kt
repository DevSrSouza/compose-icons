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

public val TablerIcons.Pig: ImageVector
    get() {
        if (_pig != null) {
            return _pig!!
        }
        _pig = Builder(name = "Pig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                lineToRelative(0.0f, 3.803f)
                arcToRelative(6.019f, 6.019f, 0.0f, false, true, 2.658f, 3.197f)
                horizontalLineToRelative(1.341f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-1.342f)
                arcToRelative(6.008f, 6.008f, 0.0f, false, true, -1.658f, 2.473f)
                verticalLineToRelative(2.027f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-0.583f)
                arcToRelative(6.04f, 6.04f, 0.0f, false, true, -1.0f, 0.083f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(6.04f, 6.04f, 0.0f, false, true, -1.0f, -0.083f)
                verticalLineToRelative(0.583f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(0.0f, -0.027f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.0f, -10.473f)
                horizontalLineToRelative(2.5f)
                lineToRelative(4.5f, -3.0f)
                close()
            }
        }
        .build()
        return _pig!!
    }

private var _pig: ImageVector? = null
