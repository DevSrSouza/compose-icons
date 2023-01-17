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

public val TablerIcons.SailboatOff: ImageVector
    get() {
        if (_sailboatOff != null) {
            return _sailboatOff!!
        }
        _sailboatOff = Builder(name = "SailboatOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                lineToRelative(-1.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                moveToRelative(4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-0.506f, 1.517f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-7.0f, -9.0f)
                verticalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.713f, 7.718f)
                lineToRelative(-1.713f, 4.282f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _sailboatOff!!
    }

private var _sailboatOff: ImageVector? = null
