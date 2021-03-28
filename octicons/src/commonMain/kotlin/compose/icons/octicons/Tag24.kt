package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Tag24: ImageVector
    get() {
        if (_tag24 != null) {
            return _tag24!!
        }
        _tag24 = Builder(name = "Tag24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 6.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 2.5f)
                verticalLineToRelative(8.44f)
                curveToRelative(0.0f, 0.397f, 0.158f, 0.779f, 0.44f, 1.06f)
                lineToRelative(10.25f, 10.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.12f, 0.0f)
                lineToRelative(8.44f, -8.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -2.12f)
                lineTo(12.0f, 1.44f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.94f, 1.0f)
                lineTo(2.5f, 1.0f)
                close()
                moveTo(2.5f, 2.5f)
                horizontalLineToRelative(8.44f)
                lineToRelative(10.25f, 10.25f)
                lineToRelative(-8.44f, 8.44f)
                lineTo(2.5f, 10.94f)
                lineTo(2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _tag24!!
    }

private var _tag24: ImageVector? = null
