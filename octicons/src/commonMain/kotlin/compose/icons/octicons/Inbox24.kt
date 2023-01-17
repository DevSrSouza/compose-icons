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

public val Octicons.Inbox24: ImageVector
    get() {
        if (_inbox24 != null) {
            return _inbox24!!
        }
        _inbox24 = Builder(name = "Inbox24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.801f, 3.57f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 6.414f, 2.5f)
                horizontalLineToRelative(11.174f)
                curveToRelative(0.702f, 0.0f, 1.337f, 0.42f, 1.611f, 1.067f)
                lineToRelative(3.741f, 8.828f)
                curveToRelative(0.04f, 0.092f, 0.06f, 0.192f, 0.06f, 0.293f)
                verticalLineToRelative(7.562f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 21.25f, 22.0f)
                horizontalLineTo(2.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 20.25f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.1f, 0.02f, -0.199f, 0.059f, -0.291f)
                lineTo(4.8f, 3.571f)
                close()
                moveTo(6.414f, 4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.23f, 0.153f)
                lineTo(2.88f, 12.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.648f, 0.372f)
                lineTo(10.18f, 15.0f)
                horizontalLineToRelative(3.638f)
                lineToRelative(1.533f, -2.628f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.64f, -0.372f)
                lineToRelative(5.13f, -0.051f)
                lineToRelative(-3.304f, -7.797f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.23f, -0.152f)
                close()
                moveTo(21.5f, 13.445f)
                lineToRelative(-5.067f, 0.05f)
                lineToRelative(-1.535f, 2.633f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.648f, 0.372f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.648f, -0.372f)
                lineTo(7.57f, 13.5f)
                horizontalLineTo(2.5f)
                verticalLineToRelative(6.75f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _inbox24!!
    }

private var _inbox24: ImageVector? = null
