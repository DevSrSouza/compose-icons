package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Nat: ImageVector
    get() {
        if (_nat != null) {
            return _nat!!
        }
        _nat = Builder(name = "Nat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.82f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.82f)
                curveTo(6.4f, 9.84f, 5.3f, 9.0f, 4.0f, 9.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                curveTo(5.3f, 15.0f, 6.4f, 14.16f, 6.82f, 13.0f)
                close()
                moveTo(4.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(5.0f, 12.55f, 4.55f, 13.0f, 4.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.47f, 12.4f)
                curveToRelative(0.27f, -0.2f, 0.27f, -0.6f, 0.0f, -0.8f)
                lineTo(19.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.05f)
                curveToRelative(-0.47f, -4.69f, -4.16f, -8.42f, -8.83f, -8.94f)
                curveTo(5.52f, 2.0f, 5.0f, 2.46f, 5.0f, 3.06f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f)
                curveTo(9.88f, 4.48f, 13.0f, 7.87f, 13.0f, 12.0f)
                reflectiveCurveToRelative(-3.12f, 7.52f, -7.13f, 7.95f)
                curveTo(5.37f, 20.01f, 5.0f, 20.44f, 5.0f, 20.94f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.6f, 0.52f, 1.07f, 1.11f, 1.0f)
                curveToRelative(4.67f, -0.52f, 8.37f, -4.25f, 8.83f, -8.94f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(2.0f)
                lineTo(22.47f, 12.4f)
                close()
            }
        }
        .build()
        return _nat!!
    }

private var _nat: ImageVector? = null
