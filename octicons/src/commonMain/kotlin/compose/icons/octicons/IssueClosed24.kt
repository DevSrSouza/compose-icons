package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
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

public val Octicons.IssueClosed24: ImageVector
    get() {
        if (_issueClosed24 != null) {
            return _issueClosed24!!
        }
        _issueClosed24 = Builder(name = "IssueClosed24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 12.0f)
                curveToRelative(0.0f, -5.24f, 4.288f, -9.5f, 9.593f, -9.5f)
                arcToRelative(9.608f, 9.608f, 0.0f, false, true, 7.197f, 3.219f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.12f, -0.998f)
                arcTo(11.108f, 11.108f, 0.0f, false, false, 12.093f, 1.0f)
                curveTo(5.973f, 1.0f, 1.0f, 5.919f, 1.0f, 12.0f)
                reflectiveCurveToRelative(4.973f, 11.0f, 11.093f, 11.0f)
                curveToRelative(5.403f, 0.0f, 9.91f, -3.832f, 10.893f, -8.915f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.472f, -0.285f)
                curveToRelative(-0.848f, 4.381f, -4.74f, 7.7f, -9.421f, 7.7f)
                curveTo(6.788f, 21.5f, 2.5f, 17.24f, 2.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.0f, 7.0f)
                close()
                moveTo(23.28f, 7.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-3.47f, 3.47f)
                lineToRelative(-1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _issueClosed24!!
    }

private var _issueClosed24: ImageVector? = null
