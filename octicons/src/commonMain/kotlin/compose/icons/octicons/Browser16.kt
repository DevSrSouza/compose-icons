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

public val Octicons.Browser16: ImageVector
    get() {
        if (_browser16 != null) {
            return _browser16!!
        }
        _browser16 = Builder(name = "Browser16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 4.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 4.0f)
                lineTo(4.0f, 3.0f)
                close()
                moveTo(2.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 4.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(14.0f, 13.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(14.0f, 4.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(2.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(15.0f, 3.0f)
                close()
            }
        }
        .build()
        return _browser16!!
    }

private var _browser16: ImageVector? = null
