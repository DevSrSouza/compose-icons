package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.EvenOdd
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

public val Octicons.GitBranch24: ImageVector
    get() {
        if (_gitBranch24 != null) {
            return _gitBranch24!!
        }
        _gitBranch24 = Builder(name = "GitBranch24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.75f, 21.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, -3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 3.5f)
                close()
                moveTo(2.5f, 19.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -6.5f, 0.0f)
                close()
                moveTo(5.75f, 6.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, -3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 3.5f)
                close()
                moveTo(2.5f, 4.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -6.5f, 0.0f)
                close()
                moveTo(18.25f, 6.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, -3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, 3.5f)
                close()
                moveTo(15.0f, 4.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -6.5f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.75f, 16.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 6.5f, 16.0f)
                verticalLineTo(8.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 5.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.5f, 8.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.75f, 3.75f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, 1.75f)
                horizontalLineTo(5.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 8.25f, 11.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 2.25f, -2.25f)
                close()
            }
        }
        .build()
        return _gitBranch24!!
    }

private var _gitBranch24: ImageVector? = null
