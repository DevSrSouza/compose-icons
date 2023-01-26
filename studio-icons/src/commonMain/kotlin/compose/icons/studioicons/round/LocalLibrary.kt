package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.LocalLibrary: ImageVector
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
                curveToRelative(-1.82f, -1.7f, -4.12f, -2.89f, -6.68f, -3.35f)
                curveTo(4.11f, 7.99f, 3.0f, 8.95f, 3.0f, 10.18f)
                verticalLineToRelative(6.24f)
                curveToRelative(0.0f, 1.68f, 0.72f, 2.56f, 1.71f, 2.69f)
                curveToRelative(2.5f, 0.32f, 4.77f, 1.35f, 6.63f, 2.87f)
                curveToRelative(0.35f, 0.29f, 0.92f, 0.32f, 1.27f, 0.04f)
                curveToRelative(1.87f, -1.53f, 4.16f, -2.58f, 6.68f, -2.9f)
                curveToRelative(0.94f, -0.13f, 1.71f, -1.06f, 1.71f, -2.02f)
                verticalLineToRelative(-6.92f)
                curveToRelative(0.0f, -1.23f, -1.11f, -2.19f, -2.32f, -1.98f)
                curveToRelative(-2.56f, 0.46f, -4.86f, 1.65f, -6.68f, 3.35f)
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
