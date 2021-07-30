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

public val TablerIcons.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(2.0f, 2.0f)
                moveToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.75f, -2.75f)
                lineToRelative(-0.55f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5359f, 11.0f)
                lineToRelative(-0.7321f, -2.7321f)
                lineToRelative(-2.7321f, 0.7321f)
                moveToRelative(2.7321f, -0.7321f)
                lineToRelative(-4.5f, 7.7942f)
                arcToRelative(2.0f, 2.0f, 92.2389f, false, false, 1.5066f, 2.8905f)
                lineToRelative(1.141f, 0.0237f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.4641f, 11.0f)
                lineToRelative(2.7321f, 0.7321f)
                lineToRelative(0.7321f, -2.7321f)
                moveToRelative(-0.7321f, 2.7321f)
                lineToRelative(-4.5f, -7.7942f)
                arcToRelative(2.0f, 2.0f, 111.4966f, false, false, -3.2566f, -0.1405f)
                lineToRelative(-0.591f, 0.9763f)
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
