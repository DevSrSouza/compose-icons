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

public val Octicons.Share24: ImageVector
    get() {
        if (_share24 != null) {
            return _share24!!
        }
        _share24 = Builder(name = "Share24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.53f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineTo(8.22f, 4.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(1.97f, -1.97f)
                verticalLineToRelative(10.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(3.56f)
                lineToRelative(1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-3.25f, -3.25f)
                close()
                moveTo(5.5f, 9.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 4.0f, 9.75f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 20.0f, 20.25f)
                verticalLineTo(9.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 18.25f, 8.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineTo(5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _share24!!
    }

private var _share24: ImageVector? = null
