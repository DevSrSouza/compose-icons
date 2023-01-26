package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.CommentsDisabled: ImageVector
    get() {
        if (_commentsDisabled != null) {
            return _commentsDisabled!!
        }
        _commentsDisabled = Builder(name = "CommentsDisabled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.83f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-6.17f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.83f)
                lineToRelative(-4.0f, -4.0f)
                horizontalLineTo(20.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(15.17f)
                lineTo(16.83f, 14.0f)
                close()
                moveTo(2.1f, 2.1f)
                lineTo(0.69f, 3.51f)
                lineTo(2.0f, 4.83f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(11.17f)
                lineToRelative(5.31f, 5.31f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.1f, 2.1f)
                close()
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(0.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(6.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _commentsDisabled!!
    }

private var _commentsDisabled: ImageVector? = null
