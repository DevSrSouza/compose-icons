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

public val Octicons.Sync24: ImageVector
    get() {
        if (_sync24 != null) {
            return _sync24!!
        }
        _sync24 = Builder(name = "Sync24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.38f, 8.0f)
                arcTo(9.502f, 9.502f, 0.0f, false, true, 12.0f, 2.5f)
                arcToRelative(9.502f, 9.502f, 0.0f, false, true, 9.215f, 7.182f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.456f, -0.364f)
                curveTo(21.473f, 4.539f, 17.15f, 1.0f, 12.0f, 1.0f)
                arcToRelative(10.995f, 10.995f, 0.0f, false, false, -9.5f, 5.452f)
                lineTo(2.5f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                lineTo(1.0f, 8.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.38f, 8.0f)
                close()
                moveTo(2.785f, 14.318f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.455f, 0.364f)
                curveTo(2.527f, 19.461f, 6.85f, 23.0f, 12.0f, 23.0f)
                curveToRelative(4.052f, 0.0f, 7.592f, -2.191f, 9.5f, -5.451f)
                verticalLineToRelative(1.701f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(23.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.37f)
                arcTo(9.502f, 9.502f, 0.0f, false, true, 12.0f, 21.5f)
                curveToRelative(-4.446f, 0.0f, -8.181f, -3.055f, -9.215f, -7.182f)
                close()
            }
        }
        .build()
        return _sync24!!
    }

private var _sync24: ImageVector? = null
