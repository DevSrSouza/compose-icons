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

public val RoundGroup.DryCleaning: ImageVector
    get() {
        if (_dryCleaning != null) {
            return _dryCleaning!!
        }
        _dryCleaning = Builder(name = "DryCleaning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.56f, 11.36f)
                lineTo(13.0f, 8.44f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.38f, 0.0f, 0.72f, 0.22f, 0.88f, 0.53f)
                curveTo(13.04f, 4.84f, 13.39f, 5.0f, 13.73f, 5.0f)
                curveToRelative(0.74f, 0.0f, 1.26f, -0.79f, 0.91f, -1.44f)
                curveToRelative(-0.6f, -1.1f, -1.86f, -1.78f, -3.24f, -1.51f)
                curveToRelative(-1.17f, 0.23f, -2.12f, 1.2f, -2.34f, 2.37f)
                curveTo(8.77f, 5.98f, 9.67f, 7.35f, 11.0f, 7.82f)
                verticalLineToRelative(0.63f)
                lineToRelative(-6.56f, 2.92f)
                curveTo(3.56f, 11.75f, 3.0f, 12.62f, 3.0f, 13.57f)
                verticalLineToRelative(0.01f)
                curveTo(3.0f, 14.92f, 4.08f, 16.0f, 5.42f, 16.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.58f)
                curveToRelative(1.34f, 0.0f, 2.42f, -1.08f, 2.42f, -2.42f)
                verticalLineToRelative(-0.01f)
                curveTo(21.0f, 12.62f, 20.44f, 11.75f, 19.56f, 11.36f)
                close()
                moveTo(18.58f, 14.0f)
                horizontalLineToRelative(-1.86f)
                curveToRelative(-0.35f, -0.6f, -0.98f, -1.0f, -1.72f, -1.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.74f, 0.0f, -1.38f, 0.4f, -1.72f, 1.0f)
                horizontalLineTo(5.42f)
                curveToRelative(-0.46f, 0.0f, -0.58f, -0.65f, -0.17f, -0.81f)
                lineToRelative(6.75f, -3.0f)
                lineToRelative(6.75f, 3.0f)
                curveTo(19.17f, 13.38f, 19.03f, 14.0f, 18.58f, 14.0f)
                close()
            }
        }
        .build()
        return _dryCleaning!!
    }

private var _dryCleaning: ImageVector? = null
