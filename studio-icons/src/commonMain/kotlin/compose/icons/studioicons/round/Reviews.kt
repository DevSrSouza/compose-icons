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

public val RoundGroup.Reviews: ImageVector
    get() {
        if (_reviews != null) {
            return _reviews!!
        }
        _reviews = Builder(name = "Reviews", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineToRelative(15.59f)
                curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
                moveTo(13.57f, 11.57f)
                lineToRelative(-1.12f, 2.44f)
                curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0.0f)
                lineToRelative(-1.12f, -2.44f)
                lineToRelative(-2.44f, -1.12f)
                curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(2.44f, -1.12f)
                lineToRelative(1.12f, -2.44f)
                curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f)
                lineToRelative(1.12f, 2.44f)
                lineToRelative(2.44f, 1.12f)
                curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f)
                lineTo(13.57f, 11.57f)
                close()
            }
        }
        .build()
        return _reviews!!
    }

private var _reviews: ImageVector? = null
