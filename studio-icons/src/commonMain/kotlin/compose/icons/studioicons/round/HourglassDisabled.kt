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

public val RoundGroup.HourglassDisabled: ImageVector
    get() {
        if (_hourglassDisabled != null) {
            return _hourglassDisabled!!
        }
        _hourglassDisabled = Builder(name = "HourglassDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f)
                lineToRelative(8.19f, 8.19f)
                lineToRelative(-3.0f, 3.01f)
                curveTo(6.21f, 15.8f, 6.0f, 16.31f, 6.0f, 16.84f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.86f, 0.0f, 1.58f, -0.54f, 1.87f, -1.3f)
                lineToRelative(1.91f, 1.91f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(16.0f, 19.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.5f)
                lineToRelative(2.84f, -2.84f)
                lineTo(16.0f, 18.83f)
                verticalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(-2.84f, 2.84f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(3.0f, -2.99f)
                curveTo(17.79f, 8.22f, 18.0f, 7.71f, 18.0f, 7.18f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.0f)
                curveTo(7.14f, 2.0f, 6.42f, 2.54f, 6.13f, 3.3f)
                lineTo(8.0f, 5.17f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _hourglassDisabled!!
    }

private var _hourglassDisabled: ImageVector? = null
