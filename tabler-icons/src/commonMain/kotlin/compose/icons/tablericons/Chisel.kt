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

public val TablerIcons.Chisel: ImageVector
    get() {
        if (_chisel != null) {
            return _chisel!!
        }
        _chisel = Builder(name = "Chisel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                lineToRelative(1.5f, 1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.347f, 15.575f)
                lineToRelative(2.08f, 2.079f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, -2.773f, 2.772f)
                lineToRelative(-2.08f, -2.079f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, 2.773f, -2.772f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(7.414f, 7.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.586f, 1.414f)
                verticalLineToRelative(2.172f)
                horizontalLineToRelative(-2.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.414f, -0.586f)
                lineToRelative(-7.414f, -7.414f)
                close()
            }
        }
        .build()
        return _chisel!!
    }

private var _chisel: ImageVector? = null
