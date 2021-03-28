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

public val Octicons.RepoPull16: ImageVector
    get() {
        if (_repoPull16 != null) {
            return _repoPull16!!
        }
        _repoPull16 = Builder(name = "RepoPull16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 8.0f)
                lineTo(13.0f, 6.0f)
                lineTo(7.0f, 6.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(13.0f, 2.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, 3.0f)
                close()
                moveTo(4.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 2.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-1.5f, -1.5f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(1.0f, 14.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(0.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(11.0f, 1.0f)
                lineTo(2.0f, 1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(9.0f)
                lineTo(11.0f, 7.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(1.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(4.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _repoPull16!!
    }

private var _repoPull16: ImageVector? = null
