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

public val Octicons.Duplicate24: ImageVector
    get() {
        if (_duplicate24 != null) {
            return _duplicate24!!
        }
        _duplicate24 = Builder(name = "Duplicate24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.513f, 6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.987f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.987f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(11.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.013f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.024f, 3.75f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                lineTo(20.25f, 2.0f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(11.498f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                lineTo(8.774f, 16.998f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, -1.75f)
                close()
                moveTo(8.774f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(11.498f)
                curveToRelative(0.0f, 0.139f, 0.112f, 0.25f, 0.25f, 0.25f)
                lineTo(20.25f, 15.498f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(20.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.995f, 10.749f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 1.75f, -1.751f)
                horizontalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineTo(3.745f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(3.5f, 20.25f)
                curveToRelative(0.0f, 0.138f, 0.111f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-1.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                verticalLineToRelative(1.51f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 22.0f)
                horizontalLineToRelative(-9.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 20.25f)
                lineToRelative(-0.005f, -9.501f)
                close()
            }
        }
        .build()
        return _duplicate24!!
    }

private var _duplicate24: ImageVector? = null
