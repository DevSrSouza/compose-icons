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

public val RoundGroup.LunchDining: ImageVector
    get() {
        if (_lunchDining != null) {
            return _lunchDining!!
        }
        _lunchDining = Builder(name = "LunchDining", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.37f, 14.28f)
                curveToRelative(0.79f, -0.29f, 1.17f, -0.78f, 1.99f, -0.78f)
                curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f)
                curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f)
                curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f)
                curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f)
                curveToRelative(0.81f, 0.0f, 1.17f, 0.46f, 1.93f, 0.76f)
                curveToRelative(0.67f, 0.26f, 1.39f, -0.25f, 1.39f, -0.96f)
                curveToRelative(0.0f, -0.43f, -0.28f, -0.81f, -0.69f, -0.96f)
                curveToRelative(-0.97f, -0.35f, -1.22f, -0.83f, -2.65f, -0.83f)
                curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f)
                curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f)
                curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f)
                curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f)
                curveToRelative(-1.55f, 0.0f, -1.96f, 0.63f, -2.68f, 0.89f)
                curveToRelative(-0.39f, 0.14f, -0.65f, 0.52f, -0.65f, 0.94f)
                curveTo(2.01f, 14.03f, 2.71f, 14.52f, 3.37f, 14.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                curveToRelative(0.02f, -4.0f, -4.28f, -6.0f, -10.0f, -6.0f)
                curveTo(6.29f, 3.0f, 2.0f, 5.0f, 2.0f, 9.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                curveTo(21.55f, 10.0f, 22.0f, 9.55f, 22.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _lunchDining!!
    }

private var _lunchDining: ImageVector? = null
