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

public val RoundGroup.Cottage: ImageVector
    get() {
        if (_cottage != null) {
            return _cottage!!
        }
        _cottage = Builder(name = "Cottage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.39f, 12.19f)
                curveToRelative(0.34f, -0.44f, 0.25f, -1.07f, -0.19f, -1.4f)
                lineToRelative(-9.6f, -7.33f)
                curveToRelative(-0.36f, -0.27f, -0.86f, -0.27f, -1.21f, 0.0f)
                lineTo(6.0f, 7.58f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveTo(4.0f, 6.45f, 4.0f, 7.0f)
                verticalLineToRelative(2.11f)
                lineToRelative(-2.21f, 1.68f)
                curveToRelative(-0.44f, 0.33f, -0.52f, 0.96f, -0.19f, 1.4f)
                curveToRelative(0.34f, 0.44f, 0.96f, 0.52f, 1.4f, 0.19f)
                lineTo(4.0f, 11.62f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-8.38f)
                lineToRelative(0.99f, 0.76f)
                curveTo(21.43f, 12.72f, 22.06f, 12.63f, 22.39f, 12.19f)
                close()
                moveTo(5.27f, 5.0f)
                curveToRelative(-0.74f, 0.0f, -1.26f, -0.8f, -0.9f, -1.45f)
                curveTo(4.89f, 2.62f, 5.87f, 2.0f, 7.0f, 2.0f)
                curveToRelative(0.38f, 0.0f, 0.72f, -0.22f, 0.89f, -0.53f)
                curveTo(8.04f, 1.16f, 8.39f, 1.0f, 8.73f, 1.0f)
                curveToRelative(0.74f, 0.0f, 1.26f, 0.8f, 0.9f, 1.45f)
                curveTo(9.11f, 3.38f, 8.13f, 4.0f, 7.0f, 4.0f)
                curveTo(6.62f, 4.0f, 6.28f, 4.22f, 6.11f, 4.53f)
                curveTo(5.96f, 4.84f, 5.61f, 5.0f, 5.27f, 5.0f)
                close()
            }
        }
        .build()
        return _cottage!!
    }

private var _cottage: ImageVector? = null
