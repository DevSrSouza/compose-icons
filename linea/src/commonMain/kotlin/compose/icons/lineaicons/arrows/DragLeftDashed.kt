package compose.icons.lineaicons.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.ArrowsGroup

public val ArrowsGroup.DragLeftDashed: ImageVector
    get() {
        if (_dragLeftDashed != null) {
            return _dragLeftDashed!!
        }
        _dragLeftDashed = Builder(name = "DragLeftDashed", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(33.0f, 32.0f)
                lineTo(1.0f, 32.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 32.0f)
                moveToRelative(-15.0f, 0.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, true, true, 30.0f, 0.0f)
                arcToRelative(15.0f, 15.0f, 0.0f, true, true, -30.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 23.0f)
                lineToRelative(-9.0f, 9.0f)
                lineToRelative(9.0f, 9.0f)
            }
        }
        .build()
        return _dragLeftDashed!!
    }

private var _dragLeftDashed: ImageVector? = null
