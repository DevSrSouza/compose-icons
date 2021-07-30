package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.RepoClone16: ImageVector
    get() {
        if (_repoClone16 != null) {
            return _repoClone16!!
        }
        _repoClone16 = Builder(name = "RepoClone16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 0.0f)
                lineTo(9.0f, 0.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(16.0f, 1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(11.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(4.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                lineTo(3.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(4.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                lineTo(3.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(2.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                lineTo(8.0f, 0.0f)
                lineTo(1.0f, 0.0f)
                curveTo(0.45f, 0.0f, 0.0f, 0.45f, 0.0f, 1.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(1.5f, -1.5f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 1.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(1.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(3.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 8.0f)
                close()
                moveTo(4.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _repoClone16!!
    }

private var _repoClone16: ImageVector? = null
