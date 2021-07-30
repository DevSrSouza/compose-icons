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

public val Octicons.Copy24: ImageVector
    get() {
        if (_copy24 != null) {
            return _copy24!!
        }
        _copy24 = Builder(name = "Copy24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.75f, 3.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 3.0f, 4.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 3.0f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(9.75f, 8.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 8.0f, 9.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(9.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 21.0f, 19.25f)
                verticalLineToRelative(-9.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 19.25f, 8.0f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(9.5f, 9.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-9.5f)
                close()
            }
        }
        .build()
        return _copy24!!
    }

private var _copy24: ImageVector? = null
