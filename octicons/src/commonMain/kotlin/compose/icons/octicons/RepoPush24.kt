package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val Octicons.RepoPush24: ImageVector
    get() {
        if (_repoPush24 != null) {
            return _repoPush24!!
        }
        _repoPush24 = Builder(name = "RepoPush24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 0.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 2.75f)
                verticalLineToRelative(16.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 22.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-11.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineTo(18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 16.5f)
                horizontalLineToRelative(7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.546f, 0.0f, -1.059f, 0.146f, -1.5f, 0.401f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineTo(18.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 13.903f)
                lineToRelative(2.202f, 2.359f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.096f, -1.024f)
                lineToRelative(-3.5f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.096f, 0.0f)
                lineToRelative(-3.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.096f, 1.024f)
                lineToRelative(2.202f, -2.36f)
                verticalLineToRelative(9.348f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-9.347f)
                close()
            }
        }
        .build()
        return _repoPush24!!
    }

private var _repoPush24: ImageVector? = null
