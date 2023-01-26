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

public val RoundGroup.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = Builder(name = "Router", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.45f, 5.55f)
                curveToRelative(0.19f, 0.19f, 0.5f, 0.21f, 0.72f, 0.04f)
                curveTo(13.3f, 4.69f, 14.65f, 4.2f, 16.0f, 4.2f)
                reflectiveCurveToRelative(2.7f, 0.49f, 3.84f, 1.39f)
                curveToRelative(0.21f, 0.17f, 0.52f, 0.15f, 0.72f, -0.04f)
                lineToRelative(0.04f, -0.05f)
                curveToRelative(0.22f, -0.22f, 0.21f, -0.59f, -0.03f, -0.8f)
                curveTo(19.24f, 3.57f, 17.62f, 3.0f, 16.0f, 3.0f)
                reflectiveCurveToRelative(-3.24f, 0.57f, -4.57f, 1.7f)
                curveToRelative(-0.24f, 0.21f, -0.26f, 0.57f, -0.03f, 0.8f)
                lineToRelative(0.05f, 0.05f)
                close()
                moveTo(13.15f, 6.31f)
                curveToRelative(-0.25f, 0.2f, -0.26f, 0.58f, -0.04f, 0.8f)
                lineToRelative(0.04f, 0.04f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.72f, 0.04f)
                curveToRelative(0.63f, -0.48f, 1.38f, -0.69f, 2.13f, -0.69f)
                reflectiveCurveToRelative(1.5f, 0.21f, 2.13f, 0.68f)
                curveToRelative(0.22f, 0.17f, 0.53f, 0.16f, 0.72f, -0.04f)
                lineToRelative(0.04f, -0.04f)
                curveToRelative(0.23f, -0.23f, 0.21f, -0.6f, -0.04f, -0.8f)
                curveToRelative(-0.83f, -0.64f, -1.84f, -1.0f, -2.85f, -1.0f)
                reflectiveCurveToRelative(-2.02f, 0.36f, -2.85f, 1.01f)
                close()
                moveTo(19.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 13.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.5f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _router!!
    }

private var _router: ImageVector? = null
