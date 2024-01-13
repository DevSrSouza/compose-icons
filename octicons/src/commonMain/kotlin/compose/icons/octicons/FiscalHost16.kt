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

public val Octicons.FiscalHost16: ImageVector
    get() {
        if (_fiscalHost16 != null) {
            return _fiscalHost16!!
        }
        _fiscalHost16 = Builder(name = "FiscalHost16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 9.25f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(5.5f, 4.0f)
                verticalLineToRelative(0.793f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.414f)
                verticalLineToRelative(1.586f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.414f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 14.25f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(14.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 12.25f)
                verticalLineTo(1.75f)
                curveTo(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f)
                horizontalLineToRelative(12.5f)
                curveTo(15.217f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineToRelative(10.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 14.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(1.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _fiscalHost16!!
    }

private var _fiscalHost16: ImageVector? = null
