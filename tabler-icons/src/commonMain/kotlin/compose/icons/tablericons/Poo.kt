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

public val TablerIcons.Poo: ImageVector
    get() {
        if (_poo != null) {
            return _poo!!
        }
        _poo = Builder(name = "Poo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                curveToRelative(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 4.0f)
                lineToRelative(0.164f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.196f, 3.32f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.615f, 3.063f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.299f, 5.607f)
                lineToRelative(-0.176f, 0.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.474f, -5.613f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.615f, -3.062f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.195f, -3.32f)
                lineToRelative(0.164f, 0.0f)
                curveToRelative(1.5f, 0.0f, 2.5f, -2.0f, 1.5f, -4.0f)
                close()
            }
        }
        .build()
        return _poo!!
    }

private var _poo: ImageVector? = null
