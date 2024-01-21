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

public val TablerIcons.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                moveToRelative(0.0f, 2.667f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, -2.667f)
                horizontalLineToRelative(8.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, 2.667f)
                verticalLineToRelative(8.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, 2.667f)
                horizontalLineToRelative(-8.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, -2.667f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.012f, 16.737f)
                arcToRelative(2.005f, 2.005f, 0.0f, false, true, -1.012f, -1.737f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.75f, 0.0f, 1.158f, 0.385f, 1.5f, 1.0f)
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
