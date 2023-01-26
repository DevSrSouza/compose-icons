package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LocalLibrary: ImageVector
    get() {
        if (_localLibrary != null) {
            return _localLibrary!!
        }
        _localLibrary = Builder(name = "LocalLibrary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.55f)
                curveTo(9.64f, 9.35f, 6.48f, 8.0f, 3.0f, 8.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(3.48f, 0.0f, 6.64f, 1.35f, 9.0f, 3.55f)
                curveToRelative(2.36f, -2.19f, 5.52f, -3.55f, 9.0f, -3.55f)
                verticalLineTo(8.0f)
                curveToRelative(-3.48f, 0.0f, -6.64f, 1.35f, -9.0f, 3.55f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _localLibrary!!
    }

private var _localLibrary: ImageVector? = null
