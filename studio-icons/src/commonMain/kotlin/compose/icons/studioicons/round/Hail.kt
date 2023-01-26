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

public val RoundGroup.Hail: ImageVector
    get() {
        if (_hail != null) {
            return _hail!!
        }
        _hail = Builder(name = "Hail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(13.1f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(17.95f, 2.0f)
                lineTo(17.95f, 2.0f)
                curveToRelative(0.59f, 0.0f, 1.06f, 0.51f, 1.0f, 1.09f)
                curveTo(18.93f, 3.24f, 18.74f, 7.15f, 15.0f, 8.4f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(10.1f)
                curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f)
                curveToRelative(-0.46f, 0.36f, -1.17f, 0.87f, -1.36f, 2.67f)
                curveTo(6.99f, 13.59f, 6.57f, 14.0f, 6.04f, 14.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.58f, 0.0f, -1.05f, -0.49f, -1.0f, -1.07f)
                curveToRelative(0.13f, -1.6f, 0.62f, -2.98f, 2.07f, -4.22f)
                curveTo(8.21f, 7.81f, 10.0f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f)
                curveToRelative(0.43f, -0.34f, 1.28f, -0.99f, 1.48f, -3.02f)
                curveTo(17.01f, 2.4f, 17.43f, 2.0f, 17.95f, 2.0f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveTo(4.0f, 16.45f, 4.45f, 16.0f, 5.0f, 16.0f)
                close()
            }
        }
        .build()
        return _hail!!
    }

private var _hail: ImageVector? = null
