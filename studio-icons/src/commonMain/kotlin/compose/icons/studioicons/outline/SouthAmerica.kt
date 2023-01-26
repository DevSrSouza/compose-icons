package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.SouthAmerica: ImageVector
    get() {
        if (_southAmerica != null) {
            return _southAmerica!!
        }
        _southAmerica = Builder(name = "SouthAmerica", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -1.95f, 0.7f, -3.74f, 1.87f, -5.13f)
                lineTo(9.0f, 10.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                verticalLineToRelative(5.59f)
                curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f)
                lineTo(12.0f, 20.0f)
                curveTo(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f)
                close()
                moveTo(13.0f, 19.94f)
                verticalLineTo(18.0f)
                lineToRelative(3.75f, -5.62f)
                curveToRelative(0.16f, -0.25f, 0.25f, -0.54f, 0.25f, -0.83f)
                verticalLineTo(10.5f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-1.4f, -1.75f)
                curveTo(12.72f, 7.28f, 12.15f, 7.0f, 11.54f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.07f)
                curveTo(9.18f, 4.39f, 10.54f, 4.0f, 12.0f, 4.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                curveTo(20.0f, 16.07f, 16.94f, 19.44f, 13.0f, 19.94f)
                close()
            }
        }
        .build()
        return _southAmerica!!
    }

private var _southAmerica: ImageVector? = null
