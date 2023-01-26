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

public val RoundGroup.CommentsDisabled: ImageVector
    get() {
        if (_commentsDisabled != null) {
            return _commentsDisabled!!
        }
        _commentsDisabled = Builder(name = "CommentsDisabled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 2.81f)
                curveTo(1.0f, 3.2f, 1.0f, 3.83f, 1.39f, 4.22f)
                lineTo(2.0f, 4.83f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.17f)
                lineToRelative(4.61f, 4.61f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(2.81f, 2.81f)
                curveTo(2.42f, 2.42f, 1.78f, 2.42f, 1.39f, 2.81f)
                close()
                moveTo(6.38f, 9.21f)
                lineTo(8.17f, 11.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveTo(6.0f, 9.68f, 6.15f, 9.4f, 6.38f, 9.21f)
                close()
                moveTo(7.0f, 14.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(14.83f, 12.0f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineTo(17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.17f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineTo(17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(8.83f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineTo(20.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(15.17f)
                lineTo(16.83f, 14.0f)
                horizontalLineTo(17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(14.83f)
                close()
            }
        }
        .build()
        return _commentsDisabled!!
    }

private var _commentsDisabled: ImageVector? = null
