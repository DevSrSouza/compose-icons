package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Number16: ImageVector
    get() {
        if (_number16 != null) {
            return _number16!!
        }
        _number16 = Builder(name = "Number16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(1.75f, 6.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 1.0f, 5.25f)
                close()
                moveTo(1.0f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(1.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.368f, 1.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.623f, 0.859f)
                lineToRelative(-2.0f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.482f, -0.237f)
                lineToRelative(2.0f, -12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.86f, -0.622f)
                close()
                moveTo(11.868f, 1.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.623f, 0.859f)
                lineToRelative(-2.0f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.482f, -0.237f)
                lineToRelative(2.0f, -12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.86f, -0.622f)
                close()
            }
        }
        .build()
        return _number16!!
    }

private var _number16: ImageVector? = null
