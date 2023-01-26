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

public val RoundGroup.EvStation: ImageVector
    get() {
        if (_evStation != null) {
            return _evStation!!
        }
        _evStation = Builder(name = "EvStation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.77f, 7.23f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(-3.19f, -3.19f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f)
                lineToRelative(1.58f, 1.58f)
                curveToRelative(-1.05f, 0.4f, -1.76f, 1.47f, -1.58f, 2.71f)
                curveToRelative(0.16f, 1.1f, 1.1f, 1.99f, 2.2f, 2.11f)
                curveToRelative(0.47f, 0.05f, 0.88f, -0.03f, 1.27f, -0.2f)
                verticalLineToRelative(7.21f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(14.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4.86f)
                curveToRelative(0.0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -0.69f, -0.28f, -1.32f, -0.73f, -1.77f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.0f, 16.12f)
                verticalLineTo(13.5f)
                horizontalLineTo(6.83f)
                curveToRelative(-0.38f, 0.0f, -0.62f, -0.4f, -0.44f, -0.74f)
                lineToRelative(2.67f, -5.0f)
                curveToRelative(0.24f, -0.45f, 0.94f, -0.28f, 0.94f, 0.24f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.14f)
                curveToRelative(0.38f, 0.0f, 0.62f, 0.41f, 0.43f, 0.75f)
                lineToRelative(-2.64f, 4.62f)
                curveToRelative(-0.25f, 0.44f, -0.93f, 0.26f, -0.93f, -0.25f)
                close()
            }
        }
        .build()
        return _evStation!!
    }

private var _evStation: ImageVector? = null
