package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Unlock16: ImageVector
    get() {
        if (_unlock16 != null) {
            return _unlock16!!
        }
        _unlock16 = Builder(name = "Unlock16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.607f, -1.346f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.264f, -0.808f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.501f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.0f, 7.5f)
                verticalLineToRelative(6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 15.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 6.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(5.5f, 4.0f)
                close()
                moveTo(4.75f, 7.5f)
                lineTo(3.5f, 7.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-6.0f)
                lineTo(4.75f, 7.5f)
                close()
            }
        }
        .build()
        return _unlock16!!
    }

private var _unlock16: ImageVector? = null
