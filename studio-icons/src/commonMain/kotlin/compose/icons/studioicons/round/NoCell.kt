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

public val RoundGroup.NoCell: ImageVector
    get() {
        if (_noCell != null) {
            return _noCell!!
        }
        _noCell = Builder(name = "NoCell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.83f, 6.0f)
                lineToRelative(-3.7f, -3.7f)
                curveTo(5.42f, 1.55f, 6.15f, 1.0f, 7.0f, 1.0f)
                lineToRelative(10.0f, 0.01f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 1.99f)
                verticalLineToRelative(13.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.83f)
                close()
                moveTo(20.49f, 21.9f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-0.2f, -0.2f)
                curveTo(18.58f, 22.45f, 17.85f, 23.0f, 17.0f, 23.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(7.83f)
                lineToRelative(-2.9f, -2.9f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(16.97f, 16.97f)
                curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                close()
                moveTo(15.17f, 18.0f)
                lineTo(7.0f, 9.83f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.17f)
                close()
            }
        }
        .build()
        return _noCell!!
    }

private var _noCell: ImageVector? = null
