package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Beaker24: ImageVector
    get() {
        if (_beaker24 != null) {
            return _beaker24!!
        }
        _beaker24 = Builder(name = "Beaker24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.807f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(-0.563f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(9.125f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(5.307f)
                lineToRelative(5.125f, 9.301f)
                curveToRelative(0.964f, 1.75f, -0.302f, 3.892f, -2.299f, 3.892f)
                horizontalLineTo(5.174f)
                curveToRelative(-1.998f, 0.0f, -3.263f, -2.142f, -2.3f, -3.892f)
                close()
                moveTo(4.189f, 18.832f)
                arcToRelative(1.123f, 1.123f, 0.0f, false, false, 0.985f, 1.668f)
                horizontalLineToRelative(13.652f)
                arcToRelative(1.123f, 1.123f, 0.0f, false, false, 0.985f, -1.668f)
                lineTo(17.7f, 15.0f)
                horizontalLineTo(6.3f)
                close()
                moveTo(14.5f, 3.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.093f, 0.362f)
                lineTo(7.127f, 13.5f)
                horizontalLineToRelative(9.746f)
                lineToRelative(-2.28f, -4.138f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 14.5f, 9.0f)
                close()
            }
        }
        .build()
        return _beaker24!!
    }

private var _beaker24: ImageVector? = null
